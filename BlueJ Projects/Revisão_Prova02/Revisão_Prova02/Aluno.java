public class Aluno
{
    //atributos
    private int matricula;
    private String nome;
    private Turma turma;
    private int votos;
    private boolean isPresidente;
    
    //construtores
    public Aluno(int matricula, Turma turma){
        this.matricula = matricula;
        this.turma = turma;
        this.votos = 0;
        this.isPresidente = false;
    }
    public Aluno(int matricula, String nome, Turma turma){
        this.matricula = matricula;
        this.nome = nome;
        this.turma = turma;
        this.votos = 0;
        this.isPresidente = false;
    }
    
    //metodos
    public void votarRepresentante(int matricula){
        turma.getAluno(matricula).receiveVoto();
    }
    
    //acesso
    // como restrição, a matricula não poderá ser alterada após instanciação de um objeto do tipo aluno
    
    public int getMatricula(){
        return this.matricula;
    }
    
    public void receiveVoto(){
        this.votos += 1;
    }
    
    public int getVotos(){
        return this.votos;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setTurma(Turma turma){
        this.turma = turma;
    }
    
    public Turma getTurma(){
        return this.turma;
    }
    
    public void setIsPresidente(boolean isPresidente){
        this.isPresidente = isPresidente;
    }
    
    public boolean getIsPresidente(){
        return this.isPresidente;
    }
}
