package com.bridgelabz;

public enum UserFieldPattern {
    // Setting default regex values to enum
    REGEX_NAME("^[A-Z][a-z]{2,}$"),
    REGEX_EMAIL("^[a-z][a-z0-9]+([._+#-][a-zA-Z0-9]+)*@[a-zA-Z0-93]+.[a-zA-Z]{2,3}(.[a-zA-Z]{2,3})?$"),
    REGEX_MOBILE_NUMBER("^[9][1][ ][1-9][0-9]{9}$"),
    REGEX_PASSWORD("^(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%!]).{8,}$");

    public final String pattern;

    //Constructor
    UserFieldPattern(String pattern) {
        this.pattern = pattern;
    }


    }

