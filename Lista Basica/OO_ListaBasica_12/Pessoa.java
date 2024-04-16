import java.util.Calendar;

public class Pessoa
{
    //atributos
    private String nome;
    private Data dataNascimento;
    private String email;
    
    //construtores
    public Pessoa(){
    dataNascimento = new Data();
    }
    public Pessoa(String nome, Data dataNascimento, String email) {
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }
    
    //Metodos
    public boolean eAdulto(){
        if(calcularIdade() > 17){
            return true;
        } else{
            return false;
        }
    }
    
    public int calcularIdade(){
        Calendar date = Calendar.getInstance();
        int idade;
        
        if(dataNascimento.getMes() < (date.get(Calendar.MONTH)+1)){
            idade = date.get(Calendar.YEAR) - dataNascimento.getAno();
        } else if(dataNascimento.getMes() == (date.get(Calendar.MONTH) + 1) && dataNascimento.getDia() <= date.get(Calendar.DAY_OF_MONTH)) {
            idade = date.get(Calendar.YEAR) - dataNascimento.getAno();
        } else{
            idade = (date.get(Calendar.YEAR) - 1) - dataNascimento.getAno();
        }
        
        return idade;
    }
    
    //acesso
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setDataNascimento(int dia, int mes, int ano){
        dataNascimento.setDia(dia);
        dataNascimento.setMes(mes);
        dataNascimento.setAno(ano);
    }
    
    public String getDataNascimento(){
        return dataNascimento.toString();
    }
    
}
