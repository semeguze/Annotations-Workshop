package com.globant.web.pages;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;

@Slf4j
@Getter
@Setter
public class CreateAccountPage extends BasePage {

    /**
     * Fake record locators / WebElement's with fake .getText() value
     */
    private String fakeUsername = "TestName123";
    private String fakeEmail = "fake@email.com";
    private String fakePasswordOriginal = "APass123#:)";
    private String fakePasswordCopy = "APass123#:)";

    public CreateAccountPage() {
    }

    public CreateAccountPage(WebDriver pDriver) {
        super(pDriver);
    }

    /**
     * Method that validates if the username is available
     * @return boolean value as response of the validation
     */
    public boolean isUserAvailable() {
        log.info("The user : {} is valid", fakeUsername);
        return true;
    }

    /**
     * Method that validates if the email is available
     * @return boolean value as response of the validation
     */
    public boolean isEmailValid() {
        log.info("The email : {} is valid", fakeEmail);
        return true;
    }

    /**
     * Method that validates if original pass and the copy pass are the same
     * @return boolean value as response of the validation
     */
    public boolean isPasswordValid() {
        if (fakePasswordOriginal.equals(fakePasswordCopy)) {
            log.info("The password is valid");
            return true;
        } else {
            log.info("The password is invalid");
            return false;
        }
    }

    /**
     * Method that validates if account is already saved
     * @return boolean value as response of the validation
     */
    public boolean isAccountStored() {
        log.info("The account is already stored");
        return true;
    }
}
