public class uc3 {/**
 * Use Case 3: Optimized ASCII Banner
 * Focus: Memory efficiency using String.join() instead of the '+' operator.
 */
public class OopsBannerRefactored {
    public static void main(String[] args) {
        // Line 1
        System.out.println(String.join(" ", " ", "***", "***", "****", "****", ""));
        // Line 2
        System.out.println(String.join(" ", "*", " ", "*", "*", " ", "*", "*", " ", "*", "*", " ", ""));
        // Line 3
        System.out.println(String.join(" ", "*", " ", "*", "*", " ", "*", "*", " ", "*", "*", " ", ""));
        // Line 4
        System.out.println(String.join(" ", "*", " ", "*", "*", " ", "*", "****", "***", " "));
        // Line 5
        System.out.println(String.join(" ", "*", " ", "*", "*", " ", "*", "*", " ", " ", " ", " "));
        // Line 6
        System.out.println(String.join(" ", "*", " ", "*", "*", " ", "*", "*", " ", " ", " ", " "));
        // Line 7
        System.out.println(String.join(" ", " ", "***", "***", "*", " ", "****", ""));
    }
}
    
}
