import java.util.HashMap;

public class MapCollection {

    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> map = new HashMap<>();

        // O
        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        // P
        map.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        // S
        map.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return map;
    }

    public static void displayBanner(String message, HashMap<Character, String[]> map) {

        int height = 5;

        for (int i = 0; i < height; i++) {

            for (char c : message.toCharArray()) {
                System.out.print(map.get(c)[i] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        HashMap<Character, String[]> map = createCharacterMap();

        displayBanner("OOPS", map);
    }
}