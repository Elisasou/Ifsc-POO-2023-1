/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade14;

import java.util.Scanner;

/**
 *
 * @author elisa
 */
public class Atividade14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
               
    System.out.println("Digite o valor total da compra: ");
    float valorCompra = entrada.nextFloat(); 
    
                
    System.out.println("Digite uma das opções: "+ "\n"+
                       "1. a vista com 10% de desconto\n" +
                       "2. em duas vezes (preço da etiqueta)\n" +
                       "3. de 3 até 10 vezes com 3% de juros ao mês (somente para compras acima de R$100,00).");
                                              
        int opcao = entrada.nextInt();     
     
         
       
        switch (opcao) {
        case 1:
            float valorCompra1=valorCompra-((valorCompra*10)/100);
            System.out.println("Valor da compra a vista :...........: " + valorCompra1 + "\n");
            break;
        case 2:
            float valorCompra2=valorCompra;
            System.out.println("Valor da compra em 2x :...........: " + valorCompra2 + "\n");
            break;
        default:
            System.out.println("Digite o numero de parcelas: "+ "\n");
            int parcelas= entrada.nextInt(); 
            float valorCompra3=valorCompra+(((valorCompra*3)/100)* parcelas);
            System.out.println("Valor da compra parcelada :...........: " + valorCompra3 + "\n");
            break;
            
            
    }
       
    
}
    }
   
    

    
    

