package com.spencer.core;

public class Demo {
    public static void main(String[] args) {
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", false, "aaa"));
        group.addOption(new Option("b", true, "bbb"));
        group.addOption(new Option("c", "copy", true, "bbb"));

        CommandHelp helper = new CommandHelp(group);
        helper.printHelpInfo();

        CommandParser parser = new DefaultParser(group);
        args = new String[]{"-a", "-b=happy", "-copys=dd"};
        Command command = null;
        try {
            command = parser.parse(args);
            System.out.println(command.getOption("b").getValue());
            System.out.println(command.hasOption("c"));
            System.out.println(command.getValue("c"));
        }catch (IllegalArgumentException e){
            System.out.println("parse failed");
        }
    }
}
