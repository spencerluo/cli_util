package com.spencer.core;

public class Option {
    private String name;
    private String desc;
    boolean hasValue;
    private String value;


    public Option(String name, boolean hasValue, String desc){
        this.name = name;
        this.desc = desc;
        this.hasValue = hasValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isHasValue() {
        return hasValue;
    }

    public void setHasValue(boolean hasValue) {
        this.hasValue = hasValue;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
