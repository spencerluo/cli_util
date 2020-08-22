package com.spencer.core;

public class OptionValidator {

    static void validOpt(String opt){
        if (opt != null) {
            if (opt.length() == 1) {
                char c = opt.charAt(0);
                if (!isValidOpt(c)){
                    throw new IllegalArgumentException("Illegal option name '" + c + "'");
                }
            }else {
                char[] char_arr = opt.toCharArray();
                for (char c : char_arr){
                    if (!isValidOpt(c)){
                        throw new IllegalArgumentException("The option contains an illegal character '" + c + "'");
                    }
                }
            }
        }
    }

    private static boolean isValidOpt(char c) {
        return isValidChar(c) || c == '?' || c == '@';
    }
    private static boolean isValidChar(char c){
        return Character.isJavaIdentifierPart(c);
    }
}
