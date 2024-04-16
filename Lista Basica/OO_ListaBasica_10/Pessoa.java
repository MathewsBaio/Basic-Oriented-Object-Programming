public class Pessoa
{
    //atributos
    private String nome;
    private String sexo;
    private String corOlhos;
    private String corCabelos;
    private double altura;
    private int idade;
    
    //construtores
    public Pessoa(){
        
    }
    
    public Pessoa(String nome, String sexo, String corOlhos, String corCabelos, double altura, int idade){
        this.nome = nome;
        this.sexo = sexo;
        this.corOlhos = corOlhos;
        this.corCabelos = corCabelos;
        this.altura = altura;
        this.idade = idade;
    }
    
    //acesso
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public String getSexo(){
        return sexo;
    }
    
    public void setCorOlhos(String corOlhos){
        this.corOlhos = corOlhos;
    }
    
    public String getCorOlhos(){
        return corOlhos;
    }
    
    public void setCorCabelos(String corCabelos){
        this.corCabelos = corCabelos;
    }
    
    public String getCorCabelos(){
        return corCabelos;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public int getIdade(){
        return idade;
    }
}
