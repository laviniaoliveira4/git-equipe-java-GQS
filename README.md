# git-equipe-java-GQS

🚀 Projeto Herança em Java — Animais
👥 Integrantes do Grupo
Nome Isabella  (feature Subclasse Gato) — RA: 
Nome Marcos (feature Subclasse Cachorro) — RA: 
Nome Lavinia (Superclasse Animal e App.java) — RA: 4231920657

📄 Descrição do Projeto
Este projeto tem como objetivo demonstrar o uso de herança, sobrescrita de métodos (@Override) e polimorfismo em Java, utilizando o tema animais.

A classe Animal funciona como superclasse, contendo atributos comuns como espécie, sexo e idade, além de métodos básicos como emitirSom() e toString(). A partir dela, foram criadas subclasses como Gato e Tigre, que herdam suas características e sobrescrevem o método emitirSom() para apresentar comportamentos específicos. No App.java, os objetos são armazenados em uma lista do tipo Animal, permitindo o uso de polimorfismo ao tratar diferentes subclasses de forma genérica, exibindo suas informações e comportamentos no console.

⚙️ Tecnologias Utilizadas
Java (JDK 17 ou superior)
Programação Orientada a Objetos (POO)
Git e GitHub (GitHub Flow)
▶️ Como Executar
git clone https://github.com/gabszinn/git-equipe-java.git
Execute o arquivo: App.java

🗂️ Estrutura do Projeto
src/
 └─ main/
    └─ java/
       └─ git/
          └─ equipe/
             ├─ App.java
             └─ modelo/
                ├─ Animal.java
                ├─ Gato.java
                └─ Tigre.java
🧠 Conceitos Aplicados Herança (extends) Sobrescrita de métodos (@Override) Polimorfismo (List) Encapsulamento Uso de construtores e super

🧪 Exemplo de Saída
Especie: Tigre-siberiano, Sexo: fêmea, Idade: 5
Som: Rugido
-------------------
Especie: Gato Persa, Sexo: macho, Idade: 3
Som: Miau Miau!
-------------------
📌 Observações

Cada integrante desenvolveu uma parte do sistema utilizando branches e Pull Requests. O projeto segue o fluxo GitHub Flow (feature → dev → main).
