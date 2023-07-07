package curso.etech.func;

import curso.etech.commos.BaseTest;
import curso.etech.pages.FilmesPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FilmesFunc extends BaseTest {

    FilmesPage filmesPage = new FilmesPage();

    public void pesquisarFilme(String nomeFilme){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(filmesPage.getXpathCampoPesquisar())));
        filmesPage.getCampoPesquisa().sendKeys(nomeFilme);
    }

    public boolean validarCapaFilme(){
        return filmesPage.getCapaFilme().isDisplayed();
    }
}
