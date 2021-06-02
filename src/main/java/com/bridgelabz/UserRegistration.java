package com.bridgelabz;

public class UserRegistration {


    public static boolean ValidateFirstName(String firstName) {
        boolean Validation = firstName.matches("^[A-Z][a-z]{2,}$");
        if(Validation){
            System.out.println("First Name is Valid");
        } else {
            System.out.println("Invalid \n Enter valid name");
        }
        return Validation;
    }

    public boolean ValidateLastName(String lastName) {
        boolean Validation =lastName.matches ("^[A-Z][a-z]{2,}$");
        if (Validation) {
            System.out.println("Last Name is Valid");
        }else {
            System.out.println("Invalid \n Enter valid Last Name");
        }
        return Validation ;
    }

    public boolean ValidateEmail(String email) {
        boolean Validation= email.matches("^[a-z][a-zA-Z0-9]+([._+#-][a-zA-Z0-9]+)*@[a-zA-Z0-93]+.[a-zA-Z]{2,3}(.[a-zA-Z]{2,3})?$");
        if (Validation){
            System.out.println("Email is Valid");
        } else {
            System.out.println("Invalid \n Enter a valid Email");
        }
        return Validation;
    }

    public boolean ValidatePhoneNumber(String PhoneNumber) {
        boolean Validation=PhoneNumber.matches ("^[9][1][ ][1-9][0-9]{9}$");
         if (Validation) {
             System.out.println("Phone number is Valid");
         } else {
             System.out.println("Invalid \n Enter a valid number");
         }
        return Validation;

    }

    public boolean ValidatePassword(String Password) {
        boolean Validation = Password.matches("(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%!]).{8,}");
        if (Validation){
            System.out.println("Password is Valid");
        }else {
            System.out.println("Invalid \n Enter Valid Password");
        }
        return Validation;
    }

    public void SelectOption() {
    }
}

