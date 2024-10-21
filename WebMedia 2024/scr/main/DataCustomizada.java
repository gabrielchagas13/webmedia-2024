package main;

public class DataCustomizada {
    //atributos 
    private int dia;
    private int mes;
    private int ano;

    //instanciando para trabalhar com variaveis dentro da classe, para isso o this.variavel
    public DataCustomizada(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    //fomartar data 
    public String dataFormatada() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
}
