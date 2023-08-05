import java.util.Scanner;

public class atividade_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();

        double Fahrenheit = (9 * temperaturaCelsius + 160) / 5;

        System.out.println("Em graus Fahrenheit fica: " + Fahrenheit + "\u00B09F");

        scanner.close();
    }
}
