package com.example.task04;

/**
 * Класс точки на плоскости
 */
public class Point {
    final int x;
    final int y;

    public int getX() {return x; }
    public int getY() { return y; }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    double distance(Point point){
        double distanceX = this.x - point.x;
        double distanceY = this.y - point.y;

        return Math.sqrt(distanceX*distanceX + distanceY*distanceY);
    }

    public String toString(){
        return "(" + x + "," + y +")";
    }
}
