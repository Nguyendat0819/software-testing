import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testStatementCoverage() {
        Calculator c = new Calculator();
        assertEquals(6, c.sumEvenNumbers(4));
    }
}