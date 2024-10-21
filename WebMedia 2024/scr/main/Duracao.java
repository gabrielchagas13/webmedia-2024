package main;

public class Duracao {
    //atributos
    private Hora horaInicial;
    private int duracaoTotal;

    public Duracao(Hora horaInicial, int tempoEmSegundos) {
        this.horaInicial = horaInicial;
        this.duracaoTotal = tempoEmSegundos;
    }

    public boolean maiorQue(Duracao outraDuracao) {
        return this.duracaoTotal > outraDuracao.duracaoTotal;
    }

    public int duracaoEmSegundos() {
        return duracaoTotal;
    }

    public String relatorio() {
        int horas = duracaoTotal / 3600;
        int minutos = (duracaoTotal % 3600) / 60;
        int segundos = duracaoTotal % 60;
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }
}
