package GithubWeb;

import Base.BaseClass;
import Pages.GithubPages;
import Pages.LoginPages;
import io.qameta.allure.*;
import org.testng.annotations.Test;

public class GithubTest extends BaseClass {
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("This is a method to verify that user is able to view and nav to docs ")
    public void mainPageMethod() throws InterruptedException {
        GithubPages github = new GithubPages(driver);
        github.openGitUrl();
        Thread.sleep(2000);
        github.clickOnDocs();
        Thread.sleep(2000);

    }
    @Test
    public void signInMethod() throws InterruptedException {
        GithubPages signIn = new GithubPages(driver);
        signIn.openGitUrl();
        signIn.clickOnSignInBtn();

        // Create an instance of LoginPages and use it directly
        LoginPages login = new LoginPages(driver);
        login.enterUserName();
        login.enterPassword();
        login.clickOnLoginBtn();

    }
}
