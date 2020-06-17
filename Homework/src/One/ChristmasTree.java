package One;
public class ChristmasTree {
    public static void main(String[] args) {
        char[][] arr1 = new char[15][15];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[i][j] = ' ';
            }
        }
        int centralelement = Math.round((arr1.length - 1) / 2);
        for (int i = 0; i < arr1.length; i++) {
            for (int j = (centralelement - (i - 1) / 2); j < (centralelement + (i + 1) / 2); j++) {
                arr1[i][j] = '^';
            }
        }
        for (int i = 1; i < arr1.length; i++) {
            System.out.println();
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[i][j]);
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[i][j] = ' ';
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = arr1.length / 2 - 2; j < arr1.length / 2 + 2; j++) {
                arr1[i][j] = 'V';
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[i][j]);
            }
        }
    }
}