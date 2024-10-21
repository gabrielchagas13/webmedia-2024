import main.Duracao;
import main.Hora;
import org.junit.Assert;
import org.junit.Test;

public class DuracaoTest {

    @Test
    public void testDuracaoRelatorio() {
        Hora horaInicial = new Hora(12, 0, 0);
        Duracao duracao = new Duracao(horaInicial, 5415); // 5415 segundos 
        String relatorio = duracao.relatorio();
        Assert.assertEquals("01:30:15", relatorio);
    }

    @Test
    public void testDuracaoMaiorQue() {
        Hora horaInicial1 = new Hora(10, 0, 0);
        Duracao duracao1 = new Duracao(horaInicial1, 3600); // 1 hora

        Hora horaInicial2 = new Hora(11, 0, 0);
        Duracao duracao2 = new Duracao(horaInicial2, 1800); // 30 minutos

        Assert.assertTrue(duracao1.maiorQue(duracao2)); // duracao1 deve ser maior que duracao2
    }

    @Test
    public void testDuracaoEmSegundos() {
        Hora horaInicial = new Hora(9, 0, 0);
        Duracao duracao = new Duracao(horaInicial, 4500); // 4500 segundos = 1h 15m
        Assert.assertEquals(4500, duracao.duracaoEmSegundos()); 
    }

    @Test
    public void testDuracaoMenorQue() {
        // Testando se uma duração é menor que outra
        Hora horaInicial1 = new Hora(12, 0, 0);
        Duracao duracao1 = new Duracao(horaInicial1, 1800); // 30 minutos

        Hora horaInicial2 = new Hora(13, 0, 0);
        Duracao duracao2 = new Duracao(horaInicial2, 3600); // 1 hora

        Assert.assertFalse(duracao1.maiorQue(duracao2)); // duracao1 não deve ser maior que duracao2
    }
}
