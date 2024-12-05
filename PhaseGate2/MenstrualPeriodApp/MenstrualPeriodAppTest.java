import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MenstrualPeriodAppTest {

    @Test
    public void testCalculateMenstrualCycle() {
        String lmp = "2024-11-01";
        int cycleLength = 28;

        String[] expected = {
                "Next Period: 2024-11-29",
                "Ovulation Date: 2024-11-15",
                "Fertile Window: 2024-11-13 to 2024-11-17",
                "Safe Window Before: Cycle Start to 2024-11-12",
                "Safe Window After: 2024-11-18 to Cycle End"
        };

        String[] result = MenstrualPeriodApp.calculateMenstrualCycle(lmp, cycleLength);

        assertEquals(expected[0], result[0]);
        assertEquals(expected[1], result[1]);
        assertEquals(expected[2], result[2]);
        assertEquals(expected[3], result[3]);
        assertEquals(expected[4], result[4]);
    }
}

