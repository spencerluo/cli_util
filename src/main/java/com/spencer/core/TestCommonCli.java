package com.spencer.core;

import org.apache.commons.cli.*;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;

public class TestCommonCli {
    public static void main(String[] args) throws ParseException {
        Options options = new Options();
        options.addOption(new Option("a","ab", false, "kfc"));
        options.addOption(new Option("b","aab", true, "ufc"));
        options.addOption(new Option(null,null, true, "ufc"));

        CommandLineParser parser = new DefaultParser();
        String[] strings = new String[]{"-a", "-b=cc", "dd=kk"};
        CommandLine commandLine = parser.parse(options, strings);
        System.out.println(commandLine.hasOption("-b"));
        System.out.println(commandLine.getOptionValue("dd"));
    }
}
