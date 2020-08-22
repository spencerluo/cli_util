package com.spencer.core;

import com.sun.istack.internal.NotNull;

public class CommandHelp {
    private OptionGroup group;

    public CommandHelp(@NotNull OptionGroup group){
        this.group = group;
    }

    public void printHelpInfo(){
        System.out.println("Usage:");
        for(Option option: group.getOptions()){
            StringBuilder buffer = new StringBuilder();

            String name = option.getName();
            String fullName = option.getFullName();
            String desc = option.getDesc();

            buffer.append("-").append(name).append(" ");
            if (fullName != null) {
                buffer.append("--").append(expandString(fullName, 6));
            }else {
                buffer.append(expandString(" ", 8));
            }
            if (desc != null) {
                buffer.append(":").append(desc);
            }

            System.out.println(buffer.toString());
        }
    }

    private String expandString(String s, int size){
        String expandChar = " ";
        StringBuilder builder = new StringBuilder();
        builder.append(s);
        int count = size - s.length();
        while (count > 0){
            builder.append(expandChar);
            count --;
        }
        return builder.toString();
    }
}
