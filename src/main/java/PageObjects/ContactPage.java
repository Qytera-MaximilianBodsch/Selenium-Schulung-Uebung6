package PageObjects;

import core.GeneralHelper;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class ContactPage extends GeneralHelper {
    public static final ContactPage contactpage = new ContactPage();
    public static ContactPage getInstance(){
        return contactpage;
    }

    public void checkBusinessIsChecked(){
        List<WebElement> radioButton = driver.findElements(By.name("your-customer-type"));
        for (WebElement e: radioButton) {
            if(e.getAttribute("value").equals("Business")){
                Assertions.assertTrue(e.isSelected());
            }
        }
    }
    
    public void checkPrivateIsNotChecked(){
        List<WebElement> radioButton = driver.findElements(By.name("your-customer-type"));
        for (WebElement e: radioButton) {
            if(e.getAttribute("value").equals("Private")){
                Assertions.assertFalse(e.isSelected());
            }
        }
    }
}
