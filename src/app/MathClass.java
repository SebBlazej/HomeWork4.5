package app;

import model.Line;
import model.Point;

class MathClass {

    MathClass(){

    }

    double getLineLenght(Line line){
        return Math.sqrt(Math.pow(line.getPointB().getX() - line.getPointA().getX(), 2) + Math.pow(line.getPointB().getY() - line.getPointA().getY(), 2));
    }

    boolean checkIfCanBuildTriangle(Point pointA, Point pointB, Point pointC){
        double lineLenghtAB = getLineLenght(new Line(pointA, pointB));
        double lineLenghtBC = getLineLenght(new Line(pointB, pointC));
        double lineLenghtCA = getLineLenght(new Line(pointC, pointA));
        if(lineLenghtAB > lineLenghtBC && lineLenghtAB > lineLenghtCA) return lineLenghtBC + lineLenghtAB > lineLenghtAB;
        else if(lineLenghtBC > lineLenghtAB &&  lineLenghtBC > lineLenghtCA) return lineLenghtAB + lineLenghtCA > lineLenghtBC;
        else return lineLenghtBC + lineLenghtCA > lineLenghtAB;

   }
}
