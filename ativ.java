import java.util.Scanner;

public class ativ {
    public static void main(String[] args) {
        int numero1,numero2,soma;
        Scanner valor = new Scanner(System.in);
        try{
            System.out.println("digite numero :");
            numero1 = valor.nextInt();
            try{
                System.out.println("digite um segundo numero :");
                numero2 = valor.nextInt();
                soma=numero1 + numero2;
                System.out.println("o resutado é :"+soma);

            }catch(Exception e){
                System.out.println("só aceita numeros");
            }

        }catch(Exception e){
            System.out.println("só aceita numero");
        }

    }
}
