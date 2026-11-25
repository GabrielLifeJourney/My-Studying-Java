package dominio;

public class Aula074_Funcionario extends Aula074_Pessoa {
    private double salario;

    public Aula074_Funcionario(String nome){
        super(nome);
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