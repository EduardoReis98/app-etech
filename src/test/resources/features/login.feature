#language: pt
#enconding: UTF-8
#author: Eduardo Reis
#date: 03/07/2023
#version: 1.0

@smokeTest @testeLogin
Funcionalidade: Login
  Com essa funcionalidade iremos validar
  O login na aplicação com um usuário já cadastrado.

  Contexto:
    Dado acessar a tela de login

  @testeLoginCorreto
  Cenário: Validar login na aplicção
    Quando inserir os dados de usuário
      | email               | senha     |
      | automacao@etech.dev | Etech@123 |
    Então deve visualizar o email ultilizado "automacao@etech.dev"
