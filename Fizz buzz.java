public class FizzBuzz {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 100; i++) {
            
            // Check for both 3 and 5 FIRST
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            } 
            // Then check for 3
            else if (i % 3 == 0) {
                System.out.println("fizz");
            } 
            // Then check for 5
            else if (i % 5 == 0) {
                System.out.println("buzz");
            } 
            else {
                System.out.println(i);
            }
            
        }
    }
}