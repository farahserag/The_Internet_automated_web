package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AlertTests extends BaseTests {
    @Test
    public void testAcceptAlert (){
      var alertsPage=  homePage.clickJavaScriptAlerts();
      alertsPage.triggerAlert();
      alertsPage.alert_clickToAccept();
     assertEquals
    (alertsPage.getResult(),
            "You successfully clicked an alert") ;
    }
    @Test
    public void testGetTextAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text,"I am a JS Confirm");
    }
    @Test
    public void testSetInputAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();

        String text ="Farah Serag";
        alertsPage.alert_SetInput(text);
        alertsPage.alert_clickToAccept();

        assertEquals(alertsPage.getResult(),"You entered: "+text );
    }
}
