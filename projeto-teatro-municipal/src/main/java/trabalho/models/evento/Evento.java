package trabalho.models.evento;

import trabalho.models.Teatro;
import trabalho.models.pag.Ingresso;
import trabalho.models.sup.Data;

import java.util.ArrayList;

public class Evento {

    // Atributos

    private String titulo;
    private String resumo;
    private String organizador;
    private String horario;
    private double valor;
    private boolean isBroadcasted;

    private Teatro teatro;
    private Data data;

    private ArrayList<PlateiaA> assentosPA;
    private ArrayList<PlateiaB> assentosPB;
    private ArrayList<BalcaoNobre> assentosBN;
    private ArrayList<Camarote> assentosCA;

//    private PlateiaA[] plateiaA;
//    private PlateiaB[]  plateiaB;
//    private BalcaoNobre[] balcaoNobre;
//    private Camarote[] camarote;

    // Construtores

    public Evento(Teatro teatro) {
        this.teatro = teatro;
        assentosPA = new ArrayList<>();
        assentosPB = new ArrayList<>();
        assentosBN = new ArrayList<>();
        assentosCA = new ArrayList<>();
//        plateiaA = new PlateiaA[teatro.getNumAssentosPlateiaA()];
//        plateiaB = new PlateiaB[teatro.getNumAssentosPlateiaB()];
//        balcaoNobre = new BalcaoNobre[teatro.getNumAssentosBalcaoNobre()];
//        camarote = new Camarote[teatro.getNumAssentosCamarote()];
    }

    public Evento(Teatro teatro,String titulo, String resumo, String organizador,
                  String horario, double valor, boolean isBroadcasted, Data data) {
        this.teatro = teatro;
        this.titulo = titulo;
        this.resumo = resumo;
        this.organizador = organizador;
        this.horario = horario;
        this.valor = valor;
        this.isBroadcasted = isBroadcasted;
        this.data = data;
        assentosPA = new ArrayList<>();
        assentosPB = new ArrayList<>();
        assentosBN = new ArrayList<>();
        assentosCA = new ArrayList<>();

//        plateiaA = new PlateiaA[teatro.getNumAssentosPlateiaA()];
//        plateiaB = new PlateiaB[teatro.getNumAssentosPlateiaB()];
//        balcaoNobre = new BalcaoNobre[teatro.getNumAssentosBalcaoNobre()];
//        camarote = new Camarote[teatro.getNumAssentosCamarote()];
    }

    // Métodos

    public void introduzirAssentosPA() {
        for (int i = 0; i < teatro.getNumAssentosPlateiaA(); i++) {
            assentosPA.add(new PlateiaA(i + 1, this));

        }
    }

    public void introduzirAssentosPB() {
        for (int i = 0; i < teatro.getNumAssentosPlateiaB(); i++) {
            assentosPB.add(new PlateiaB(i + 1, this));

        }
    }

    public void introduzirAssentosBN() {
        for (int i = 0; i < teatro.getNumAssentosBalcaoNobre(); i++) {
            assentosBN.add(new BalcaoNobre(i + 1, this));
        }
    }

    public void introduzirAssentosCA() {
        for (int i = 0; i < teatro.getNumAssentosCamarote(); i++) {
            assentosCA.add(new Camarote(i + 1, this));

        }
    }

    public void introduzirAssentos() {
        introduzirAssentosPA();
        introduzirAssentosPB();
        introduzirAssentosBN();
        introduzirAssentosCA();
    }

    public PlateiaA procurarAssentoPA(int num) {
        PlateiaA procurado = null;

        for (int i = 0; i < assentosPA.size(); i++) {
            if (assentosPA.get(i).getNumero() == (num)) {
                procurado = assentosPA.get(i);
            }
        }

        return procurado;
    }

    public PlateiaB procurarAssentoPB(int num) {
        PlateiaB procurado = null;

        for (PlateiaB pb : assentosPB) {
            if (pb.getNumero() == (num)) {
                procurado = pb;
            }
        }

        return procurado;
    }

    public BalcaoNobre procurarAssentoBN(int num) {
        BalcaoNobre procurado = null;

        for (BalcaoNobre bn : assentosBN) {
            if (bn.getNumero() == (num)) {
                procurado = bn;
            }
        }

        return procurado;
    }

    public Camarote procurarAssentoCA(int num) {
        Camarote procurado = null;

        for (Camarote ca : assentosCA) {
            if (ca.getNumero() == (num)) {
                procurado = ca;
            }
        }

        return procurado;
    }


    private int numAssentosOcupados(ArrayList<PlateiaA> assentos) {
        int count = 0;
        for (PlateiaA as : assentos) {
            if (as.getIngresso() != null) {
                count++;
            }
        }
        return count;
    }


    public boolean isPaDisponivel(){
        if(numAssentosOcupados(assentosPA) == assentosPA.size()) {
            return false;
        } else {
            return true;
        }
    }



//    public int numAssentosTotalDisponiveis() {
//        return teatro.numTotalAssentos() - (numAssentosOcupados(plateiaA) + numAssentosOcupados(plateiaB) + numAssentosOcupados(balcaoNobre) + numAssentosOcupados(camarote));
//    }
//
//    public boolean isPlateiaADisponivel() {
//        if(numAssentosOcupados(plateiaA) < teatro.getNumAssentosPlateiaA()) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public boolean isPlateiaBDisponivel() {
//        if(numAssentosOcupados(plateiaB) < teatro.getNumAssentosPlateiaB()) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public boolean isBalcaoNobreDisponivel() {
//        if(numAssentosOcupados(balcaoNobre) < teatro.getNumAssentosBalcaoNobre()) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public boolean isCamaroteDisponivel() {
//        if (numAssentosOcupados(camarote) < teatro.getNumAssentosCamarote()) {
//            return true;
//        } else {
//            return false;
//        }
//    }

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

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isBroadcasted() {
        return isBroadcasted;
    }

    public void setBroadcasted(boolean broadcasted) {
        isBroadcasted = broadcasted;
    }

    public Teatro getTeatro() {
        return teatro;
    }

    public void setTeatro(Teatro teatro) {
        this.teatro = teatro;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

//    public void setAssentoPlateiaA(Ingresso ig, int index) {
//        plateiaA[index] = new PlateiaA(ig, this);
//    }
//
//    public PlateiaA[] getPlateiaA() {
//        return plateiaA;
//    }
//
//    public void setAssentoPlateiaB(Ingresso ig, int index) {
//        plateiaB[index] = new PlateiaB(ig, this);
//    }
//
//    public PlateiaB[] getPlateiaB() {
//        return plateiaB;
//    }
//
//    public void setAssentoBalcaoNobre(Ingresso ig, int index) {
//        balcaoNobre[index] = new BalcaoNobre(ig, this);
//    }
//
//    public BalcaoNobre[] getBalcaoNobre() {
//        return balcaoNobre;
//    }
//
//    public void setAssentoCamarote(Ingresso ig, int index) {
//        camarote[index] = new Camarote(ig, this);
//    }
//
//    public Camarote[] getCamarote() {
//        return camarote;
//    }


    public ArrayList<PlateiaA> getAssentosPA() {
        return assentosPA;
    }

    public ArrayList<PlateiaB> getAssentosPB() {
        return assentosPB;
    }

    public ArrayList<BalcaoNobre> getAssentosBN() {
        return assentosBN;
    }

    public ArrayList<Camarote> getAssentosCA() {
        return assentosCA;
    }
}
