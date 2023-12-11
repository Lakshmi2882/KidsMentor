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
     By Signupbutton= By.xpath("//a[@class='btn btn-default']");
     By  SignUP=By.id("masterstudy-authorization-sign-up");
     By UserName= By.xpath("//input[@name='register_user_login']");
     By Emailid= By.name("register_user_email");
     By Password=By.name("register_user_password");
     By ConfirmPassword= By.name("register_user_password_re");

    By Submitbutton= By.xpath("(//span[text()='Sign Up'])[2]");
    By Enrolltext= By.xpath("//div//h3[text()='Enrolled Courses']");
            //By.xpath("//a[@class='masterstudy-button masterstudy-button_style-primary masterstudy-button_size-sm']//span[text()='Sign Up']");
   public  void openUrl(){
      bp.goToUrl();
   }

//    }
//
//    //@FindBy(id = "cn-accept-cookies")
//    //private  WebDriver acceptCookiesButton;
//
//
//   //a[@id='masterstudy-authorization-sign-up']
//   private WebElement signUpButton;
//
//   @FindBy(css = "#stm-lms-register > form > div:nth-child(1) > div:nth-child(1) > div > input")
// //   @FindBy(name="user_login")
//    private WebElement username;
//
//  @FindBy(xpath = "//*[@id=\"stm-lms-register\"]/form/div[1]/div[2]/div/input")
//  // @FindBy(name="user_password")
//    private WebElement email;
//
//    @FindBy(xpath = "//*[@id=\"stm-lms-register\"]/form/div[2]/div[1]/div/input")
//    private WebElement password;
//
//    @FindBy(name = "password_re")
//    private WebElement confirmPassword;
//
//   @FindBy(css= ".stm_lms_register_wrapper__actions > label:nth-child(1) > span:nth-child(2)")
//    private WebElement instructor;
//
//   @FindBy(xpath = "//*[@id=\"stm-lms-register\"]/form/div[4]/div[1]/div/input")
//    private WebElement degree;
//
//   @FindBy(xpath = "//*[@id=\"stm-lms-register\"]/form/div[4]/div[2]/div/input")
//    private WebElement expertize;
//
//   @FindBy(css = "button.btn > span:nth-child(1)")
//   private WebElement registerButton;
//
//   @FindBy(css = ".stm_lms_user_info_top > h3:nth-child(1)")
//   private WebElement enrolledCoursesDisplayed;

  public void clickSignUpButton(){

      driver.findElement(Signupbutton).click();
  }
  public void clickSignUp()
  {
      driver.findElement(SignUP).click();
  }

   public void enterUsername(){
//       WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
//       wait.until(ExpectedConditions.presenceOfElementLocated(UserName)).sendKeys("Lakshmi");
      driver.findElement(UserName).sendKeys("Lakshmi456");
   }

   public void enterEmail(){
     //  email.sendKeys("Ll@gmail.com");
       driver.findElement(Emailid).sendKeys("lll23@gmail.com");
   }

   public void enterPassword(){
       driver.findElement(Password).sendKeys("234weR*U");
   }
   public void enterConfirmPassword(){
       driver.findElement(ConfirmPassword).sendKeys("234weR*U");
   }
public void SubmitButtonlink()
{
   // WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
    //   wait.until(ExpectedConditions.presenceOfElementLocated(Submitbutton)).click();
 driver.findElement(Submitbutton).click();

}
public String VerifyEnrolltext()
{
    WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
    String text=   wait.until(ExpectedConditions.presenceOfElementLocated(Enrolltext)).getText();
    return text;
}
//   public void clickInstructor() {
//      instructor.click();
//  }
//  public  void  enterDegree(){
//       degree.sendKeys("computer");
//  }
//  public void enterExpertize(){
//       expertize.sendKeys("scrum");
//  }
//  public void clickRegisterButton(){
//       registerButton.click();
//  }
//    public boolean enrolledCoursesDisplayed() {
//        return enrolledCoursesDisplayed.isDisplayed();
//    }
}
