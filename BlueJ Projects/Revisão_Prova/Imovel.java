
public class Imovel
{
   //atributos 
   private int numero;
   protected int metrosQuadrados;
   private String proprietario;
   private Condominio condominio;
   
   //construtores
   public Imovel(){}
   public Imovel(int numero, int metrosQuadrados, String proprietario){
       this.numero = numero;
       this.metrosQuadrados = metrosQuadrados;
       this.proprietario = proprietario;
   }
   
   //metodos
   
   public double valorVenal(){
       return 1000 * metrosQuadrados;
   }
   
   public double valorVenda(){
       return valorVenal() - (valorVenal() * 0.15);
   }
   
   
   
   
   // acesso
   public void setNumero(int numero){
       this.numero = numero;
   }
   
   public int getNumero(){
       return this.numero;
   }
   
   public void setMetrosQuadrados(int metrosQuadrados){
       this.metrosQuadrados = metrosQuadrados;
   }
   
   public int getMetrosQuadrados(){
       return this.metrosQuadrados;
   }
   
   public void setProprietario(String proprietario){
       this.proprietario = proprietario;
   }
   
   public String getProprietario(){
       return this.proprietario;
   }
   
   public void setCondominio(Condominio condominio){
       this.condominio = condominio;
   }
   
   public Condominio getCondominio(){
       return this.condominio;
   }
}
