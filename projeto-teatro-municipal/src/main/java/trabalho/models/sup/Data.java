package trabalho.models.sup;

import java.util.Calendar;

public class Data {
    // Atributos
    private int dia;
    private int mes;
    private int ano;

    // Construtores
    public Data(int dia, int mes, int ano) {
        if (ano > 0) {
            this.ano = ano;
        }

        if (mes > 0 && mes < 13) {
            this.mes = mes;
        } else if (mes <= 0) {
            this.mes = 1;
        } else if (mes > 12) {
            this.mes = 12;
        }

        if (mes != 4 && mes != 6 && mes != 9 && mes != 11) {
            if (mes == 2) {
                if (dia >= 1 && dia <= 28) {
                    this.dia = dia;
                } else if (dia <= 0) {
                    this.dia = 1;
                } else if (dia > 28) {
                    this.dia = 28;
                }
            } else if (dia >= 1 && dia <= 31) {
                this.dia = dia;
            } else if (dia <= 0) {
                this.dia = 1;
            } else if (dia > 31) {
                this.dia = 31;
            }
        } else if (dia >= 1 && dia <= 30) {
            this.dia = dia;
        } else if (dia <= 0) {
            this.dia = 1;
        } else if (dia > 30) {
            this.dia = 30;
        }

    }

    public Data() {
        Calendar date = Calendar.getInstance();
        this.dia = date.get(date.DAY_OF_MONTH);
        this.mes = date.get(date.MONTH) + 1;
        this.ano = date.get(date.YEAR);
    }

    // Métodos
    public String toString() {
        String data = String.format("%d/%d/%d", this.dia, this.mes, this.ano);
        return data;
    }

    public boolean isPassado() {
        Calendar date = Calendar.getInstance();
        int anoPresente = date.get(Calendar.YEAR);
        int mesPresente = date.get(Calendar.MONTH);
        int diaPresente = date.get(Calendar.DAY_OF_MONTH);

        if(this.ano < anoPresente) {
            return true;
        } else if (this.ano == anoPresente && this.mes < mesPresente) {
            return true;
        } else if (this.ano == anoPresente && this.mes == mesPresente && this.dia < diaPresente) {
            return true;
        } else {
            return false;
        }
    }

    // Acesso
    public void setDia(int dia) {
        if (this.mes != 4 && this.mes != 6 && this.mes != 9 && this.mes != 11) {
            if (this.mes == 2) {
                if (dia >= 1 && dia <= 28) {
                    this.dia = dia;
                } else if (dia <= 0) {
                    this.dia = 1;
                } else if (dia > 28) {
                    this.dia = 28;
                }
            } else if (dia >= 1 && dia <= 31) {
                this.dia = dia;
            } else if (dia <= 0) {
                this.dia = 1;
            } else if (dia > 31) {
                this.dia = 31;
            }
        } else if (dia >= 1 && dia <= 30) {
            this.dia = dia;
        } else if (dia <= 0) {
            this.dia = 1;
        } else if (dia > 30) {
            this.dia = 30;
        }

    }

    public int getDia() {
        return this.dia;
    }

    public void setMes(int mes) {
        if (mes > 0 && mes < 13) {
            this.mes = mes;
        } else if (mes <= 0) {
            this.mes = 1;
        } else if (mes > 12) {
            this.mes = 12;
        }

    }

    public int getMes() {
        return this.mes;
    }

    public void setAno(int ano) {
        if (ano > 0) {
            this.ano = ano;
        }

    }

    public int getAno() {
        return this.ano;
    }

}
