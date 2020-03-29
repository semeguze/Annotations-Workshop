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

    public boolean isUserAvailable() {
        log.info("The user : {} is valid", fakeUsername);
        return true;
    }

    public boolean isEmailValid() {
        log.info("The email : {} is valid", fakeEmail);
        return true;
    }

    public boolean isPasswordValid() {
        if (fakePasswordOriginal.equals(fakePasswordCopy)) {
            log.info("The password is valid");
            return true;
        } else {
            log.info("The password is invalid");
            return false;
        }
    }

    public boolean isAccountStored() {
        log.info("The account is already stored");
        return true;
    }
}
