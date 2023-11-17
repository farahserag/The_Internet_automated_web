package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DropDownTest extends BaseTests {
    @Test
    public void TestSelectOption (){
        var dropdDownPage = homePage.clickDropDown();
        String option = "Option 1";
        dropdDownPage.selectFromDropDown(option);
        var selectedOptions = dropdDownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        assertTrue(selectedOptions.contains(option), "Option not selected");

    }
}
