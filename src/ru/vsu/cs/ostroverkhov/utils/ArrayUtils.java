package ru.vsu.cs.ostroverkhov.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ArrayUtils {
    public static int[] toPrimitive(Integer[] arr) {
        if (arr == null) {
            return null;
        }
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    public static int[] toIntArray(String str) {
        Scanner scanner = new Scanner(str);
        scanner.useLocale(Locale.ROOT);
        scanner.useDelimiter("(\\s|[,;])+");
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }

        Integer[] arr = list.toArray(new Integer[0]);
        return ArrayUtils.toPrimitive(arr);
    }

    public static int[] readIntArrayFromConsole() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.printf("Input array:%n");
                String line = scanner.nextLine();
                return toIntArray(line);
            } catch (Exception e) {
                System.out.print("You made a mistake, try again! ");
            }
        }
    }
}

