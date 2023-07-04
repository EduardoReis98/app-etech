package curso.etech.func;

import curso.etech.pages.IntroducaoPage;

public class IntroducaoFunc {

    IntroducaoPage introducaoPage = new IntroducaoPage();

    public void pularIntroducao(){
        introducaoPage.getBotaoPular().click();
    }
}
