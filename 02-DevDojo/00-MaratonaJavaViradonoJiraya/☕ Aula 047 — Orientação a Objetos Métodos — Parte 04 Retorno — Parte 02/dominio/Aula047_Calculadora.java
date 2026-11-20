package dominio;

public class Aula047_Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicaDoiNumeros(int num1, float num2) {
        System.out.println(num1*num2);
    }

    public double divideDoisNumeros(double num1,double num2){
        if(num2 == 0){
            return 0;
        }
        return num1 / num2;
    }

    public double divideDoisNumeros2(double num1,double num2){
        if(num2!=0){
            return num1/num2;
        }
        return 0;
    }
    public void divideDoisNumeros3(double num1,double num2){
        if(num2 == 0){
        System.out.println("Não existe divisao por zero");
            return; // atenção so funciona no public void .
        }
        System.out.println(num1/num2);
    }

    // AQUI TEMOS DIFERENTES MODOS DE return




}
