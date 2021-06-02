package com.bridgelabz;


import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationJunitTest{
    // case for first name
    UserRegistration userRegistration = new UserRegistration();

    //Name Starts with a capital letter
    @Test
    public void givenFirstName_ShouldReturn_True() {
        boolean result = userRegistration.ValidateFirstName("Shweta");
        Assert.assertTrue(result);
    }

    // Name starts with small letter
    @Test
    public void givenFirstName_ShouldReturn_False() {
        boolean result =userRegistration.ValidateFirstName("shweta");
        Assert.assertFalse(result);
    }

    //When name does not contain minimum 3 letters
    @Test
    public void givenFirstName_WhenDoNotReturnMinThreeLetters_ShouldReturnFalse() {
        boolean result = userRegistration.ValidateFirstName("Sh");
        Assert.assertFalse(result);
    }

    // Case For LastName
    //Last Name do not starts with Min three Letters
    @Test
    public void givenLastName_WhenDoNotReturnMinThreeLetters_ShouldReturnFalse() {
        boolean result = userRegistration.ValidateLastName("Pr");
        Assert.assertFalse(result);

}
// Last Name start with small letter
    @Test
    public void givenLastName_WhenDoNotStartWithCapitalLetters_ShouldReturnFalse() {
        boolean result = userRegistration.ValidateLastName("prasad");
        Assert.assertFalse(result);
    }

    // Last Name Starts With a Capital Letter
    @Test
    public void givenLastName_WhenStartWithCapitalLetters_ShouldReturnTrue() {
        boolean result = userRegistration.ValidateLastName("Prasad");
        Assert.assertTrue(result);
    }

    // case For Email

    // Email starts with small letter

    @Test
    public void givenEmail_WhenStartsWithSmallLetter_ShouldReturnTrue() {
        boolean result = userRegistration.ValidateEmail("email48@gmail.com");
        Assert.assertTrue(result);
    }
    //Email starts with Capital letter

    @Test
    public void givenEmail_WhenStartsWithCapitalLetter_ShouldReturnFalse() {
        boolean result = userRegistration.ValidateEmail("Email48@gmail.com");
        Assert.assertTrue(result);
    }

    // email ends with .com

    @Test
    public void  givenEmail_WhenEndsWithComOrIn_ShouldReturnTrue() {
        boolean result = userRegistration.ValidateEmail("shwetaprasad48@gmail.com");
        Assert.assertTrue(result);
    }
    // email do not ends with .COM OR IN

    @Test
    public void givenEmail_WhenDoNotEndsWithComOrIn_ShouldReturnFalse() {
        boolean result = userRegistration.ValidateEmail("shwetaprasad48@gmail.inn");
        Assert.assertTrue(result);
    }

    //Cases for Mobile Number
    //Phone number followed with country code

    @Test
    public void givenPhoneNumber_WhenFollowedByCountryCode_ShouldReturnTrue() {
        boolean result = userRegistration.ValidatePhoneNumber("91 7894561230");
        Assert.assertTrue(result);
    }

    // Number does not contain country code


    @Test
    public void givenPhoneNumber_WhenDoesNotFollowedByCountryCode_ShouldReturnFalse(){
        boolean result = userRegistration.ValidatePhoneNumber("7894561230");
        Assert.assertFalse(result);
    }

    // Phone Number Does Not have 10 digit number
    @Test
    public void givenPhoneNumber_WhenDoNotHaveTenDigitNumber_ShouldReturnFalse() {
        boolean result = userRegistration.ValidatePhoneNumber("789456213");
        Assert.assertFalse(result);
    }

    // phone num  has 10 digit  number
    @Test
    public void givenPhoneNumber_WhenHaseTenDigitNumber_ShouldReturnTrue() {
        boolean result = userRegistration.ValidatePhoneNumber("91 7894561230");
        Assert.assertTrue(result);
    }
 // Validation of Password
 //Must Contain Minimum 8 Characters

    @Test
    public void givenPassword_WhenIsMinimumEightDigit_ShouldReturnTrue() {
        boolean result = userRegistration.ValidatePassword("Code$212");
        Assert.assertTrue(result);
    }
    //Does Not Fulfill The Criteria

    @Test
    public void givenPassword_WhenDoNotContainMinimumEightDigit_ShouldReturnFalse()  {
        boolean result = userRegistration.ValidatePassword("Code$21");
        Assert.assertTrue(result);

    }
//Case For One UpperCase
    //Password with 1 uppercase
    @Test
    public void givenPassword_WhenContainOneUpperCase_ShouldReturnTrue() {
        boolean result = userRegistration.ValidatePassword("Code$212");
        Assert.assertTrue(result);
    }
// password does not contain any uppercase
    @Test
    public void givenPassword_WhenContainsNoUpperCase_ShouldReturnFalse() {
        boolean result = userRegistration.ValidatePassword("code$210");
        Assert.assertFalse(result);
    }
    // case for 1 numeric number
    // password contains 1 numeric number
    @Test
    public void givenPassword_WhenContainsOneNumericNumber_ShouldReturnTrue()  {
        boolean result = userRegistration.ValidatePassword("Code$2120");
        Assert.assertTrue(result);
    }
    //case for no numeric number
    @Test
    public void givenPassword_WhenDoNotContainOneNumericNumber_ShouldReturnFalse() {
        boolean result = userRegistration.ValidatePassword("Code$#");
        Assert.assertFalse(result);
    }
// case for One Special Character
//Have  1 special character
    @Test
    public void givenPassword_WhenPasswordHaveAtLeastOneSpecialCharacter_ShouldReturnTrue() {
        boolean result = userRegistration.ValidatePassword("Code$2120");
        Assert.assertTrue(result);
    }
    // have no special Character
    @Test
    public void givenPassword_WhenPasswordDoNotHaveAnySpecialCharacter_ShouldReturnFalse() {
        boolean result = userRegistration.ValidatePassword("Code2120");
        Assert.assertFalse(result);
    }
}
