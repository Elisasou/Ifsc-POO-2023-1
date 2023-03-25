/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade2;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Atividade2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o raio do circulo: ");
        int raio = entrada.nextInt(); 
        
        
        float diametro = raio*2;
        float circunferencia = (float)(2*Math.PI) * raio;
        float area = (float) Math.PI * (raio*raio);
        
        System.out.println("Diametro................: " + diametro + "\n" +
                           "Circunferencia..........: " + circunferencia + "\n" +
                           "Area....................: " + area + "\n");
      
    }
    
}
