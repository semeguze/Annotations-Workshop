package com.globant.web.tests.account.logOut;

import com.globant.web.pages.LogOutPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;

@Slf4j
public class LogOut extends LogOutTest {

    @Test
    public void deleteAccount() {
        log.info("[Test - LogOut]");
        LogOutPage logOutPage = new LogOutPage();

        log.info("Validating if user is able to log out");
        Assert.assertTrue(logOutPage.isLogOutPossible());
        log.info("Log out user from account");
        Assert.assertTrue(logOutPage.logOutUser());
    }
}
