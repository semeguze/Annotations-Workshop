package com.globant.web.pages;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;

@Slf4j
@Getter
@Setter
public class LogOutPage extends BasePage {

    /**
     * Fake record locators / WebElement's with fake .getText() value
     */
    private String fakeUsername = "TestName123";
    private String fakePassword = "APass123#:)";
    private boolean isEverythingSaved = true;

    public LogOutPage() {
    }

    public LogOutPage(WebDriver pDriver) {
        super(pDriver);
    }

    public boolean isLogOutPossible() {
        if (isEverythingSaved){
            log.info("Everything is saved. The user can log out");
            return true;
        }else{
            log.info("There is something not saved. The user can not log out");
            return false;
        }
    }

    public boolean logOutUser() {
        log.info("Secure disconnecting");
        log.info("Saving timestamp");
        return true;
    }
}
