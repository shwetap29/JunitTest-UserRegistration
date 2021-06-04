package com.bridgelabz;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    // First Name validation
    public static String validateFirstName(String firstName, ValidateInput validate) {
        String result;
        try {
            if(validate.validateInput(firstName, UserFieldPattern.REGEX_NAME)) {
                result = "valid";
            }
            else {
                throw new InvalidUserDetailsException(InvalidUserDetailsException.invalidCredentials.INVALID_FIRSTNAME, "Invalid User Details");
            }
        } catch(InvalidUserDetailsException exception) {
            result = exception.type.toString();
        }
        return result;
    }


    // Last Name validation
    public static String validateLastName(String lastName, ValidateInput validate) {
        String result;
        try {
            if(validate.validateInput(lastName, UserFieldPattern.REGEX_NAME)) {
                result = "valid";
            } else {
                throw new InvalidUserDetailsException(InvalidUserDetailsException.invalidCredentials.INVALID_LASTNAME, "Invalid User Details");
            }
        } catch(InvalidUserDetailsException exception) {
            result = exception.type.toString();
        }
        return result;
    }


    // Email Validation
    public static String validateEmail(String email, ValidateInput validate) {
        String result;
        try {
            if(validate.validateInput(email, UserFieldPattern.REGEX_EMAIL )) {
                result = "valid";
            } else {
                throw new InvalidUserDetailsException(InvalidUserDetailsException.invalidCredentials.INVALID_EMAIL, "Invalid User Details");
            }
        } catch(InvalidUserDetailsException exception) {
            result = exception.type.toString();
        }
        return result;
    }


    // Mobile Number validation
    public static String validateMobileNumber(String number, ValidateInput validate) {
        String result;
        try {
            if(validate.validateInput(number, UserFieldPattern.REGEX_MOBILE_NUMBER)) {
                result = "valid";
            } else
            {
                throw new InvalidUserDetailsException(InvalidUserDetailsException.invalidCredentials.INVALID_PHONE_NUMBER, "Invalid User Details");
            }
        } catch(InvalidUserDetailsException exception) {
            result = exception.type.toString();
        }
        return result;
    }


    // Password Validation
    public static String validatePassword(String password, ValidateInput validate) {
        String result;
        try {
            if(validate.validateInput(password, UserFieldPattern.REGEX_PASSWORD)) {
                result = "valid";
            } else {
                throw new InvalidUserDetailsException(InvalidUserDetailsException.invalidCredentials.INVALID_PASSWORD, "Invalid User Details");
            }
        } catch(InvalidUserDetailsException exception) {
            result = exception.type.toString();
        }
        return result;
    }


    // Validate Input
    ValidateInput validate = (String input, UserFieldPattern regex) -> {
        boolean result;
        Pattern pattern = Pattern.compile(regex.pattern);
        Matcher matcher = pattern.matcher(input);
        result = matcher.find();
        return result;
    };
}
