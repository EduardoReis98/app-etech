#language: pt
#enconding: UTF-8
#author: Eduardo Reis
#date: 03/07/2023
#version: 1.0

  @smokeTest @pesquisaFilmes2
  Funcionalidade: Pesquisar filme na tela Home
    Com essa funcionalidade iremos validar
    A pesquisa de um filme e visualizar a capa do mesmo

    Contexto: estar logado na aplicação
      Dado acessar a tela de login
      E inserir os dados de usuário
        | email               | senha     |
        | automacao@etech.dev | Etech@123 |
      E selecionar a aba de filmes

    Cenário: pesquisa de filme na tela home
      Quando pesquisar o filme "Vingadores" na aba filme
      Então deve visualizar a capa do filme na aba filme