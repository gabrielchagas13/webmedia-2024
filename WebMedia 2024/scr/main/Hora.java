package main;

public class Hora {
    //atributos 
    private int horas;
    private int minutos;
    private int segundos;

    //ajustando a variavel certo 
    public Hora(int horas, int minutos, int segundos) {
        ajustar(horas, minutos, segundos);
    }

    //fazer tempo certo 
    public void ajustar(int horas, int minutos, int segundos) {
        if (horas >= 0 && horas < 24) {
            this.horas = horas;
        }
        if (minutos >= 0 && minutos < 60) {
            this.minutos = minutos;
        }
        if (segundos >= 0 && segundos < 60) {
            this.segundos = segundos;
        }
    }

    //validando 
    public boolean validar() {
        return horas >= 0 && horas < 24 && minutos >= 0 && minutos < 60 && segundos >= 0 && segundos < 60;
    }

    public void incrementar(int quantidadeSegundos) {
        segundos += quantidadeSegundos;
        minutos += segundos / 60;
        segundos %= 60;
        horas += minutos / 60;
        minutos %= 60;
        horas %= 24; // Limita as horas a 24
    }

    public boolean estaNaFrenteDe(Hora outraHora) {
        if (this.horas != outraHora.horas) {
            return this.horas > outraHora.horas;
        }
        if (this.minutos != outraHora.minutos) {
            return this.minutos > outraHora.minutos;
        }
        return this.segundos > outraHora.segundos;
    }

    //formantnadno a hora
    public String horaFormatada() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }
}
