import javax.swing.*;

public class ControleFonteRecurso {

    public static void main(String[] args) {

        String recurso;

        recurso = JOptionPane.showInputDialog("Digite os primeiros 4 dígitos do recuso: ");

        switch(recurso) {
            case "0100":
                String mensagem = "A Fonte de Destinação para o recurso "+ recurso +"\n é 11110000";
                JOptionPane.showMessageDialog(null, mensagem);
                System.out.println("10010000");
                break;
            case "0101":
                System.out.println("11110000");
                break;
            case "0102":
                System.out.println("10010000");
                break;
            case "0103":
                System.out.println("11110000");
                break;
            case "0104":
                System.out.println("10010000");
                break;
            case "0105":
                System.out.println("11110000");
                break;
            default:
                System.out.println("Valor incorreto, digite novamente");
                JOptionPane.showMessageDialog(null,"Valor incorreto, digite novamente");
        }
    }
}
