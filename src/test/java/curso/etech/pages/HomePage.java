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

    private String xpathBotaoSuperior = "//android.widget.ImageView[@resource-id='br.com.filme.app:id/imageBytesizemenu']";

    @AndroidFindBy(id = "txtEmail")
    private WebElement emailLogado;

    @AndroidFindBy(id = "edtSearch")
    private WebElement campoPesquisa;

    private String xpathCampoPesquisa = "//android.widget.EditText[@resource-id='br.com.filme.app:id/edtSearch']";

    @AndroidFindBy(id = "image2405f5d1220d45f")
    private WebElement capaFilme;

    public WebElement getBotaoMenuSuperior() {
        return botaoMenuSuperior;
    }

    public WebElement getEmailLogado() {
        return emailLogado;
    }

    public String getXpathBotaoSuperior() {
        return xpathBotaoSuperior;
    }

    public WebElement getCampoPesquisa() {
        return campoPesquisa;
    }

    public WebElement getCapaFilme() {
        return capaFilme;
    }

    public String getXpathCampoPesquisa() {
        return xpathCampoPesquisa;
    }
}
