import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("digite um Valor A");
        int valorA = scanner.nextInt();
        System.out.println("digite um Valor B");
        int valorB = scanner.nextInt();

        valorA = valorA + valorB;
        valorB = valorA - valorB;
        valorA = valorA - valorB;

        System.out.println("depois da troca de valores:");
        System.out.println("valor de A: " + valorA);
        System.out.println("valor de B: " + valorB);


    }
}