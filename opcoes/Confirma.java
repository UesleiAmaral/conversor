package opcoes;
import javax.swing.JOptionPane;

public class Confirma {
    public int confirmar() {
        Object[] options = { "Voltar Inicio", "Finalizar", "Cancelar" };
        int valorEscolhidoDoUsuario = JOptionPane.showOptionDialog(
                null,
                "Deseja Continuar",
                "Opções",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.WARNING_MESSAGE, null, options, options[0]);

        return valorEscolhidoDoUsuario;

    }
}
