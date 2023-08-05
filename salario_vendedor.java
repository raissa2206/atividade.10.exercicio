

import java.util.Scanner;
public class salario_vendedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do vendedor: ");
        String nomeVend = scanner.nextLine();

        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o total de vendas efetuadas (em dinheiro): ");
        double totalVendas = scanner.nextDouble();

        double comissao = 0.15 * totalVendas;
        double salarioFinal = salarioFixo + comissao;
        System.out.println("\nNome do Vendedor: " + nomeVend);
        System.out.println("Salário Fixo: R$ " + salarioFixo);
        System.out.println("Comissão: R$ " + comissao);
        System.out.println("Salário Final no mês: R$ " + salarioFinal);

        scanner.close();
    }
}