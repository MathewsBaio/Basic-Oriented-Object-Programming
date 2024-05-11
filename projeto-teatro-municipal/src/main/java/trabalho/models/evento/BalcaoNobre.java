package trabalho.models.evento;

import trabalho.models.pag.Ingresso;

public class BalcaoNobre extends Assento {
    // Atributo

    // Construtores
    public BalcaoNobre(int num, Evento evento) {
        super(num, evento);
    }

    // Métodos

    @Override
    public double valorIngresso() {
        return this.evento.getValor() + (this.evento.getValor() * 0.15);
    }

    // Acesso
}
