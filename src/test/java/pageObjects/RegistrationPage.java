package pageObjects;


import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class RegistrationPage  {

    public WebDriver driver;
    public BasePage bp;

    public RegistrationPage(WebDriver driver){
        this.driver=driver;
        bp= new BasePage(driver);
        //  PageFactory.initElements(driver, this);

    }
    By SignUpButton= By.xpath("//a[@class='btn btn-default']");
    By  SignUP=By.id("masterstudy-authorization-sign-up");
    By Emailid= By.name("register_user_email");
    By UserName= By.xpath("//input[@name='register_user_login']");
    By Password=By.name("register_user_password");
    By ConfirmPassword= By.name("register_user_password_re");

    By SubmitButton= By.xpath("(//span[text()='Sign Up'])[2]");
    By EnrollText= By.xpath("//div//h3[text()='Enrolled Courses']");
    By EnterValidEmailText = By.xpath("//span[text()='Please enter a valid email']");

    public  void openUrl()
    {
        bp.goToUrl();
    }


    public void ClickSignUpButton()
    {

        driver.findElement(SignUpButton).click();
    }
    public void clickSignUp()
    {
        driver.findElement(SignUP).click();
    }

    public void enterEmail(String emailtxt)
    {

        driver.findElement(Emailid).sendKeys(emailtxt);
    }

    public void enterUsername(String usernametxt){
//       WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
//       wait.until(ExpectedConditions.presenceOfElementLocated(UserName)).sendKeys("Lakshmi");
        driver.findElement(UserName).sendKeys(usernametxt);
    }

    public void enterPassword(String confirmtxt)
    {
        driver.findElement(Password).sendKeys(confirmtxt);
    }
    public void enterConfirmPassword(String confirmtxt)
    {
        driver.findElement(ConfirmPassword).sendKeys(confirmtxt);
    }
    public void SubmitButtonlink()
    {
        // WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
        //   wait.until(ExpectedConditions.presenceOfElementLocated(Submitbutton)).click();
        driver.findElement(SubmitButton).click();

    }
    public String VerifyEnrolltext()
    {
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
        String text=   wait.until(ExpectedConditions.presenceOfElementLocated(EnrollText)).getText();
        return text;
    }

    public String InvalidEmail()
    {      WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
        String text=   wait.until(ExpectedConditions.presenceOfElementLocated(EnterValidEmailText)).getText();

        return text;
    }


}