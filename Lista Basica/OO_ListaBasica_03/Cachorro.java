public class Cachorro
{
    // atributos
    
    private String nome;
    private int idade;
    private String raca;
        
    // construtores
    
    public Cachorro() {}
    public Cachorro(String fnome, String fraca, int fidade) {
        nome = fnome;
        idade = fidade;
        raca = fraca;
    }
    
    // metodos
    
    // acesso
    
    public void setNome(String nNome) {
        nome = nNome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setIdade(int nIdade) {
        idade = nIdade;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setRaca(String nRaca) {
        raca = nRaca;
    }
    
    public String getRaca() {
        return raca;
    }
}
