package trabalho.models;

import trabalho.models.evento.Evento;
import trabalho.models.stream.Streaming;
import trabalho.models.sup.Endereco;

import java.util.ArrayList;

public class Teatro {

    // Atributos

    private String nome;
    private String instituicaoADM;
    private String diretor;
    private Endereco endereco;
    private String telefone;
    private int numAssentosPlateiaA;
    private int numAssentosPlateiaB;
    private int numAssentosBalcaoNobre;
    private int numAssentosCamarote;

    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Evento> eventos;
    private Streaming plataformaStream;

    // Construtores

    public Teatro() {
        funcionarios = new ArrayList<>();
        eventos = new ArrayList<>();
    }
    public Teatro(String nome, String instituicaoADM, String diretor, Endereco endereco,
                  String telefone, int numAssentosPlateiaA, int numAssentosPlateiaB,
                  int numAssentosBalcaoNobre, int numAssentosCamarote, Streaming plataformaStream) {
        this.nome = nome;
        this.instituicaoADM = instituicaoADM;
        this.diretor = diretor;
        this.endereco = endereco;
        this.telefone = telefone;
        this.numAssentosPlateiaA = numAssentosPlateiaA;
        this.numAssentosPlateiaB = numAssentosPlateiaB;
        this.numAssentosBalcaoNobre = numAssentosBalcaoNobre;
        this.numAssentosCamarote = numAssentosCamarote;
        this.plataformaStream = plataformaStream;
        funcionarios = new ArrayList<>();
        eventos = new ArrayList<>();
    }

    // Metodos
    public int numTotalAssentos(){
        return numAssentosPlateiaA + numAssentosPlateiaB + numAssentosBalcaoNobre + numAssentosCamarote;
    }

    public Evento procurarEvento(String tit) {
        Evento evento = null;

        for (Evento ev : eventos) {
            if (ev.getTitulo().toUpperCase().equals(tit.toUpperCase()) ) {
                evento = ev;
            }
        }

        return evento;
    }

    // Acesso

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInstituicaoADM() {
        return instituicaoADM;
    }

    public void setInstituicaoADM(String instituicaoADM) {
        this.instituicaoADM = instituicaoADM;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getNumAssentosPlateiaA() {
        return numAssentosPlateiaA;
    }

    public void setNumAssentosPlateiaA(int numAssentosPlateiaA) {
        this.numAssentosPlateiaA = numAssentosPlateiaA;
    }

    public int getNumAssentosPlateiaB() {
        return numAssentosPlateiaB;
    }

    public void setNumAssentosPlateiaB(int numAssentosPlateiaB) {
        this.numAssentosPlateiaB = numAssentosPlateiaB;
    }

    public int getNumAssentosBalcaoNobre() {
        return numAssentosBalcaoNobre;
    }

    public void setNumAssentosBalcaoNobre(int numAssentosBalcaoNobre) {
        this.numAssentosBalcaoNobre = numAssentosBalcaoNobre;
    }

    public int getNumAssentosCamarote() {
        return numAssentosCamarote;
    }

    public void setNumAssentosCamarote(int numAssentosCamarote) {
        this.numAssentosCamarote = numAssentosCamarote;
    }

    public Streaming getPlataformaStream() {
        return plataformaStream;
    }

    public void setPlataformaStream(Streaming plataformaStream) {
        this.plataformaStream = plataformaStream;
    }

    public void addFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void addEvento(Evento evento) {
        eventos.add(evento);
    }

    public ArrayList<Evento> getEventos() {
        return eventos;
    }


}
