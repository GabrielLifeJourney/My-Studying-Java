public class ObjetosClassesInterfacesPacoteseHerança_notion {
    public static void main(String[] args) {
        /*
        - **Objetos, Classes, Interfaces, Pacotes e Herança**

    ## 🎯 Objetivo

    Compreender os conceitos fundamentais da programação orientada a objetos (POO) em Java: objetos, classes, encapsulamento, herança, interfaces e pacotes. Ao final, você deverá conseguir reconhecer como esses elementos organizam o código e como se relacionam na construção de uma aplicação.

    ## 📚 Conceitos

    ### 1. O que é um objeto?

    Um objeto é uma unidade de software que reúne **estado** e **comportamento** relacionados.

    - **Estado:** representa as características ou informações que o objeto possui.
    - **Comportamento:** representa as ações que o objeto pode executar.

    A fonte utiliza exemplos do mundo real:

    | Objeto | Estado | Comportamento |
    | --- | --- | --- |
    | Cachorro | Nome, cor, raça e fome | Latir, buscar e abanar o rabo |
    | Bicicleta | Marcha, cadência da pedalada e velocidade | Trocar de marcha, alterar a cadência e frear |
    | Luminária | Ligada ou desligada | Ligar e desligar |
    | Rádio | Ligado, desligado, volume e estação | Ligar, desligar, aumentar/diminuir volume, buscar e sintonizar |

    **Como pensar em objetos:** observe algo ao seu redor e pergunte:

    1. Quais estados esse objeto pode ter?
    2. Quais comportamentos ele pode executar?

    Essa observação ajuda a identificar objetos, seus dados e suas ações antes de começar a programar.

    ### 2. Como um objeto é representado no software?

    Objetos de software organizam estado e comportamento:

    - **Campos (fields):** armazenam o estado do objeto. São variáveis declaradas dentro da classe.
    - **Métodos (methods):** representam os comportamentos e operam sobre o estado interno do objeto.

    A fonte utiliza uma bicicleta como exemplo. Seu estado pode incluir velocidade, cadência atual da pedalada e marcha. Seus métodos podem alterar esses valores.

    ### 3. Encapsulamento de dados

    Encapsulamento é o princípio de ocultar o estado interno do objeto e exigir que a interação com ele aconteça por meio de seus métodos.

    Exemplo conceitual da bicicleta: se ela possui apenas seis marchas, o método responsável por trocar a marcha pode rejeitar valores menores que 1 ou maiores que 6.

    Isso permite que o próprio objeto controle como seu estado pode ser utilizado ou alterado pelo restante do programa.

    **Benefícios de organizar o código em objetos:**

    | Benefício | Significado |
    | --- | --- |
    | Modularidade | O código de um objeto pode ser escrito e mantido independentemente de outros objetos. |
    | Ocultação de informações | Os detalhes internos ficam escondidos; o restante do programa interage pelos métodos disponibilizados. |
    | Reutilização de código | Objetos já desenvolvidos podem ser utilizados em outros programas. |
    | Facilidade de substituição e depuração | Um objeto problemático pode ser substituído por outro sem precisar reconstruir toda a aplicação. |

    ### 4. O que é uma classe?

    Uma **classe** é um modelo ou projeto (*blueprint*) a partir do qual objetos individuais são criados.

    A analogia da fonte é a fabricação de bicicletas: várias bicicletas podem ser construídas a partir do mesmo projeto. Cada bicicleta criada é uma instância da classe.

    - **Classe:** define a estrutura e os comportamentos.
    - **Objeto:** é uma instância criada a partir dessa classe.
    - **Instanciar:** significa criar um objeto de uma classe.

    #### Exemplo original da fonte — Classe Bicycle

    ```java
    class Bicycle {

        int cadence = 0;
        int speed = 0;
        int gear = 1;

        void changeCadence(int newValue) {
             cadence = newValue;
        }

        void changeGear(int newValue) {
             gear = newValue;
        }

        void speedUp(int increment) {
             speed = speed + increment;
        }

        void applyBrakes(int decrement) {
             speed = speed - decrement;
        }

        void printStates() {
             IO.println("cadence:" +
                 cadence + " speed:" +
                 speed + " gear:" + gear);
        }
    }
    ```

    **Entendendo a classe:**

    - `cadence`, `speed` e `gear` são campos que representam o estado da bicicleta.
    - `changeCadence()` altera a cadência.
    - `changeGear()` altera a marcha.
    - `speedUp()` aumenta a velocidade.
    - `applyBrakes()` reduz a velocidade.
    - `printStates()` apresenta os valores atuais.

    A classe `Bicycle` não possui um método `main()` porque, nesse exemplo, ela é apenas o modelo das bicicletas. Outra classe será responsável por criar e utilizar os objetos.

    #### Exemplo original da fonte — Criando e utilizando objetos

    ```java
    class BicycleDemo {
        public static void main(String[] args) {

            // Create two different
            // Bicycle objects
            Bicycle bike1 = new Bicycle();
            Bicycle bike2 = new Bicycle();

            // Invoke methods on
            // those objects
            bike1.changeCadence(50);
            bike1.speedUp(10);
            bike1.changeGear(2);
            bike1.printStates();

            bike2.changeCadence(50);
            bike2.speedUp(10);
            bike2.changeGear(2);
            bike2.changeCadence(40);
            bike2.speedUp(10);
            bike2.changeGear(3);
            bike2.printStates();
        }
    }
    ```

    Saída apresentada pela fonte:

    ```
    cadence:50 speed:10 gear:2
    cadence:40 speed:20 gear:3
    ```

    **O que observar:** `bike1` e `bike2` são dois objetos diferentes, criados a partir da mesma classe. Cada um mantém seu próprio estado. Alterar a velocidade ou a marcha de um não altera automaticamente os valores do outro.

    ### 5. O que é herança?

    Herança permite que uma classe receba estado e comportamento definidos em outra classe.

    A fonte utiliza diferentes tipos de bicicleta:

    - Bicicletas de montanha (*MountainBike*).
    - Bicicletas de estrada (*RoadBike*).
    - Bicicletas tandem (*TandemBike*).

    Todas compartilham características gerais de uma bicicleta, como velocidade, cadência e marcha. Porém, cada tipo também pode possuir características próprias.

    Nesse exemplo:

    - **Superclasse:** classe mais geral, que fornece características para outras classes. Aqui, `Bicycle`.
    - **Subclasse:** classe que herda de outra. Aqui, `MountainBike`, `RoadBike` e `TandemBike`.

    Em Java, cada classe pode ter **uma única superclasse direta**, enquanto uma superclasse pode possuir um número ilimitado de subclasses.

    #### Exemplo original da fonte — Utilizando extends

    ```java
    class MountainBike extends Bicycle {

        // new fields and methods defining
        // a mountain bike would go here

    }
    ```

    A palavra-chave `extends` indica que `MountainBike` herda de `Bicycle`.

    Assim, a subclasse recebe os campos e métodos herdáveis da superclasse e pode concentrar seu próprio código nas características específicas de uma bicicleta de montanha.

    ### 6. O que é uma interface?

    Uma interface define um conjunto de comportamentos que uma classe se compromete a fornecer.

    A fonte compara uma interface aos botões de uma televisão: os botões são a forma de interação entre a pessoa e o aparelho, sem que seja necessário conhecer toda a fiação interna.

    Em sua forma mais comum no exemplo apresentado, uma interface reúne métodos declarados sem implementação (sem corpo).

    #### Exemplo original da fonte — Interface Bicycle

    ```java
    interface Bicycle {

        // wheel revolutions per minute
        void changeCadence(int newValue);

        void changeGear(int newValue);

        void speedUp(int increment);

        void applyBrakes(int decrement);
    }
    ```

    A interface declara os comportamentos que uma bicicleta deve disponibilizar, mas não apresenta a implementação desses métodos.

    #### Implementando uma interface

    Uma classe utiliza a palavra-chave `implements` para declarar que implementa uma interface.

    #### Exemplo original da fonte — Classe ACMEBicycle

    ```java
    class ACMEBicycle implements Bicycle {

        int cadence = 0;
        int speed = 0;
        int gear = 1;

        public void changeCadence(int newValue) {
             cadence = newValue;
        }

        public void changeGear(int newValue) {
             gear = newValue;
        }

        public void speedUp(int increment) {
             speed = speed + increment;
        }

        public void applyBrakes(int decrement) {
             speed = speed - decrement;
        }

        void printStates() {
             IO.println("cadence:" +
                 cadence + " speed:" +
                 speed + " gear:" + gear);
        }
    }
    ```

    **O que acontece nesse exemplo?**

    1. `ACMEBicycle` declara que implementa a interface `Bicycle`.
    2. A classe fornece a implementação dos métodos declarados na interface.
    3. O compilador exige que os métodos abstratos da interface sejam implementados.
    4. Se a classe não implementar os métodos exigidos, a compilação falhará.

    **Atenção à visibilidade:** os métodos implementados precisam ser `public`, como no exemplo acima. Os métodos declarados em uma interface são públicos implicitamente; a implementação não pode reduzir essa visibilidade.

    Uma interface funciona como um **contrato** entre a classe e o restante do programa: a classe promete oferecer os comportamentos definidos por ela.

    ### 7. O que é um pacote?

    Um pacote (*package*) é um espaço de nomes utilizado para organizar classes e interfaces relacionadas.

    A analogia da fonte é a organização de arquivos em pastas:

    - Uma pasta pode guardar páginas HTML.
    - Outra pode guardar imagens.
    - Outra pode guardar scripts e aplicações.

    Da mesma forma, pacotes ajudam a organizar projetos Java, que podem conter centenas ou milhares de classes.

    ### 8. O que é a API da plataforma Java?

    A plataforma Java oferece uma biblioteca extensa de classes organizadas em pacotes. Essa biblioteca é conhecida como **API (Application Programming Interface)**.

    A fonte apresenta alguns exemplos:

    | Classe/objeto | Utilidade apresentada |
    | --- | --- |
    | `String` | Representa e manipula sequências de caracteres. |
    | `File` | Permite criar, excluir, inspecionar, comparar e modificar arquivos. |
    | `Socket` | Permite criar e utilizar sockets de rede. |
    | Objetos de GUI | Controlam elementos de interfaces gráficas, como botões e caixas de seleção. |

    A API permite utilizar funcionalidades já disponibilizadas pela plataforma, em vez de implementar toda a infraestrutura do zero.

    A fonte recomenda consultar e manter nos favoritos a **Especificação da API da Plataforma Java**, que lista os pacotes, interfaces, classes, campos e métodos fornecidos pela plataforma Java SE.

    ## 🧠 O que memorizar

    - Um objeto reúne estado e comportamento.
    - Campos armazenam o estado; métodos representam comportamentos.
    - Encapsulamento oculta o estado interno e controla a interação por métodos.
    - Uma classe é o modelo a partir do qual objetos são criados.
    - Um objeto criado a partir de uma classe é uma instância.
    - Cada objeto possui seu próprio estado.
    - Herança permite reutilizar estado e comportamento de uma superclasse.
    - `extends` indica herança entre classes.
    - Uma classe Java possui apenas uma superclasse direta.
    - Uma interface define um contrato de comportamentos.
    - `implements` indica que uma classe implementa uma interface.
    - O compilador verifica se os métodos exigidos pela interface foram implementados.
    - Os métodos implementados de uma interface precisam manter a visibilidade pública.
    - Um pacote organiza classes e interfaces relacionadas.
    - A API Java reúne funcionalidades disponibilizadas pela plataforma.

    ## 💻 Exemplos de código

    Os exemplos abaixo são complementos didáticos para revisar os conceitos da fonte.

    ### Exemplo 1 — Identificando classe, objeto, campos e métodos

    ```java
    class Lampada {
        boolean ligada = false;

        void ligar() {
            ligada = true;
        }

        void desligar() {
            ligada = false;
        }
    }

    class TesteLampada {
        public static void main(String[] args) {
            Lampada lampada = new Lampada();

            lampada.ligar();
            IO.println(lampada.ligada);
        }
    }
    ```

    ### Exemplo 2 — Duas instâncias independentes

    ```java
    Lampada sala = new Lampada();
    Lampada quarto = new Lampada();

    sala.ligar();

    IO.println(sala.ligada);
    IO.println(quarto.ligada);
    ```

    Observe que ligar a lâmpada da sala não altera o estado da lâmpada do quarto.

    ### Exemplo 3 — Herança

    ```java
    class Veiculo {
        void mover() {
            IO.println("O veículo está se movendo.");
        }
    }

    class Carro extends Veiculo {
        void buzinar() {
            IO.println("Buzina!");
        }
    }
    ```

    A classe `Carro` herda o comportamento `mover()` de `Veiculo` e declara seu próprio comportamento `buzinar()`.

    ### Exemplo 4 — Interface e implementação

    ```java
    interface Autenticavel {
        boolean autenticar(String senha);
    }

    class Usuario implements Autenticavel {
        public boolean autenticar(String senha) {
            return senha.equals("java123");
        }
    }
    ```

    A interface declara o contrato. A classe `Usuario` fornece a implementação do método.

    ## 🔎 Explicação do código

    ### 1. Classe não é a mesma coisa que objeto

    Considere a classe `Bicycle` como o projeto de fabricação de uma bicicleta. Quando o programa executa `new Bicycle()`, cria um objeto baseado nesse projeto.

    ### 2. Cada objeto possui seu próprio estado

    Quando o programa cria `bike1` e `bike2`, são criadas duas instâncias independentes. Ambas possuem os campos definidos pela classe, mas cada objeto mantém seus próprios valores.

    ### 3. Métodos controlam comportamentos

    Uma chamada como `bike1.speedUp(10)` solicita que o objeto execute o método `speedUp()`. O método altera o estado daquele objeto.

    ### 4. Herança evita repetição

    Quando uma classe herda de outra, ela pode aproveitar características já definidas na superclasse. A subclasse acrescenta aquilo que é específico dela.

    ### 5. Interface define o que a classe promete fazer

    A interface declara os métodos que fazem parte do contrato. A classe que utiliza `implements` precisa fornecer as implementações exigidas.

    ### 6. Lei de Feynman

    Explique sem consultar as anotações:

    - O que diferencia uma classe de um objeto?
    - Qual é a diferença entre estado e comportamento?
    - Por que encapsulamento é útil?
    - Como duas bicicletas criadas pela mesma classe podem ter velocidades diferentes?
    - Qual é a diferença entre superclasse e subclasse?
    - Para que servem `extends` e `implements`?
    - Por que uma interface pode ser comparada a um contrato?
    - Qual é a função de um pacote?

    ## ⚠️ Pontos de atenção

    - Não confunda classe com objeto: a classe é o modelo; o objeto é a instância.
    - Campos e métodos possuem funções diferentes: campos representam dados; métodos definem comportamentos.
    - Encapsulamento não significa apenas agrupar campos e métodos: envolve ocultar o estado interno e controlar o acesso a ele.
    - Criar dois objetos da mesma classe não significa que eles compartilham automaticamente os mesmos valores de instância.
    - Em Java, uma classe possui somente uma superclasse direta.
    - `extends` é utilizado para herança entre classes; `implements` é utilizado para implementar interfaces.
    - Uma classe concreta que implementa uma interface precisa implementar os métodos abstratos exigidos por ela.
    - Os métodos implementados devem ser públicos; não reduza a visibilidade exigida pela interface.
    - Pacotes organizam classes e interfaces; não são a mesma coisa que classes ou objetos.
    - A API Java disponibiliza classes e funcionalidades prontas para reutilização.

    ## 📝 Resumo

    A programação orientada a objetos organiza o software por meio de objetos que possuem estado e comportamento. As classes funcionam como modelos para criar esses objetos. O encapsulamento protege o estado interno e controla a interação com o objeto por meio de métodos.

    A herança permite que uma classe aproveite características de outra usando `extends`. As interfaces estabelecem contratos de comportamento que as classes assumem ao utilizar `implements`. Por fim, os pacotes organizam classes e interfaces relacionadas, enquanto a API Java oferece uma biblioteca de funcionalidades reutilizáveis.

    ## 🏋️ Exercícios

    Resolva no IntelliJ. Escreva o código, execute e explique o que aconteceu. Não consulte soluções prontas antes de tentar.

    ### Exercício 1 — Identificando objetos

    Escolha três objetos do mundo real. Para cada um, liste pelo menos três estados possíveis e três comportamentos.

    ### Exercício 2 — Criando uma classe

    Crie uma classe `Celular` com campos para marca, modelo e nível de bateria. Adicione métodos para ligar, desligar e carregar.

    ### Exercício 3 — Criando instâncias

    No método `main()`, crie dois objetos da classe `Celular`. Atribua valores diferentes a cada um e demonstre que são objetos independentes.

    ### Exercício 4 — Estado e comportamento

    Crie uma classe `ContaBancaria` com um campo para saldo e métodos para depositar e consultar o saldo. Explique qual parte representa o estado e qual representa o comportamento.

    ### Exercício 5 — Encapsulamento

    Modifique a classe do exercício anterior para impedir que o saldo seja alterado diretamente de fora da classe. Controle a alteração por meio de métodos.

    ### Exercício 6 — Herança

    Crie uma classe `Animal` com um método `emitirSom()`. Depois, crie duas subclasses que herdem de `Animal` e acrescentem comportamentos próprios.

    ### Exercício 7 — Utilizando extends

    Crie uma classe `Veiculo` e uma subclasse `Moto`. Identifique quais características pertencem à superclasse e quais são específicas da subclasse.

    ### Exercício 8 — Criando uma interface

    Crie uma interface `Controlavel` com os métodos `ligar()` e `desligar()`. Depois, crie uma classe que implemente essa interface.

    ### Exercício 9 — Identificando contratos

    Crie duas classes diferentes que implementem a mesma interface. Cada classe deve fornecer sua própria implementação dos métodos declarados.

    ### Exercício 10 — Lei de Feynman

    Explique com suas próprias palavras:

    1. O que é programação orientada a objetos?
    2. O que é um objeto?
    3. O que é uma classe?
    4. O que é encapsulamento?
    5. O que é herança?
    6. O que é uma interface?
    7. O que é um pacote?
    8. Para que serve a API Java?

    ## 🔄 Revisão

    Responda sem consultar as anotações:

    1. Quais são as duas características compartilhadas pelos objetos?
    2. Onde um objeto armazena seu estado?
    3. Como o comportamento de um objeto é disponibilizado?
    4. O que significa encapsulamento de dados?
    5. Cite dois benefícios de organizar o código em objetos.
    6. O que é uma classe?
    7. O que significa instanciar uma classe?
    8. Por que dois objetos da mesma classe podem possuir estados diferentes?
    9. O que é uma superclasse?
    10. O que é uma subclasse?
    11. Qual palavra-chave indica herança em Java?
    12. Quantas superclasses diretas uma classe Java pode ter?
    13. O que é uma interface?
    14. Qual palavra-chave indica a implementação de uma interface?
    15. O que acontece se uma classe concreta não implementar os métodos abstratos exigidos pela interface?
    16. Por que os métodos implementados de uma interface precisam ser públicos?
    17. O que é um pacote?
    18. O que significa API?
    19. Qual é a utilidade da documentação da API da plataforma Java?

    ## ✅ Checklist

    - [ ]  Entendi a diferença entre estado e comportamento.
    - [ ]  Sei identificar campos e métodos em uma classe.
    - [ ]  Entendi o que é encapsulamento.
    - [ ]  Conheço os benefícios da organização em objetos.
    - [ ]  Sei diferenciar classe e objeto.
    - [ ]  Sei criar instâncias utilizando `new`.
    - [ ]  Entendi que cada objeto possui seu próprio estado.
    - [ ]  Entendi o conceito de superclasse e subclasse.
    - [ ]  Sei reconhecer o uso de `extends`.
    - [ ]  Entendi o papel de uma interface.
    - [ ]  Sei reconhecer o uso de `implements`.
    - [ ]  Entendi que uma interface estabelece um contrato.
    - [ ]  Sei por que os métodos implementados precisam ser públicos.
    - [ ]  Entendi a função dos pacotes.
    - [ ]  Sei explicar o que é a API Java.
    - [ ]  Consigo explicar os conceitos sem consultar as anotações.
    - [ ]  Resolvi os exercícios propostos.

    ---

    **Referência:** Oracle Learn Java — Objetos, Classes, Interfaces, Pacotes e Herança.

    **Última atualização informada pela fonte:** 14 de setembro de 2021.

    **Observação sobre a fonte:** os diagramas mencionados no texto original foram descritos conceitualmente, mas não foram reproduzidos nesta documentação. Os exemplos complementares estão identificados como material didático adicional.
         */
    }
}
