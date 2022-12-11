package com.esafzay.matrix;

import java.util.ArrayList;
import java.util.List;

public class Matrix {

    private List<Point> points = new ArrayList<>();

    private int minX;
    private int minY;
    private int maxX;
    private int maxY;

    public Matrix() {
        initMinMax();
    }

    public void add(int pointX, int pointY) {
        points.add(new Point(pointX, pointY));
        updateMinMax(pointX, pointY);
    }

    public void delete(int pointX, int pointY) {

        points.remove(new Point(pointX, pointY));

        if (pointX == minX || pointX == maxX || pointY == minY || pointY == maxY) {

            initMinMax();

            for (Point point : points) {
                updateMinMax(point.x(), point.y());
            }
        }
    }

    public int[][] getRectangle() {
        return new int[][]{{minX, minY}, {maxX, maxY}};
    }

    public List<Point> getPoints() {
        return points;
    }

    private void initMinMax() {
        minX = Integer.MAX_VALUE;
        maxX = Integer.MIN_VALUE;
        minY = Integer.MAX_VALUE;
        maxY = Integer.MIN_VALUE;
    }

    private void updateMinMax(int pointX, int pointY) {
        if (pointX < minX) {
            minX = pointX;
        }

        if (pointX > maxX) {
            maxX = pointX;
        }

        if (pointY < minY) {
            minY = pointY;
        }

        if (pointY > maxY) {
            maxY = pointY;
        }
    }

    public static record Point(int x, int y) {
    }
}
