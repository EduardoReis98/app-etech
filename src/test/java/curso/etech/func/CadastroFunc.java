package curso.etech.func;

import com.github.javafaker.Faker;
import curso.etech.commos.BaseTest;
import curso.etech.pages.CadastroPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Locale;

public class CadastroFunc extends BaseTest {

    CadastroPage cadastroPage = new CadastroPage();
    Faker faker;

    public CadastroFunc() {
        faker = new Faker(new Locale("pt-BR"));
    }

    public void preencherDadosUsuarios(){
        cadastroPage.getCampoNomeCompleto().sendKeys(faker.name().fullName());
        cadastroPage.getCampoComoSerChamado().sendKeys(faker.name().firstName());
        cadastroPage.getCampoTelefone().sendKeys(faker.phoneNumber().cellPhone());
        cadastroPage.getCampoDataNascimento().sendKeys("15/09/1998");
        cadastroPage.getBotaoProsseguir().click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(cadastroPage.getCampoCepWait())));
        cadastroPage.getCampoCep().sendKeys("01001001");
        cadastroPage.getBotaoPesquisarCep().click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(cadastroPage.getTextSaoPaulo())));
        cadastroPage.getBotaoProsseguirCep().click();
        cadastroPage.getCampoEmail().sendKeys(faker.internet().emailAddress());
        cadastroPage.getCampoSenha().sendKeys("Teste@123");
        cadastroPage.getCampoConfirmarSenha().sendKeys("Teste@123");
        cadastroPage.getBotaoCriarConta().click();
    }
}
