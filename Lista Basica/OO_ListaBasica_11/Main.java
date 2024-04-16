import java.util.Scanner;

public class Main
{
    public static Scanner readLine = new Scanner(System.in);
    
    public static void main(String[] args) {
        Data dataAtual = new Data();
        
        System.out.println("A data atual é: "+dataAtual.toString());
        
        Data dataNova = novaData();
        
        dataNova.diaSeguinte();
        System.out.println("O dia seguinte a data escolhida e: "+dataNova.toString());
        
         
        
        
        
        
    }
    
    public static Data novaData(){
        Data data = new Data();
        
        System.out.print("Dia: ");
        data.setDia(readLine.nextInt());
        System.out.print("Mês: ");
        data.setMes(readLine.nextInt());
        System.out.print("Ano: ");
        data.setAno(readLine.nextInt());
        
        return data;
    }
    

    
}
