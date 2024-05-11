package trabalho.models.pag;

import trabalho.models.Cliente;
import trabalho.models.evento.Assento;
import trabalho.models.evento.Evento;

public class Ingresso {

    //Atributos
    private double valorPago;
    private Evento evento;
    private Cliente comprador;
    private Assento assento;

    // Construtores
    public Ingresso() {
    }

    public Ingresso(double valorPago, Evento evento, Cliente comprador, Assento assento) {
        this.valorPago = valorPago;
        this.evento = evento;
        this.comprador = comprador;
        this.assento = assento;
    }

    // Métodos

    //Acesso

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Cliente getComprador() {
        return comprador;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }

    public Assento getAssento() {
        return assento;
    }

    public void setAssento(Assento assento) {
        this.assento = assento;
    }
}
