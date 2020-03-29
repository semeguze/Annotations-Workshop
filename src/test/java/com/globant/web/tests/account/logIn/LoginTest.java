package com.globant.web.tests.account.logIn;

import com.globant.web.tests.BaseTest;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.*;

@Slf4j
public class LoginTest extends BaseTest {


    @BeforeTest
    public void beforeTest() {
        log.info("=============================");
        log.info("[BeforeTest] - Verify endpoint /v1/account/login");
    }

    @BeforeClass
    public void beforeClass() {
        log.info("[BeforeClass] - Load page to log-in");
    }

    @BeforeMethod
    public void beforeMethod() {
        log.info("[BeforeMethod] - Validate log in fields are not empty");
    }

    @AfterMethod
    public void afterMethod() {
        log.info("[AfterMethod] - Save log of log in");
    }

    @AfterClass
    public void afterClass() {
        log.info("[AfterClass] - Show home page");
    }

    @AfterTest
    public void afterTest() {
        log.info("[AfterTest] - Finish LogIn");
        log.info("=============================");
    }
}
