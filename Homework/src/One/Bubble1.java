package One;
public class Bubble1 {
    public static void main(String[] args) {
        int[] arr2 = new int[10];
        int[] arr1 = new int[]{11, 89, 13, 3, 8, 43, 6, 8, 49, 0};
//создали массив с обратным порядком
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[arr1.length - 1 - i];
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
//        упорядочили по возрастанию
        for (int i = 0; i < arr2.length - 1; i++) {
            for (int j = 0; j < arr2.length - 1; j++) {
                if (arr2[j] > arr2[j + 1]) {
                    int b = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = b;
                }
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}