package com.spencer.core;

import org.apache.commons.lang3.StringUtils;

public class DefaultParser implements CommandParser {
    private final OptionGroup optionGroup;
    private Command command = new Command();

    private final String PREFIX = "-";
    private final String VALUE_PREFIX = "=";

    public DefaultParser(OptionGroup optionGroup){
        this.optionGroup = optionGroup;
    }

    @Override
    public Command parse(String[] args) {
        for(String arg: args){
            parseArg(arg);
        }
        return command;
    }

    private void parseArg(String arg) {
        String res = removePrefix(arg);
        Option option = null;
        if(!hasValue(res)){
            option = processSingleOption(res);
        }else{
            option = processValueOption(res);
        }

        if (option == null){
            throw new IllegalArgumentException();
        }else {
            command.addOption(option);
        }
    }

    private String removePrefix(String arg){
        if (arg.startsWith(PREFIX)){
            return arg.substring(1);
        }else {
            throw new IllegalArgumentException();
        }
    }

    private boolean hasValue(String arg){
        return arg.contains(VALUE_PREFIX);
    }

    private Option processSingleOption(String res) {
        return optionGroup.getOption(res);
    }

    private Option processValueOption(String arg) {
        String[] res = arg.split(VALUE_PREFIX);
        if (res.length != 2){
            throw new IllegalArgumentException();
        }

        String name = res[0];
        String value = res[1];
        if (StringUtils.isBlank(name) || StringUtils.isBlank(value)){
            throw new IllegalArgumentException();
        }

        Option option = optionGroup.getOption(name);
        if (option != null && option.isHasValue()){
            option.setValue(value);
        }else {
            throw new IllegalArgumentException();
        }

        return option;
    }
}
