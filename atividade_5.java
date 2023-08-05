import java.text.DecimalFormat;
import java.util.Scanner;

public class atividade_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();
        System.out.print("Digite a nota da primeira prova: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a nota 2: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite a nota 3: ");
        double nota3 = scanner.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;
        DecimalFormat df = new DecimalFormat("0.00");
        String mediaFormatada = df.format(media);

        System.out.println("\nNome do Aluno: " + nomeAluno);
        System.out.println("Média: " + mediaFormatada);
        scanner.close();
    }
}

  

