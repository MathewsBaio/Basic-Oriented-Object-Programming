import java.util.ArrayList;

public class Turma
{
    //atributos
    private String numero;
    private ArrayList<Aluno> alunos;
    
    //construtores
    public Turma(){
        alunos = new ArrayList<Aluno>();
    }
    public Turma(String numero){
        alunos = new ArrayList<Aluno>();
        this.numero = numero;
    }
    
    //metodos
    public Aluno alunoMaisVotado(){
        Aluno maisVotado = alunos.get(0);
        for(int i = 1; i < alunos.size(); i++){
            if(maisVotado.getVotos() < alunos.get(i).getVotos()) {
                maisVotado =  alunos.get(i);
            }
        }
        return maisVotado;
    }
    
    public void definirPresidente(){
        alunoMaisVotado().setIsPresidente(true);
    }
    
    //acesso
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    public String getNumero(){
        return this.numero;
    }
    
    public void addAluno(Aluno aluno){
        if(alunos.size() < 5){
            alunos.add(aluno);
        }
    }
    
    public Aluno getAluno(int matricula){
        Aluno aluno = null;
        for(int i = 0; i < alunos.size(); i++){
            if(matricula == alunos.get(i).getMatricula()) {
                aluno = alunos.get(i);
            }
        }
        return aluno;
    }
}
