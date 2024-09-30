
public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        
        int temp = 1;
        int startValue = 1;

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            temp = startValue;
            int bottom = n;

            // Inner loop for columns
            for (int j = 1; j <= n; j++) {
                if (i + j > n + 1) {
                    temp = temp + bottom;
                    System.out.print(temp + " ");
                    bottom--;
                } else {
                    System.out.print(temp + " ");
                    temp = temp + (i + j);
                }

                if (i + j == n + 1) {
                    temp = temp - (i + j);
                }
            }

            // Update the startValue for the next row
            startValue = startValue + i;
            bottom = n;
            System.out.println();
        }
    }
}
