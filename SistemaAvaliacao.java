import javax.swing.JOptionPane;

public class SistemaAvaliacao {

    public static void main(String[] args) {
        // Solicitar as notas das provas e do trabalho
        String nota1Str = JOptionPane.showInputDialog("Digite a nota da primeira prova: ");
        double nota1 = Double.parseDouble(nota1Str);

        String nota2Str = JOptionPane.showInputDialog("Digite a nota da segunda prova: ");
        double nota2 = Double.parseDouble(nota2Str);

        String notaTrabalhoStr = JOptionPane.showInputDialog("Digite a nota do trabalho: ");
        double notaTrabalho = Double.parseDouble(notaTrabalhoStr);

        // Calcular a média
        double media = (nota1 + nota2 + notaTrabalho) / 3;

        // Verificar se o aluno está aprovado ou reprovado
        String resultado;
        if (media >= 6) {
            resultado = "Aprovado";
        } else {
            resultado = "Reprovado";
        }

        // Exibir a média e o resultado
        JOptionPane.showMessageDialog(null, String.format("Média: %.2f%nResultado: %s", media, resultado));
    }
}