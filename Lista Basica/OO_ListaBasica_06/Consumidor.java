import java.util.ArrayList;

public class Consumidor
{
    // atributos
    private String nome;
    private ArrayList<Carro> carros; 
    // construtores
    public Consumidor() {
        
    }
    
    public Consumidor(String nome) {
        this.nome = nome;
        carros = new ArrayList<Carro>();
    }
    
    // metodos
    
    // acesso
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void addCarro(Carro carro) {
        carros.add(carro);
    }
    
    public Carro getCarro(int i) {
        return carros.get(i);
    }
}
