package com.bridgelabz;


import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationJunitTest{
    // case for first name
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

    // Case For LastName
    //Last Name do not starts with Min three Letters
    @Test
    public void givenLastName_DoNotReturnMinThreeLetters_ReturnFalse() {
        boolean result = userRegistration.ValidateLastName("la");
        Assert.assertFalse(result);

}
// Last Name start with small letter
    @Test
    public void givenLastName_DoNotStartWithCapitalLetters_ReturnFalse() {
        boolean result = userRegistration.ValidateLastName("lastName");
        Assert.assertFalse(result);
    }

    // Last Name Starts With a Capital Letter
    @Test
    public void givenLastName_StartWithCapitalLetters_ReturnTrue() {
        boolean result = userRegistration.ValidateLastName("LastName");
        Assert.assertTrue(result);
    }

    // case For Email

    // Email starts with small letter

    @Test
    public void givenEmail_StartsWithSmallLetter_ReturnTrue() {
        boolean result = userRegistration.ValidateEmail("email48@gmail.com");
        Assert.assertTrue(result);
    }
    //Email starts with Capital letter

    @Test
    public void givenEmail_StartsWithCapitalLetter_ReturnFalse() {
        boolean result = userRegistration.ValidateEmail("Email48@gmail.com");
        Assert.assertTrue(result);
    }

    // email ends with .com

    @Test
    public void  givenEmail_EndsWithComOrIn_ReturnTrue() {
        boolean result = userRegistration.ValidateEmail("email48@gmail.com");
        Assert.assertTrue(result);
    }
    // email do not ends with .COM OR IN

    @Test
    public void givenEmail_DoNotEndsWithComOrIn_ReturnFalse() {
        boolean result = userRegistration.ValidateEmail("email48@gmail.inn");
        Assert.assertTrue(result);
    }
}
