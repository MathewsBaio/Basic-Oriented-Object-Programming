public class Apartamento extends Imovel
{
    //atributos
    private int nroQuarto;
    
    //construtores
    public Apartamento(){}
    public Apartamento(int numero, int metrosQuadrados, String proprietario, int nroQuarto){
        super(numero, metrosQuadrados, proprietario);
        this.nroQuarto = nroQuarto;
        
        
    }
    
    //metodos
    public double valorVenal(){
       return (1000 * metrosQuadrados) + (500 * nroQuarto);
   }
    
    
    //acesso
    public void setNroQuarto(int nroQuarto){
        this.nroQuarto = nroQuarto;
    }
    
    public int getNroQuarto(){
        return this.nroQuarto;
    }
}
