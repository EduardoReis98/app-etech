package curso.etech.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static curso.etech.commos.BaseTest.driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "edtEmail")
    private WebElement campoEmail;

    @AndroidFindBy(id = "edtSenha")
    private WebElement campoSenha;

    @AndroidFindBy(id = "btnLogin")
    private WebElement botaoEntrar;

    public WebElement getCampoEmail() {
        return campoEmail;
    }

    public WebElement getCampoSenha() {
        return campoSenha;
    }

    public WebElement getBotaoEntrar() {
        return botaoEntrar;
    }
}
