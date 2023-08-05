import java.util.Scanner;

public class atividade_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        int h = A;
        A = B;
        B = h;

        System.out.println("\nValores trocados:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);

        scanner.close();
    }
}