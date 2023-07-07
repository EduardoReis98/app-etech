package curso.etech.steps;

import curso.etech.func.HomeFunc;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
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

    @Quando("pesquisar o filme {string}")
    public void pesquisarFilme(String nomeFilme){
        homeFunc.pesquisarHome(nomeFilme);
    }

    @Então("deve visualizar a capa do filme")
    public void visualizarCapaFilme(){
        Assert.assertTrue(homeFunc.visualizarCapaFilme());
    }

    @E("selecionar a aba de séries")
    public void selecionarAbaSeries(){
        homeFunc.selecionarSeries();
    }
}
