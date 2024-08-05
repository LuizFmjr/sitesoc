#language: pt

Funcionalidade: Busca no blog 

	Esquema do Cenario: Pesquisar no blog Soc
		
		Dado que acesso o blog Soc
		Quando preencho o campo de "<pesquisa>"
		Entao visualizo o resultado da pesquisa
		
		Exemplos:
		| pesquisa  					  |
		| Saúde e Segurança     |
		| Segurança no trabalho |
