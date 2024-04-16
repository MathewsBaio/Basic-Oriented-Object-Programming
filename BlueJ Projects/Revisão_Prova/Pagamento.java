

public class Pagamento
{
    //atributos
    private int mesAno;
    private double valorPago;
    private Condominio condominio;
    private Imovel imovel;
    
    //construtores
    public Pagamento(){}
    public Pagamento(int mesAno, Imovel imovel){
        this.mesAno = mesAno;
        this.imovel = imovel;
    }
    
    
    //acesso
    public void setMesAno(int mesAno){
        this.mesAno = mesAno;
    }
    
    public int getMesAno(){
        return this.mesAno;
    }
    
    public void setValorPago(double valorPago){
        this.valorPago = valorPago;
    }
    
    public double getValorPago(){
        return this.valorPago;
    }
    
    public void setImovel(Imovel imovel){
       this.imovel = imovel;
   }
   
   public Imovel getImovel(){
       return this.imovel;
   }
}
