package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {


    public boolean ValidateFirstName(String firstName) {
        String Naming_Pattern = "^[A-Z][a-z]{2,}$";
        return (Pattern.matches(Naming_Pattern, firstName));
    }
}

