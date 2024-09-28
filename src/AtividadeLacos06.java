import java.util.Scanner;

public class AtividadeLacos06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário um número n
        System.out.print("Digite a quantidade de números que deseja inserir: ");
        int n = scanner.nextInt();

        // Verifica se n é positivo
        if (n <= 0) {
            System.out.println("Por favor, insira um número positivo.");
            return;
        }

        double soma = 0;

        // Loop para receber n números do usuário
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o número " + i + ": ");
            double numero = scanner.nextDouble();
            soma += numero; // Adiciona o número à soma
        }

        // Calcula a média
        double media = soma / n;

        // Exibe a média
        System.out.printf("A média dos números inseridos é: %.2f\n", media);

        // Fecha o scanner
        scanner.close();
    }
}

