public class Triangulo
{
   // atributos 
   private double ladoUm;
   private double ladoDois;
   private double ladoTres;
   
   // construtores
   public Triangulo(){}
   public Triangulo(double fladoUm, double fladoDois, double fladoTres) {
       ladoUm = fladoUm;
       ladoDois = fladoDois;
       ladoTres = fladoTres;
   }
   
   // metodos
   
   public double calcularArea(double l1, double l2, double l3) {
       double area;
       
       if(tipoTriangulo(l1, l2, l3) == "Equilatero") {
           area = Math.pow(l1,2) * (Math.sqrt(3) / 4);
       } else if(tipoTriangulo(l1, l2, l3) == "Isosceles") {
            if(l1 != l3 && l1 == l2) {
                area = (l3 * calcularAlturaIsosceles(ladoUm, ladoDois, ladoTres)) / 2;
        }   else if(l1 != l2 && l1 == l3) {
                area = (l2 * calcularAlturaIsosceles(ladoUm, ladoDois, ladoTres)) / 2;
        }   else {
                area = (l1 * calcularAlturaIsosceles(ladoUm, ladoDois, ladoTres)) / 2;
        }
       } else {
           double s = calcularSemiPerimetroEscaleno(ladoUm,ladoDois,ladoTres); 
           area = Math.sqrt(s * (s - l1) * (s - l2) * (s - l3));
       }
       return area;
       
   }
   
   public double calcularPerimetro(double l1, double l2, double l3) {
       return l1 + l2 + l3;
   }
   
   public double calcularAlturaIsosceles(double l1, double l2, double l3) {
       double altura;
       
       if(l1 != l3 && l1 == l2) {
           altura = Math.sqrt(Math.pow(l1,2) - Math.pow(l3/2,2));
       } else if(l1 != l2 && l1 == l3) {
           altura = Math.sqrt(Math.pow(l1,2) - Math.pow(l2/2,2));
       } else {
           altura = Math.sqrt(Math.pow(l3,2) - Math.pow(l1/2,2));
       }
       return altura;
   }
   
   public double calcularSemiPerimetroEscaleno(double l1, double l2, double l3) {
       return (l1 + l2 + l3) / 2;
   }
   
   public String tipoTriangulo(double l1, double l2, double l3) {
       if(l1 == l2 && l1 == l3) {
           return "Equilatero";
       } else if(l1 != l2 && l1 != l3) {
           return "Escaleno";
       } else {
           return "Isosceles";
       }
   }
   
   // acesso
   
   public void setLadoUm(double l1) {
       ladoUm = l1;
   }
   
   public double getLadoUm(){
       return ladoUm;
   }
   
   public void setLadoDois(double l2) {
       ladoDois = l2;
   }
   
   public double getLadoDois(){
       return ladoDois;
   }
   
   public void setLadoTres(double l3) {
       ladoTres = l3;
   }
   
   public double getLadoTres(){
       return ladoTres;
   }
   
   
}
