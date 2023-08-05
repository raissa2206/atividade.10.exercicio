import java.util.Scanner;

public class ativ2 {
  public static void main(String[] args) {
        int numero1,numero2,soma,menos,divisao;
        double mutipica;
        Scanner valor = new Scanner(System.in);
        
            System.out.println("digite numero :");
            numero1 = valor.nextInt();
           
                System.out.println("digite um segundo numero:");
                numero2 = valor.nextInt();
                soma=numero1 + numero2;
                menos= numero1 - numero2;
                divisao= numero1 * numero2;
                mutipica= numero1/numero2;

                System.out.println("o resutado é soma :"+soma);
                System.out.println("o resutado é subtração :"+menos);
                System.out.println("o resutado é divisão :"+divisao);
                System.out.println("o resutado é mutiplicação :"+mutipica);

          

    }
}