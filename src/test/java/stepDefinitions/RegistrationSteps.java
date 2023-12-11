package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import pageObjects.RegistrationPage;

public class RegistrationSteps {
    public WebDriver driver;
    public RegistrationPage RP;



    public RegistrationSteps(){

  //  System.setProperty("webdriver.firefox.driver", "C:\\Users\\eddan\\SeleniumcucumberPro\\src\\test\\resources\\drivers\\geckodriver.exe");
  // driver = new FirefoxDriver();
WebDriverManager.chromedriver().setup();
driver= new ChromeDriver();

     // driver= new FirefoxDriver();
        driver.manage().window().maximize();
//        BP= new BasePage(driver);
      RP= new RegistrationPage(driver);
    }


//RegistrationPage RP = new RegistrationPage(driver);
    @Given("^I navigate to the website$")
    public void iNavigateToTheWebsite() {
      //  driver.get("https://prepmajor.com/user-account/");
//        BP.SelectBrowser("Chrome");
//      BP.goToUrl("https://prepmajor.com/user-account");
      //  registrationPage.openUrl();
        //RP.OpenURL("https://prepmajor.com/user-account/");

     //   driver.manage().window().maximize();
        RP.openUrl();

    }


    @And("^I click sign up button$")
    public void iClickSignUpButton() {
       //driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div/div/div/div[3]/a[2]/span")).click();
       // registrationPage.clickSignUpButton();
        RP.clickSignUpButton();
    }

    @And("I click  sign up")
    public void iClickSignUp() {

RP.clickSignUp();
    }

//    @And("^i enter the username$")
//    public void iEnterTheUsername() {
//       // driver.findElement(By.cssSelector("#stm-lms-register > form > div:nth-child(1) > div:nth-child(1) > div > input")).sendKeys("Kira");
//      RP.enterUsername();
//    }
    @And("I enter the username")
    public void i_enter_the_username() {
        // Write code here that turns the phrase above into concrete actions
       RP.enterUsername();
    }
//
    @And("^I enter the email$")
    public void iEnterTheEmail() {
        //driver.findElement(By.xpath("//*[@id=\"stm-lms-register\"]/form/div[1]/div[2]/div/input")).sendKeys("kira@yahoo.com");
       RP.enterEmail();
    }
//
//    @And("^i enter Password$")
//    public void iEnterPassword() {
//        //driver.findElement(By.xpath("//*[@id=\"stm-lms-register\"]/form/div[2]/div[1]/div/input")).sendKeys("Kira123@");
//        registrationPage.enterPassword();
//    }
@And("I enter Password")
public void i_enter_password() {
   RP.enterPassword();
}

//    @And("^I enter confirm Password$")
//    public void iEnterConfirmPassword() {
//
//        //driver.findElement(By.name("password_re")).sendKeys("Kira123@");
//        registrationPage.enterConfirmPassword();
//    }
@And("I enter confirm Password")
public void i_enter_confirm_password() {
    RP.enterConfirmPassword();
}
//
    @When("I click on Submit button")
    public void i_click_on_submit_button() {
RP.SubmitButtonlink();
    }
    @Then("Enrolled courses displayed")
    public void enrolled_courses_displayed() {
        Assert.assertEquals(RP.VerifyEnrolltext(),"Enrolled Courses");
    }
//
//    @And("^I click register instructor$")
//    public void iTickRegisterIsAnInstructor() throws InterruptedException {
//        Thread.sleep(5000);
//        //driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/div/div/div[2]/div/form/div[4]/div/div/label/span[2]")).click();
//         registrationPage.clickInstructor();
//    }
//
//    @And("I enter degree")
//    public void iEnterDegree() {
//       // driver.findElement(By.xpath("//*[@id=\"stm-lms-register\"]/form/div[4]/div[1]/div/input")).sendKeys("computer");
//        registrationPage.enterDegree();
//    }
//
//    @And("I enter expertize")
//    public void iEnterExpertize() {
//       // driver.findElement(By.xpath("//*[@id=\"stm-lms-register\"]/form/div[4]/div[2]/div/input")).sendKeys("scrum");
//      registrationPage.enterExpertize();
//    }
//
//    @And("^I click on register button$")
//    public void iClickOnRegisterButton() throws InterruptedException {
//        Thread.sleep(5000);
//        //driver.findElement(By.xpath("//*[@id=\"stm-lms-register\"]/form/div[5]/div/div/button/span")).click();
//        registrationPage.clickRegisterButton();
//    }
//
//    @Then("Enrolled courses displayed")
//    public void EnrolledCoursesDisplayed() {
//        //String expectedMessage = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/div/div[1]/h3")).getAccessibleName();
//        Assert.assertTrue(registrationPage.enrolledCoursesDisplayed());
//    }
}
