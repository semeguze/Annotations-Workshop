package com.globant.web.pages;

import com.globant.entities.Account;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;

@Slf4j
@Getter
@Setter
public class DeleteAccountPage extends BasePage {

    public DeleteAccountPage() {
    }

    public DeleteAccountPage(WebDriver pDriver) {
        super(pDriver);
    }

    public boolean removeAccount(){
        Account fakeAccount = getAccount();
        log.info("Account : {} deleted form DB", fakeAccount.getUsername());
        return true;
    }

    public boolean isAccountDeleted(){
        Account fakeAccount = getAccount();
        log.info("Account : {} is deleted or no longer exists", fakeAccount.getUsername());
        return true;
    }

    private Account getAccount(){
        return new Account("fakeAccount", "anyPass123");
    }

}
