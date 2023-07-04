#language: pt
#enconding: UTF-8
#author: Eduardo Reis
#date: 03/07/2023
#version: 1.0

@testeLogin
Funcionalidade: Login

  Contexto:
    Dado acessar a tela de login

  @testeLoginCorreto
  Cenário: Validar login na aplicção
    Quando inserir os dados de usuário
      | email               | senha     |
      | automacao@etech.dev | Etech@123 |
    Então deve visualizar o email ultilizado "automacao@etech.dev"
