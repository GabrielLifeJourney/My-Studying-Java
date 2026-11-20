package dominio;

public class Aula055_Pessoa {
    private String nome;
    private int idade;

    public void imprime(){
//        System.out.println(get.nome); não faça isso
//        System.out.println(get.idade);
        System.out.println(nome);
        System.out.println(idade);
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade) {
        if (idade < 0){
            System.out.println("Idade Invalida");
            return;
        }
        this.idade = idade;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }


}
