package ativadeds10;

import javax.swing.JOptionPane;
        
public class AtivadeDS10 {
    public static void main(String[] args) {
    
    int num[][] = new int [10][10];
    int l, c;
    int soma =0;
    String exibir = "";
    
    JOptionPane.showMessageDialog(null, "Inserindo os dados na Matriz");
    
        for (l=0;l<10;l++){
            for(c=0;c<10;c++){
            num[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Entre com os números da matriz"+"\nlinha " +l+ "\ncoluna "+c));
            }
        }
        
    JOptionPane.showMessageDialog (null, "Mostrando os dados na Matriz");
        
        for (l = 0; l < 10; l++) {
                for (c = 0; c < 10; c++) {
                exibir += num[l][c] + "|";
                }
                exibir += "\n";
            }
    JOptionPane.showMessageDialog(null, exibir);
        
        for (l=0;l<10;l++){
            for(c=0;c<10;c++){
            soma = soma + num[l][c];    
            }    
        }
        
    JOptionPane.showMessageDialog(null, "A soma de todos os números digitados é:\n " + soma);
        
    }
}
