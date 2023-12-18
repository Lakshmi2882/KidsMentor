package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageObjects.MentorRegistrationPage;

public class MentorRegistrationStepDefinition {
    public WebDriver driver;
  public   MentorRegistrationPage Mentor;
  public MentorRegistrationStepDefinition()
  {
      WebDriverManager.chromedriver().setup();
      driver= new ChromeDriver();

      Mentor= new MentorRegistrationPage(driver);
      driver.manage().window().maximize();

  }
    @Given("I navigate to the website")
    public void iNavigateToTheWebsite() {
      Mentor.openURL();

    }



    @Then("welcome page displayed")
    public void welcomePageDisplayed() {
      Assert.assertEquals(Mentor.welcomeMessage(),"Welcome!");
    }

    @When("I enter first name {string}")
    public void iEnterFirstName(String FName) {
    Mentor.enterFirstName(FName);
    }

    @And("I enter last name {string}")
    public void iEnterLastName(String LName) {
    Mentor.enterLastName(LName);
    }

    @And("I enter the email {string}")
    public void iEnterTheEmail(String emailtxt) {
    Mentor.enterEmail(emailtxt);
    }

    @And("I enter Password {string}")
    public void iEnterPassword(String pwdtxt) {
    Mentor.enterPassword(pwdtxt);
    }



    @And("I click terms and condition")
    public void iClickTermsAndCondition() {
    Mentor.clickTermsandconditionscheckbox();
    }

    @And("I click join now")
    public void iClickJoinNow() {
    Mentor.clickJoinNowButton();
    }





  @And("I click Mentor checkbox")
  public void iClickMentorCheckbox() {
    Mentor.ClickMentorRadioButton();
  }

  @And("I click Mentee checkbox")
  public void iClickMenteeCheckbox() {
    Mentor.ClickMenteeRadioButton();
  }

  @When("I click start as a mentor")
  public void iClickStartAsAMentor() {
    Mentor.JoinasMentor();
  }

  @When("I click start as a mentee")
  public void iClickStartAsAMentee() {
    Mentor.JoinasMentee();
  }
}
