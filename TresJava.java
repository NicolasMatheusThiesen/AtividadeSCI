import java.util.Scanner;

public class TresJava {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        double nota1, nota2, nota3, nota4, media;
        char continuar;

        do {
            System.out.println("Digite o nome do aluno:");
            nome = scanner.next();

            System.out.println("Digite a primeira nota:");
            nota1 = scanner.nextDouble();

            System.out.println("Digite a segunda nota:");
            nota2 = scanner.nextDouble();

            System.out.println("Digite a terceira nota:");
            nota3 = scanner.nextDouble();

            System.out.println("Digite a quarta nota:");
            nota4 = scanner.nextDouble();

            media = (nota1 + nota2 + nota3 + nota4) / 4;

            System.out.printf("Aluno: %s\nMédia: %.2f\n", nome, media);

            if (media < 6) {
                System.out.println("Situação: Reprovado");
            } else {
                System.out.println("Situação: Aprovado");
            }

            System.out.println("Deseja continuar? (S/N)");
            continuar = scanner.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');

        scanner.close();
    }
}
