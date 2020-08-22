package com.spencer.core;

public class Option {
    private String name;
    private String fullName;
    private String desc;
    private boolean hasValue;
    private String value;


    public Option(String name, String fullName, boolean hasValue, String desc){
        OptionValidator.validOpt(name);
        this.name = name;
        this.fullName = fullName;
        this.desc = desc;
        this.hasValue = hasValue;
    }

    public Option(String name, boolean hasValue, String desc){
        this(name, null, hasValue, desc);
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
