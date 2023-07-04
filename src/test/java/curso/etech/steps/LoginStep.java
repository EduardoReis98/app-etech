package curso.etech.steps;

import curso.etech.func.LoginFunc;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Quando;

import java.util.List;
import java.util.Map;

public class LoginStep {

    LoginFunc loginFunc = new LoginFunc();

    @Quando("inserir os dados de usuário")
    public void inserirDadosUsuario(DataTable dataTable) {
        List<Map<String, String>> usuario = dataTable.asMaps();
        String email = usuario.get(0).get("email");
        String senha = usuario.get(0).get("senha");
        loginFunc.realizarLogin(email,senha);
        System.out.println();
    }
}


