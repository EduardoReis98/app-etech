package curso.etech.steps;

import curso.etech.func.IntroducaoFunc;
import curso.etech.func.LoginFunc;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class LoginStep {

    LoginFunc loginFunc = new LoginFunc();
    IntroducaoFunc introducaoFunc = new IntroducaoFunc();

    @Quando("inserir os dados de usuário")
    public void inserirDadosUsuario(DataTable dataTable) {
        List<Map<String, String>> usuario = dataTable.asMaps();
        String email = usuario.get(0).get("email");
        String senha = usuario.get(0).get("senha");
        loginFunc.realizarLogin(email,senha);
        System.out.println();
    }

    @Dado("acessar a tela de cadastro")
    public void acessarTelaCadastro(){
        introducaoFunc.pularIntroducao();
        loginFunc.acessarCadastro();
    }

    @Então("deve visualizar a tela de login")
    public void visualizarTelaLogin(){
        boolean resultado = loginFunc.validarBotaoLogin();
        Assert.assertTrue(resultado);
    }
}


