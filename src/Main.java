public class Main {
    public static void main(String[] args) {
        /////// TASK 1
        for (int i = 0; i < 31; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        ////// TASK 2
        for (int i = 30; i >= 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        ////// TASK 3
        for (int i = 0; i <= 18; i = i +3) {
            System.out.print(i + " ");
        }

        System.out.println();

        ///// TASK 4
        for (int i = 10; i >= 0; i = i - 2) {
            System.out.print(i + " ");
        }

        //// TASK 5
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int y = 0; y < i+1; y++) {
                System.out.print("* ");
            }

        }

        // Adding this just to add spacing
        System.out.println();

        //// TASK 6
        for (int i = 5; i >= 0; i--) {
            System.out.println();
            for (int y = i; y >= 0; y--) {
                System.out.print("* ");
            }
        }

        // Adding this just to add spacing
        System.out.println();

        //// TASK 7
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int y = 0; y < 5; y++) {
                System.out.print("* ");
            }
        }

    }
}
