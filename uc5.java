public class uc5 {/**
 * Use Case 5: Compact ASCII Banner
 * Focus: Array Initialization with nested String.join() calls.
 */
public class OopsBannerInitialised {
    public static void main(String[] args) {
        // Combining declaration, allocation, and initialization in one statement
        String[] banner = {
            String.join(" ", "  ", "***", " ", "***", " ", "****", " ", "****", " "),
            String.join(" ", " *", "  ", "*", "*", "  ", "*", "*", "   ", "*", "   ", "*"),
            String.join(" ", " *", "  ", "*", "*", "  ", "*", "*", "   ", "*", "   ", "*"),
            String.join(" ", " *", "  ", "*", "*", "  ", "*", "****", " ", "***", "  "),
            String.join(" ", " *", "  ", "*", "*", "  ", "*", "*", "   ", " ", "   ", " "),
            String.join(" ", " *", "  ", "*", "*", "  ", "*", "*", "   ", " ", "   ", " "),
            String.join(" ", "  ", "***", " ", "***", " ", "*", "   ", "****", " ")
        };

        // Render using the enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
            
        }
    }
}
    
}
