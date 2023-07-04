package curso.etech.steps;

import curso.etech.func.HomeFunc;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Então;
import org.junit.jupiter.api.Assertions;

import java.util.List;
import java.util.Map;

public class HomeStep {

    HomeFunc homeFunc = new HomeFunc();

    @Então("deve visualizar o email ultilizado {string}")
    public void deveRealizarLoginSucesso(String email){
        String emailLogado = homeFunc.validarLogin();
        Assertions.assertEquals(email,emailLogado);
    }
}
