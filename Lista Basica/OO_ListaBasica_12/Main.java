import java.util.Scanner;

public class Main
{
    public static Scanner readLine = new Scanner(System.in);
    
    public static void main(String[] args){
        Pessoa pes = cadastrarPessoa();
        
        if(pes.eAdulto()){
            System.out.println("Tem mais que 17 anos!");
        } else{
            System.out.println("É menor de idade!");
        }
        
        
    }
    
    public static Pessoa cadastrarPessoa(){
        Pessoa pessoa = new Pessoa();
        System.out.print("Nome: ");
        pessoa.setNome(readLine.next());
        System.out.print("Idade: ");
        System.out.print("Email: ");
        pessoa.setEmail(readLine.next());
        
        cadastrarData(pessoa);
        
        return pessoa;
    }
    
    public static void cadastrarData(Pessoa pessoa){
        int dia, mes, ano;
        
        System.out.println("Data de nascimento: ");
        System.out.print("Dia: ");
        dia = readLine.nextInt();
        System.out.print("Mes: ");
        mes = readLine.nextInt();
        System.out.print("Ano: ");
        ano = readLine.nextInt();
        
        pessoa.setDataNascimento(dia, mes, ano);
    }
    
}
