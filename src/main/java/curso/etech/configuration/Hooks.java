package curso.etech.configuration;

import curso.etech.commos.BaseTest;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public class Hooks extends BaseTest {

    @Before
    public  void before() throws MalformedURLException {
        super.inicialzarDriver();

    }
}
