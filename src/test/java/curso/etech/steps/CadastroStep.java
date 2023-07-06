package curso.etech.steps;

import curso.etech.func.CadastroFunc;
import io.cucumber.java.pt.Quando;

public class CadastroStep {

    CadastroFunc cadastroFunc = new CadastroFunc();

    @Quando("preencher dados de um novo usuário")
    public void preencherDadosNovoUsuario(){
        cadastroFunc.preencherDadosUsuarios();

    }
}
