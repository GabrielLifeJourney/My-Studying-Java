public class Aula27_Aula06EstruturasdeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        System.out.println("++++++++++++++++++++++++++++++++++");
        System.out.println("             while                ");
        int count = 0;
        while (count < 10){
            System.out.println(++count);
           // count += 1 ; count = count = count + 1;
        }
        System.out.println("++++++++++++++++++++++++++++++++++");
        System.out.println("          do-while                ");
        count = 0;
        do {
        System.out.println("Dentro do do-while " + ++count);
        //count++;
        } while (count < 10);
        System.out.println("++++++++++++++++++++++++++++++++++");
        System.out.println("               for                ");
        for (int i=1; i<=10; i++){
            System.out.println("For"+ i);
        }

    }
}
