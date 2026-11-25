package dominio;

public class Aula075_Funcionario extends Aula075_Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do Bloco de Inicialização estatico de Funcionario");
    }
    {
        System.out.println("Dentro do Bloco de Inicialização de Funcionario 1");
    }
    {
        System.out.println("Dentro do Bloco de Inicialização de Funcionario 2");
    }

    public Aula075_Funcionario(String nome){
        super(nome);
        System.out.println("Dentro de construtor de funcionario");
    }

    public void imprime(){
        super.imprime();
        System.out.println("Salario: "+this.salario);
    }

    public void relatorioPagamentos(){
        System.out.println("Eu"+this.nome +"Recebi o Salario"+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}