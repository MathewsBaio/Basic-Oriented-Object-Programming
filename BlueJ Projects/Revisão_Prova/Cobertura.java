public class Cobertura extends Imovel
{
    //atributos
    private boolean duplex;
    private boolean triplex;
    
    //construtores
    public Cobertura(){}
    public Cobertura(int numero, int metrosQuadrados, String proprietario, boolean duplex, boolean triplex){
        super(numero, metrosQuadrados, proprietario);
        this.duplex = duplex;
        this.triplex = triplex;
    }
    
    //metodos
    public double valorVenal(){
        if(duplex) {
            return (1000 * metrosQuadrados) * 2;
        } else if(triplex){
            return (1000 * metrosQuadrados) * 3;
        } else{
            return (1000 * metrosQuadrados);
        }
   }
    
    
    //acesso
    public void setDuplex(boolean duplex){
        this.duplex = duplex;
    }
    
    public boolean getDuplex(){
        return this.duplex;
    }
    
    public void setTriplex(boolean triplex){
        this.triplex = triplex;
    }
    
    public boolean getTriplex(){
        return this.triplex;
    }
}
