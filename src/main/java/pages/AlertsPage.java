package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
   private WebDriver driver;
   private By TriggerAlertButton =
           By.xpath(".//button[text()=\"Click for JS Alert\"]");
    private By TriggerConfirmButton =
            By.xpath(".//button[text()=\"Click for JS Confirm\"]");
   private By TriggerPromptButton =
           By.xpath(".//button[text()=\"Click for JS Prompt\"]");

   private By results =By.id("result");
   public AlertsPage(WebDriver driver){
       this.driver=driver;
   }
   public void triggerAlert(){
       driver.findElement(TriggerAlertButton).click();
   }
    public void triggerConfirm (){
        driver.findElement(TriggerConfirmButton).click();
    }
    public void triggerPrompt(){
       driver.findElement(TriggerPromptButton).click();
    }
    public void alert_SetInput(String text){
       driver.switchTo().alert().sendKeys(text);
    }

   public void alert_clickToAccept(){
       driver.switchTo().alert().accept();
   }
    public void alert_clickToDismiss(){
       driver.switchTo().alert().dismiss();
    }
    public String alert_getText(){
       return driver.switchTo().alert().getText();
    }
   public String getResult(){
       return driver.findElement(results).getText();
   }


}
