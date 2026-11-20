package dominio;

public class Aula051_ImpressoraEstudante {
    public void imprime(Aula051_Estudante estudante){
        System.out.println("\n+++++++++++\n");

        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
        estudante.nome = "Gohan";
    }

}
