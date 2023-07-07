package curso.etech.func;

import curso.etech.commos.BaseTest;
import curso.etech.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class HomeFunc extends BaseTest {

    HomePage homePage = new HomePage();

    public String validarLogin(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(homePage.getXpathBotaoSuperior())));
        homePage.getBotaoMenuSuperior().click();
        String emailLogado = homePage.getEmailLogado().getText();
        return emailLogado;
    }

    public void pesquisarHome(String nomeFilme){
        homePage.getCampoPesquisa().sendKeys(nomeFilme);
    }

    public boolean visualizarCapaFilme(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(homePage.getXpathCampoPesquisa())));
        return homePage.getCapaFilme().isDisplayed();
    }

    public void selecionarSeries(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(homePage.getXpathMenuSerie())));
        homePage.getMenuSeries().click();
    }

    public void selecionarFilmes(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(homePage.getXpathMenuFilme())));
        homePage.getMenuFilmes().click();
    }
}
