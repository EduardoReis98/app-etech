#language: pt
#enconding: UTF-8
#author: Eduardo Reis
#date: 10/07/2023
#version: 1.0

  @smokeTest @testeSairConta
  Funcionalidade: Logout da aplicação
    Com essa funcionalidade iremos validar
    O logout de um usuário da aplicação

    Contexto: estar logado na aplicação
      Dado acessar a tela de login
      E inserir os dados de usuário
        | email               | senha     |
        | automacao@etech.dev | Etech@123 |

    Cenário: Logout da aplicação
      Quando selecionar o botão sair da conta na aba de usuários
      Então deve visualizar a tela de login
