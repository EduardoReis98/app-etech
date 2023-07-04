package curso.etech.steps;

import curso.etech.func.IntroducaoFunc;
import io.cucumber.java.pt.Dado;

public class IntroducaoStep {

    IntroducaoFunc introducaoFunc = new IntroducaoFunc();

    @Dado("acessar a tela de login")
    public void acessarTelaLogin(){
        introducaoFunc.pularIntroducao();
    }
}
