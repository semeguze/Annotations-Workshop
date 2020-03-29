package com.globant.web.tests.account.delete;

import com.globant.web.pages.DeleteAccountPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;

@Slf4j
public class DeleteAccount extends DeleteAccountTest {

    /**
     * Test to delete an account
     */
    @Test
    public void deleteAccount() {
        log.info("[Test - Delete account]");
        DeleteAccountPage deleteAccountPage = new DeleteAccountPage();

        log.info("Deleting account");
        Assert.assertTrue(deleteAccountPage.removeAccount());
        log.info("Validating if account has been deleted successfully");
        Assert.assertTrue(deleteAccountPage.isAccountDeleted());
    }
}
