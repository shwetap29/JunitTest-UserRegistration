package com.bridgelabz;


import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationJunitTest{
    // case for first name
    UserRegistration userRegistration = new UserRegistration();

    //Name Starts with a capital letter
    @Test
    public void givenFirstName_WhenStartsWith_CapitalLetter_ShouldReturn_True() {
        Assert.assertEquals("valid", UserRegistration.ValidateFirstName("Shweta"));
    }

    // Name contains number
    @Test
    public void givenFirstName_WhenContainsNumber_ShouldReturn_False() {
        Assert.assertEquals("INVALID_FIRSTNAME" ,UserRegistration.ValidateFirstName("Shweta29"));
    }

    //When name does not contain minimum 3 letters
    @Test
    public void givenFirstName_DoNotReturnMinThreeLetters_ShouldReturnFalse() {
        Assert.assertEquals("INVALID_FIRSTNAME" ,UserRegistration.ValidateFirstName("Sh"));
    }

    // When name starts with small letters
    @Test
    public void givenFirstName_StartsWithSmallLetter_ShouldReturnFalse() {
        Assert.assertEquals("INVALID_FIRSTNAME" ,UserRegistration.ValidateFirstName("shweta"));
    }

    // Case For LastName
    //Last Name do not starts with Min three Letters
    @Test
    public void givenLastName_WhenDoNotReturnMinThreeLetters_ShouldReturnFalse() {
        Assert.assertEquals("INVALID_FIRSTNAME" ,UserRegistration.ValidateLastName("PR"));

}
// Last Name start with small letter
    @Test
    public void givenLastName_WhenDoNotStartWithCapitalLetters_ShouldReturnFalse() {
        Assert.assertEquals("INVALID_LASTNAME" ,UserRegistration.ValidateLastName("prasad"));
    }

    // Last Name Starts With a Capital Letter
    @Test
    public void givenLastName_WhenStartsWithCapitalLetters_ShouldReturnTrue() {
        Assert.assertEquals("VALID_LASTNAME" ,UserRegistration.ValidateLastName("Prasad"));
    }

    // case For Email

    // Email starts with small letter

    @Test
    public void givenEmail_WhenStartsWithSmallLetter_ShouldReturnTrue() {
        Assert.assertEquals("VALID_EMAIL" , UserRegistration.Validateemail("shweta48@"));
    }
    //Email starts with Capital letter

    @Test
    public void givenEmail_StartsWithCapitalLetter_ShouldReturnFalse() {
        Assert.assertEquals("INVALID_EMAIL" , UserRegistration.Validateemail("Shweta48@"));
    }

    // email ends with .com

    @Test
    public void  givenEmail_EndsWithComOrIn_ShouldReturnTrue() {
        Assert.assertEquals("VALID_EMAIL" , UserRegistration.Validateemail("shweta48@gmail.com"));
    }
    // email do not ends with .COM OR IN

    @Test
    public void givenEmail_DoNotEndsWithComOrIn_ShouldReturnFalse() {
        Assert.assertEquals("INVALID_EMAIL" , UserRegistration.Validateemail("shweta48@"));
    }

    //Cases for Mobile Number
    //Phone number followed with country code

    @Test
    public void givenPhoneNumber_WhenFollowedByCountryCode_ShouldReturnTrue() {
        Assert.assertEquals("VALID_NUMBER" , UserRegistration.ValidatePhoneNumber("91 9784561230"));
    }

    // Number does not contain country code
    @Test
    public void givenPhoneNumber_DoesNotFollowedByCountryCode_ShouldReturnFalse(){
        Assert.assertEquals("INVALID_NUMBER" ,UserRegistration.ValidatePhoneNumber("9876543210"));
    }

    // Phone Number Does Not have 10 digit number
    @Test
    public void givenPhoneNumber_DoNotHaveTenDigitNumber_ShouldReturnFalse() {
        Assert.assertEquals("INVALID_NUMBER" ,UserRegistration.ValidatePhoneNumber("789456123"));
    }

    // phone num  has 10 digit  number
    @Test
    public void givenPhoneNumber_HasTenDigitNumber_ShouldReturnTrue() {
        Assert.assertEquals("VALID_NUMBER" ,UserRegistration.ValidatePhoneNumber("7894561230"));
    }
 // Validation of Password
 //Must Contain Minimum 8 Characters

    @Test
    public void givenPassword_IsMinimumEightDigit_ShouldReturnTrue() {
        Assert.assertEquals("VALID_PASSWORD" ,UserRegistration.ValidatePassword("Code$123"));
    }
    //Does Not Fulfill The Criteria

    @Test
    public void givenPassword_WhenDoNotContainMinimumEightDigit_ShouldReturnFalse()  {
        Assert.assertEquals("INVALID_PASSWORD" ,UserRegistration.ValidatePassword("Code@12"));

    }
     //Case For One UpperCase
    //Password with 1 uppercase
    @Test
    public void givenPassword_WhenContainOneUpperCase_ShouldReturnTrue() {
        Assert.assertEquals("VALID_PASSWORD" , UserRegistration.ValidatePassword("Code@"));
    }
// password does not contain any uppercase
    @Test
    public void givenPassword_WhenContainsNoUpperCase_ShouldReturnFalse() {
        Assert.assertEquals("INVALID_PASSWORD" ,UserRegistration.ValidatePassword("code@"));
    }
    // case for 1 numeric number
    // password contains 1 numeric number
    @Test
    public void givenPassword_WhenContainsOneNumericNumber_ShouldReturnTrue()  {
        Assert.assertEquals("VALID_PASSWORD" ,UserRegistration.ValidatePassword("Code1"));
    }
    //case for no numeric number
    @Test
    public void givenPassword_DoNotContainOneNumericNumber_ReturnFalse() {
        Assert.assertEquals("INVALID_PASSWORD" ,UserRegistration.ValidatePassword("Code@#"));
    }
// case for One Special Character
//Have  1 special character
    @Test
    public void givenPassword_WhenPasswordHaveAtLeastOneSpecialCharacter_ShouldReturnTrue() {
        Assert.assertEquals("VALID_PASSWORD" ,UserRegistration.ValidatePassword("Code@"));
    }
    // have no special Character
    @Test
    public void givenPassword_WhenPasswordDoNotHaveAnySpecialCharacter_ShouldReturnFalse() {
        Assert.assertEquals("INVALID_PASSWORD" ,UserRegistration.ValidatePassword("Code123"));
    }
}
