/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade15;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Atividade15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua classe para receber o numero da sua poltrona: "+"\n"+
                           "1- Primeira Classe"+"\n"+
                           "2- Classe Executiva");
        int classe = entrada.nextInt(); 
        
        if (classe==1){
            
            int n;
            Random r = new Random();
            n = r.nextInt( 5 ) + 1;
            System.out.println( "Sua poltrona eh a " + n + " da Primeira Classe" );
        }else if(classe==2){
            
            int m;
            Random s = new Random();
            m = s.nextInt( 5 ) + 7;
            System.out.println( "Sua poltrona eh a " + m + " da Classe Executiva" );
            }
        else {
            System.out.println( "Essa opcao nao existe, tente novamente" );
            }
        
        
       
        
                
                   }
        
    
}
