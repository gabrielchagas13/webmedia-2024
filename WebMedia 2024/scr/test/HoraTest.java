import main.Hora;
import org.junit.Assert;
import org.junit.Test;

public class HoraTest {

    @Test
    public void testHoraFormatada() {
        Hora hora = new Hora(9, 5, 3);
        String horaFormatada = hora.horaFormatada();
        Assert.assertEquals("09:05:03", horaFormatada);
    }

    @Test
    public void testIncrementar() {
        //testando a função de incrementar segundos
        Hora hora = new Hora(23, 59, 50);
        hora.incrementar(15); // Deve passar para 00:00:05
        Assert.assertEquals("00:00:05", hora.horaFormatada());
    }

    @Test
    public void testEstaNaFrenteDe() {
        //testando a comparacao de horas
        Hora hora1 = new Hora(10, 30, 0);
        Hora hora2 = new Hora(10, 29, 59);
        Assert.assertTrue(hora1.estaNaFrenteDe(hora2)); // hora1 deve estar à frente de hora2
    }

    @Test
    public void testValidar() {
        //testando a validação de uma hora correta
        Hora hora = new Hora(12, 30, 30);
        Assert.assertTrue(hora.validar());

        //testando a validação de uma hora incorreta
        Hora horaInvalida = new Hora(25, 0, 0);
        Assert.assertTrue(horaInvalida.validar()); // Deve ser inválida
    }

    @Test
    public void testAjustar() {
        //testando o ajuste de hora
        Hora hora = new Hora(25, 61, 61); 
        hora.ajustar(23, 59, 59); // Ajusta para uma hora válida
        Assert.assertTrue(hora.validar());
        Assert.assertEquals("23:59:59", hora.horaFormatada());
    }
}
