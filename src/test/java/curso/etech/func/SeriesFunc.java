package curso.etech.func;

import curso.etech.commos.BaseTest;
import curso.etech.pages.SeriesPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SeriesFunc extends BaseTest {

    SeriesPage seriesPage = new SeriesPage();

    public void pesquisarSerie(String nomeSerie){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(seriesPage.getXpathCampoPesquisar())));
        seriesPage.getCampoPesquisar().sendKeys(nomeSerie);
    }

    public boolean validarCapaSerie(){
        return seriesPage.getCapaSerie().isDisplayed();
    }
}
