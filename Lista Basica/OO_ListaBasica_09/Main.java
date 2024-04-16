import java.util.Scanner;

public class Main
{
   public static void main(String[] args) {
       Scanner readLine = new Scanner(System.in);
       
       System.out.print("Insira o valor a ser pago: ");
       double valor = readLine.nextDouble();
       System.out.print("Insira a taxa de juros mensal: ");
       double taxa = readLine.nextDouble();
       System.out.print("Insira o numero de meses para parcelar o pagamento: ");
       int meses = readLine.nextInt();
       
       Emprestimo emp = new Emprestimo(valor, meses, taxa);
       
       
       System.out.println();
       System.out.println("Valor da mensalidade: " + emp.valorMensalidade());
       System.out.println("Valor total pago: " + emp.valorTotal());
       System.out.println("Valor pago em juros: " + emp.totalJuros());
       
       
               
   }
}
