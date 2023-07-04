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
}
