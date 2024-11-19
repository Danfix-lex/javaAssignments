public class EmployersWorkingHours {
    public static void main(String[] args) {
        int[][] hours = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9}
        };

        int[][] employeeHours = new int[hours.length][2];
        for (int i = 0; i < hours.length; i++) {
            int total = 0;
            for (int j = 0; j < hours[i].length; j++) {
                total += hours[i][j];
            }
            employeeHours[i][0] = i;
            employeeHours[i][1] = total;
        }

        for (int i = 0; i < employeeHours.length - 1; i++) {
            for (int j = 0; j < employeeHours.length - i - 1; j++) {
                if (employeeHours[j][1] > employeeHours[j + 1][1]) {
                    int[] temp = employeeHours[j];
                    employeeHours[j] = employeeHours[j + 1];
                    employeeHours[j + 1] = temp;
                }
            }
        }

        for (int[] employee : employeeHours) {
            System.out.println("Employee " + employee[0] + ": " + employee[1] + " hours");
        }
    }
}

