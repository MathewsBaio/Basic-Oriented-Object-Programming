import java.util.Scanner;

public class Main
{
   public void main() {
       PlanoCartesiano plano = new PlanoCartesiano();
       Scanner readLine = new Scanner(System.in);
       
       System.out.println("Insira o primeiro ponto: ");
       plano.setPontoUm(readLine.nextDouble());
       System.out.println("Insira o segundo ponto: ");
       plano.setPontoDois(readLine.nextDouble());
       
       System.out.println("Distancia entre os dois pontos: " + plano.distanciaPontos(plano.getPontoUm(),plano.getPontoDois()));
   }
}
