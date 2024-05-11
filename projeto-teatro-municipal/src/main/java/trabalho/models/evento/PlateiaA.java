package trabalho.models.evento;

import trabalho.models.pag.Ingresso;

public class PlateiaA extends Assento{
    // Atributo

    // Construtores
    public PlateiaA(int num, Evento evento) {
        super(num, evento);
    }

    // Métodos

    @Override
    public double valorIngresso() {
        return this.evento.getValor();
    }



    // Acesso
}
