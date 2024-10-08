package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.Hooks;

public class ContentPage extends Hooks {
    public ContentPage(){PageFactory.initElements(androidDriver,this);}

    public WebElement findelementByAccesibilityId(String id){
        return androidDriver.findElementByAccessibilityId(id);
    }

    public void clickElement(WebElement element){element.click();}
    public void isDisplayedElement(WebElement element){Assert.assertTrue(element.isDisplayed(),"Element is not visible");}

    public WebElement getContentButton(){return findelementByAccesibilityId("Content");}
    public WebElement getResourcesButton(){return findelementByAccesibilityId("Resources");}
    public WebElement getStyledTextButton(){return findelementByAccesibilityId("StyledText");}

}
