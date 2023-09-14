package atividadeds07;
import java.util.Scanner;
        
public class AtividadeDS07 {
    public static void main(String[] args) {
            
    String nomep;
    double valor, valorDesconto;
    int i;
            
    System.out.println("Este programa mostra o nome e o valor do produto com 50% de desconto");
        
        for (i=1;i<=2;i++){
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite nome do produto "+ i+": ");
        nomep = ler.nextLine();
        
        System.out.print("Digite o valor do produto " +i+ ": ");
        valor = ler.nextDouble();
        
        valorDesconto = valor/2;
        
        System.out.println("O produto "+ nomep +" com 50% de desconto esta R$"+valorDesconto);
        }
    }
}

