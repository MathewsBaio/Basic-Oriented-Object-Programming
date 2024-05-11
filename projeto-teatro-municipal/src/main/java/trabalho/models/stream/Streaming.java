package trabalho.models.stream;

import trabalho.models.Cliente;

import java.util.ArrayList;

public class Streaming {

    // Atributos
    private String nome;
    private ArrayList<Midia> catalogo;
    private ArrayList<Cliente> assinantes;

    // Construtores
    public Streaming() {
        catalogo = new ArrayList<>();
        assinantes = new ArrayList<>();
    }

    public Streaming(String nome) {
        this.nome = nome;
        catalogo = new ArrayList<>();
        assinantes = new ArrayList<>();
    }

    // Métodos

    public Midia procuraMidia(String tit) {

        for (Midia md : catalogo) {
            if (md.getTitulo() == tit) {
                return md;
            }
        }

        return null;
    }





    // acesso


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addMidia(Midia midia) {
        catalogo.add(midia);
    }

    public ArrayList<Midia> getCatalogo() {
        return catalogo;
    }

    public void addCliente(Cliente cliente) {
        assinantes.add(cliente);
    }

    public ArrayList<Cliente> getAssinantes() {
        return assinantes;
    }
}
