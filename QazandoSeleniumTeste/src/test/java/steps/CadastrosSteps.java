package steps;


import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.CadastroPage;
import pages.LoginPage;
import runner.RunCucumberTest;

public class CadastrosSteps extends RunCucumberTest {

    CadastroPage cadastroPage = new CadastroPage(driver);

    @Quando("^eu preencho o formulário de cadastro$")
    public void eu_preencho_o_formulário_de_cadastro() {
        cadastroPage.selectTitle(1);
        cadastroPage.preencheNome("Rodrigo");
        cadastroPage.preenchePassword("Valentim");
        cadastroPage.preenchePassword("SENHATESTE");
        cadastroPage.selecionaAniversario(23,01,"1997");
        cadastroPage.preencheAddress("Rua teste da cidade do QA");
        cadastroPage.preencheCidade("Cerquilho");
        cadastroPage.selecionaState("Colorado");
        cadastroPage.preenchePostalCode("88880");
        cadastroPage.preencheCelular("+55015999999999");

    }

    @Quando("^clico em registrar$")
    public void clico_em_registrar() {
        cadastroPage.clickRegister();
    }

    @Então("vejo cadastro realizado com sucesso$")
        public void vejo_cadastro_realizado_com_sucesso() {
        }
    }


