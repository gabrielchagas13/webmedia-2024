import main.Ciclista;
import main.DataCustomizada;
import main.Duracao;
import main.Etapa;
import main.Hora;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class CiclistaTest {

    @Test
    public void testGetTempoTotalEmSegundos() {
        //testando o tempo total em segundos
        DataCustomizada data1 = new DataCustomizada(15, 10, 2024);
        Hora horaInicial1 = new Hora(8, 30, 0);
        Etapa etapa1 = new Etapa(1, data1, horaInicial1, 7200); // 2 horas

        DataCustomizada data2 = new DataCustomizada(15, 10, 2024);
        Hora horaInicial2 = new Hora(10, 0, 0);
        Etapa etapa2 = new Etapa(2, data2, horaInicial2, 3600); // 1 hora

        Ciclista ciclista = new Ciclista("Gabriel Chagas Lage", 1, "Rua Dom Jose Gaspar", Arrays.asList(etapa1, etapa2));
        
        Assert.assertEquals(10800, ciclista.getTempoTotalEmSegundos()); // 3 horas em segundos
    }

    @Test
    public void testCompararCiclistas() {
        // Testando a comparação de ciclistas
        DataCustomizada data = new DataCustomizada(15, 10, 2024);
        Hora horaInicial1 = new Hora(8, 30, 0);
        Etapa etapa1 = new Etapa(1, data, horaInicial1, 7200); // 2 horas

        Hora horaInicial2 = new Hora(10, 0, 0);
        Etapa etapa2 = new Etapa(2, data, horaInicial2, 3600); // 1 hora

        Ciclista ciclista1 = new Ciclista("Gabriel Chagas Lage", 1, "Rua Dom Jose Gaspar", Arrays.asList(etapa1));
        Ciclista ciclista2 = new Ciclista("Caio Souza de Rezende", 2, "Arena MRV", Arrays.asList(etapa2));

        Ciclista vencedor = Ciclista.compararCiclistas(ciclista1, ciclista2);
        
        Assert.assertEquals(ciclista2, vencedor); // Ciclista 2 deve ser o vencedor por ter menor tempo
    }

    @Test
    public void testDiferencaTempo() {
        // Testando a diferença de tempo entre ciclistas
        DataCustomizada data = new DataCustomizada(15, 10, 2024);
        Hora horaInicial1 = new Hora(8, 30, 0);
        Etapa etapa1 = new Etapa(1, data, horaInicial1, 7200); // 2 horas

        Hora horaInicial2 = new Hora(10, 0, 0);
        Etapa etapa2 = new Etapa(2, data, horaInicial2, 3600); // 1 hora

        Ciclista ciclista1 = new Ciclista("Gabriel Chagas Lage", 1, "Rua Dom Jose Gaspar", Arrays.asList(etapa1));
        Ciclista ciclista2 = new Ciclista("Danilao da Fisioculturismo", 2, "Orla da Pampula", Arrays.asList(etapa2));

        String diferenca = Ciclista.diferencaTempo(ciclista1, ciclista2);
        
        Assert.assertEquals("60 minutos e 0 segundos", diferenca); // Ambos devem ter o mesmo tempo
    }

    @Test
    public void testCompararEtapa() {
        // Testando a comparação de etapas específicas
        DataCustomizada data = new DataCustomizada(15, 10, 2024);
        Hora horaInicial1 = new Hora(8, 30, 0);
        Etapa etapa1 = new Etapa(1, data, horaInicial1, 7200); // 2 horas

        Hora horaInicial2 = new Hora(9, 0, 0);
        Etapa etapa2 = new Etapa(1, data, horaInicial2, 5400); // 1,5 horas

        Ciclista ciclista1 = new Ciclista("Gabriel Chagas Lage", 1, "Rua Dom Jose Gaspar", Arrays.asList(etapa1));
        Ciclista ciclista2 = new Ciclista("Caio Souza de Rezende", 2, "Arena MRV", Arrays.asList(etapa2));

        Ciclista vencedorEtapa = Ciclista.compararEtapa(1, ciclista1, ciclista2);
        
        Assert.assertEquals(ciclista2, vencedorEtapa); // Ciclista 2 deve ser o vencedor na etapa 1
    }
}
