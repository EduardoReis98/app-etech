package curso.etech.func;

import curso.etech.pages.LoginPage;

public class LoginFunc {

    LoginPage loginPage = new LoginPage();

    public void realizarLogin(String email, String senha){
        loginPage.getCampoEmail().sendKeys(email);
        loginPage.getCampoSenha().sendKeys(senha);
        loginPage.getBotaoEntrar().click();
    }

    public void acessarCadastro(){
        loginPage.getBotaoCriarConta().click();
    }

    public boolean validarBotaoLogin(){
        return loginPage.getBotaoEntrar().isDisplayed();

    }
}
