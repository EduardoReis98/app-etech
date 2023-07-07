package curso.etech.pages;

import curso.etech.steps.FilmesStep;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static curso.etech.commos.BaseTest.driver;

public class FilmesPage {

    public FilmesPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "edtSearch")
    private WebElement campoPesquisa;

    private String xpathCampoPesquisar = "//android.widget.EditText[@resource-id='br.com.filme.app:id/edtSearch']";

    @AndroidFindBy(id = "image2405f5d1220d45f")
    private WebElement capaFilme;

    public WebElement getCampoPesquisa() {
        return campoPesquisa;
    }

    public String getXpathCampoPesquisar() {
        return xpathCampoPesquisar;
    }

    public WebElement getCapaFilme() {
        return capaFilme;
    }
}
