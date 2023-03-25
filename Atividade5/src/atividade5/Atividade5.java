/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade5;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Atividade5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o codigo do produto: ");
        int codigo = entrada.nextInt(); 
        
        switch (codigo){
            case 1 -> System.out.println("Alimento nao-perecivel");
            
            case 2, 3, 4 -> System.out.println("Alimento perecivel");
            
            case 5, 6 -> System.out.println("Vestuário");
            
            case 7 -> System.out.println("Higiene Pessoal");
            
            case 8,9,10,11,12,13,14,15 -> System.out.println("Limpeza e Utensílios domésticos");
                                
            default -> System.out.println("\t\t\t\t\t Opcao inexistente! Tente novamente.\n\n");
        }
            
                    
    }
    
}
