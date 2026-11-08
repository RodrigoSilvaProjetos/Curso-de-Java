import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CALCULADORA SIMPLES ===");

        // Entrada dos números
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // Escolha da operação
        System.out.println("\nEscolha a operação:");
        System.out.println("1 - Soma (+)");
        System.out.println("2 - Subtração (-)");
        System.out.println("3 - Multiplicação (*)");
        System.out.println("4 - Divisão (/)");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        double resultado = 0;
        boolean operacaoValida = true;

        // Estrutura de decisão para calcular o resultado
        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                // Validação para evitar divisão por zero
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("\nErro: Não é possível dividir por zero!");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("\nOpção inválida!");
                operacaoValida = false;
                break;
        }

        // Exibição do resultado
        if (operacaoValida) {
            System.out.println("\nO resultado é: " + resultado);
        }

        // Fechamento do scanner
        scanner.close();
    }
}