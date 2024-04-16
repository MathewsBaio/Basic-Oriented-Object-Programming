public class Numero
{
   // atributos
   
    double valor;
   
   // construtores
    
    public Numero() {}
    public Numero(double fvalor) {
        valor = fvalor;
    }
    
   // metodos
    
    public boolean verificaImpar(double valor) {
        boolean eImpar = false;
        
        if(valor % 2 != 0) {
            eImpar = true;
        } else {
            return false;
        }
            
        return eImpar;
    }
    
   
   // acesso
   
   public void setValor(double novoValor) {
       valor = novoValor;
   }
   
   public double getValor() {
       return valor;
   }
}
