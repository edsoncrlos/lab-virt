# ADR-002 — Adotar Spring Boot como framework do backend

## Status

accepted

## Context

O projeto de gerenciamento de VMs necessita de um framework para o desenvolvimento do backend e da API responsável por disponibilizar os recursos da aplicação.

A equipe possui conhecimento prévio em Java e Spring Boot, o que reduz o tempo necessário para aprendizado, configuração e desenvolvimento. Além disso, o ecossistema Spring oferece recursos adequados para a construção de APIs REST, injeção de dependências, persistência de dados e integração com outros serviços necessários ao projeto.

## Decision

Adotar o **Spring Boot** como framework principal para o desenvolvimento do backend da aplicação de gerenciamento de VMs.

O Spring Boot será utilizado para estruturar a aplicação, disponibilizar as APIs REST, gerenciar a injeção de dependências e facilitar a integração com os componentes de persistência e demais serviços necessários ao projeto.

## Consequences

### Vantagens

* Redução do tempo de desenvolvimento devido ao conhecimento prévio da equipe em Java e Spring Boot.
* Facilidade para criação e organização de APIs REST.
* Suporte à injeção de dependências, contribuindo para a redução do acoplamento entre os componentes.
* Integração simplificada com bancos de dados por meio do Spring Data JPA.

### Desvantagens

* Pode introduzir uma curva de aprendizado para membros da equipe sem experiência com o ecossistema Spring.
* A utilização excessiva de funcionalidades específicas do framework pode aumentar o acoplamento da aplicação ao Spring.
* O uso do Spring Boot adiciona dependências e configurações que precisam ser mantidas ao longo do ciclo de vida do projeto.
