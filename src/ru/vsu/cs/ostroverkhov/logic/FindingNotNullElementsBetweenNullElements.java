package ru.vsu.cs.ostroverkhov.logic;

public class FindingNotNullElementsBetweenNullElements {

    public static int findNotNullElementsBetweenNullElements(int[] arr) {
        int count = 0;
        int maxCount = 0;
        if (findNulls(arr)) {

            for (int i = findFirstNull(arr); i < arr.length; i++) {
                if (arr[i] == 0) {
                    if (count > maxCount) {
                        maxCount = count;
                    }
                    count = 0;
                } else {
                    count++;
                }
            }

            return maxCount;
        } else return -1;
    }


    public static int findFirstNull(int[] arr) {
        int i = 0;
        while (arr[i] != 0) {
            i++;
            if (i == arr.length) {
                return -1;
            }
        }
        return i;
    }


    public static boolean findNulls(int[] arr) {
        int n = 0;
        boolean result = true;
        for (int j : arr) {
            if (j == 0) n++;
        }
        if (n < 2) {
            result = false;
        }
        return result;
    }
}
