package com.globant.web.tests.account.logOut;

import com.globant.web.tests.BaseTest;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.*;

@Slf4j
public class LogOutTest extends BaseTest {


    @BeforeTest
    public void beforeTest() {
        log.info("=============================");
        log.info("[BeforeTest] - Verify endpoint /v1/account/logout");
    }

    @BeforeClass
    public void beforeClass() {
        log.info("[BeforeClass] - Load popout to log-out");
    }

    @BeforeMethod
    public void beforeMethod() {
        log.info("[BeforeMethod] - Validate acceptance pop-up to logout");
    }

    @AfterMethod
    public void afterMethod() {
        log.info("[AfterMethod] - Save log of log out");
    }

    @AfterClass
    public void afterClass() {
        log.info("[AfterClass] - Show home page");
    }

    @AfterTest
    public void afterTest() {
        log.info("[AfterTest] - Finish LogOut");
        log.info("=============================");
    }
}
