package Hooks;


import org.openqa.selenium.WebDriver;




import org.openqa.selenium.WebDriver;

    public class BasePage {

        public WebDriver driver;

        public BasePage(WebDriver driver)
        {
            this.driver=driver;
        }

        public void goToUrl()
        {
            String url = "https://mentorskid.com";
            //String url = "https://prepmajor.com";
            driver.get(url);
        }
}
