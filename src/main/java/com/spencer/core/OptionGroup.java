package com.spencer.core;

import java.util.ArrayList;
import java.util.List;

public class OptionGroup {

    private List<Option> optionList = new ArrayList<>();

    public void addOption(Option option){
        optionList.add(option);
    }

    public List<Option> getOptions(){
        return optionList;
    }
}
