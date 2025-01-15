import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SimpleTest {

    @Test
    public void plusTest() {
        int a = 2;
        int b = 2;
        int sum = 4;
        int actualSum = a + b;

        assertEquals(sum, actualSum);
    }
}