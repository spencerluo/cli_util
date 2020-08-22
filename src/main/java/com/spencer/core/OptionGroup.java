package com.spencer.core;

import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OptionGroup {

    private final Map<String, Option> optionMap = new HashMap<>();

    public void addOption(Option option){
        optionMap.put(option.getName(), option);
        if (option.getFullName() != null) {
            optionMap.put(option.getFullName(), option);
        }
    }

    public Option getOption(String name){
        return optionMap.get(name);
    }

    public List<Option> getOptions(){
        return new ArrayList<>(optionMap.values());
    }
}
