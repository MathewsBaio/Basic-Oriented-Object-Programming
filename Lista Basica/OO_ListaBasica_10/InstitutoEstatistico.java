import java.util.ArrayList;

public class InstitutoEstatistico
{
    //atributos
    private String nome;
    private String sigla;
    private ArrayList<Pessoa> habitantes;
    
    //construtores
    public InstitutoEstatistico(){
        habitantes = new ArrayList<>();
    }
    public InstitutoEstatistico(String sigla){
        this.sigla = sigla;
        habitantes = new ArrayList<>();
    }
    public InstitutoEstatistico(String nome, String sigla){
        this.nome = nome;
        this.sigla = sigla;
        habitantes = new ArrayList<>();
    }
    
    //metodos
    public Pessoa maiorAltura(){
        Pessoa maior = habitantes.get(0);
        
        for(int i = 1; i < habitantes.size(); i++) {
            if(habitantes.get(i).getAltura() > maior.getAltura()) {
                maior = habitantes.get(i);
            }
        }
        
        return maior;
    }
    
    public Pessoa menorAltura(){
        Pessoa menor = habitantes.get(0);
        
        for(int i = 1; i < habitantes.size(); i++) {
            if(habitantes.get(i).getAltura() < menor.getAltura()) {
                menor = habitantes.get(i);
            }
        }
        
        return menor;
    }
    
    public double mediaAlturaMulheres(){
        double media, soma = 0;
        
        for(int i = 0; i < habitantes.size(); i++) {
            if(habitantes.get(i).getSexo().toUpperCase().equals("FEMININO")) {
                soma += habitantes.get(i).getAltura();
            }
        }
        
        media = soma / numeroMulheres();
        return media;
    }
    
    public int numeroHomens(){
        int cont = 0;
        for(int i = 0; i < habitantes.size(); i++){
            if(habitantes.get(i).getSexo().toUpperCase().equals("MASCULINO")) {
                cont++;
            }
        }
        
        return cont;
    }
    
    public int numeroMulheres(){
        int cont = 0;
        for(int i = 0; i < habitantes.size(); i++){
            if(habitantes.get(i).getSexo().toUpperCase().equals("FEMININO")) {
                cont++;
            }
        }
        
        return cont;
    }
    
    public double porcentagemHomens(){
        if(numeroHomens() == 0){
            return 0;
        }
        return (habitantes.size() * 100) / numeroHomens();
    }
    
    public double porcentagemMulheres(){
        if(numeroMulheres() == 0){
            return 0;
        }
        return (habitantes.size() * 100) / numeroMulheres();
    }
    
    public int mulheresAdultasLoiras(){
        int cont = 0;
        for(int i = 0; i < habitantes.size(); i++){
            if(habitantes.get(i).getSexo().toUpperCase().equals("FEMININO")) {
                if(habitantes.get(i).getIdade() >= 18 && habitantes.get(i).getIdade() <= 35 &&
                habitantes.get(i).getCorOlhos().toUpperCase().equals("VERDES") && 
                habitantes.get(i).getCorCabelos().toUpperCase().equals("LOIROS")){
                    cont++;
                }
            }
        }
        return cont;
    }
    
    public double porcentagemMulheresAdultasLoiras(){
        if(mulheresAdultasLoiras() == 0){
            return 0;
        }
        return (numeroMulheres() * 100) / mulheresAdultasLoiras();
    }
    
    
    
    //acesso
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setSigla(String sigla){
        this.sigla = sigla;
    }
    
    public String getSigla(){
        return sigla;
    }
    
    public void addHabitante(Pessoa habitante){
        habitantes.add(habitante);
    }
    
    public Pessoa getHabitante(int i){
        return habitantes.get(i);
    }
}
