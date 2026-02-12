package com.example.task04;

public class Line {

    private Point point1;
    private Point point2;

    public Point getP1() { return point1; }
    public Point getP2() { return point2; }

    public Line(Point point1, Point point2){
        this.point1 = point1;
        this.point2 = point2;
    }

    public double length () {
        return point1.distance(point2);
    }

    public double distance(Point point){
        return Math.abs((point2.getY() - point1.getY()) * point.getX() -
                        (point2.getX() - point1.getX()) * point.getY() +
                         point2.getX() * point1.getY() - point2.getY() *
                         point1.getX()) / this.length();
    }

    public String toString() {
        return String.format("(%d, %d)-(%d, %d)",
                point1.x, point1.y, point2.x, point2.y);
    }

    public boolean isCollinearLine(Point point) {
        return distance(point) == 0;
    }


}




