#language: pt
#enconding: UTF-8
#author: Eduardo Reis
#date: 03/07/2023
#version: 1.0

  @smokeTest @testCadastro
  Funcionalidade: Cadastro

    Contexto:
      Dado acessar a tela de cadastro

    Cenário: Validar cadastro na aplicação
      Quando preencher dados de um novo usuário
      Então deve visualizar a tela de login