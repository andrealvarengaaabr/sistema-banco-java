# sistema-banco-java
**NOME: Andre Pinto Alvarenga**
**Turma: 2º período de Tecnico em informatica** 
**Frase:** O método fecharMes() está na interface porque representa atributo comum as classes contas e enquanto depositar está na classe herdada por ter uma lógica idêntica para todas as contas, evitando a repetição de código.

**Descrição**

Programa que usa conceitos de interface e herança para criar um programa capaz de usar uma classe mâe para gerar atributos comuns as classes filhas, e além do mais, usar conceitos de interface que é pela qual conversamos com um Autenticavel, ou seja ela expõe o que o objeto faz. É um programa referente a Atividade da 5º lista de POO do Msc Rodrigo de Lima Cunha.

**Regras do programa:**
O programa 

**Estrutura do projeto**

sistema-banco-java/
├── README.md
└── src/
├── Conta.java → classe mãe (herança)
├── FechamentoMensal.java → interface
├── ContaCorrente.java → extends Conta implements
FechamentoMensal
├── ContaPoupanca.java → extends Conta implements
FechamentoMensal
└── SistemaBanco.java

**Hierarquia de classes e interfaces**
Aclasse Interface é a ( FechamentoMensal )
Classe mãe é a ( Conta )

**Como executar**

1. Abrir o projeto no NetBeans
2. Executar a classe main ( SistemaBanco) 
3. O resultado aparece na aba Output

**Tecnologias**

- Java
- NetBeans
- Git e GitHub

**Autor**
Andre Pinto Alvarenga

