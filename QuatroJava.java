import java.util.Scanner;

public class QuatroJava {
    public static void main(String[] args) throws Exception {

        Scanner escreva = new Scanner(System.in);
        int[] num = new int[5];
        int n=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Escreva um número");
            num[i] = escreva.nextInt();
            
        }
        n = num[2];
        System.out.println("Posição 3 = " + n);
    }
}
