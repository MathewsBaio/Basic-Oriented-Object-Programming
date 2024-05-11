package trabalho.models;

import trabalho.models.evento.Evento;
import trabalho.models.pag.Ingresso;
import trabalho.models.stream.Midia;
import trabalho.models.sup.Endereco;
import trabalho.models.sup.Data;

public class Funcionario {

    // Atributos
    private String nome;
    private String cpf;
    private Data dataNasc;
    private Endereco endereco;
    private Teatro teatro;

    // construtores
    public Funcionario() {
    }
    public Funcionario(String nome, String cpf, Data dataNasc, Endereco endereco, Teatro teatro) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
        this.teatro = teatro;
    }


    // Métodos

    public void cadastrarEvento(Evento evento) {
        teatro.addEvento(evento);
    }

    public void criarMidia(Evento evento) {
        Midia md = new Midia(evento.getTitulo(), evento.getResumo(), evento.getOrganizador(), teatro.getPlataformaStream());

        teatro.getPlataformaStream().addMidia(md);
    }



    // Acesso

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Data getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Data dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Teatro getTeatro() {
        return teatro;
    }

    public void setTeatro(Teatro teatro) {
        this.teatro = teatro;
    }
}
