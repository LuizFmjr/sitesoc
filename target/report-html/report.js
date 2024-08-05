$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Luiz Fernando/Documents/Qaut/java/sitesoc/features/cenariobuscablog.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 3,
  "name": "Busca no blog",
  "description": "",
  "id": "busca-no-blog",
  "keyword": "Funcionalidade"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Pesquisar no blog Soc",
  "description": "",
  "id": "busca-no-blog;pesquisar-no-blog-soc",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "line": 7,
  "name": "que acesso o blog Soc",
  "keyword": "Dado "
});
formatter.step({
  "line": 8,
  "name": "preencho o campo de \"\u003cpesquisa\u003e\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 9,
  "name": "visualizo o resultado da pesquisa",
  "keyword": "Entao "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "busca-no-blog;pesquisar-no-blog-soc;",
  "rows": [
    {
      "cells": [
        "pesquisa"
      ],
      "line": 12,
      "id": "busca-no-blog;pesquisar-no-blog-soc;;1"
    },
    {
      "cells": [
        "Saúde e Segurança"
      ],
      "line": 13,
      "id": "busca-no-blog;pesquisar-no-blog-soc;;2"
    },
    {
      "cells": [
        "Segurança no trabalho"
      ],
      "line": 14,
      "id": "busca-no-blog;pesquisar-no-blog-soc;;3"
    }
  ],
  "keyword": "Exemplos"
});
formatter.scenario({
  "line": 13,
  "name": "Pesquisar no blog Soc",
  "description": "",
  "id": "busca-no-blog;pesquisar-no-blog-soc;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "line": 7,
  "name": "que acesso o blog Soc",
  "keyword": "Dado "
});
formatter.step({
  "line": 8,
  "name": "preencho o campo de \"Saúde e Segurança\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 9,
  "name": "visualizo o resultado da pesquisa",
  "keyword": "Entao "
});
formatter.match({
  "location": "stepspesquisa.que_acesso_o_blog_Soc()"
});
formatter.result({
  "duration": 17330528300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Saúde e Segurança",
      "offset": 21
    }
  ],
  "location": "stepspesquisa.preencho_o_campo_de(String)"
});
formatter.result({
  "duration": 974020900,
  "status": "passed"
});
formatter.match({
  "location": "stepspesquisa.visualizo_o_resultado_da_pesquisa()"
});
formatter.result({
  "duration": 4893402200,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Pesquisar no blog Soc",
  "description": "",
  "id": "busca-no-blog;pesquisar-no-blog-soc;;3",
  "type": "scenario",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "line": 7,
  "name": "que acesso o blog Soc",
  "keyword": "Dado "
});
formatter.step({
  "line": 8,
  "name": "preencho o campo de \"Segurança no trabalho\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 9,
  "name": "visualizo o resultado da pesquisa",
  "keyword": "Entao "
});
formatter.match({
  "location": "stepspesquisa.que_acesso_o_blog_Soc()"
});
formatter.result({
  "duration": 8517923900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Segurança no trabalho",
      "offset": 21
    }
  ],
  "location": "stepspesquisa.preencho_o_campo_de(String)"
});
formatter.result({
  "duration": 8633181500,
  "status": "passed"
});
formatter.match({
  "location": "stepspesquisa.visualizo_o_resultado_da_pesquisa()"
});
formatter.result({
  "duration": 4524875500,
  "status": "passed"
});
});