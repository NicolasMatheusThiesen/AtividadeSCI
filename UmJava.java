import java.util.Scanner;



public class UmJava {
    public static void main(String[] args) throws Exception {

        Scanner escreva = new Scanner(System.in);
        int[] num = new int[5];
        int soma = 0;
        double media = 0;
        int par=0;
        int imp=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Escreva um número");
            num[i] = escreva.nextInt();
            soma += num[i];
        }
        media = soma / 5;
        for (int i = 0; i < 5; i++) {
            if (num[i] % 2 == 0) {
                par = num[i];
                System.out.println("Par"+ par);
            } 
            else{
                imp = num[i];
                System.out.println("Impares"+ imp);
            }
        }
             System.out.println("Média" + media);     
            
    
    }
}
