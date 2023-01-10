package stepDefinition;

import Base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;
import pages.LoginPage;
import pages.SecureArea;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginStep extends BaseTest {
   @Before
    @Override
    public void setup() {
        super.setup();
    }

    LoginPage loginPage;
    SecureArea secureArea;

    @Given("nevigate to login")
    public void login()
    {
        loginPage=  homePage.clickFormAuthenication();
    }
    @When("I enter valid {string}" )

    public void sendName(String name){
        loginPage.setUserName(name);

    }
    @And("i enter valid {string}")

    public void sendPassword(String password){
        loginPage.serPassowrd(password);
    }
    @And("i click on button1")
    public void iClickOnButton() throws InterruptedException {
        // loginPage.clickLoginbutton();
        secureArea= loginPage.clickLoginbutton();
        Thread.sleep(3000);

    }
    @Then("success happen")
    public void userLoginSuccess() {
        assertTrue("alert text is incorrect",secureArea.getAlertText().contains("You logged into a secure area!"));

    }
    @And("user go to homepage")
    public void getHome(){
        System.out.println("hi ya ");
        assertEquals("wrong",driver.getCurrentUrl(),"https://the-internet.herokuapp.com/secure");
    }
    @Then("login fail")

    public void failLogin() {

        assertTrue("alert text is incorrect",loginPage.getAlertText().contains(" Your username is invalid!"));

    }
    @After
    public void close(){
        System.out.println("it work ya 7omar");
        driver.quit();

    }
}
