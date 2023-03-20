import java.util.Scanner;

public class DoisJava {
    public static void main(String[] args) throws Exception {

        Scanner escreva = new Scanner(System.in);
        int[] num = new int[5];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            System.out.println("Escreva um número");
            num[i] = escreva.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (num[i] > maior) {
                maior = num[i];
            }
            if (num[i] < menor) {
                menor = num[i];
            }
        }
        System.out.println("Menor" + menor);
        System.out.println("Maior" + maior);
    }
}
