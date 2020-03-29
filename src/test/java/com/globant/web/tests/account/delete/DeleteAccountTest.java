package com.globant.web.tests.account.delete;

import com.globant.web.tests.BaseTest;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.*;

@Slf4j
public class DeleteAccountTest extends BaseTest {


    @BeforeTest
    public void beforeTest() {
        log.info("=============================");
        log.info("[BeforeTest] - Verify endpoint /v1/account/delete");
    }

    @BeforeClass
    public void beforeClass() {
        log.info("[BeforeClass] - Validate user is logged in");
        log.info("[BeforeClass] - Load page to delete account");
    }

    @BeforeMethod
    public void beforeMethod() {
        log.info("[BeforeMethod] - Validate acceptance pop-up to delete account");
    }

    @AfterMethod
    public void afterMethod() {
        log.info("[AfterMethod] - Save log of account deleted");
    }

    @AfterClass
    public void afterClass() {
        log.info("[AfterClass] - Show confirmation message");
    }

    @AfterTest
    public void afterTest() {
        log.info("[AfterTest] - Finish Delete");
        log.info("=============================");
    }
}
