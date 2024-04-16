

public class Emprestimo
{
    //atributos
    private double valor;
    private int meses;
    private double taxa;
    
    //construtores
    public Emprestimo(){}
    public Emprestimo(double valor, int meses, double taxa){
        this.valor = valor;
        this.meses = meses;
        this.taxa = taxa;
    }
    
    //métodos
    public double valorMensalidade(){
        double mensalidade = valor/meses;
        return mensalidade += mensalidade * taxa;
    }
    
    public double valorTotal(){
        return valorMensalidade() * meses;
    }
    
    public double totalJuros(){
        return valorTotal() - valor;
    }
    
    //acesso (considerei para este caso impossibilitar a alteração dos atributos após a criação de um emprestimo)
    public double getValor(){
        return valor;
    }
    
    public int getMeses(){
        return meses;
    }
    
    public double getTaxa(){
        return taxa;
    }
}
