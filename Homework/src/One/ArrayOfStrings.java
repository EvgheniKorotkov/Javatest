package One;

import java.util.*;

public class ArrayOfStrings {
    public static void main(String[] args) {
        String[] strArr = new String[10];
        Set<Integer> setDup = new HashSet<>();
        List<String> strs = Arrays.asList("one", "two", "three", "four", "five");
        Random rand = new Random();
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = strs.get(rand.nextInt(5));
            System.out.print(strArr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < strArr.length; i++) {
            for (int j = i + 1; j < strArr.length; j++) {
                boolean test = strArr[i].equals(strArr[j]);
                if (test) {
                    setDup.add(i);
                    setDup.add(j);
                    System.out.print(strArr[j] + " ");
                }
            }
        }
        System.out.println("set");
        System.out.print(setDup + " ");
        String[] strarrD = new String[setDup.size()];
        String[] strarrU = new String[strArr.length - setDup.size()];

        int dIt = 0, uIt = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (setDup.contains(i)) {
                strarrD[dIt] = strArr[i];
                dIt++;
            } else {
                strarrU[uIt] = strArr[i];
                uIt++;
            }
        }
        System.out.println();
        System.out.println("duplicate:");
        for (int i = 0; i < strarrD.length; i++) {
            System.out.print(strarrD[i] + " ");
        }
        System.out.println();
        System.out.println("unic:");
        for (int i = 0; i < strarrU.length; i++) {
            System.out.print(strarrU[i] + " ");
        }
        System.out.println();
    }
}