package ObjectsPath;

import org.openqa.selenium.By;

public class HomePaths {
    public static final By navigatorButton  = By.xpath("//div[@class='AppHeader-user']//child::button");

    public static final By repoButton  = By.xpath("//span[text()='Your repositories']");

    public static final By newRepoButton  = By.xpath("//*[@id='user-profile-frame']/div/div[1]/div/div/a");

    public static final By repoName  = By.xpath("//input[@data-testid='repository-name-input']");

    public static final By createRepoButton  = By.xpath("//span[text()='Create repository']");


}
