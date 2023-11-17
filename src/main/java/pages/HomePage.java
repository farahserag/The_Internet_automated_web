package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
  public HomePage(WebDriver driver){
      this.driver=driver;
  }
  public LoginPage clickFormAuthentication(){
  clickLink("Form Authentication");
   return  new LoginPage(driver);
  }
  public DropdownPage clickDropDown(){
      clickLink("Dropdown");
      return new DropdownPage(driver);
  }
  public KeyPressesPage clickKeyPresses(){
      clickLink("Key Presses");
      return new KeyPressesPage(driver);
  }
  public AlertsPage clickJavaScriptAlerts(){
      clickLink("JavaScript Alerts");
      return new AlertsPage (driver);
  }
  public DynamicLoadingPage clickDynamicLoading(){
      clickLink("Dynamic Loading");
      return new DynamicLoadingPage(driver);
  }
  private void clickLink(String linkText){
      driver.findElement(By.linkText(linkText)).click();
  }
}
