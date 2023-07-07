package curso.etech.steps;

import curso.etech.func.SeriesFunc;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class SeriesStep {

    SeriesFunc seriesFunc = new SeriesFunc();

    @Quando("pesquisar a série {string}")
    public void pesquisarSerie(String nomeSerie){
        seriesFunc.pesquisarSerie(nomeSerie);
    }

    @Então("deve visualizar a capa da série")
    public void visualizarCapaSerie(){
        Assert.assertTrue(seriesFunc.validarCapaSerie());

    }
}
