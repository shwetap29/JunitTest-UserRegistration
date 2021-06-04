package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_valid_ReturnTrue() {
        Assert.assertEquals("valid" , UserRegistration.validateFirstName("FirstName"));
    }

    @Test
    public void givenFirstName_Invalid_ReturnFalse() {
        Assert.assertEquals("Invalid_FirstName" , UserRegistration.validateFirstName("firstName"));{
    }

}
