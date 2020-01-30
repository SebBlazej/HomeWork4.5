package model;


public class Line {
    private Point pointA;
    private Point pointB;

    Line(){

    }

    public Line(Point pointA, Point pointB){
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public double getLineLenght(){
        return Math.sqrt(Math.pow(pointB.getX() - pointA.getX(), 2) + Math.pow(pointB.getY() - pointA.getY(), 2));
    }

    public Point getPointA() {
        return pointA;
    }

    public Point getPointB() {
        return pointB;
    }
}
