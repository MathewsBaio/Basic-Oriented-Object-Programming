public class PlanoCartesiano
{
    // atributos
    private double pontoUm;
    private double pontoDois;
    
    
    // construtores
    public PlanoCartesiano(){}
    public PlanoCartesiano(double fpontoUm, double fpontoDois) {
        pontoUm = fpontoUm;
        pontoDois = fpontoDois;
    }
    
    // metodos
    
    public double distanciaPontos(double pontoUm, double pontoDois) {
        double distancia;
        
        if(pontoUm > pontoDois) {
            distancia = pontoUm - pontoDois;
        } else {
            distancia = pontoDois - pontoUm;
        }
        
        return distancia;
    }
    
    
    // acesso
    
    public void setPontoUm(double novoPonto) {
        pontoUm = novoPonto;
    }
    
    public double getPontoUm(){
        return pontoUm;
    }
    
    public void setPontoDois(double novoPonto) {
        pontoDois = novoPonto;
    }
    
    public double getPontoDois(){
        return pontoDois;
    }
    
}
