/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primeiroprojeto;

import java.text.DecimalFormat;
import java.util.Scanner;



/**
 *
 * @author Aluno
 */
public class PrimeiroProjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat df = new DecimalFormat ("0.00");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Primeiro projeto na IDE Netbeans");
        System.out.print("informe seu nome: ");
        String nome = entrada.nextLine();
        System.out.print("informe sua idade: ");
        int idade = entrada.nextInt();  
        System.out.print("informe seu peso: ");
        float peso = entrada.nextFloat();
        System.out.print("informe sua altura: ");
        float altura = entrada.nextFloat();
        System.out.println();
        
        float imc = calcularImc(peso,altura);// (float) (peso / Math.pow(altura,2.0)); // float imc =  peso/(altura * altura);
        String classificacao = classificarImc(imc);   
    
        System.out.println("Nome...........: " + nome + "\n" +
                           "Idade..........: " + idade + "\n" +
                           "Peso...........: " + peso + "\n" +
                           "Altura.........: " + altura + "\n" +
                           "Seu Imc eh.....: " + df.format(imc) + "\n" +
                           "classificacao..: " + classificacao );
       
              
        
    }
    public static String classificarImc(float imc) {
         if (imc < 18.5){
            return ("Adulto com baixo peso.");
        
        }else if (imc < 25){
            return("Adulto com peso adequado ");
        
        }else if (imc < 30 ){
             return("Adulto com sobrepeso ");
        
        }else
             return("Adulto com obesidade.");
    }
    
    
    public static float calcularImc(float peso, float altura){
        float imc = (float) (peso / Math.pow(altura,2.0));
        return imc;
    }
    
}
