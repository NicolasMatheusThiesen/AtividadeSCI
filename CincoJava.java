import java.util.Scanner;

public class CincoJava {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] alunos = new String[3][5]; 
        double[] medias = new double[3];
        double maiorMedia = 0, menorMedia = 10; 
        String nomeMaiorMedia = "", nomeMenorMedia = ""; 

        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite o nome do %dº aluno:\n", i+1);
            alunos[i][0] = scanner.next();

            double somaNotas = 0;
            for (int j = 1; j < 5; j++) {
                System.out.printf("Digite a %dª nota:\n", j);
                alunos[i][j] = scanner.next();
                somaNotas += Double.parseDouble(alunos[i][j]);
            }

            medias[i] = somaNotas / 4;

            if (medias[i] > maiorMedia) {
                maiorMedia = medias[i];
                nomeMaiorMedia = alunos[i][0];
            }

            if (medias[i] < menorMedia) {
                menorMedia = medias[i];
                nomeMenorMedia = alunos[i][0];
            }
        }

        System.out.println("\nMédias:");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%s: %.2f\n", alunos[i][0], medias[i]);
        }

        System.out.println("\nAluno com a maior média: " + nomeMaiorMedia);
        System.out.println("Aluno com a menor média: " + nomeMenorMedia);

        scanner.close();
    }
}
