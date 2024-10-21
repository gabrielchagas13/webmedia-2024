package main;

import java.util.List;

public class Ciclista {
    //atributos
    private String nome;
    private int numero;
    private String cidade;
    private List<Etapa> etapas;

    //instanciando para trabalhar com variaveis dentro da classe, para isso o this.variavel
    public Ciclista(String nome, int numero, String cidade, List<Etapa> etapas) {
        this.nome = nome;
        this.numero = numero;
        this.cidade = cidade;
        this.etapas = etapas;
    }

    //metodo para pegar o tempo total em segundo 
    public int getTempoTotalEmSegundos() {
        int tempoTotal = 0; 
        for (Etapa etapa : etapas) { // <- pecorrer a o array da etapa 
            tempoTotal += etapa.getTempoEtapa().duracaoEmSegundos(); // aqui ele chama outro metodo na classe etapa
        }
        return tempoTotal;
    }

    //calcula que foi em menos tempo  
    public static Ciclista compararCiclistas(Ciclista ciclista1, Ciclista ciclista2) { //aqui ele chama ciclista 1 e 2 da classe ciclista 
        int tempoCiclista1 = ciclista1.getTempoTotalEmSegundos();
        int tempoCiclista2 = ciclista2.getTempoTotalEmSegundos();
        
        if (tempoCiclista1 < tempoCiclista2) {
            return ciclista1;
        } else {
            return ciclista2;
        }
    }

    //calcula a diferença de tempo 
    public static String diferencaTempo(Ciclista ciclista1, Ciclista ciclista2) { //mais uma vez chama a classe ciclista 
        int diferencaEmSegundos = Math.abs(ciclista1.getTempoTotalEmSegundos() - ciclista2.getTempoTotalEmSegundos());
        int minutos = diferencaEmSegundos / 60;
        int segundos = diferencaEmSegundos % 60;
        return String.format("%d minutos e %d segundos", minutos, segundos);
    }

    //compara em uma etapa especifica 
    public static Ciclista compararEtapa(int numeroEtapa, Ciclista ciclista1, Ciclista ciclista2) {
        Etapa etapaCiclista1 = ciclista1.getEtapaPorNumero(numeroEtapa);
        Etapa etapaCiclista2 = ciclista2.getEtapaPorNumero(numeroEtapa);

        if (etapaCiclista1.getTempoEtapa().duracaoEmSegundos() < etapaCiclista2.getTempoEtapa().duracaoEmSegundos()) {
            return ciclista1;
        } else {
            return ciclista2;
        }
    }

    
    private Etapa getEtapaPorNumero(int numeroEtapa) {
        for (Etapa etapa : etapas) {
            if (etapa.getNumero() == numeroEtapa) {
                return etapa;
            }
        }
        return null; 
    }

    public String getNome() {
        return nome;
    }
}
