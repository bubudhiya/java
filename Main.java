public class Pattern {
    public static void main(String[] args) {
        int n = 3;
        int startValue = 1;
        int temp;

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            temp = startValue;
            int bottom = n;

            // Inner loop for columns
            for (int j = 1; j <= n; j++) {
                // Calculate the increment without conditions
                int increment = (i + j <= n + 1) ? (i + j) : bottom--;

                // Print the current value and update temp
                System.out.print(temp + " ");
                temp += increment;
            }

            // Update startValue for the next row
            startValue += i;
            System.out.println();
        }
    }
}
