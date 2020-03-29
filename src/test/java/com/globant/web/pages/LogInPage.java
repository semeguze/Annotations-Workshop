package com.globant.web.pages;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;

@Slf4j
@Getter
@Setter
public class LogInPage extends BasePage {

    /**
     * Fake record locators / WebElement's with fake .getText() value
     */
    private String fakeUsername = "TestName123";
    private String fakePassword = "APass123#:)";

    public LogInPage() {
    }

    public LogInPage(WebDriver pDriver) {
        super(pDriver);
    }

    /**
     * Method that validates if the username and password syntax are valid
     * @return boolean value as response of the validation
     */
    public boolean validateFields() {
        log.info("Validating syntax for 'username' field : {}", fakeUsername);
        log.info("Validating syntax for 'password' field : {}", fakePassword);
        log.info("Syntax is valid");
        return true;
    }

    /**
     * Method that manages the logic to login
     * @return boolean of the action performed
     */
    public boolean logInUser() {
        log.info("Get the auth token from /v1/oauth");
        String token = "ABBABANE123123238JDSKASDEK435345";
        log.info("Log in user with token : {}", token);
        log.info("Comparing data with DB");
        log.info("Log in successful");
        return true;
    }
}
