public class Main {
    public static void main(String[] args) {
        int n = 4;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int temp = sum + n;  // For odd rows, we will use this for decrementing
            
            // Use (i % 2) to determine whether to increment or decrement
            for (int j = 0; j < n; j++) {
                // When i is odd (1), it decrements; when even (0), it increments
                System.out.print((i % 2 == 0 ? ++sum : temp--) + " ");
            }
            // Update sum for the next row if the current row is odd
            sum += (i % 2 == 0) ? 0 : n; // Increment sum only for even rows

            System.out.println();
        }
        
    }
}
