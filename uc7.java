public class uc7 {/**
 * Use Case 5: Compact Array Initialization
 * Goal: Reduce verbosity by initializing the array and content in a single statement.
 */
public class OopsBannerCompact {
    public static void main(String[] args) {
        // Combining declaration and initialization using an array literal {}
        String[] banner = {
            String.join(" ", "  *** ", " *** ", "**** ", "**** "),
            String.join(" ", " * *", " * *", " * *", " * "),
            String.join(" ", " * *", " * *", " * *", " * "),
            String.join(" ", " * *", " * *", "**** ", " *** "),
            String.join(" ", " * *", " * *", " * ", "    *"),
            String.join(" ", " * *", " * *", " * ", "    *"),
            String.join(" ", "  *** ", " *** ", " * ", "**** ")
        };

        // Enhanced for-loop for rendering
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
    
}