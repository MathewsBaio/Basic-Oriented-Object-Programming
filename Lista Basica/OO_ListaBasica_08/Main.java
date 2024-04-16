import java.util.Scanner;

public class Main
{
    void main() {
        Scanner readLine = new Scanner(System.in);
        
        Produto prod = new Produto();
        System.out.println("Insira o nome do produto:");
        prod.setNome(readLine.next());
        System.out.println("Insira o valor do produto:");
        prod.setValor(readLine.nextDouble());
        System.out.println("Insira o codigo de barras do produto:");
        prod.setCodigoBarras(readLine.next());
        System.out.println("Insira a quantidade disponivel do produto:");
        prod.setQtdEstoque(readLine.nextInt());
        
        if(prod.estaDisponivel()) {
            System.out.println("Produto em estoque");
        } else {
            System.out.println("Produto esgotado");
        }
    }
}
