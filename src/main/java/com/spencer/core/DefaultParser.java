package com.spencer.core;

public class DefaultParser implements CommandParser {
    private OptionGroup optionGroup;

    public DefaultParser(OptionGroup optionGroup){
        this.optionGroup = optionGroup;
    }

    @Override
    public Command parse(String[] args) {
        for(String arg: args){
            parseArg(arg);
        }
        return new Command();
    }

    private void parseArg(String arg) {
    }
}
