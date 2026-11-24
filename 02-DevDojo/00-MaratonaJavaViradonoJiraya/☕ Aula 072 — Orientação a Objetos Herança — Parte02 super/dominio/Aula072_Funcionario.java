package dominio;

public class Aula072_Funcionario extends Aula072_Pessoa {
    private double salario;

    public void imprime(){
        super.imprime();
        System.out.println("Salario: "+this.salario);
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
