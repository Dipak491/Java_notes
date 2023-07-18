public class PatternDemo {

    public static void main(String[] args) {

        int i, j;
        int row = 6;

        for (i = 0; i < row; i++) {
            for (j = 0; j < row; j++) {
                if (i == 0 || j == 0 || i == row - 1 || j == row - 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

}