package steps_definitions;

import pages.buscaCredenciado;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class stepcredenciado {
	
	@Dado("^que acesso o Site Soc$")
	public void que_acesso_o_Site_Soc() throws Throwable {
		buscaCredenciado buscaCredenciado = new buscaCredenciado();
		buscaCredenciado.que_acesso_o_Site_Soc();
	}

	@Quando("^quando preencho os filtros para buscar um credenciado$")
	public void quando_preencho_os_filtros_para_buscar_um_credenciado() throws Throwable {
		buscaCredenciado buscaCredenciado = new buscaCredenciado();
		buscaCredenciado.quando_preencho_os_filtros_para_buscar_um_credenciado();
	}

	@Quando("^clico em saiba mais$")
	public void clico_em_saiba_mais() throws Throwable {
		buscaCredenciado buscaCredenciado = new buscaCredenciado();
		buscaCredenciado.clico_em_saiba_mais();
	}

	@Entao("^visualizo o perfil do credenciado$")
	public void visualizo_o_perfil_do_credenciado() throws Throwable {
		buscaCredenciado buscaCredenciado = new buscaCredenciado();
		buscaCredenciado.visualizo_o_perfil_do_credenciado();
	}

}
