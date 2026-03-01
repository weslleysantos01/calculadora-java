import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            mostrarMenu();

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 4) {

                System.out.print("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();

                System.out.print("Digite o segundo número: ");
                double num2 = scanner.nextDouble();

                double resultado = calcular(opcao, num1, num2);

                System.out.println("Resultado: " + resultado);
            }

        } while (opcao != 5);

        System.out.println("Programa encerrado.");
        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("\n=== CALCULADORA ===");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Sair");
    }

    public static double calcular(int opcao, double a, double b) {

        switch (opcao) {
            case 1:
                return a + b;
            case 2:
                return a - b;
            case 3:
                return a * b;
            case 4:
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Não é possível dividir por zero!");
                    return 0;
                }
            default:
                return 0;
        }
    }
}