package steps_definitions;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.buscaPage;

public class stepspesquisa {
	
	@Dado("^que acesso o blog Soc$")
	public void que_acesso_o_blog_Soc() throws Throwable {
		buscaPage buscaPage = new buscaPage();
		buscaPage.que_acesso_o_blog_Soc();
	}

	@Quando("^preencho o campo de \"(.*?)\"$")
	public void preencho_o_campo_de(String pesquisa) throws Throwable {
		buscaPage buscaPage = new buscaPage();
		buscaPage.preencho_o_campo_de(pesquisa);
	}

	@Entao("^visualizo o resultado da pesquisa$")
	public void visualizo_o_resultado_da_pesquisa() throws Throwable {
		buscaPage buscaPage = new buscaPage();
		buscaPage.visualizo_o_resultado_da_pesquisa();
	}

}
