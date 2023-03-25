/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade11;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Atividade11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
               
        System.out.println("Preco do KWh consumido: ");
        float precoKwh = entrada.nextFloat(); 
        int cont = 0;
        
        while(cont >0){            
        
        System.out.println("Numero do consumidor: ");
        int consumidor = entrada.nextInt(); 
        
        System.out.println("Quantidade de KWh consumidos durante o mes: ");
        int qtdadeKwh = entrada.nextInt(); 
        
        System.out.println("Codigo do tipo de consumidor (residencial, comercial, industrial).");
        String codigo = entrada.nextLine(); 
                     
        float totalFatura = precoKwh * qtdadeKwh;   
        System.out.println("consumidor:...........: " + consumidor+ "\n"+
                           "total a pagar.........: " + totalFatura + "\n");
        
   
         cont++;   
        } 
        
        
        
        
        
    }
    
}
