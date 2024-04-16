public class Casa extends Imovel implements CondominioFechado
{
    //atributos
    private int metragemTerreno;
    
    //construtores
    public Casa(){}
    public Casa(int numero, int metrosQuadrados, String proprietario, int metragemTerreno){
        super(numero, metrosQuadrados, proprietario);
        this.metragemTerreno = metragemTerreno;
        
        
    }
    
    //metodos
    public double valorTerreno(){
        return 350 * metragemTerreno;
    }
    
    public double valorVenal(){
       return 1500 * metrosQuadrados;
   }
   
   public double valorVenda(){
       return (valorVenal() - (valorVenal() * 0.15)) + valorTerreno();
   }
    
    
    //acesso
    public void setMetragemTerreno(int metragemTerreno){
        this.metragemTerreno = metragemTerreno;
    }
    
    public int getMetragemTerreno(){
        return this.metragemTerreno;
    }

}
