public class RamificacaoComInstrucoesSwitch_notion {
    public static void main(String[] args) {
        /*
        - **Ramificação com instruções switch**

    ## 🎯 Objetivo

    Compreender como utilizar a instrução `switch` para selecionar um caminho de execução com base no valor de uma variável seletora, reconhecer os tipos aceitos, controlar a execução com `break` e `default` e identificar quando escolher `switch` ou `if-then-else`.

    ## 📚 Conceitos

    ### 1. O que é uma instrução switch?

    A instrução `switch` é uma das estruturas de controle de fluxo do Java. Ela permite selecionar entre vários caminhos de execução com base no valor de uma expressão, chamada de **variável seletora**.

    O Java avalia a expressão do `switch` e procura um rótulo `case` compatível com o valor encontrado. A execução começa no bloco associado ao rótulo correspondente.

    ### 2. Tipos aceitos pela variável seletora

    De acordo com a lição, a variável seletora pode utilizar:

    - Tipos primitivos: `byte`, `short`, `char` e `int`.
    - Tipos wrapper: `Character`, `Byte`, `Short` e `Integer`.
    - Tipos enumerados (`enum`).
    - `String`.

    Os tipos primitivos `boolean`, `long`, `float` e `double` não podem ser utilizados como tipo da variável seletora nesta forma de `switch` apresentada pela lição.

    ### 3. Estrutura básica: switch, case, break e default

    O corpo de uma instrução `switch` é chamado de **bloco switch**. Dentro dele, as instruções podem ser identificadas por um ou mais rótulos `case` ou pelo rótulo `default`.

    - `switch`: avalia a expressão seletora.
    - `case`: identifica um valor possível.
    - `break`: encerra a instrução `switch` que o contém.
    - `default`: trata valores que não correspondem a nenhum dos rótulos `case` definidos.

    Exemplo da lição:

    ```java
    int quarter = ...; // any value

    String quarterLabel = null;
    switch (quarter) {
        case 0: quarterLabel = "Q1 - Winter";
                break;
        case 1: quarterLabel = "Q2 - Spring";
                break;
        case 2: quarterLabel = "Q3 - Summer";
                break;
        case 3: quarterLabel = "Q3 - Summer";
                break;
        default: quarterLabel = "Unknown quarter";
    };
    ```

    **Atenção ao exemplo da fonte:** os casos `2` e `3` recebem o mesmo texto, `"Q3 - Summer"`. A lição não explica se isso é intencional; portanto, não alteramos o exemplo original. Em um programa real, confirme o resultado esperado antes de corrigir esse valor.

    ### 4. O comportamento de fall through

    Quando um `case` correspondente é encontrado, o Java executa as instruções a partir daquele ponto. Se não houver um `break`, a execução continua também pelos próximos casos, mesmo que os valores dos rótulos seguintes não correspondam à variável seletora. Esse comportamento é chamado de **fall through**.

    Exemplo da lição:

    ```java
    int month = 8;
    List<String> futureMonths = new ArrayList<>();

    switch (month) {
        case 1:  futureMonths.add("January");
        case 2:  futureMonths.add("February");
        case 3:  futureMonths.add("March");
        case 4:  futureMonths.add("April");
        case 5:  futureMonths.add("May");
        case 6:  futureMonths.add("June");
        case 7:  futureMonths.add("July");
        case 8:  futureMonths.add("August");
        case 9:  futureMonths.add("September");
        case 10: futureMonths.add("October");
        case 11: futureMonths.add("November");
        case 12: futureMonths.add("December");
                 break;
        default: break;
    }
    ```

    Como `month` vale `8`, a execução começa no `case 8`. Como não há `break` nos casos seguintes, os meses de agosto até dezembro são adicionados à lista. O `break` do caso `12` encerra o `switch`.

    A lição observa que o último `break` não é tecnicamente necessário, porque a execução já sairia do bloco `switch` ao chegar ao final. Mesmo assim, recomenda mantê-lo para facilitar futuras alterações e reduzir a possibilidade de erros.

    ### 5. Utilizando default

    O rótulo `default` representa o caminho executado quando nenhum dos rótulos `case` corresponde ao valor seletor.

    No exemplo anterior, o `default` contém apenas `break`. No exemplo seguinte, ele informa que o mês recebido é inválido.

    ### 6. Vários rótulos case para o mesmo bloco

    Uma instrução pode utilizar vários rótulos `case` para executar o mesmo conjunto de instruções. Isso evita repetir o mesmo código para valores que compartilham o mesmo resultado.

    Exemplo da lição — calcular a quantidade de dias de um mês:

    ```java
    int month = 2;
    int year = 2021;
    int numDays = 0;

    switch (month) {
        case 1: case 3: case 5:   // January March May
        case 7: case 8: case 10:  // July August October
        case 12:
            numDays = 31;
            break;
        case 4: case 6:   // April June
        case 9: case 11:  // September November
            numDays = 30;
            break;
        case 2: // February
            if (((year % 4 == 0) &&
                 !(year % 100 == 0))
                 || (year % 400 == 0))
                numDays = 29;
            else
                numDays = 28;
            break;
        default:
            IO.println("Invalid month.");
            break;
    }
    ```

    Os meses com 31 dias compartilham uma atribuição; os meses com 30 dias compartilham outra. Fevereiro possui um tratamento separado, pois sua quantidade de dias depende do ano. O `if-else` interno verifica a condição de ano bissexto apresentada pela fonte.

    ### 7. Quando escolher switch ou if-then-else?

    A escolha deve considerar a legibilidade e o tipo de condição que precisa ser testada.

    - `switch`: adequado quando a seleção depende de valores específicos de uma variável, como um número inteiro, um valor enumerado ou uma `String`.
    - `if-then-else`: adequado quando as condições envolvem comparações, intervalos ou expressões booleanas.

    Um conjunto de comparações de igualdade com meses pode ser escrito com `switch`:

    ```java
    int month = ...; // any month
    if (month == 1) {
        IO.println("January");
    } else if (month == 2) {
        IO.println("February");
    } // and so on
    ```

    Por outro lado, a verificação de faixas de temperatura exige condições relacionais e, por isso, utiliza `if-then-else`:

    ```java
    int temperature = ...; // any temperature
    if (temperature < 0) {
        IO.println("Water is ice");
    } else if (temperature < 100) {
        IO.println("Water is liquid, known as water");
    } else {
        IO.println("Water is vapor");
    }
    ```

    A lição explica que esse segundo exemplo não pode ser representado com os rótulos `case` tradicionais apresentados, pois eles não aceitam condições booleanas como `temperature < 0`.

    ### 8. Utilizando String nos rótulos case

    Desde o Java SE 7, é possível utilizar um objeto `String` na expressão de uma instrução `switch`.

    Exemplo da lição — converter o nome de um mês em seu número:

    ```java
    String month = ...; // any month
    int monthNumber = -1;

    switch (month.toLowerCase()) {
        case "january":
            monthNumber = 1;
            break;
        case "february":
            monthNumber = 2;
            break;
        case "march":
            monthNumber = 3;
            break;
        case "april":
            monthNumber = 4;
            break;
        case "may":
            monthNumber = 5;
            break;
        case "june":
            monthNumber = 6;
            break;
        case "july":
            monthNumber = 7;
            break;
        case "august":
            monthNumber = 8;
            break;
        case "september":
            monthNumber = 9;
            break;
        case "october":
            monthNumber = 10;
            break;
        case "november":
            monthNumber = 11;
            break;
        case "december":
            monthNumber = 12;
            break;
        default:
            monthNumber = 0;
            break;
    }
    ```

    A comparação de valores `String` nos rótulos `case` funciona como se fosse utilizado o método `String.equals()`. No exemplo, `toLowerCase()` converte o nome recebido para letras minúsculas, permitindo que a comparação funcione com nomes digitados em diferentes combinações de maiúsculas e minúsculas.

    ### 9. Variável seletora null

    A variável seletora pode ser um objeto, como uma `String` ou um tipo wrapper. Se esse objeto estiver com valor `null`, a instrução `switch` lançará uma exceção `NullPointerException`.

    Por isso, é necessário proteger o código contra uma variável seletora nula antes de utilizá-la no `switch`.

    ## 🧠 O que memorizar

    - `switch` escolhe um caminho com base no valor de uma expressão seletora.
    - Os tipos apresentados pela lição são `byte`, `short`, `char`, `int`, seus wrappers correspondentes, `enum` e `String`.
    - `boolean`, `long`, `float` e `double` não são aceitos como tipos primitivos da variável seletora nesta forma de `switch`.
    - `case` identifica um valor possível.
    - `break` encerra o `switch` que o contém.
    - Sem `break`, pode ocorrer `fall through`: a execução continua pelos casos seguintes.
    - `default` trata valores que não correspondem a nenhum `case`.
    - Vários rótulos `case` podem compartilhar o mesmo bloco de instruções.
    - `switch` é indicado para selecionar valores específicos; `if-else` permite testar intervalos e condições.
    - A comparação de `String` nos rótulos `case` funciona como `String.equals()`.
    - Uma variável seletora `null` pode causar `NullPointerException`.

    ## 💻 Exemplos de código

    ### Exemplo 1 — Selecionar uma opção

    ```java
    int opcao = 2;

    switch (opcao) {
        case 1:
            IO.println("Cadastrar");
            break;
        case 2:
            IO.println("Consultar");
            break;
        case 3:
            IO.println("Sair");
            break;
        default:
            IO.println("Opção inválida");
            break;
    }
    ```

    Saída:

    ```
    Consultar
    ```

    ### Exemplo 2 — Agrupar valores

    ```java
    int dia = 6;

    switch (dia) {
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
            IO.println("Dia útil");
            break;
        case 6:
        case 7:
            IO.println("Fim de semana");
            break;
        default:
            IO.println("Dia inválido");
            break;
    }
    ```

    Saída:

    ```
    Fim de semana
    ```

    *Complemento didático: exemplos adicionais para praticar a estrutura apresentada na lição.*

    ## 🔎 Explicação do código

    ### 1. Como o switch escolhe o caminho?

    Pense no `switch` como um menu de opções. O programa recebe um valor e procura o `case` correspondente. Se encontrar, começa a executar as instruções daquele caso.

    ### 2. Por que o break é importante?

    O `break` funciona como uma ordem para sair do `switch`. Sem ele, o Java pode continuar executando as instruções dos casos seguintes. Esse comportamento é o `fall through`.

    ### 3. Quando usar vários case?

    Quando valores diferentes precisam produzir o mesmo resultado. Em vez de repetir as instruções, os rótulos podem ser colocados em sequência e compartilhar um único bloco.

    ### 4. Switch ou if-else?

    Imagine um menu com opções numeradas: cada número representa uma escolha específica, o que combina com `switch`. Agora imagine classificar temperaturas abaixo de zero, entre zero e cem ou acima de cem: isso depende de intervalos e combina melhor com `if-else`.

    ### 5. Analogia — Lei de Feynman

    Imagine uma máquina de atendimento com um seletor:

    - `switch`: a máquina lê a opção escolhida.
    - `case`: cada opção disponível no menu.
    - `break`: encerra o atendimento daquela opção.
    - `default`: informa que a opção não existe.
    - `fall through`: a máquina continua executando as opções seguintes porque não recebeu a instrução para parar.

    ## ⚠️ Pontos de atenção

    - Não confunda `switch` com uma sequência de condições por intervalo. Para intervalos, utilize `if-else`.
    - Verifique se cada `case` precisa de `break`. A ausência dele pode provocar `fall through`.
    - O `default` é importante para tratar valores não previstos.
    - Vários rótulos `case` podem compartilhar o mesmo bloco, sem duplicar instruções.
    - O último `break` pode ser dispensável quando o fluxo já chega ao fim do `switch`, mas a lição recomenda mantê-lo para facilitar alterações futuras.
    - A comparação de `String` nos casos é baseada em igualdade de conteúdo, como em `equals()`.
    - `toLowerCase()` converte o texto para minúsculas; os rótulos precisam corresponder à forma convertida.
    - Verifique se uma variável seletora que contém um objeto pode ser `null`, pois isso pode gerar `NullPointerException`.
    - No exemplo dos trimestres, a fonte repete o rótulo `"Q3 - Summer"` nos casos `2` e `3`. Não trate isso como uma regra da linguagem: é apenas o conteúdo daquele exemplo.

    ## 📝 Resumo

    A instrução `switch` permite selecionar um caminho de execução de acordo com o valor de uma expressão. Os rótulos `case` identificam os valores tratados, enquanto `default` oferece um caminho para valores não previstos. A instrução `break` encerra o bloco; sem ela, pode ocorrer `fall through`, fazendo a execução continuar pelos casos seguintes.

    O `switch` pode trabalhar com tipos inteiros específicos, tipos enumerados e `String`. É mais adequado quando a seleção depende de valores específicos. Para condições com intervalos ou expressões booleanas, a estrutura `if-else` é a escolha apropriada.

    **Ideia central:** `switch` seleciona um caminho a partir de um valor; `case`, `break` e `default` controlam como essa seleção será executada.

    ## 🏋️ Exercícios

    Resolva primeiro no papel ou explicando o raciocínio. Depois, implemente no IntelliJ. Não consulte uma solução pronta antes de tentar.

    ### Exercício 1 — Opções de menu

    Crie uma variável inteira chamada `opcao`. Utilize `switch` para exibir uma mensagem diferente para as opções 1, 2 e 3. Utilize `default` para opções inválidas.

    ### Exercício 2 — Entendendo break

    Observe um `switch` com três casos em sequência. Remova o `break` do primeiro caso e descreva quais mensagens serão exibidas quando a variável seletora corresponder a ele.

    ### Exercício 3 — Fall through

    Crie um `switch` com uma variável `mes = 8`. Faça a execução adicionar à lista os meses a partir de agosto até dezembro, utilizando o comportamento de `fall through`.

    ### Exercício 4 — Agrupando cases

    Crie uma variável `dia` de 1 a 7. Agrupe os dias de segunda a sexta em um mesmo bloco e sábado e domingo em outro. Exiba se é dia útil ou fim de semana.

    ### Exercício 5 — Dias do mês

    Utilize `switch` para definir a quantidade de dias de um mês. Agrupe os meses com 30 e 31 dias e trate fevereiro separadamente. Utilize `default` para mês inválido.

    ### Exercício 6 — Switch ou if-else?

    Escreva duas situações:

    1. Uma escolha baseada em valores específicos, como uma opção de menu.
    2. Uma classificação baseada em intervalos numéricos, como faixas de temperatura.

    Implemente a primeira com `switch` e a segunda com `if-else`. Explique por que escolheu cada estrutura.

    ### Exercício 7 — String

    Crie uma variável `String mes` com o nome de um mês em inglês. Utilize `switch` para convertê-lo em seu número. Teste o comportamento com letras maiúsculas e minúsculas usando `toLowerCase()`.

    ### Exercício 8 — Null

    Declare uma variável `String` com valor `null`. Antes de utilizá-la em um `switch`, implemente uma verificação que impeça a ocorrência de `NullPointerException`.

    ### Exercício 9 — Lei de Feynman

    Explique com suas próprias palavras:

    1. Qual é a função do `switch`?
    2. Qual é a diferença entre `case` e `default`?
    3. O que acontece quando falta um `break`?
    4. Quando vários `case` podem compartilhar um bloco?
    5. Quando escolher `switch` em vez de `if-else`?

    ## 🔄 Revisão

    Responda sem consultar as anotações:

    1. Para que serve a instrução `switch`?
    2. O que é a variável seletora?
    3. Quais tipos podem ser utilizados como variável seletora segundo a lição?
    4. Quais tipos primitivos não podem ser utilizados?
    5. O que representa um rótulo `case`?
    6. Qual é a função de `break`?
    7. O que significa `fall through`?
    8. Para que serve o rótulo `default`?
    9. Como vários rótulos `case` podem compartilhar instruções?
    10. Qual é a diferença entre usar `switch` e `if-else`?
    11. Desde qual versão do Java a lição informa que `String` pode ser utilizada em `switch`?
    12. Como a comparação de `String` nos rótulos `case` funciona?
    13. Por que uma variável seletora `null` pode causar uma exceção?

    ## ✅ Checklist

    - [ ]  Entendi a finalidade da instrução `switch`.
    - [ ]  Sei identificar a variável seletora.
    - [ ]  Conheço os tipos aceitos pela estrutura apresentada na lição.
    - [ ]  Sei utilizar rótulos `case`.
    - [ ]  Entendi como e por que utilizar `break`.
    - [ ]  Consigo explicar o comportamento de `fall through`.
    - [ ]  Sei utilizar `default`.
    - [ ]  Consigo agrupar vários rótulos `case`.
    - [ ]  Sei diferenciar situações adequadas para `switch` e `if-else`.
    - [ ]  Entendi como utilizar `String` no `switch`.
    - [ ]  Sei por que uma variável seletora `null` precisa ser tratada.
    - [ ]  Consigo explicar o funcionamento de um `switch` sem consultar as anotações.

    ---

    **Referência:** Dev.java — Branching with Switch Statements.

    **Última atualização informada pela fonte:** 14 de setembro de 2021.
         */
    }
}
