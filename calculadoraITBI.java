import javax.swing.JOptionPane;

public class CalculadoraITBI {

    public static void main(String[] args) {
        // Solicitar o valor de transação do imóvel
        String valorTransacaoStr = JOptionPane.showInputDialog("Digite o valor de transação do imóvel: ");
        double valorTransacao = Double.parseDouble(valorTransacaoStr);

        // Solicitar o valor venal do imóvel
        String valorVenalStr = JOptionPane.showInputDialog("Digite o valor venal do imóvel: ");
        double valorVenal = Double.parseDouble(valorVenalStr);

        // Solicitar a porcentagem do imposto ITBI
        String porcentagemITBIStr = JOptionPane.showInputDialog("Digite a porcentagem do imposto ITBI: ");
        double porcentagemITBI = Double.parseDouble(porcentagemITBIStr);

        // Determinar o maior valor entre valor de transação e valor venal
        double maiorValor = Math.max(valorTransacao, valorVenal);

        // Calcular o imposto ITBI
        double impostoITBI = (porcentagemITBI / 100) * maiorValor;

        // Exibir o resultado
        JOptionPane.showMessageDialog(null, String.format("O imposto ITBI a ser pago é: R$ %.2f", impostoITBI));
    }
}