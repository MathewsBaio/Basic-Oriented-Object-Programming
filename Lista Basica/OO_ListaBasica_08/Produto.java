

public class Produto
{
   //atributos
   private String nome;
   private String codigoBarras;
   private double valor;
   private int qtdEstoque;
   
   //construtores
   public Produto(){}
   public Produto(String nome, String codigoBarras, double valor, int qtdEstoque){
       this.nome = nome;
       this.codigoBarras = codigoBarras;
       this.valor = valor;
       if(qtdEstoque >= 0) {
           this.qtdEstoque = qtdEstoque;    
       } else {
           this.qtdEstoque = (qtdEstoque * -1);
       }
   }

   
   //metodos
   public boolean estaDisponivel(){
       if(qtdEstoque > 0) {
           return true;
       } else {
           return false;
       }
   }
   
   public void infoProduto(){
       System.out.println("Info sobre o produto " + nome + ":");
       System.out.println("Codigo de barras: " + codigoBarras);
       System.out.println("Preço: " + valor);
   }
   
   //acesso
   public void setNome(String nome){
       this.nome = nome;
   }
   
   public String getNome(){
       return this.nome;
   }
   
   public void setCodigoBarras(String codigoBarras){
       this.codigoBarras = codigoBarras;
   }
   
   public String getCodigoBarras(){
       return this.codigoBarras;
   }
   
   public void setValor(double valor){
       this.valor = valor;
   }
   
   public double getValor(){
       return this.valor;
   }
   
   public void setQtdEstoque(int qtdEstoque) {
       if(qtdEstoque >= 0) {
           this.qtdEstoque = qtdEstoque;    
       } else {
           this.qtdEstoque = (qtdEstoque * -1);
       }
       
   }
   
   public int getQtdEstoque(){
       return this.qtdEstoque;
   }
}
