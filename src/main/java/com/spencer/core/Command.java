package com.spencer.core;

import java.util.HashMap;
import java.util.Map;

public class Command {
    private final Map<String, Option> optionMap = new HashMap<>();

    public void addOption(Option option){
        optionMap.put(option.getName(), option);
    }

    public Option getOption(String name){
        return optionMap.get(name);
    }

    public boolean hasOption(String name){
        return optionMap.containsKey(name);
    }

    public String getValue(String name) {
        Option option = getOption(name);
        if (option != null && option.isHasValue()) {
            return option.getValue();
        }else {
            return null;
        }
    }
}
