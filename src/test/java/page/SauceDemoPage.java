package page;

import org.openqa.selenium.support.PageFactory;
import utils.HooksWeb;

public class SauceDemoPage extends HooksWeb {

    public SauceDemoPage(){PageFactory.initElements(androidDriver,this);}

    public void executeElement(String element){
        androidDriver.executeScript(element);
    }

    public String usernameTextBoxJS(String key){return "document.querySelector(\"#user-name\").value='"+key+"';";}
    public String passwordTextBoxJS(String key){return "document.querySelector(\"#password\").value='"+key+"';";}
    public String clickLogin(){return "document.querySelector(\"#login-button\").click();";}

}
