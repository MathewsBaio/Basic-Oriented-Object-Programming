package trabalho.models.evento;

import trabalho.models.pag.Ingresso;

public class PlateiaB extends Assento {
    // Atributo

    // Construtores
    public PlateiaB(int num, Evento evento) {
        super(num, evento);
    }

    // Métodos

    @Override
    public double valorIngresso() {
        return this.evento.getValor();
    }

    // Acesso
}
