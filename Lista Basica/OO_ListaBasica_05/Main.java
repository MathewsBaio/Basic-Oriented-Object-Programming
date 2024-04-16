import java.util.Scanner;

public class Main
{
   void main() {
       Scanner readline = new Scanner(System.in);
       Triangulo tri = new Triangulo();
       
       System.out.println("Insira o primeiro lado do triangulo:");
       tri.setLadoUm(readline.nextDouble());
       
       System.out.println("Insira o segundo lado do triangulo:");
       tri.setLadoDois(readline.nextDouble());
       
       System.out.println("Insira o terceiro lado do triangulo:");
       tri.setLadoTres(readline.nextDouble());
       
       System.out.println("O triangulo e do tipo: " + tri.tipoTriangulo(tri.getLadoUm(),tri.getLadoDois(),tri.getLadoTres()));
       
       System.out.println("A area do triangulo e: " + tri.calcularArea(tri.getLadoUm(),tri.getLadoDois(),tri.getLadoTres()));
       
       System.out.println("O perimetro do triangulo e: " + tri.calcularPerimetro(tri.getLadoUm(),tri.getLadoDois(),tri.getLadoTres()));
       
       
   }
}