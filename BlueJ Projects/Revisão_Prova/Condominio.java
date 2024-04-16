import java.util.ArrayList;

public class Condominio
{
    //atributos
    private String nome;
    private String endereco;
    private ArrayList<Despesa> despesas;
    private ArrayList<Imovel> imoveis;
    private ArrayList<Pagamento> pagamentos;
    
    //construtores
    public Condominio(){
        despesas = new ArrayList<Despesa>();
        imoveis = new ArrayList<Imovel>();
        pagamentos = new ArrayList<Pagamento>();
        
        Despesa despesaInicial = new Despesa(012024, "Primeira despesa do ano",15000, false);
        addDespesa(despesaInicial);
    }
    
    public Condominio(String nome, String endereco){
        despesas = new ArrayList<Despesa>();
        imoveis = new ArrayList<Imovel>();
        pagamentos = new ArrayList<Pagamento>();
        
        Despesa despesaInicial = new Despesa(012024, "Primeira despesa do ano",15000, false);
        addDespesa(despesaInicial);
        
        this.nome = nome;
        this.endereco = endereco;
    }
    //metodos
    public double valorCondominio(int mesAno){
        double valor = getDespesa(mesAno).getValor();
        return valor;
    }
    
    public void relatorio(){
        System.out.println("Mês: 01 - 2016");
        System.out.println("30 apartamentos (18 pagos – 12 não pagos)");
        System.out.println("Valor arrecadados: R$ 8.000,00 valor a ser pago R$ 8.200,00");
    }
    
    public void pagarCondominio(Imovel imovel, int mesAno){
        Pagamento novoPag = new Pagamento(mesAno, imovel);
        addPagamento(novoPag);
    }
    
    //acesso
    public void setNome(String nome){
       this.nome = nome;
   }
   
   public String getNome(){
       return this.nome;
   }
   
   public void setEndereco(String endereco){
       this.endereco = endereco;
   }
   
   public String getEndereco(){
       return this.endereco;
   }
   
   public void addDespesa(Despesa despesa){
       despesas.add(despesa);
   }
   
   public Despesa getDespesa(int mesAno){
       for(int i = 0; i < despesas.size(); i++){
           if(despesas.get(i).getMesAno() == mesAno){
               return despesas.get(i);        
           }
       }
       return null;
   }
   
   public void addImovel(Imovel imovel){
       imoveis.add(imovel);
   }
   
   public Imovel getImovel(int numero){
       for(int i = 0; i < imoveis.size(); i++){
           if(imoveis.get(i).getNumero() == numero){
               return imoveis.get(i);        
           } 
       }
       return null;
   }
   
   public void addPagamento(Pagamento pagamento){
       pagamentos.add(pagamento);
   }
   
   public Pagamento getPagamento(int mesAno){
       for(int i = 0; i < pagamentos.size(); i++){
           if(pagamentos.get(i).getMesAno() == mesAno){
               return pagamentos.get(i);        
           } 
       }
       return null;
   }
}
