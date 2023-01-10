package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public Object getCookieManager;
    /*
     *  we use webdriver element in order to do the find element, so we can use it in all page
     */
    private WebDriver driver;
    public HomePage(WebDriver driver){

        this.driver=driver;
    }
    public LoginPage clickFormAuthenication(){
        // to open the page of link  it must return the handler of new paege beacuse your action change page

        clickLink("Form Authentication");

        return new LoginPage(driver);

    }

    private void clickLink(String lintText){
        driver.findElement(By.linkText(lintText)).click();
    }

}
