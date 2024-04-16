import java.util.Scanner;

public class Main
{
    void main() {
        Retangulo ret = new Retangulo();
        Scanner readLine = new Scanner(System.in);
        
        System.out.println("Insira o comprimento do retangulo: ");
        ret.setComprimento(readLine.nextDouble());
        System.out.println("Insira a largura do retangulo: ");
        ret.setLargura(readLine.nextDouble());
        
        System.out.println("Resultado das operações: ");
        System.out.println("Area do retangulo: " + ret.calcularArea(ret.getComprimento(),ret.getLargura()));
        System.out.println("Perimetro do retangulo: " + ret.calcularPerimetro(ret.getComprimento(),ret.getLargura()));
    }
}
