/**
 * OOPSBannerApp UC6 – OOPS Banner Application (Modular Approach)
 * Each letter pattern is generated using a separate method.
 */

public class StaticFunctions {

    // Method to generate the pattern for letter 'O'
    public static String[] getOPattern() {
        return new String[] {
            "  ***  ",
            " *   * ",
            " *   * ",
            " *   * ",
            " *   * ",
            " *   * ",
            "  ***  "
        };
    }

    // Method to generate the pattern for letter 'P'
    public static String[] getPPattern() {
        return new String[] {
            " ***** ",
            " *   * ",
            " *   * ",
            " ***** ",
            " *     ",
            " *     ",
            " *     "
        };
    }

    // Method to generate the pattern for letter 'S'
    public static String[] getSPattern() {
        return new String[] {
            " ***** ",
            " *     ",
            " *     ",
            "  ***  ",
            "     * ",
            "     * ",
            " ***** "
        };
    }

    // Main method
    public static void main(String[] args) {

        // Get patterns from methods
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Loop to assemble and print "OOPS"
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                oPattern[i] + "  " +
                oPattern[i] + "  " +
                pPattern[i] + "  " +
                sPattern[i]
            );
        }
    }
}