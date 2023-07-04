package curso.etech.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static curso.etech.commos.BaseTest.driver;

public class IntroducaoPage {

    public IntroducaoPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "txtPular")
    private WebElement botaoPular;

    public WebElement getBotaoPular() {
        return botaoPular;
    }
}
