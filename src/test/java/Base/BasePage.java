package Base;


import org.openqa.selenium.WebDriver;



public class BasePage {

 public WebDriver driver;//class variable

    public BasePage(WebDriver driver){//local driver
this.driver=driver;//class driver= local driver



    }


    public void goToUrl(){
      String url = "https://prepmajor.com";
        driver.get(url);



    }

public void CloseBrowser()
{
    driver.close();
}


}
