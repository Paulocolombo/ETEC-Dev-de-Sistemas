
package atividadeds05;
import java.util.Scanner;

public class Atividadeds05 {

    public static void main(String[] args) {
        // Este programa escolhe a fila para os usuarios de acordo com sua idade
        Scanner leitor = new Scanner(System.in);
        int usuario;
        
        System.out.println("Digite a idade do usuário: ");
        usuario = leitor.nextInt();
        
        if(usuario <60){
            System.out.println("Fila comum");
        }else if(usuario>=60 && usuario <80){
        System.out.println("Fila prioritária");
    }else if(usuario>=80){
        System.out.println("Fila prioritária com mais de 80 anos");
    }
    }
}
