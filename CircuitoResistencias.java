import javax.swing.JOptionPane;

public class CircuitoResistencias {

    public static void main(String[] args) {
        // Solicitar os valores das resistências
        String r1Str = JOptionPane.showInputDialog("Digite o valor da resistência R1 (em ohms): ");
        String r2Str = JOptionPane.showInputDialog("Digite o valor da resistência R2 (em ohms): ");
        String r3Str = JOptionPane.showInputDialog("Digite o valor da resistência R3 (em ohms): ");
        String r4Str = JOptionPane.showInputDialog("Digite o valor da resistência R4 (em ohms): ");

        // Converter os valores para double
        double r1 = Double.parseDouble(r1Str);
        double r2 = Double.parseDouble(r2Str);
        double r3 = Double.parseDouble(r3Str);
        double r4 = Double.parseDouble(r4Str);

        // Calcular a resistência equivalente em série
        double resistenciaEquivalente = r1 + r2 + r3 + r4;

        // Encontrar a maior e a menor resistência
        double maiorResistencia = Math.max(Math.max(r1, r2), Math.max(r3, r4));
        double menorResistencia = Math.min(Math.min(r1, r2), Math.min(r3, r4));

        // Exibir os resultados
        String resultado = String.format("Resistência Equivalente: %.2f ohms%n" +
                                          "Maior Resistência: %.2f ohms%n" +
                                          "Menor Resistência: %.2f ohms", 
                                          resistenciaEquivalente, maiorResistencia, menorResistencia);
        JOptionPane.showMessageDialog(null, resultado);
    }
}