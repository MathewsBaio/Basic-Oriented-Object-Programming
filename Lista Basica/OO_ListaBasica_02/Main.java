import java.util.Scanner;

public class Main
{
    public static void main() {
        Scanner readLine = new Scanner(System.in);
        Numero numA = new Numero();
        Numero numB = new Numero();
        Numero i = new Numero();
        
        System.out.println("Insira o primeiro número: ");
        numA.setValor(readLine.nextDouble());
        System.out.println("Insira o segundo número: ");
        numB.setValor(readLine.nextDouble());
        
        for(i.setValor(numA.getValor() + 1); i.getValor() < numB.getValor(); i.setValor(i.getValor() + 1)) {
            if(i.verificaImpar(i.getValor())) {
                System.out.println(i.getValor());
            }
        }  
    }  
}