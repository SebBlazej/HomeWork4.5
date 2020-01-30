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

    public boolean isFirstQuarter(){
        return x>0 && y>0;
    }

    public boolean isSecondQuarter(){
        return x<0 && y>0;
    }

    public boolean isThirdQuarter(){
        return x<0 && y<0;
    }

    public boolean isFourthQuarter(){
        return x>0 && y<0;
    }


    public boolean isOnAxisX(){
        return x==0;
    }

    public boolean isOnAxisY(){
        return y==0;
    }

    public boolean isCenter(){
        return isOnAxisX() && isOnAxisY();
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
