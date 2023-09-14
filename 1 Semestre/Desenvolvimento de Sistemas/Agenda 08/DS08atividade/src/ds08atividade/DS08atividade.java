package ds08atividade;

import javax.swing.JOptionPane;

public class DS08atividade {
    public static void main(String[] args) {
    
    int idade,espectador = 1;
    String opniao;
    double media = 0, contop = 0, porcpessimo=0;
    
        do{
        idade = Integer.parseInt(JOptionPane.showInputDialog("Espectador número " +espectador+ ", digite sua idade: "));
        opniao = JOptionPane.showInputDialog("Espectador número "+espectador+", digite sua opnião(ótimo, bom, regular, ruim ou péssimo): ");
                       
            while(!opniao.equals("ótimo") && !opniao.equals("bom") && !opniao.equals("regular") && !opniao.equals("ruim") && !opniao.equals("péssimo")){
            JOptionPane.showMessageDialog(null, "Opnião digitada incorretamente");
            opniao = JOptionPane.showInputDialog("Digite novamente por favor");
            };
       
        espectador++;
        media = media+idade;
        
            if(opniao.equals("ótimo")){
            contop = contop + 1;
            }
            if(opniao.equals("péssimo")){
            porcpessimo = porcpessimo + 1;
            }
        }while(espectador <=40);
            JOptionPane.showMessageDialog(null, "A quantidade de resposta ótimo foi: "+contop);
            JOptionPane.showMessageDialog(null,"A média de idade dos espctadore é: "+(media/40)+ " anos");
            JOptionPane.showMessageDialog(null,"A porcentagem de respostas péssimo é: "+ (porcpessimo * 100/ 40) +" %");
    }
}
