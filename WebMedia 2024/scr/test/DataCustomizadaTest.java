import org.junit.Assert;
import org.junit.Test;

import main.DataCustomizada;

public class DataCustomizadaTest {

    //teste para a data 20/10/2024
    @Test
    public void testDataFormatada1() {
        DataCustomizada data = new DataCustomizada(20, 10, 2024);
        String dataFormatada = data.dataFormatada();
        Assert.assertEquals("20/10/2024", dataFormatada);
    }

    //teste para a data 09/09/2004 (meu anv)
    @Test
    public void testDataFormatada2() {
        DataCustomizada data = new DataCustomizada(9, 9, 2004);
        String dataFormatada = data.dataFormatada();
        Assert.assertEquals("09/09/2004", dataFormatada);
    }

    //teste para a data 31/07/2004 (anv do caio)
    @Test
    public void testDataFormatada3() {
        DataCustomizada data = new DataCustomizada(31, 7, 2004);
        String dataFormatada = data.dataFormatada();
        Assert.assertEquals("31/07/2004", dataFormatada);
    }

    //teste para a data 02/12/2021
    @Test
    public void testDataFormatada4() {
        DataCustomizada data = new DataCustomizada(2, 12, 2021);
        String dataFormatada = data.dataFormatada();
        Assert.assertEquals("02/12/2021", dataFormatada);
    }
}
