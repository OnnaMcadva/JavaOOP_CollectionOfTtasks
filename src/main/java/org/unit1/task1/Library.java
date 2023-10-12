package org.unit1.task1;


public class Library {
    // свойство для хранения результата работы одного из методов
    private int indMax = 0;
    // проверка ввода размерности
    static boolean conditionVerify(int n) {
        if (n <= 0) {
            System.out.println("Число должно быть больше 0.\n" +
                    "Попробуйте еще раз!\n");
            return false;
        }
        return true;
    }
    // создание + заполнение массива из случайных чисел
    static int[] generationArray(final int MIN, final int MAX, int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (MAX - MIN) + MIN);
        }
        return array;
    }
    // экземплярный метод
    int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i])
                min = array[i];
        }
        return min;
    }
    // экземплярный метод
    void maxIndex(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[indMax] <= array[i])
                indMax = i;
        }
    }
    // геттер для возвращения результата работы maxIndex()
    int getMaxInd() {
        return indMax;
    }
}
