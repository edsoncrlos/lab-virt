# ADR-003 — Adotar Domain-Driven Design (DDD) no backend

## Status

accepted

## Context

O projeto de gerenciamento de VMs possui diferentes responsabilidades e regras de negócio que precisam ser organizadas de forma clara no backend. Consequentemente, é necessário estabelecer uma abordagem para estruturar os módulos e modelar as regras de negócio de forma que sejam mantidos baixo acoplamento e alta coesão.

## Decision

Adotar princípios de Domain-Driven Design para orientar a modelagem do domínio e a organização dos módulos do backend, utilizando apenas os padrões necessários à complexidade do projeto.

## Consequences

### Vantagens

- Melhor organização do código a partir dos domínios e responsabilidades do negócio.
- Maior separação entre regras de negócio, infraestrutura e mecanismos de exposição da API.
- Facilita a evolução e manutenção do sistema à medida que novas regras de negócio forem adicionadas.
- Reforça os limites definidos pela arquitetura monolítica modular.

### Desvantagens

- Pode aumentar a complexidade inicial do projeto em comparação com uma estrutura mais simples e orientada apenas às camadas técnicas.
- Exige maior disciplina da equipe para manter corretamente os limites e responsabilidades dos módulos.
- A aplicação de conceitos de DDD de forma excessiva pode introduzir abstrações desnecessárias.
- Membros da equipe sem familiaridade com DDD podem precisar de tempo para compreender e aplicar adequadamente seus conceitos.