package ru.vsu.cs.ostroverkhov.console;

import ru.vsu.cs.ostroverkhov.utils.ArrayUtils;
import ru.vsu.cs.ostroverkhov.logic.FindingNotNullElementsBetweenNullElements;

public class Main {

    public static void main(String[] args) {
        int[] arr = ArrayUtils.readIntArrayFromConsole();
        int result = FindingNotNullElementsBetweenNullElements.findNotNullElementsBetweenNullElements(arr);
        System.out.println(result);
    }
}
