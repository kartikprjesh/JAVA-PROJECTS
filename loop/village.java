public class village {

    // ANSI Colors
    static final String RESET = "\u001B[0m";
    static final String YELLOW = "\u001B[33m";
    static final String GREEN = "\u001B[32m";
    static final String BLUE = "\u001B[34m";
    static final String RED = "\u001B[31m";
    static final String WHITE = "\u001B[37m";
    static final String BROWN = "\u001B[38;5;94m";

    public static void main(String[] args) {

        printSunAndClouds();
        printBirds();
        printMountains();
        printVillage();
        printGround();

    }

    // SUN AND CLOUDS
    static void printSunAndClouds() {

        System.out.println(YELLOW +
                "       \\   |   /                          " +
                WHITE + "     @@@@@@@          @@@@@@@");

        System.out.println(YELLOW +
                "        \\  |  /                           " +
                WHITE + "   @@@@@@@@@@@      @@@@@@@@@@@");

        System.out.println(YELLOW +
                "      --- ☀ ---                          " +
                WHITE + "  @@@@@@@@@@@@@    @@@@@@@@@@@@@");

        System.out.println(YELLOW +
                "        / | \\                            " +
                WHITE + "   @@@@@@@@@@@      @@@@@@@@@@@");

        System.out.println(YELLOW +
                "       /  |  \\                           " +
                WHITE + "     @@@@@@@          @@@@@@@");

        System.out.println(RESET);
    }

    // BIRDS
    static void printBirds() {

        System.out.println(
                WHITE +
                "                         V     V                V     V"
        );

        System.out.println(
                "              V                                V"
        );

        System.out.println(RESET);
    }

    // MOUNTAINS
    static void printMountains() {

        System.out.println(WHITE +
                "                     /\\                   /\\");
        System.out.println(
                "                    /  \\                 /  \\");
        System.out.println(
                "           /\\      /    \\       /\\      /    \\");
        System.out.println(
                "          /  \\    /      \\     /  \\    /      \\");
        System.out.println(
                "         /    \\  /        \\   /    \\  /        \\");
        System.out.println(
                "________/______\\/__________\\_/______\\/__________\\______");

        System.out.println(RESET);
    }

    // VILLAGE
    static void printVillage() {

        // Trees
        System.out.println(GREEN +
                "      *****                               *****");
        System.out.println(
                "    *********                           *********");
        System.out.println(
                "   ***********                         ***********");

        // Roof
        System.out.println(RED +
                "              /\\                         /\\");
        System.out.println(
                "             /  \\                       /  \\");
        System.out.println(
                "            /    \\                     /    \\");
        System.out.println(
                "           /______\\                   /______\\");

        // Houses
        System.out.println(YELLOW +
                "           |      |                   |      |");
        System.out.println(
                "           | [] []|                   |[]  []|");
        System.out.println(
                "           |      |                   |      |");

        System.out.println(
                "           |  __  |                   |  __  |");

        System.out.println(
                "           | |  | |                   | |  | |");

        System.out.println(
                "___________|_|__|_|___________________|_|__|_|________");

        // Tree trunks
        System.out.println(BROWN +
                "      |||||                               |||||");
        System.out.println(
                "      |||||                               |||||");

        System.out.println(RESET);
    }

    // GRASS + ROAD + FLOWERS
    static void printGround() {

        for (int i = 0; i < 3; i++) {

            System.out.print(GREEN);

            for (int j = 0; j < 20; j++) {
                System.out.print("* ");
            }

            System.out.print(BROWN + "       ||       ");

            System.out.print(GREEN);

            for (int j = 0; j < 20; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Flowers
        System.out.println(
                YELLOW +
                "   *       *       *                 *       *       *"
        );

        System.out.println(
                GREEN +
                "   |       |       |                 |       |       |"
        );

        System.out.println(
                "___|_______|_______|_________________|_______|_______|___"
        );

        System.out.println(RESET);
    }
}
