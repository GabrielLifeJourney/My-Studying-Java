public class exercism003_AinfiltraçãodeAnnalyn {
    public static void main(String[] args) {
        /*
        ícone da trilha Java
        Nosso Analyzer de Java gerou este feedback ao analisar sua solução.
        Se você usa uma expressão || para combinar duas expressões menores com OR e uma delas está entre parênteses e só combina alguns termos com AND (por exemplo, knightIsAwake || (archerIsAwake && !prisonerIsAwake)), dá para omitir os parênteses, porque && tem precedência maior que ||:

        // instead of
        knightIsAwake || (archerIsAwake && !prisonerIsAwake);

        // use
        knightIsAwake || archerIsAwake && !prisonerIsAwake;
        Vale lembrar que, em certos casos complexos, usar parênteses pode melhorar a legibilidade e a compreensão da condição.

        Se este feedback automático não parecer certo, por favor abra uma issue no repositório exercism/java-analyzer.

        Exercism provides automated feedback using a number of intelligent tools and systems developed by our community
         */

        /*
         class AnnalynsInfiltration {
            public static boolean canFastAttack(boolean knightIsAwake) {
                return !knightIsAwake;
            }
            public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
                return knightIsAwake || archerIsAwake || prisonerIsAwake;
            }
            public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
                return prisonerIsAwake && !archerIsAwake;
            }
            public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
                return (petDogIsPresent && !archerIsAwake) || (!petDogIsPresent && prisonerIsAwake && !knightIsAwake && !archerIsAwake);
            }
        }
         */
    }
}
