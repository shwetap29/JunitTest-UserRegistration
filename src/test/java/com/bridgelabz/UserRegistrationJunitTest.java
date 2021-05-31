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

    //Cases for Mobile Number
    //Phone number followed with country code

    @Test
    public void givenPhoneNumber_FollowedByCountryCode_ReturnTrue() {
        boolean result = userRegistration.ValidatePhoneNumber("91 7894561230");
        Assert.assertTrue(result);
    }

    // Number does not contain country code


    @Test
    public void givenPhoneNumber_DoesNotFollowedByCountryCode_ReturnFalse(){
        boolean result = userRegistration.ValidatePhoneNumber("7894561230");
        Assert.assertFalse(result);
    }

    // Phone Number Does Not have 10 digit number
    @Test
    public void givenPhoneNumber_DoNotHaveTenDigitNumber_ReturnFalse() {
        boolean result = userRegistration.ValidatePhoneNumber("789456213");
        Assert.assertFalse(result);
    }

    // phone num  has 10 digit  number
    @Test
    public void givenPhoneNumber_HaseTenDigitNumber_ReturnTrue() {
        boolean result = userRegistration.ValidatePhoneNumber("91 7894561230");
        Assert.assertTrue(result);
    }
 // Validation of Password
 //Must Contain Minimum 8 Characters

    @Test
    public void givenPassword_IsMinimumEightDigit_ReturnTrue() {
        boolean result = userRegistration.ValidatePassword("Code$212");
        Assert.assertTrue(result);
    }
    //Does Not Fulfill The Criteria

    @Test
    public void givenPassword_DoNotContainMinimumEightDigit_ReturnFalse()  {
        boolean result = userRegistration.ValidatePassword("Code$");
        Assert.assertTrue(result);

    }
//Case For One UpperCase
    //Password with 1 uppercase
    @Test
    public void givenPassword_ContainOneUpperCase_ReturnTrue() {
        boolean result = userRegistration.ValidatePassword("Code$212");
        Assert.assertTrue(result);
    }
// password does not contain any uppercase
    @Test
    public void givenPassword_ContainsNoUpperCase_ReturnFalse() {
        boolean result = userRegistration.ValidatePassword("code$210");
        Assert.assertFalse(result);
    }
    // case for 1 numeric number
    // password contains 1 numeric number
    @Test
    public void givenPassword_ContainsOneNumericNumber_ReturnTrue()  {
        boolean result = userRegistration.ValidatePassword("Code$2120");
        Assert.assertTrue(result);
    }
    //case for no numeric number
    @Test
    public void givenPassword_DoNotContainOneNumericNumber_ReturnFalse() {
        boolean result = userRegistration.ValidatePassword("Code$#");
        Assert.assertFalse(result);
    }
// case for One Special Character
//Have  1 special character
    @Test
    public void givenPassword_PasswordHaveAtLeastOneSpecialCharacter_ReturnTrue() {
        boolean result = userRegistration.ValidatePassword("Code$2120");
        Assert.assertTrue(result);
    }
    // have no special Character
    @Test
    public void givenPassword_PasswordDoNotHaveAnySpecialCharacter_ReturnFalse() {
        boolean result = userRegistration.ValidatePassword("Code2120");
        Assert.assertFalse(result);
    }
}
