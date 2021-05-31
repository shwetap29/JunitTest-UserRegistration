package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {


    public boolean ValidateFirstName(String firstName) {
        String Naming_Pattern = "^[A-Z][a-z]{2,}$";
        return (Pattern.matches(Naming_Pattern, firstName));
    }



    public boolean ValidateLastName(String lastName) {
        String Naming_Pattern = "^[A-Z][a-z]{2,}$";
        return (Pattern.matches(Naming_Pattern, lastName));
    }

    public boolean ValidateEmail(String email) {
        String Email = "^[a-z][a-zA-Z0-9]+([._+#-][a-zA-Z0-9]+)*@[a-zA-Z0-93]+.[a-zA-Z]{2,3}(.[a-zA-Z]{2,3})?$";
        return (Pattern.matches(Email, email));
    }

    public boolean ValidatePhoneNumber(String PhoneNumber) {
        String  Phone_Number = "^[9][1][ ][1-9][0-9]{9}$";
        return  (Pattern.matches(Phone_Number, PhoneNumber));

    }
}

