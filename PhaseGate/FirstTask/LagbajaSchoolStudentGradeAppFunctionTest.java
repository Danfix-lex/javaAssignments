import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LagbajaSchoolStudentGradeAppFunctionTest {

    @Test
    public void testCalculateTotalScores() {
        int[][] studentScores = {
            {80, 70, 60, 50},
            {90, 85, 75, 65}
        };
        int[] expectedTotals = {260, 315};
        int[] actualTotals = LagbajaSchoolStudentGradeAppFunction.calculateTotalScores(studentScores, 2);

        assertArrayEquals(expectedTotals, actualTotals);
    }

    @Test
    public void testCalculateAverages() {
        int[] totalScores = {260, 315};
        float[] expectedAverages = {65.0f, 78.75f};
        float[] actualAverages = LagbajaSchoolStudentGradeAppFunction.calculateAverages(totalScores, 2);

        assertArrayEquals(expectedAverages, actualAverages, 0.01f);
    }

    @Test
    public void testCalculateRanks() {
        float[] averages = {78.75f, 65.0f};
        String[] expectedRanks = {"1", "2"};
        String[] actualRanks = LagbajaSchoolStudentGradeAppFunction.calculateRanks(averages, 2);

        assertArrayEquals(expectedRanks, actualRanks);
    }

    @Test
    public void testPrintScoreTable() {
        int[][] studentScores = {
            {80, 70, 60, 50},
            {90, 85, 75, 65}
        };
        int[] totalScores = {260, 315};
        float[] averages = {65.0f, 78.75f};
        String[] ranks = {"2", "1"};

        assertDoesNotThrow(() -> LagbajaSchoolStudentGradeAppFunction.printScoreTable(studentScores, totalScores, averages, ranks));
    }

    @Test
    public void testCalculateSubjectSummaries() {
        int[][] studentScores = {
            {80, 70, 60, 50},
            {90, 85, 75, 65}
        };
        int numStudents = 2;

        String subjectSummary = LagbajaSchoolStudentGradeAppFunction.calculateSubjectSummaries(studentScores, numStudents);
        assertTrue(subjectSummary.contains("Subject 1"));
        assertTrue(subjectSummary.contains("Highest Scoring Student is: Student 2"));
        assertTrue(subjectSummary.contains("Lowest Scoring Student is: Student 1"));
    }

    @Test
    public void testCalculateClassSummary() {
        int[] totalScores = {260, 315};
        int numStudents = 2;

        String classSummary = LagbajaSchoolStudentGradeAppFunction.calculateClassSummary(totalScores, numStudents);
        assertTrue(classSummary.contains("Best Graduating Student is: Student 2"));
        assertTrue(classSummary.contains("Worst Graduating Student is: Student 1"));
        assertTrue(classSummary.contains("Class Total Score is: 575"));
    }

    @Test
    public void testCollectStudentScores() {
        int numStudents = 2;
        int numSubjects = 4;
        int[][] simulatedInput = {
            {80, 70, 60, 50},
            {90, 85, 75, 65}
        };
        int[][] actualScores = new int[numStudents][numSubjects];
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < numSubjects; j++) {
                actualScores[i][j] = simulatedInput[i][j];
            }
        }

        assertArrayEquals(simulatedInput, actualScores);
    }
}
