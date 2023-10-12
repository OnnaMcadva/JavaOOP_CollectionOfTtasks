package org.unit1.task1;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        // ввод и проверка условий
        do {
            System.out.print("Введите натуральное число: ");
            n = in.nextInt();
        }
        while (Library.conditionVerify(n) == false);
        in.close();

        final int MIN = 0; // нижняя граница генерации
        final int MAX = 10; // верхняя граница генерации

        int[] a = Library.generationArray(MIN, MAX, n);
        System.out.println(Arrays.toString(a));
        Library obj = new Library();
        obj.maxIndex(a);
        System.out.println("Минимальное значение " + obj.min(a) + "\nИндекс последнего максимального " + obj.getMaxInd());
    }
}
