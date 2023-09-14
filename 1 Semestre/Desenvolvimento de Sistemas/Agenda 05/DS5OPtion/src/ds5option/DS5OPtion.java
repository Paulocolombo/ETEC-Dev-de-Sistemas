package ds5option;
import javax.swing.JOptionPane;

public class DS5OPtion {
    public static void main(String[] args) {
        
       //Declaração de variáveis.
        int usuario;
        //O programa pede a idade do usuário.
        usuario = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do usuário"));
        
        //Aqui o programa vai decidir em qual fila o usuário deve estar, de acordo com sua idade.
        if(usuario>=60){
            if(usuario>=80){
                JOptionPane.showMessageDialog(null,"Fila prioritária 80+");
    }else{
                JOptionPane.showMessageDialog(null,"Fila prioritária");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Fila comum");
        }
}
}