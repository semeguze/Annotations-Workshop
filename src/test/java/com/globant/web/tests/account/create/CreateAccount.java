package com.globant.web.tests.account.create;

import com.globant.web.pages.CreateAccountPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;

@Slf4j
public class CreateAccount extends CreateAccountTest {

    @Test
    public void createAccount() {
        log.info("[Test - Create account]");
        CreateAccountPage createAccountPage = new CreateAccountPage();

        log.info("Validating if username is available");
        Assert.assertTrue(createAccountPage.isUserAvailable());
        log.info("Validating if email is valid");
        Assert.assertTrue(createAccountPage.isEmailValid());
        log.info("Validating if password data is valid");
        Assert.assertTrue(createAccountPage.isPasswordValid());
        log.info("Validating if account has been created into the DB");
        Assert.assertTrue(createAccountPage.isAccountStored());
    }
}
