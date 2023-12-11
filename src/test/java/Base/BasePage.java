package Base;


import org.openqa.selenium.WebDriver;

public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver){
this.driver=driver;

    }
//public WebDriver SelectBrowser(String browsername)
//{
//    if(browsername.equalsIgnoreCase("chrome"))
//    {
//         WebDriverManager.chromedriver().setup();
//        driver= new ChromeDriver();
//    }
//    return driver;
//}

    public void goToUrl(){
      String url = "https://prepmajor.com";
        driver.get(url);

    }

public void CloseBrowser()
{
   // driver.close();
}


}
