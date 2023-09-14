package forumag06;
import javax.swing.JOptionPane;

public class ForumAG06 {
    public static void main(String[] args) {
        
        String signo;
        signo = JOptionPane.showInputDialog("Digite o seu signo e descubra qual Cavaleiro de Ouro você é");
        
        switch (signo){
            case "áres":
                JOptionPane.showMessageDialog(null, "Mu de Áries, nasceu entre 21 de março a 20 de abril");
                break;
            case "touro":
                JOptionPane.showMessageDialog(null, "Aldebaran de Touro, nasceu entre 21 de abril a 20 de maio");
                break;
            case "gêmeos":
                JOptionPane.showMessageDialog(null, "Saga de Gêmeos, nasceu entre 21 de maio a 20 de junho");
                break;
            case "câncer":
                JOptionPane.showMessageDialog(null, "Máscara da morte de Câncer, o melhor signo, nasceu entre 21 de junho a 22 de julho");
                break;
            case "leão":
                JOptionPane.showMessageDialog(null, "Aiolia de Leão, nasceu entre 23 de julho a 22 de agosto");
                break;
            case "virgem":
                JOptionPane.showMessageDialog(null, "Shaka de Virgem, nasceu entre 23 de agosto a 22 de setembro");
                break;
            case "libra":
                JOptionPane.showMessageDialog(null, "Dohko de Libra, nasceu entre 23 de setembro a 22 de outubro");
                break;
            case "escorpião":
                JOptionPane.showMessageDialog(null, "Milo de Escorpião, nasceu entre 23 de outubro a 21 de novembro");
                break;
            case "sagitário":
                JOptionPane.showMessageDialog(null, "Aiolos de Sagitário, nasceu entre 22 de novembro a 21 de dezembro");
                break;
            case "capricórnio":
                JOptionPane.showMessageDialog(null, "Shura de Capricórnio, nasceu entre 22 de dezembro a 20 de janeiro");
                break;
            case "aquário":
                JOptionPane.showMessageDialog(null, "Camus de Aquário, nasceu entre 21 de janeiro a 18 de fevereiro");
                break;
            case "peixes":
                JOptionPane.showMessageDialog(null, "Afrodite de Peixes, nasceu entre 19 de fevereiro a 20 de março");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Signo inválido");
                break;   
        }
        
        
    }
    }
