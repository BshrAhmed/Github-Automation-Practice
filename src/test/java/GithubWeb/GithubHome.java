package GithubWeb;

import Base.BaseClass;
import Pages.HomePages;
import Pages.LoginPages;
import org.testng.annotations.Test;

public class GithubHome extends BaseClass  {



    @Test(testName = "TS-001")
    public void loginPageMethod() throws InterruptedException {
        LoginPages login = new LoginPages(driver);


        login.openUrl();
        login.enterUserName();
        login.enterPassword();
        login.clickOnLoginBtn();


    }
    @Test (testName = "TS-002")
    public void HomePageMethod() throws InterruptedException {
        HomePages home = new HomePages(driver);
        loginPageMethod();
        // use previous method

        Thread.sleep(3000);
        home.clickOnNavigatorBtn();
        home.clickOnRepo();
        home.createNewRepo();
        home.newRepoName();
        Thread.sleep(2000);
        home.scrollToPosition(0,600);
        Thread.sleep(2000);
        home.createRepoButton();
        Thread.sleep(2000);
    }

}
