public class uc4 {/**
 * Use Case 4: Modular ASCII Banner
 * Focus: Data structures (Arrays) and Looping for reusability.
 */
public class OopsBannerArray {
    public static void main(String[] args) {
        // Step 1: Initialize the String array with 7 rows
        String[] banner = new String[7];

        // Step 2: Populate the array using String.join() for efficiency (from UC3)
        banner[0] = String.join(" ", "  ", "***", " ", "***", " ", "****", " ", "****", " ");
        banner[1] = String.join(" ", " *", "  ", "*", "*", "  ", "*", "*", "   ", "*", "   ", "*");
        banner[2] = String.join(" ", " *", "  ", "*", "*", "  ", "*", "*", "   ", "*", "   ", "*");
        banner[3] = String.join(" ", " *", "  ", "*", "*", "  ", "*", "****", " ", "***", "  ");
        banner[4] = String.join(" ", " *", "  ", "*", "*", "  ", "*", "*", "   ", " ", "   ", " ");
        banner[5] = String.join(" ", " *", "  ", "*", "*", "  ", "*", "*", "   ", " ", "   ", " ");
        banner[6] = String.join(" ", "  ", "***", " ", "***", " ", "*", "   ", "****", " ");

        // Step 3: Use an enhanced for-loop to render the banner
        // This decouples the data (the banner) from the action (printing)
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
    
}
