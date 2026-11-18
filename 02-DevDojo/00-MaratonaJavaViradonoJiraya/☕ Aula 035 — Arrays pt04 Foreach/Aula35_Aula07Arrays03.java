public class Aula35_Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 =new int[]{5,4,3,2,1};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println("+++++++++++\nseparação2");
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }
        System.out.println("+++++++++++\nseparação3");
        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]);
        }
        System.out.println("+++++++++++\nseparação4");
        for (int num : numeros3){
            System.out.println(num);
        }
        //foreach 3 tipos de arrays
    }
}
