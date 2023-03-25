package entity;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elisa
 */
public class Produto {
    private int id;//pode ir em rafctor encapsulate fildes pra fazer automotico
    private String nome;
    private String descricao;
    private double preco;
    private Categoria categoria;//1 do digrama na associação /se tivesse 2.. teria que criar 2 categorias(categoria 1 e categoria 2 se for muitas cria uma lista
    //private margemdelucro e preco de venda, margem de lucro metodo getset, preco d evendas só get(ate posso retornar o preco de venda.. mas obrigo passar por rotina(calcular preco de venda)
    //metod precodevenda ..metod calcular preco de venda//
    //explicitar o metodo condstrutor public Produto(){}
    //this.id=0; this.nome = null; etc fica oculto?
    
    
    public void setPreco(double preco){ //metodo implemntadno na classe produto estabelecendo regra de negocio pra evitar que o preco fica negativo la no mantest
        //ate funciona no maintste porem necessarioalta coesao e baixo acoplamento
        if(preco<0.0){
          this.preco = 0.0;//ate posso deixar (mas nao fniocna)sem o this mas nesse caso atribui opreco para ele mesmo nao para o preco do produto.. efeito nenhum
        }else{
          this.preco = preco;//refrencia quer usar para acessar um atributo da referencia do objeto, (preco do objeto produto recebe valor do preco lado main
        }
        
    }
    
    public double getPreco(){
        return this.preco;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + ", categoria=" + categoria + '}';
    }

    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
