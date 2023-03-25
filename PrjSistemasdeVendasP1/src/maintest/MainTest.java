/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maintest;

import entity.Categoria;
import entity.Produto;

/**
 *
 * @author elisa
 */
public class MainTest {
    public static void main(String[] args) {
        //new Produto();remeteu a classe, metodo que constroi o objeto incialinado todas variaveis da classe vai inicr com null ou zero
        //
        Produto p1 = new Produto();//jA DEFINIR O VALOR DO PARAMETRO.. TIPO 1 PRA ID..PRA ISSO CONTRUTOR DE CLASSE NA CLASSE PRODUTO
        Produto p2 = new Produto();
        p1.setId(10); 
        //p.nome = " Tenis";
        //p.descricao = " Tenis Run";
        //p.preco = -200.00; //em vez disso chama o metodo abaixo que vai la na regra de negocio na classe procuto
        p1.setPreco(200);//só da pra usar o metodo definnir preco pois  la em produto estao como private
        //if(p.preco<0.0){
         //   p.preco = 0.0;
       // }
        Categoria c1= new Categoria();
        c1.setId(1);
        c1.setDescricao("calçado");
        p1.setCategoria(c1);
        p2.setCategoria(c1);
        Categoria c2 = new Categoria();
        c2.setId(2);
        c2.setDescricao("eletronico");
        //p3.setCategoria(c2);
        
        //double precoAux = p1.getPreco();
        System.out.println("Produto 1: " + p1);
         System.out.println("Produto 2: " + p2);
         
        //System.out.println("Preco do produto: " + p.getPreco());//todo get nao tem paramentro e volta um valor e o set tem valor sem parametro
    
    
    }
    
}
