package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class RegistrationSteps {
    public WebDriver driver;
    public pageObjects.RegistrationPage RP;



    public RegistrationSteps(){


        //driver= new ChromeDriver();
        WebDriverManager.firefoxdriver().setup();
        driver= new FirefoxDriver();
        driver.manage().window().maximize();
        RP= new pageObjects.RegistrationPage(driver);
    }



    @Given("^I navigate to the website$")
    public void iNavigateToTheWebsite() {
        RP.openUrl();

    }
    @And("^I click sign up button$")
    public void iClickSignUpButton() {
        RP.ClickSignUpButton();
    }

    @And("I click  sign up")
    public void iClickSignUp() {
        RP.clickSignUp();
    }
    @When("I enter the email {string}")

    public void iEnterTheEmail(String emailtxt)
    {
        RP.enterEmail(emailtxt);
    }

    @And("I enter the username {string}")
    public void iEnterTheUsernameString (String usernametxt) {
        RP.enterUsername(usernametxt);
    }

    @And("I enter Password {string}")
    public void iEnterPassword(String passwordtxt)
    {
        RP.enterPassword(passwordtxt);
    }

    @And("I enter confirm Password {string}")
    public void iEnterConfirmPassword(String confirmtxt)
    {
        RP.enterConfirmPassword(confirmtxt);
    }

    @When("I click on Submit button")
    public void i_click_on_submit_button()
    {
        RP.SubmitButtonlink();
    }
    @Then("Enrolled courses displayed")
    public void enrolled_courses_displayed()
    {
        Assert.assertEquals(RP.VerifyEnrolltext(),"Enrolled Courses");
    }


    @Then("the text {string} is displayed")
    public void theTextIsDisplayed(String arg0)
    {
        Assert.assertEquals(RP.InvalidEmail(),"Please enter a valid email");
    }
}