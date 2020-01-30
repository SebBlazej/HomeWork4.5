package model;

public class Point {
    private double x;
    private double y;

    Point(){

    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public boolean isOnFirstQuarter(){
        return x>0 && y>0;
    }

    public boolean isOnSecondQuarter(){
        return x<0 && y>0;
    }

    public boolean isOnThirdQuarter(){
        return x<0 && y<0;
    }

    public boolean isOnFourthQuarter(){
        return x>0 && y<0;
    }


    public boolean isOnAxisX(){
        return x==0;
    }

    public boolean isOnAxisY(){
        return y==0;
    }

    public boolean isOnCenter(){
        return isOnAxisX() && isOnAxisY();
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
