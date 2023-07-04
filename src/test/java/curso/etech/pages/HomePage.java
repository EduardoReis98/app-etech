package curso.etech.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static curso.etech.commos.BaseTest.driver;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "imageBytesizemenu")
    private WebElement botaoMenuSuperior;

    private String xpathBotaoSuperior = "//*[@id='*']";

    @AndroidFindBy(id = "txtEmail")
    private WebElement emailLogado;

    public WebElement getBotaoMenuSuperior() {
        return botaoMenuSuperior;
    }

    public WebElement getEmailLogado() {
        return emailLogado;
    }

    public String getXpathBotaoSuperior() {
        return xpathBotaoSuperior;
    }
}
