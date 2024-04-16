public class Retangulo
{
    // atributos
    
    private double comprimento;
    private double largura;
    
    // construtores
    
    public Retangulo(){}
    public Retangulo(double fcomprimento, double flargura) {
        comprimento = fcomprimento;
        largura = flargura;
    }
   
    // metodos
    
    public double calcularArea(double comprimento, double largura) {
        return comprimento * largura;
    }
    
    public double calcularPerimetro(double comprimento, double largura) {
        return 2 * (comprimento + largura);
    }
    
    // acesso
    
    public void setComprimento(double nComprimento) {
        comprimento = nComprimento;
    }
    
    public double getComprimento() {
        return comprimento;
    }
    
    public void setLargura(double nLargura) {
        largura = nLargura;
    }
    
    public double getLargura() {
        return largura;
    }
}
