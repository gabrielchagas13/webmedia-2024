import main.DataCustomizada;
import main.Duracao;
import main.Etapa;
import main.Hora;
import org.junit.Assert;
import org.junit.Test;

public class EtapaTest {

    @Test
    public void testRelatorioEtapa() {
        // Testando o relatório da etapa
        DataCustomizada data = new DataCustomizada(15, 10, 2024);
        Hora horaInicial = new Hora(8, 30, 0);
        Duracao duracao = new Duracao(horaInicial, 7200); // 2 horas em segundos
        Etapa etapa = new Etapa(1, data, horaInicial, 7200);

        String relatorio = etapa.relatorioEtapa();
        String dataEsperada = "Etapa 1 - Data: 15/10/2024, Início: 08:30:00, Duração: 02:00:00";
        
        Assert.assertEquals(dataEsperada, relatorio);
    }

    @Test
    public void testGetNumero() {
        // Testando o método getNumero()
        DataCustomizada data = new DataCustomizada(15, 10, 2024);
        Hora horaInicial = new Hora(8, 30, 0);
        Etapa etapa = new Etapa(2, data, horaInicial, 3600); // 1 hora em segundos

        Assert.assertEquals(2, etapa.getNumero());
    }

    @Test
    public void testGetTempoEtapa() {
        // Testando o método getTempoEtapa()
        DataCustomizada data = new DataCustomizada(20, 11, 2024);
        Hora horaInicial = new Hora(14, 0, 0);
        Duracao duracao = new Duracao(horaInicial, 1800); // 30 minutos em segundos
        Etapa etapa = new Etapa(3, data, horaInicial, 1800); 

        Assert.assertNotNull(etapa.getTempoEtapa());
        Assert.assertEquals(1800, etapa.getTempoEtapa().duracaoEmSegundos());
    }
}
