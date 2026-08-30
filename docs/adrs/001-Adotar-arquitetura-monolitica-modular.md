# ADR-001 — Adotar arquitetura monolítica modular

## Status

accepted

## Context

- O projeto possui um escopo reduzido, sem a necessidade de escalabilidade independente de seus componentes.

## Decision

O projeto adotará uma **arquitetura monolítica modular**, na qual a aplicação será implantada como uma única unidade, mas será internamente dividida em módulos organizados por domínio.

Os módulos deverão possuir baixo acoplamento e alta coesão, evitando que detalhes internos de um domínio sejam diretamente acessados por outros domínios.

A comunicação entre os módulos deverá ocorrer preferencialmente por meio de interfaces e contratos bem definidos.

## Consequences

### Vantagens

- Menor complexidade de desenvolvimento e configuração em comparação com uma arquitetura distribuída.
- Implantação simplificada.
- Facilidade para executar e testar o sistema durante o desenvolvimento.

### Desvantagens

- É necessário aplicar boas práticas de modularização para evitar alto acoplamento dentro da aplicação.
- O crescimento da aplicação pode aumentar sua complexidade de manutenção caso os limites entre os módulos não sejam preservados.
- A aplicação é implantada como uma unidade, de modo que uma falha crítica ou indisponibilidade da instância da aplicação pode afetar a disponibilidade de todo o sistema.
