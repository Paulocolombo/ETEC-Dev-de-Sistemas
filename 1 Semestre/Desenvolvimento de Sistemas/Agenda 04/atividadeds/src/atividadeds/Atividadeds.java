/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadeds;
import java.util.Scanner;
/**
 *
 * @author CRONOS
 */
public class Atividadeds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int covidBrasil;
        int covidCentroOeste;
        int covidSul;
        int covidNorte;
        int covidNordeste;
        int covidSudeste;
        float porcentagemCentroOeste;
        float porcentagemSul;
        float porcentagemNorte;
        float porcentagemNordeste;
        float porcentagemSudeste;
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Este programa aprenseta o número total de casos de covid no Brasil, casos de covid separado por regiões e ao final a porcentagem que cada região representa em relação ao total de casos no Brasil");
        System.out.println("Digite o Número de casos de covid total no Brasil");
        covidBrasil = leitor.nextInt();
        System.out.println("Digite o Número de casos de covid total no Centro-Oeste");
        covidCentroOeste = leitor.nextInt();
        System.out.println("Digite o Número de casos de covid total no Sul");
        covidSul = leitor.nextInt();
        System.out.println("Digite o Número de casos de covid total no Norte");
        covidNorte = leitor.nextInt();
        System.out.println("Digite o Número de casos de covid total no Nordeste");
        covidNordeste = leitor.nextInt();
        System.out.println("Digite o Número de casos de covid total no Sudeste");
        covidSudeste = leitor.nextInt();
        
        porcentagemCentroOeste = (covidCentroOeste*100) / covidBrasil;
        porcentagemSul = (covidSul*100) / covidBrasil;
        porcentagemNorte = (covidNorte*100) / covidBrasil;
        porcentagemNordeste = (covidNordeste*100) / covidBrasil;
        porcentagemSudeste = (covidSudeste*100) / covidBrasil;
        
        System.out.println("Número de casos no Brasil: " + covidBrasil);
        System.out.println("Número de casos no Centro-Oeste: " + covidCentroOeste);
        System.out.println("Número de casos no Sul: " + covidSul);
        System.out.println("Número de casos no Norte: " + covidNorte);
        System.out.println("Número de casos no Nordeste: " + covidNordeste);
        System.out.println("Número de casos no Sudeste: " + covidSudeste);
        
        System.out.println("Os casos de covid no Centro-Oeste representam: " + porcentagemCentroOeste + "%");
        System.out.println("Os casos de covid no Sul representam: " + porcentagemSul + "%");
        System.out.println("Os casos de covid no Norte representam: " + porcentagemNorte + "%");
        System.out.println("Os casos de covid no Nordeste: " + porcentagemNordeste + "%");
        System.out.println("Os casos de covid no Sudeste representam: " + porcentagemSudeste + "%");
    }
    }
