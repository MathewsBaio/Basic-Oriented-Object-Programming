package trabalho.models.stream;

import trabalho.models.sup.Data;

public class Midia {

    // Atributos
    private String titulo;
    private String resumo;
    private String organizador;
    private Data releaseDate;
    private Streaming streaming;

    // Construtores
    public Midia(String titulo, String resumo, String organizador, Streaming streaming) {
        this.titulo = titulo;
        this.resumo = resumo;
        this.organizador = organizador;
        this.streaming = streaming;
        this.releaseDate = new Data();
    }


    // Métodos

    // Acesso


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getOrganizador() {
        return organizador;
    }

    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }

    public Data getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Data releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Streaming getStreaming() {
        return streaming;
    }

    public void setStreaming(Streaming streaming) {
        this.streaming = streaming;
    }
}
