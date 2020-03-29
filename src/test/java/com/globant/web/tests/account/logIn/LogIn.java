package com.globant.web.tests.account.logIn;

import com.globant.web.pages.DeleteAccountPage;
import com.globant.web.pages.LogInPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;

@Slf4j
public class LogIn extends LoginTest {

    @Test
    public void deleteAccount() {
        log.info("[Test - LogIn]");
        LogInPage logInPage = new LogInPage();

        log.info("Validating if username and password syntax are correct");
        Assert.assertTrue(logInPage.validateFields());
        log.info("Log in user into account");
        Assert.assertTrue(logInPage.logInUser());
    }
}
