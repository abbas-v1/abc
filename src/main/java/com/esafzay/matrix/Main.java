package com.esafzay.matrix;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Matrix matrix = new Matrix();

        matrix.getPoints().forEach(point -> System.out.println(point));
        System.out.println(Arrays.deepToString(matrix.getRectangle()));
        System.out.println("-----");

        matrix.add(2, 3);
        matrix.getPoints().forEach(point -> System.out.println(point));
        System.out.println(Arrays.deepToString(matrix.getRectangle()));
        System.out.println("-----");

        matrix.add(2, 4);
        matrix.getPoints().forEach(point -> System.out.println(point));
        System.out.println(Arrays.deepToString(matrix.getRectangle()));
        System.out.println("-----");

        matrix.add(1, 4);
        matrix.getPoints().forEach(point -> System.out.println(point));
        System.out.println(Arrays.deepToString(matrix.getRectangle()));
        System.out.println("-----");

        matrix.add(-2, 4);
        matrix.getPoints().forEach(point -> System.out.println(point));
        System.out.println(Arrays.deepToString(matrix.getRectangle()));
        System.out.println("-----");

        matrix.add(1, 2);
        matrix.getPoints().forEach(point -> System.out.println(point));
        System.out.println(Arrays.deepToString(matrix.getRectangle()));
        System.out.println("-----");

        matrix.add(1, -4);
        matrix.getPoints().forEach(point -> System.out.println(point));
        System.out.println(Arrays.deepToString(matrix.getRectangle()));
        System.out.println("-----");

        matrix.delete(1, -4);
        System.out.println("after delete");
        matrix.getPoints().forEach(point -> System.out.println(point));
        System.out.println(Arrays.deepToString(matrix.getRectangle()));
        System.out.println("-----");
    }
}
