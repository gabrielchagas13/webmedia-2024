package main;

import java.time.LocalDate;

import javax.xml.crypto.Data;  

public class Etapa {
    //atributo 
    //nessa ela pega o atributo em outras classes como podemos ver
    private int numero;
    private DataCustomizada data;
    private Hora horaInicial;
    private Duracao tempoEtapa;

    //instanciando para trabalhar com variaveis dentro da classe, para isso o this.variavel
    public Etapa(int numero, DataCustomizada data, Hora horaInicial, int duracaoEmSegundos) {
        this.numero = numero;
        this.data = data;
        this.horaInicial = horaInicial;
        this.tempoEtapa = new Duracao(horaInicial, duracaoEmSegundos);
    }

    //atributo para pegar o numer
    public int getNumero() {
        return numero;
    }

    public Duracao getTempoEtapa() {
        return tempoEtapa;
    }

    //relatorio etapa
    public String relatorioEtapa() {
        return String.format("Etapa %d - Data: %s, Início: %s, Duração: %s", 
                              numero, data.dataFormatada(), horaInicial.horaFormatada(), tempoEtapa.relatorio());
    }
}
