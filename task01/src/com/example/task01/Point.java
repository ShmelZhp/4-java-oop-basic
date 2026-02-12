package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    void flip(){

        int temp = x;

        x = -y;
        y = -temp;
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
