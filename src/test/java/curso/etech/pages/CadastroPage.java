package curso.etech.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static curso.etech.commos.BaseTest.driver;

public class CadastroPage {

    public CadastroPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "etInputtextes")
    private WebElement campoNomeCompleto;

    @AndroidFindBy(id = "etInputtextes1")
    private WebElement campoComoSerChamado;

    @AndroidFindBy(id = "etInputtextes2")
    private WebElement campoTelefone;

    @AndroidFindBy(id = "etInputtextes3")
    private WebElement campoDataNascimento;

    @AndroidFindBy(id = "txtButton")
    private WebElement botaoProsseguir;

    private String campoCepWait = "//android.widget.EditText[@resource-id='br.com.filme.app:id/etInputtextes']";

    private String textSaoPaulo = "//android.widget.EditText[@text='São Paulo']";

    @AndroidFindBy(id = "etInputtextes")
    private WebElement campoCep;

    @AndroidFindBy(id = "btnCep")
    private WebElement botaoPesquisarCep;

    @AndroidFindBy(id = "btnRegistrarEndereco")
    private WebElement botaoProsseguirCep;

    @AndroidFindBy(id = "etInputtextes")
    private WebElement campoEmail;

    @AndroidFindBy(id = "etInputtextes1")
    private WebElement campoSenha;

    @AndroidFindBy(id = "etInputtextes2")
    private WebElement campoConfirmarSenha;

    @AndroidFindBy(id = "btnCriarConta")
    private WebElement botaoCriarConta;

    public WebElement getCampoNomeCompleto() {
        return campoNomeCompleto;
    }

    public WebElement getCampoComoSerChamado() {
        return campoComoSerChamado;
    }

    public WebElement getCampoTelefone() {
        return campoTelefone;
    }

    public WebElement getCampoDataNascimento() {
        return campoDataNascimento;
    }

    public WebElement getBotaoProsseguir() {
        return botaoProsseguir;
    }

    public WebElement getCampoCep() {
        return campoCep;
    }

    public WebElement getBotaoPesquisarCep() {
        return botaoPesquisarCep;
    }

    public WebElement getBotaoProsseguirCep() {
        return botaoProsseguirCep;
    }

    public String getCampoCepWait() {
        return campoCepWait;
    }

    public String getTextSaoPaulo() {
        return textSaoPaulo;
    }

    public WebElement getCampoEmail() {
        return campoEmail;
    }

    public WebElement getCampoSenha() {
        return campoSenha;
    }

    public WebElement getCampoConfirmarSenha() {
        return campoConfirmarSenha;
    }

    public WebElement getBotaoCriarConta() {
        return botaoCriarConta;
    }
}
