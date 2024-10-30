import javax.swing.JOptionPane;

public class CalculadoraAposentadoria {

    public static void main(String[] args) {
        // Solicitar a idade, sexo e anos de contribuição
        String idadeStr = JOptionPane.showInputDialog("Digite sua idade: ");
        int idade = Integer.parseInt(idadeStr);

        String sexo = JOptionPane.showInputDialog("Digite seu sexo (M para masculino ou F para feminino): ").toUpperCase();

        String anosContribuicaoStr = JOptionPane.showInputDialog("Digite os anos de contribuição: ");
        int anosContribuicao = Integer.parseInt(anosContribuicaoStr);

        // Variáveis para armazenar as regras de aposentadoria
        int idadeAposentadoriaHomem = 65;
        int idadeAposentadoriaMulher = 62;
        int anosContribuicaoHomem = 35;
        int anosContribuicaoMulher = 30;

        // Verificar se a pessoa pode se aposentar
        boolean podeAposentar = false;
        int anosFaltando = 0;

        if (sexo.equals("M")) {
            // Verificar aposentadoria por idade
            if (idade >= idadeAposentadoriaHomem && anosContribuicao >= anosContribuicaoHomem) {
                podeAposentar = true;
            } else {
                if (idade < idadeAposentadoriaHomem) {
                    anosFaltando = idadeAposentadoriaHomem - idade;
                }
                if (anosContribuicao < anosContribuicaoHomem) {
                    anosFaltando += anosContribuicaoHomem - anosContribuicao;
                }
            }
        } else if (sexo.equals("F")) {
            // Verificar aposentadoria por idade
            if (idade >= idadeAposentadoriaMulher && anosContribuicao >= anosContribuicaoMulher) {
                podeAposentar = true;
            } else {
                if (idade < idadeAposentadoriaMulher) {
                    anosFaltando = idadeAposentadoriaMulher - idade;
                }
                if (anosContribuicao < anosContribuicaoMulher) {
                    anosFaltando += anosContribuicaoMulher - anosContribuicao;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Sexo inválido! Por favor, insira 'M' para masculino ou 'F' para feminino.");
            return;
        }

        // Exibir o resultado
        if (podeAposentar) {
            JOptionPane.showMessageDialog(null, "Você pode se aposentar!");
        } else {
            JOptionPane.showMessageDialog(null, String.format("Você não pode se aposentar. Faltam %d anos.", anosFaltando));
        }
    }
}