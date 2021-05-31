package com.bridgelabz;


import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationJunitTest{
    // test case for first name
    UserRegistration userRegistration = new UserRegistration();

    //Name Starts with a capital letter
    @Test
    public void givenFirstName_Return_True() {
        boolean result = userRegistration.ValidateFirstName("FirstName");
        Assert.assertTrue(result);
    }

    // Name starts with small letter
    @Test
    public void givenFirstName_Return_False() {
        boolean result =userRegistration.ValidateFirstName("firstName");
        Assert.assertFalse(result);
    }

    //When name does not contain minimum 3 letters
    @Test
    public void givenFirstName_DoNotReturnMinThreeLetters_ReturnFalse() {
        boolean result = userRegistration.ValidateFirstName("Fi");
        Assert.assertFalse(result);
    }
}

