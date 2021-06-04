package com.bridgelabz;


import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationJunitTest {
    // case for first name
    UserRegistration user = new UserRegistration();


    //Name Starts with a capital letter
    @Test
    public void givenFirstName_WhenStartsWith_CapitalLetter_ShouldReturn_Valid() {
        Assert.assertEquals("valid", UserRegistration.validateFirstName("Shweta", user.validate));
    }

    // Name contains number
    @Test
    public void givenFirstName_WhenContainsNumber_ShouldReturn_InValid() {
        Assert.assertEquals("INVALID_FIRSTNAME" ,UserRegistration.validateFirstName("Shweta29" , user.validate));
    }

    //When name does not contain minimum 3 letters
    @Test
    public void givenFirstName_DoNotReturnMinThreeLetters_ShouldReturn_Invalid() {
        Assert.assertEquals("INVALID_FIRSTNAME" ,UserRegistration.validateFirstName("Sh", user.validate));
    }

    // When name starts with small letters
    @Test
    public void givenFirstName_StartsWithSmallLetter_ShouldReturn_Invalid() {
        Assert.assertEquals("INVALID_FIRSTNAME" ,UserRegistration.validateFirstName("shweta", user.validate));
    }

    // Case For LastName
    //Last Name do not starts with Min three Letters
    @Test
    public void givenLastName_WhenDoNotReturnMinThreeLetters_ShouldReturnFalse() {
        Assert.assertEquals("INVALID_FIRSTNAME" ,UserRegistration.validateLastName("PR" , user.validate));

    }
    // Last Name start with small letter
    @Test
    public void givenLastName_WhenDoNotStartWithCapitalLetters_ShouldReturnFalse() {
        Assert.assertEquals("INVALID_LASTNAME" ,UserRegistration.validateLastName("prasad", user.validate));
    }

    // Last Name Starts With a Capital Letter
    @Test
    public void givenLastName_WhenStartsWithCapitalLetters_ShouldReturn_Valid() {
        Assert.assertEquals("VALID_LASTNAME" ,UserRegistration.validateLastName("Prasad", user.validate));
    }

    // case For Email

    // Email starts with small letter

    @Test
    public void givenEmail_WhenStartsWithSmallLetter_ShouldReturn_Valid() {
        Assert.assertEquals("VALID_EMAIL" , UserRegistration.validateEmail("shweta48@" , user.validate));
    }
    //Email starts with Capital letter

    @Test
    public void givenEmail_StartsWithCapitalLetter_ShouldReturn_Invalid() {
        Assert.assertEquals("INVALID_EMAIL" , UserRegistration.validateEmail("Shweta48@", user.validate));
    }

    // email ends with .com

    @Test
    public void  givenEmail_EndsWithComOrIn_ShouldReturn_Valid() {
        Assert.assertEquals("VALID_EMAIL" , UserRegistration.validateEmail("shweta48@gmail.com", user.validate));
    }
    // email do not ends with .COM OR IN

    @Test
    public void givenEmail_DoNotEndsWithComOrIn_ShouldReturn_Invalid() {
        Assert.assertEquals("INVALID_EMAIL" , UserRegistration.validateEmail("shweta48@" , user.validate));
    }

    //Cases for Mobile Number
    //Phone number followed with country code

    @Test
    public void givenPhoneNumber_WhenFollowedByCountryCode_ShouldReturn_Valid() {
        Assert.assertEquals("VALID_NUMBER" , UserRegistration.validateMobileNumber("91 9784561230", user.validate));
    }

    // Number does not contain country code
    @Test
    public void givenPhoneNumber_DoesNotFollowedByCountryCode_ShouldReturn_Invalid(){
        Assert.assertEquals("INVALID_NUMBER" ,UserRegistration.validateMobileNumber("9876543210", user.validate));
    }

    // Phone Number Does Not have 10 digit number
    @Test
    public void givenPhoneNumber_DoNotHaveTenDigitNumber_ShouldReturnInvalid() {
        Assert.assertEquals("INVALID_NUMBER" ,UserRegistration.validateMobileNumber("789456123",user.validate));
    }

    // phone num  has 10 digit  number
    @Test
    public void givenPhoneNumber_HasTenDigitNumber_ShouldReturn_Valid() {
        Assert.assertEquals("VALID_NUMBER" ,UserRegistration.validateMobileNumber("7894561230" , user.validate));
    }
    // Validation of Password
    //Must Contain Minimum 8 Characters

    @Test
    public void givenPassword_IsMinimumEightDigit_ShouldReturn_Valid() {
        Assert.assertEquals("VALID_PASSWORD" ,UserRegistration.validatePassword("Code$123", user.validate));
    }
    //Does Not Fulfill The Criteria

    @Test
    public void givenPassword_WhenDoNotContainMinimumEightDigit_ShouldReturn_Invalid()  {
        Assert.assertEquals("INVALID_PASSWORD" ,UserRegistration.validatePassword("Code@12", user.validate));

    }
    //Case For One UpperCase
    //Password with 1 uppercase
    @Test
    public void givenPassword_WhenContainOneUpperCase_ShouldReturn_Valid() {
        Assert.assertEquals("VALID_PASSWORD" , UserRegistration.validatePassword("Code@", user.validate));
    }
    // password does not contain any uppercase
    @Test
    public void givenPassword_WhenContainsNoUpperCase_ShouldReturn_Invalid() {
        Assert.assertEquals("INVALID_PASSWORD" ,UserRegistration.validatePassword("code@", user.validate));
    }
    // case for 1 numeric number
    // password contains 1 numeric number
    @Test
    public void givenPassword_WhenContainsOneNumericNumber_ShouldReturn_Valid()  {
        Assert.assertEquals("VALID_PASSWORD" ,UserRegistration.validatePassword("Code1", user.validate));
    }
    //case for no numeric number
    @Test
    public void givenPassword_DoNotContainOneNumericNumber_Return_Invalid() {
        Assert.assertEquals("INVALID_PASSWORD" ,UserRegistration.validatePassword("Code@#" , user.validate));
    }
    // case for One Special Character
//Have  1 special character
    @Test
    public void givenPassword_WhenPasswordHaveAtLeastOneSpecialCharacter_ShouldReturn_Valid() {
        Assert.assertEquals("VALID_PASSWORD" ,UserRegistration.validatePassword("Code@" , user.validate));
    }
    // have no special Character
    @Test
    public void givenPassword_WhenPasswordDoNotHaveAnySpecialCharacter_ShouldReturn_Invalid() {
        Assert.assertEquals("INVALID_PASSWORD" ,UserRegistration.validatePassword("Code123", user.validate));
    }
}


