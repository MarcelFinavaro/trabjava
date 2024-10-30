import javax.swing.JOptionPane;

public class GeradorDeTabuada {

    public static void main(String[] args) {
        // Solicitar um número ao usuário
        String numeroStr = JOptionPane.showInputDialog("Digite um número para ver sua tabuada:");
        
        // Converter o número para inteiro
        int numero = Integer.parseInt(numeroStr);

        // Gerar e exibir a tabuada
        StringBuilder tabuada = new StringBuilder();
        tabuada.append("Tabuada do ").append(numero).append(":\n");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            tabuada.append(numero).append(" x ").append(i).append(" = ").append(resultado).append("\n");
        }

        // Exibir a tabuada
        JOptionPane.showMessageDialog(null, tabuada.toString());
    }
}