import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculTest {
    @Test
    public void testAdd() {
        Calcul cal = new Calcul();
        assertEquals(5, cal.add(2, 3));
    }
}