# Convenção de Commits

Este repositório segue a convenção [Conventional Commits](https://www.conventionalcommits.org/).

## Formato

```text
tipo(escopo): mensagem
```

O **escopo é opcional**. Quando utilizado, deve identificar a área do projeto afetada pela alteração.

## Tipos

* `feat` — introduz uma nova funcionalidade.
* `fix` — corrige um erro.
* `docs` — realiza alterações exclusivamente na documentação.
* `style` — realiza alterações de formatação ou estilo que não modificam o significado do código.
* `refactor` — altera a estrutura ou legibilidade do código sem modificar seu comportamento.
* `perf` — realiza alterações que melhoram o desempenho.
* `test` — adiciona ou modifica testes.
* `build` — realiza alterações que afetam o sistema de build ou dependências externas.
* `ci` — realiza alterações nos arquivos ou scripts de configuração de integração contínua (CI).
* `chore` — realiza outras alterações de manutenção que não modificam o código de produção ou de testes.

## Escopos

Os escopos disponíveis são:

* `back` — alterações relacionadas ao backend.
* `front` — alterações relacionadas ao frontend.
* `scripts` — alterações nos scripts auxiliares.
* `infra` — alterações relacionadas a Docker, infraestrutura e implantação.
* `repo` — alterações relacionadas à estrutura, configuração ou ferramentas do repositório.

O escopo deve ser utilizado quando ajudar a identificar claramente a área afetada. Ele pode ser omitido quando a alteração for transversal ao projeto ou quando não houver um escopo apropriado.

### Exemplos

```text
feat(front): add registration form
fix(back): fix user validation
refactor(back): reorganize service layer
test(front): add login form tests
build(repo): update project dependency
ci(repo): configure continuous integration pipeline
chore(scripts): update development script
docs: update README
```
