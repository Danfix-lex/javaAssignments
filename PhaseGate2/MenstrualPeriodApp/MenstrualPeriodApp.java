import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MenstrualPeriodApp {
  public static void main (String[] args) {
    String lmp = "2024-11-02";
    int cycleLength = 28;
    
    String[] myMenstrual = calculateMenstrualCycle(lmp, cycleLength);
    
    for (String date : myMenstrual) {
            System.out.println(date);
        }
    }
    public static String[] calculateMenstrualCycle(String lmp, int cycleLength) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate lmpDate = LocalDate.parse(lmp, formatter);
        LocalDate nextPeriod = lmpDate.plusDays(cycleLength);
        LocalDate ovulationDate = nextPeriod.minusDays(14);
        LocalDate fertileStart = ovulationDate.minusDays(2);
        LocalDate fertileEnd = ovulationDate.plusDays(2);
        LocalDate safeStart = fertileEnd.plusDays(1);
        LocalDate safeEnd = fertileStart.minusDays(1);

        return new String[]{
                "Next Period: " + nextPeriod.format(formatter),
                "Ovulation Date: " + ovulationDate.format(formatter),
                "Fertile Window: " + fertileStart.format(formatter) + " to " + fertileEnd.format(formatter),
                "Safe Window Before: Cycle Start to " + safeEnd.format(formatter),
                "Safe Window After: " + safeStart.format(formatter) + " to Cycle End"
        };
    }
}

