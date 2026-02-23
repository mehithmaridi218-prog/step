public class uc8 {/**
 * Use Case 6: Modular ASCII Banner with Static Methods
 * Focus: Abstraction and code reuse by encapsulating patterns in helper methods.
 */
public class OopsBannerModular {

    public static void main(String[] args) {
        // Build the banner by calling static methods for each row index (0-6)
        String[] banner = new String[7];
        
        for (int i = 0; i < 7; i++) {
            banner[i] = String.join(" ", getLetterO(i), getLetterO(i), getLetterP(i), getLetterS(i));
        }

        // Render the banner
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Returns the specific slice of letter 'O' for a given row
    public static String getLetterO(int row) {
        String[] pattern = {
            "  *** ", " * *", " * *", " * *", " * *", " * *", "  *** "
        };
        return pattern[row];
    }

    // Returns the specific slice of letter 'P' for a given row
    public static String getLetterP(int row) {
        String[] pattern = {
            " **** ", " * *", " * *", " **** ", " * ", " * ", " * "
        };
        return pattern[row];
    }

    // Returns the specific slice of letter 'S' for a given row
    public static String getLetterS(int row) {
        String[] pattern = {
            " **** ", " * ", " * ", "  *** ", "     *", "     *", " **** "
        };
        return pattern[row];
    }
}
    
}
