import java.util.Calendar;

public class Data
{
    //atributos
    private int dia;
    private int mes;
    private int ano;
    
    //construtores
    public Data(int dia, int mes, int ano){
        if(ano > 0) {
            this.ano = ano;    
        }
        
        if(mes > 0 && mes < 13) {
            this.mes = mes;    
        } else if(mes <= 0) {
            this.mes = 1;
        } else if(mes > 12) {
            this.mes = 12;
        }
        
        if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if(dia >= 1 && dia <= 30) {
                this.dia = dia;
            } else if(dia <= 0) {
                this.dia = 1;
            } else if(dia > 30) {
                this.dia = 30;
            }
        } else if(mes == 2) {
            if(dia >= 1 && dia <= 28) {
                this.dia = dia;
            } else if(dia <= 0) {
                this.dia = 1;
            } else if(dia > 28) {
                this.dia = 28;
            }
        } else {
            if(dia >= 1 && dia <= 31) {
                this.dia = dia;
            } else if(dia <= 0) {
                this.dia = 1;
            } else if(dia > 31) {
                this.dia = 31;
            }
        }
    }
    public Data(){
        Calendar date = Calendar.getInstance();
        
        this.dia = date.get(Calendar.DAY_OF_MONTH);
        this.mes = date.get(Calendar.MONTH);
        this.ano = date.get(Calendar.YEAR);
    }
    
    //metodos
    public String toString(){
        String data = String.format("%d/%d/%d",dia,mes,ano);
        return data;  
    }
    
    public void diaSeguinte(){
        if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if(dia <= 29) {
                dia++;
            } else if(dia == 30) {
                this.dia = 1;
                if(mes < 12) {
                    mes++;
                } else {
                    mes = 1;
                    ano++;
                }
            } 
        } else if(mes == 2) {
            if(dia <= 27) {
                dia++;
            } else if(dia == 28) {
                this.dia = 1;
                if(mes < 12) {
                    mes++;
                } else {
                    mes = 1;
                    ano++;
                }
            } 
        } else {
            if(dia <= 30) {
                dia++;
            } else if(dia == 31) {
                this.dia = 1;
                if(mes < 12) {
                    mes++;
                } else {
                    mes = 1;
                    ano++;
                }
            } 
        }
    }
    
    //acesso 
    public void setDia(int dia){
        if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if(dia >= 1 && dia <= 30) {
                this.dia = dia;
            } else if(dia <= 0) {
                this.dia = 1;
            } else if(dia > 30) {
                this.dia = 30;
            }
        } else if(mes == 2) {
            if(dia >= 1 && dia <= 28) {
                this.dia = dia;
            } else if(dia <= 0) {
                this.dia = 1;
            } else if(dia > 28) {
                this.dia = 28;
            }
        } else {
            if(dia >= 1 && dia <= 31) {
                this.dia = dia;
            } else if(dia <= 0) {
                this.dia = 1;
            } else if(dia > 31) {
                this.dia = 31;
            }
        }
    }
    
    public int getDia(){
        return this.dia;
    }
    
    public void setMes(int mes){
        if(mes > 0 && mes < 13) {
            this.mes = mes;    
        } else if(mes <= 0) {
            this.mes = 1;
        } else if(mes > 12) {
            this.mes = 12;
        }
    }
    
    public int getMes(){
        return this.mes;
    }
    
    public void setAno(int ano){
        if(ano > 0) {
            this.ano = ano;    
        }
    }
    
    public int getAno(){
        return this.ano;
    }
}
