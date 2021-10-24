package ru.netology.Statistic.ru.netology;

public class statisticService {
    public static int sum(int[] items) {
        int result = 0;
        for (int item : items) {
            result += item;

        }
        return result;
    }
    public static int avg(int[] items) {
        return sum(items)/items.length;
        }

    public static int monthWithMax(int[] items) {
        int max = getMax(items);
        int monthCount = 0;
        int monthWithMax = 0;
        for (int item : items) {
            monthCount++;
            if (item == max){
                monthWithMax = monthCount;
            }
        }
        return monthWithMax;
    }
    public static int monthWithMin(int[] items) {
        int min = getMin(items);
        int monthCount = 0;
        int monthWithMax = 0;
        for (int item : items) {
            monthCount++;
            if (item == min){
                monthWithMax = monthCount;
            }
        }
        return monthWithMax;
    }
    public static int monthWithMoreThanAvg(int[] items) {
        int avg = avg(items);
        int monthCount = 0;
        for (int item : items) {
            if (item > avg){
                monthCount++;
            }
        }
        return monthCount;
    }
    public static int monthWithLessAvg(int[] items) {
        int avg = avg(items);
        int monthCount = 0;
        for (int item : items) {
            if (item < avg){
                monthCount++;
            }
        }
        return monthCount;
    }
    private static int getMax(int[] items) {
        int max = items[0];
        for (int item : items) {
            if (max < item){
                max = item;
            }
        }
        return max;
    }
    private static int getMin(int[] items) {
        int min = items[0];
        for (int item : items) {
            if (min > item){
                min = item;
            }
        }
        return min;
    }
}