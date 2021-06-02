package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    //INPUT Validation
    public static boolean ValidateInput(String input , UserFieldPattern regex ) {
        boolean result;
        Pattern pattern = Pattern.compile(regex.pattern);
        Matcher matcher = pattern.matcher(input);
        result = matcher.find(); // true or false
        return  result;
    }

  //First Name Validation
    public static String ValidateFirstName(String firstName){
       String result;
       try {
           if(ValidateInput(firstName, UserFieldPattern.REGEX_NAME)){
               result = "valid";
           }
           else {
               throw new InvalidUserDetailsException(InvalidUserDetailsException.invalidCredentials.INVALID_FIRSTNAME,"Invalid User Details");
           }
       } catch (InvalidUserDetailsException exception) {
           result = exception.type.toString();
       }
        return result;
    }

    // Last Name Validation
    public static String  ValidateLastName(String lastName) {
        String result;
        try {
            if (ValidateInput(lastName, UserFieldPattern.REGEX_NAME)) {
                result = "valid";
            } else {
                throw new InvalidUserDetailsException(InvalidUserDetailsException.invalidCredentials.INVALID_LASTNAME, "Invalid User Details");
            }
        } catch(InvalidUserDetailsException exception) {
            result = exception.type.toString();
        }
        return result;
    }

    public static Object Validateemail(String s) {
        return null;
    }

    // Email Validation
    public String ValidateEmail(String email) {
        String result;
        try {
            if (ValidateInput(email, UserFieldPattern.REGEX_EMAIL )){
                result = "valid";
            } else {
                throw new InvalidUserDetailsException(InvalidUserDetailsException.invalidCredentials.INVALID_EMAIL, "Invalid User Details");
            }
        }catch (InvalidUserDetailsException exception) {
            result = exception.type.toString();
        }
        return result;
    }

    // Mobile Number Validation
    public static String ValidatePhoneNumber(String number) {
        String result;
        try {
            if (ValidateInput(number, UserFieldPattern.REGEX_MOBILE_NUMBER)) {
                result = "valid";
            } else {
                throw new InvalidUserDetailsException(InvalidUserDetailsException.invalidCredentials.INVALID_PHONE_NUMBER, "Invalid User Details");
            }
        } catch (InvalidUserDetailsException exception) {
            result = exception.type.toString();
        }
            return result;
        }

  // Password Validation
    public static String ValidatePassword(String Password) {
        String result;
        try {
            if (ValidateInput(Password, UserFieldPattern.REGEX_PASSWORD)) {
                result = "valid";
            } else {
                throw new InvalidUserDetailsException(InvalidUserDetailsException.invalidCredentials.INVALID_PASSWORD, "Invalid User Details");
            }
        } catch (InvalidUserDetailsException exception) {
            result = exception.type.toString();
        }
        return result;
    }

    private static class REGEX_NAME {
    }
}


