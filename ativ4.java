import java.util.Scanner;

public class ativ4 {
        public static void main(String[] args) {
        final int TOTAL_PRODUTOS = 12; 
        Scanner scanner = new Scanner(System.in);
        double totalCusto = 0;
        double totalVenda = 0;

        for (int i = 1; i <= TOTAL_PRODUTOS; i++) {
            System.out.print("Digite o preço de custo do produto " + i + ": ");
            double precoCusto = scanner.nextDouble();

            System.out.print("Digite o preço de venda do produto " + i + ": ");
            double precoVenda = scanner.nextDouble();

            totalCusto += precoCusto;
            totalVenda += precoVenda;

            if (precoVenda > precoCusto) {
                System.out.println("Produto " + i + ": Lucro");
            } else if (precoVenda < precoCusto) {
                System.out.println("Produto " + i + ": Prejuízo");
            } else {
                System.out.println("Produto " + i + ": Empate");
            }
        }

        double mediaCusto = totalCusto / TOTAL_PRODUTOS;
        double mediaVenda = totalVenda / TOTAL_PRODUTOS;

        System.out.println("\nMédia de preço de custo: " + mediaCusto);
        System.out.println("Média de preço de venda: " + mediaVenda);

        scanner.close();
    }
}
