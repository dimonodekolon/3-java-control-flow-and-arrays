package com.example.task13;

import java.util.Arrays;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(Arrays.toString(arr));

    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null || arr.length == 0) return arr;

        String str = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 1000) {
                str += arr[i] + " ";
            }
        }

        String[] a = str.split(" ");
        int[] arr2 = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            arr2[i] = Integer.parseInt(a[i]);
        }

        arr = arr2;
        return  arr;
    }

}