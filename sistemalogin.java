import javax.swing.JOptionPane;

public class SistemaLogin {

    public static void main(String[] args) {
        // Credenciais corretas
        String usuarioCorreto = "java8";
        String senhaCorreta = "java8";

        // Contador de tentativas
        int tentativas = 3;

        // Loop para permitir até 3 tentativas
        while (tentativas > 0) {
            // Solicitar login e senha
            String usuario = JOptionPane.showInputDialog("Digite seu login:");
            String senha = JOptionPane.showInputDialog("Digite sua senha:");

            // Verificar credenciais
            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                JOptionPane.showMessageDialog(null, "Acesso concedido!");
                return; // Sai do método main se o login for bem-sucedido
            } else {
                tentativas--; // Reduz o número de tentativas restantes
                if (tentativas > 0) {
                    JOptionPane.showMessageDialog(null, "Login ou senha incorretos. Você ainda tem " + tentativas + " tentativa(s).");
                } else {
                    JOptionPane.showMessageDialog(null, "Número máximo de tentativas atingido. Acesso negado.");
                }
            }
        }
    }
}