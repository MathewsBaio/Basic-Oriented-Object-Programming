
public class Empregado
{
    //atributos
   private String nome;
   private int idade;
   private String funcao;
   private double anosTrab;
   
   //construtores
   public Empregado(){}
   public Empregado(String nome,int idade,String funcao,double anosTrab) {
       this.nome = nome;
       this.idade = idade;
       this.funcao = funcao;
       this.anosTrab = anosTrab;
   }
   
   //metodos
   public boolean podeAposentar() {
       if(idade >= 65) {
           return true;
       } else if(anosTrab >= 30) {
           return true;
       } else if(idade >= 60 && anosTrab >= 25) {
           return true;
       } else {
           return false;
       }
   }
   
   //acesso
   public void setNome(String nome) {
       this.nome = nome;
   }
   
   public String getNome(){
       return this.nome;
   }
   
   public void setIdade(int idade) {
       this.idade = idade;
   }
   
   public int getIdade() {
       return this.idade;
   }
   
   public void setFuncao(String funcao) {
       this.funcao = funcao;
   }
   
   public String getFuncao() {
       return this.funcao;
   }
   
   public void setAnosTrab(double anosTrab) {
       this.anosTrab = anosTrab;
   }
   
   public double getAnosTrab() {
       return this.anosTrab;
   }
}
