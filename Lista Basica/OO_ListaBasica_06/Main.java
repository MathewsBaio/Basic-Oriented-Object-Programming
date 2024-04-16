import java.util.Scanner;

public class Main
{
    void main() {
        Scanner readLine = new Scanner(System.in);
        Consumidor comprador = new Consumidor("Lucas");
        Carro carro = new Carro();
        comprador.addCarro(carro);
        
        System.out.println("Escolha o modelo do veículo dentre as opções gol, saveiro, virtus, uno e opala: ");
        comprador.getCarro(0).setModelo(readLine.next());
        System.out.println("Escolha a cor do veículo: ");
        comprador.getCarro(0).setCor(readLine.next());
        System.out.println("Escolha o tipo de pintura, dentre especial, metálica, comemorativa ou normal: ");
        comprador.getCarro(0).setPintura(readLine.next());
        System.out.println("Escolha a potência do motor: ");
        comprador.getCarro(0).setMotor(readLine.nextDouble());
        System.out.println("Deseja incluir cambio automático? ");
        comprador.getCarro(0).setCambioAuto(readLine.nextBoolean());
        System.out.println("Deseja incluir vidro automático? ");
        comprador.getCarro(0).setVidroAuto(readLine.nextBoolean());
        System.out.println("Deseja incluir alarme? ");
        comprador.getCarro(0).setAlarme(readLine.nextBoolean());
        System.out.println("Deseja incluir teto solar? ");
        comprador.getCarro(0).setTetoSolar(readLine.nextBoolean());
        System.out.println("Deseja incluir kit multimídia? ");
        comprador.getCarro(0).setKitMultimidia(readLine.nextBoolean());
        System.out.println("Deseja incluir ar condicionado? ");
        comprador.getCarro(0).setAr(readLine.nextBoolean());
        
        System.out.println();
        System.out.println("Parabéns, o seu carro customizado está pronto!");
        System.out.println("você comprou o seguinte automóvel no valor de: " + comprador.getCarro(0).valorCarro());
        System.out.println("Modelo: " + comprador.getCarro(0).getModelo());
        System.out.println("Fabricante: " + comprador.getCarro(0).getFabricante());
        System.out.println("Cor: " + comprador.getCarro(0).getCor());
        System.out.println("Pintura: " + comprador.getCarro(0).getPintura());
    }
    
}
