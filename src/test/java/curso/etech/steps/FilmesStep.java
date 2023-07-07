package curso.etech.steps;

import curso.etech.func.FilmesFunc;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class FilmesStep {

    FilmesFunc filmesFunc = new FilmesFunc();

    @Quando("pesquisar o filme {string} na aba filme")
    public void pesquisarFilmeAbaFilme (String nomeFilme){
        filmesFunc.pesquisarFilme(nomeFilme);
    }

    @Então("deve visualizar a capa do filme na aba filme")
    public void visualizarCapaFilmeAbaFilme (){
        Assert.assertTrue(filmesFunc.validarCapaFilme());
    }
}
