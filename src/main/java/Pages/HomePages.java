package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static ObjectsPath.HomePaths.*;

public class HomePages {
    WebDriver driver = null;

    public HomePages(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnNavigatorBtn(){
        WebElement navigateBtn = driver.findElement(navigatorButton);
        navigateBtn.click();
    }

    public void clickOnRepo(){
        WebElement repoBtn = driver.findElement(repoButton);
        repoBtn.click();
    }

    public void createNewRepo(){
        WebElement NewRepo = driver.findElement(newRepoButton);
        NewRepo.click();
    }

    public void newRepoName(){
        WebElement repoNametxt = driver.findElement(repoName);
        repoNametxt.sendKeys("Bshr6");
    }

    public void createRepoButton() throws InterruptedException {
        WebElement CreateRepoBtn = driver.findElement(createRepoButton);
        CreateRepoBtn.click();
    }

    public void scrollToPosition(int x, int y) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(arguments[0], arguments[1]);", x, y);
        //Using JavaScript for Scrolling via Selenium
    }

}

