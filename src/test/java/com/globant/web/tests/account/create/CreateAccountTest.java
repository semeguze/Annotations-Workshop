package com.globant.web.tests.account.create;

import com.globant.web.tests.BaseTest;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.*;

@Slf4j
public class CreateAccountTest extends BaseTest {


    @BeforeTest
    public void beforeTest() {
        log.info("=============================");
        log.info("[BeforeTest] - Verify endpoint /v1/account/create");
    }

    @BeforeClass
    public void beforeClass() {
        log.info("[BeforeClass] - Load page to create account");
    }

    @BeforeMethod
    public void beforeMethod() {
        log.info("[BeforeMethod] - Validate fields are valid");
    }

    @AfterMethod
    public void afterMethod() {
        log.info("[AfterMethod] - Save log of account creation");
    }

    @AfterClass
    public void afterClass() {
        log.info("[AfterClass] - Show confirmation message");
    }

    @AfterTest
    public void afterTest() {
        log.info("[AfterTest] - Log Out from new account");
        log.info("[AfterTest] - Finish creation");
        log.info("=============================");
    }
}
