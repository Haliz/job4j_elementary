package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int n = 0; n < data.length - 1; n ++) {
            int min = MinDiapason.findMin(data, n, data.length - 1);
            int index = FindLoop.indexOf(data, min, n, data.length - 1);
            if (data[n] > min) {
                int temp = data[n];
                data[n] = data[index];
                data[index] = temp;
            }
        }
        return data;
    }

}
