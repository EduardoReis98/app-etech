#language: pt
#enconding: UTF-8
#author: Eduardo Reis
#date: 03/07/2023
#version: 1.0

  @smokeTest @testeCadastroFilme
  Funcionalidade: Cadastar Filme
    Com essa funcionalidade iremos validar
    O cadastro de um filme na aplicação

    Contexto: estar logado na aplicação
      Dado acessar a tela de login
      E inserir os dados de usuário
        | email               | senha     |
        | automacao@etech.dev | Etech@123 |

    Cenário: cadastrar um novo filme
      Quando cadastrar um novo filme
      Então deve visualizar "filme cadastrado com sucesso"
