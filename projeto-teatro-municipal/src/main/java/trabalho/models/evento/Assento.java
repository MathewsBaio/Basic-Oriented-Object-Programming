package trabalho.models.evento;

import trabalho.models.pag.Ingresso;

public abstract class Assento {

    // Atributos
    protected int numero;
    protected Evento evento;
    protected Ingresso ingresso;

    // Construtores
    public Assento(int numero, Evento evento) {
        this.numero = numero;
        this.evento = evento;
    }

    // Métodos

    public abstract double valorIngresso();




    // Acesso

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Ingresso getIngresso() {
        return ingresso;
    }

    public void setIngresso(Ingresso ingresso) {
        this.ingresso = ingresso;
    }
}
