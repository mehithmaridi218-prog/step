public class uc6 {/**
 * Use Case 4: Modular ASCII Banner
 * Focus: Using Arrays to store data and Loops to decouple data from output.
 */
public class OopsBannerArray {
    public static void main(String[] args) {
        // Step 1: Declare a String array to hold the 7 lines of the banner
        String[] banner = new String[7];

        // Step 2: Populate each element using String.join() for internal efficiency
        banner[0] = String.join(" ", "  ", "***", " ", "***", " ", "****", " ", "****", " ");
        banner[1] = String.join(" ", " *", "  ", "*", "*", "  ", "*", "*", "   ", "*", "   ", "*");
        banner[2] = String.join(" ", " *", "  ", "*", "*", "  ", "*", "*", "   ", "*", "   ", "*");
        banner[3] = String.join(" ", " *", "  ", "*", "*", "  ", "*", "****", " ", "***", "  ");
        banner[4] = String.join(" ", " *", "  ", "*", "*", "  ", "*", "*", "   ", " ", "   ", " ");
        banner[5] = String.join(" ", " *", "  ", "*", "*", "  ", "*", "*", "   ", " ", "   ", " ");
        banner[6] = String.join(" ", "  ", "***", " ", "***", " ", "*", "   ", "****", " ");

        // Step 3: Use an enhanced for-loop (for-each) to iterate and print
        // This makes the code dry (Don't Repeat Yourself)
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
    
}
