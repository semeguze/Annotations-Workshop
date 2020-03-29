package com.globant.web.tests;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * Base test with the basic annotations for all the suites
 */

@Slf4j
public class BaseTest {

    @BeforeSuite
    public void beforeSuite() {
        log.info("[BeforeSuite] - Base Test");
        log.info("Setting up the driver");
        log.info("Validate Internet connection");

    }

    @AfterSuite
    public void afterSuite() {
        log.info("[AfterSuite] - Base Test");
        log.info("Close connection");
    }


}
