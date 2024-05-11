package trabalho.models;

import trabalho.models.pag.Ingresso;
import trabalho.models.sup.Data;
import trabalho.models.sup.Endereco;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private Endereco endereco;
    private Data dataNasc;
    private String celular;
    private String cpf;
    private ArrayList<Ingresso> ingressos;


    public Cliente() {
        this.ingressos = new ArrayList<>();
    }

    public Cliente(String nome, Endereco endereco, Data dataNasc, String celular, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.dataNasc = dataNasc;
        this.celular = celular;
        this.cpf = cpf;
        this.ingressos = new ArrayList<>();
    }

    public Cliente(String nome) {
        this.nome = nome;
        this.ingressos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Data dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ArrayList<Ingresso> getIngressos() {
        return ingressos;
    }

    public void addIngresso(Ingresso ingresso) {
        this.ingressos.add(ingresso);
    }
}
