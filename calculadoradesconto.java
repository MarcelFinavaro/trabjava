import java.util.Scanner;

public class CalculadoraDesconto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o valor do produto
        System.out.print("Digite o valor do produto: R$ ");
        double valorProduto = scanner.nextDouble();

        // Solicitar a porcentagem de desconto
        System.out.print("Digite a porcentagem de desconto: ");
        double porcentagemDesconto = scanner.nextDouble();

        // Calcular o valor do desconto
        double valorDesconto = (porcentagemDesconto / 100) * valorProduto;

        // Calcular o preço final do produto
        double precoFinal = valorProduto - valorDesconto;

        // Exibir os resultados
        System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
        System.out.printf("Preço final do produto: R$ %.2f%n", precoFinal);

        // Fechar o scanner
        scanner.close();
    }
}