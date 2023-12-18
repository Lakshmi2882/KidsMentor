package pageObjects;


import Hooks.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MentorRegistrationPage {


        public WebDriver driver;
        public BasePage base;
        public MentorRegistrationPage(WebDriver driver){
            this.driver=driver;
base= new BasePage(driver);
        }



        By SignUpButton = By.xpath("//a[text()='Signup']");
        By JoinasMentor= By.xpath("//a[@class='tu-secbtn']");
        By Menteebutton= By.xpath("//a[@class='tu-primbtn tu-primbtn-gradient']");
        By Welcometxt=By.xpath("//div// h2[text()='Welcome!']");

        By Emailid = By.name("registration[email]");
        By FirstName = By.name("registration[fname]");
        By LastName = By.name("registration[lname]");
        By Password = By.name("registration[password]");
        By Mentorcheckbox = By.xpath("//div[@class='tu-check tu-radiosm']");
        By Termscheckbox= By.xpath("//div[@class='tu-check tu-signup-check']");

        By joinnowbutton = By.xpath("//span[text()='Join now ']");
        By Profile=By.cssSelector("div h4");
        By Errormessage= By.xpath("//div[text()='Please add a valid email address.']");


       public void openURL()
       {
           base.goToUrl();
       }

        public void ClickSignUpButton() {

            driver.findElement(SignUpButton).click();
        }
public String welcomeMessage()
{
   String txt= driver.findElement(Welcometxt).getText();
   return txt;

}

        public void enterEmail(String emailtxt) {

            driver.findElement(Emailid).sendKeys(emailtxt);
        }

        public void enterFirstName(String FirstNameTxt) {
            driver.findElement(FirstName).sendKeys(FirstNameTxt);
        }

        public void enterLastName(String Lastnametxt) {
            driver.findElement(LastName).sendKeys(Lastnametxt);
        }

        public void enterPassword(String Passwordtxt) {
            driver.findElement(Password).sendKeys(Passwordtxt);
        }

        public void ClickMentorRadioButton() {
            List<WebElement> list=driver.findElements(Mentorcheckbox);
            for(WebElement e: list)
            {
                String text= e.getText();
                if(text.contains("Mentor"))
                {
                    e.click();
                }


            }
        }
    public void ClickMenteeRadioButton() {
        List<WebElement> list=driver.findElements(Mentorcheckbox);
        for(WebElement e: list)
        {
            String text= e.getText();
            if(text.contains("Mentee"))
            {
                e.click();
            }


        }
    }

        public void clickTermsandconditionscheckbox() {
            driver.findElement(Termscheckbox).click();

        }

        public void clickJoinNowButton() {

            driver.findElement(joinnowbutton).click();
        }
        public String MyProfileSetting()
        {
            WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
            String text=    wait.until(ExpectedConditions.presenceOfElementLocated(Profile)).getText();
            return text;
        }
        public String GetErrorText()
        {
            WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
            String text=    wait.until(ExpectedConditions.presenceOfElementLocated(Errormessage)).getText();
            return text;
        }
        public void MenteeButton()
        {
            driver.findElement(Menteebutton).click();
        }
        public void JoinasMentor()
        {
            driver.findElement(JoinasMentor).click();
        }
        public void JoinasMentee()
        {
            driver.findElement(Menteebutton).click();
        }
    }

