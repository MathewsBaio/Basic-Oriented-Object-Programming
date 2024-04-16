public class Carro
{
    // atributos
    private double valorModelo;
    private String modelo;
    private String fabricante;
    private String cor;
    private String pintura;
    private double motor;
    private boolean modeloImportante;
    private boolean cambioAuto;
    private boolean vidroAuto;
    private boolean alarme;
    private boolean tetoSolar;
    private boolean kitMultimidia;
    private boolean ar;
    
    // construtores
    public Carro(){}
    public Carro(String fmodelo, String fcor, String fpintura, double fmotor) {
        modelo = fmodelo;
        if(fmodelo.toUpperCase().equals("SAVEIRO")) {
            valorModelo = 32000;
        } else if (fmodelo.toUpperCase().equals("VIRTUS")) {
            valorModelo = 24000;
        } else if (fmodelo.toUpperCase().equals("GOL")) {
            valorModelo = 16000;
        } else {
            valorModelo = 18000;
        }
        cor = fcor;
        pintura = fpintura;
        motor = fmotor;
        if(fmodelo.toUpperCase().equals("VIRTUS")) {
            modeloImportante = true;
        } else {
            modeloImportante = false;
        }
    }
    public Carro(String fmodelo, String fcor, String fpintura, double fmotor,
    boolean fcambioAuto, boolean fvidroAuto, boolean falarme, boolean ftetoSolar, boolean fkitMultimidia, boolean far) {
        modelo = fmodelo;
        if(fmodelo.toUpperCase().equals("SAVEIRO")) {
            valorModelo = 32000;
        } else if (fmodelo.toUpperCase().equals("VIRTUS")) {
            valorModelo = 24000;
        } else if (fmodelo.toUpperCase().equals("GOL")) {
            valorModelo = 16000;
        } else {
            valorModelo = 18000;
        }
        if(fmodelo.toUpperCase().equals("SAVEIRO") ||fmodelo.toUpperCase().equals("VIRTUS") || fmodelo.toUpperCase().equals("GOL")) {
            fabricante = "Volkswagen";
        }  else if (fmodelo.toUpperCase().equals("UNO")) {
            fabricante = "Fiat";
        } else {
            fabricante = "Outro"; 
        }
        cor = fcor;
        pintura = fpintura;
        motor = fmotor;
        if(fmodelo.toUpperCase().equals("VIRTUS")) {
            modeloImportante = true;
        } else {
            modeloImportante = false;
        }
        cambioAuto = fcambioAuto;
        vidroAuto = fvidroAuto;
        alarme = falarme;
        tetoSolar = ftetoSolar;
        kitMultimidia = fkitMultimidia;
        ar = far;
    }
    
    // metodos
    public double valorCarro() {
        double valorTotal = valorModelo;
        
        valorTotal += calculoIPI() + taxaImportante() + calculoAr() + calculoCambioAuto() + calculoAlarme() + calculoPintura() +
        calculoTetoSolar() + calculoKitMidia();
        
        return valorTotal; 
    }
    
    public double calculoIPI() {
        double IPI;
        if(motor <= 1.0) {
            IPI = valorModelo * 0.1;
        } else {
            IPI = valorModelo * 0.2;
        }
        return IPI;
    }
    
    public double taxaImportante() {
        if(modeloImportante) {
            return valorModelo * 0.3;
        } else {
            return 0;
        }
    }
    
    public double calculoAr() {
        if(ar) {
            return 3000;
        } else {
            return 0;
        }
    }
    
    public double calculoCambioAuto() {
        if(cambioAuto) {
            return 5000;
        } else {
            return 0;
        }
    }
    
    public double calculoAlarme() {
        if(alarme) {
            return 800;
        } else {
            return 0;
        }
    }
    
    public double calculoPintura() {
        if(pintura.toUpperCase() == "ESPECIAL" || pintura.toUpperCase() == "METÁLICA" || pintura.toUpperCase() == "COMEMORATIVA") {
            return 2500;
        } else {
            return 0;
        }
    }
    
    public double calculoTetoSolar() {
        if(tetoSolar) {
            return 4000;
        } else {
            return 0;
        }
    }
    
    public double calculoKitMidia() {
        if(kitMultimidia) {
            return 1800;            
        } else {
            return 0;
        }
    }
    
    // acesso
    public double getValorModelo() {
        return valorModelo;
    }
    public void setModelo(String novoModelo) {
        modelo = novoModelo;
        
        if(modelo.toUpperCase().equals("SAVEIRO")) {
            valorModelo = 32000;
        } else if (modelo.toUpperCase().equals("VIRTUS")) {
            valorModelo = 24000;
        } else if (modelo.toUpperCase().equals("GOL")) {
            valorModelo = 16000;
        } else {
            valorModelo = 18000;
        }
        
        if(modelo.toUpperCase().equals("SAVEIRO") ||modelo.toUpperCase().equals("VIRTUS") || modelo.toUpperCase().equals("GOL")) {
            fabricante = "Volkswagen";
        }  else if (modelo.toUpperCase().equals("UNO")) {
            fabricante = "Fiat";
        } else {
            fabricante = "Outro"; 
        }
        
        if(modelo.toUpperCase().equals("VIRTUS")) {
            modeloImportante = true;
        } else {
            modeloImportante = false;
        }
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setFabricante(String novoFabricante) {
        fabricante = novoFabricante;
    }
    
    public String getFabricante() {
        return fabricante;
    }
    
    public void setCor(String novaCor) {
        cor = novaCor;
    }
    
    public String getCor() {
        return cor;
    }
    
    public void setPintura(String novaPintura) {
        pintura = novaPintura;
    }
    
    public String getPintura() {
        return pintura;
    }
    
    public void setMotor(double novoMotor) {
        motor = novoMotor;
    }
    
    public double getMotor() {
        return motor;
    }
    
    public void setModeloImportante(boolean novoModeloImportante) {
       modeloImportante = novoModeloImportante;
    }
    
    public boolean getModeloImportante() {
        return modeloImportante;
    }
    
    public void setCambioAuto(boolean novoCambioAuto) {
       cambioAuto = novoCambioAuto;
    }
    
    public boolean getCambioAuto() {
        return cambioAuto;
    }
    
    public void setVidroAuto(boolean novoVidroAuto) {
       vidroAuto = novoVidroAuto;
    }
    
    public boolean getVidroAuto() {
        return vidroAuto;
    }
    
    public void setAlarme(boolean novoAlarme) {
       alarme = novoAlarme;
    }
    
    public boolean getAlarme() {
        return alarme;
    }
    
    public void setTetoSolar(boolean novoTetoSolar) {
       tetoSolar = novoTetoSolar;
    }
    
    public boolean getTetoSolar() {
        return tetoSolar;
    }
    
    public void setKitMultimidia(boolean novoKitMultimidia) {
       kitMultimidia = novoKitMultimidia;
    }
    
    public boolean getKitMultimidia() {
        return kitMultimidia;
    }
    
    public void setAr(boolean novoAr ) {
       ar = novoAr;
    }
    
    public boolean getAr() {
        return ar;
    }
}
