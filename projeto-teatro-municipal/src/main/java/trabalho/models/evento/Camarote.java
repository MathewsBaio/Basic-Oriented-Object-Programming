package trabalho.models.evento;

import trabalho.models.pag.Ingresso;

public class Camarote extends Assento{
    // Atributo

    // Construtores
    public Camarote(int num, Evento evento) {
        super(num, evento);
    }

    // Métodos

    @Override
    public double valorIngresso() {
        return this.evento.getValor() + (this.evento.getValor() * 0.25);
    }

    // Acesso
}
