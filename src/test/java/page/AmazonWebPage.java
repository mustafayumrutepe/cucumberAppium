package page;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.HooksWeb;

public class AmazonWebPage extends HooksWeb {
    //public AmazonWebPage(){PageFactory.initElements(androidDriver, this);}
    public AmazonWebPage(AndroidDriver<WebElement>driver){this.androidDriver = driver;}
    //testimiz (androidDrive is null) hatası verince PageFactory yi bu şekilde değiştirdik. daha sağlam olsun
    //tabi bunu parametreli yapınca AmazonSearchBoxStep'te de
    // (AmazonWebPage amazonWebPage = new AmazonWebPage(androidDriver);) e androidDriver ekledik


    public String searchTextBoxJS(String key){
        return "document.querySelector(\"#twotabsearchtextbox\").value='"+key+"';";
    }

    public String clickSearchBoxJS(){return "document.querySelector(\"#nav-search-submit-button\").click();";}

    public void executeElement(String element){
        androidDriver.executeScript(element);
    }


}
