 # CadVeiculos

Programa em Java para cadastro e consulta de veículos pelo terminal.

## Alunos

- 1139745 / Nick Eduardo dos Santos
- 1139819 / Lucas Gazolla

## Funcionalidades

- Cadastrar veículos informando marca, modelo, ano e placa.
- Validar o ano do veículo, que deve ser posterior a 1900 e não pode ultrapassar o ano atual.
- Impedir o cadastro de duas placas iguais.
- Listar todos os veículos cadastrados.
- Consultar um veículo pela placa.
- Encerrar o programa pelo menu principal.

## Estrutura do projeto

- `Main.java`: exibe o menu e controla a execução do programa.
- `Functions.java`: contém as operações de cadastro, listagem e consulta.
- `Veiculo.java`: representa um veículo e valida seus dados.
- `Input.java`: auxilia na leitura de números inteiros pelo terminal.

## Requisitos

- Java 25 ou superior, com suporte à API `IO` e ao formato de `main` utilizado no projeto.

## Como executar

1. Abra um terminal na pasta do projeto.
2. Compile os arquivos:

```bash
javac *.java
```

3. Execute o programa:

```bash
java Main.java
```

Em ambientes que exigem a compilação explícita da classe principal, use:

```bash
java Main
```

## Como usar

Ao iniciar, o programa apresenta o menu:

```text
[1] - Cadastrar Veículo
[2] - Listar Veículos
[3] - Consultar Veículo
[0] - Sair
```

Escolha uma opção e siga as instruções exibidas no terminal. Para consultar um veículo, informe a mesma placa utilizada no cadastro.

## Observação

Os veículos são armazenados apenas em memória. Portanto, todos os dados são perdidos quando o programa é encerrado.
