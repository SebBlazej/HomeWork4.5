package app;

import model.Line;
import model.Point;

public class TestClass {
    public static void main(String[] args){
        Point pointA = new Point(10,15);
        Point pointC = new Point(10, 0);
        Point pointB = new Point(0,0);

        System.out.println("A(" + pointA.getX() + "," + pointA.getY() + ")");
        System.out.println("Punkt jest w pierwszej ćwiartce - " + pointA.isOnFirstQuarter());
        System.out.println("Punkt jest w drugiej ćwiartce - " + pointA.isOnSecondQuarter());
        System.out.println("Punkt jest w trzeciej ćwiartce - " + pointA.isOnThirdQuarter());
        System.out.println("Punkt jest w czwartej ćwiartce - " + pointA.isOnFourthQuarter());
        System.out.println("Punkt jest na osi x - " + pointA.isOnAxisX());
        System.out.println("Punkt jest na osi y - " + pointA.isOnAxisY());
        System.out.println("Punkt jest na środku układu - " + pointA.isOnCenter());
        System.out.println();
        System.out.println("B(" + pointB.getX() + "," + pointB.getY() + ")");
        System.out.println("Punkt jest w pierwszej ćwiartce - " + pointB.isOnFirstQuarter());
        System.out.println("Punkt jest w drugiej ćwiartce - " + pointB.isOnSecondQuarter());
        System.out.println("Punkt jest w trzeciej ćwiartce - " + pointB.isOnThirdQuarter());
        System.out.println("Punkt jest w czwartej ćwiartce - " + pointB.isOnFourthQuarter());
        System.out.println("Punkt jest na osi x - " + pointB.isOnAxisX());
        System.out.println("Punkt jest na osi y - " + pointB.isOnAxisY());
        System.out.println("Punkt jest na środku układu - " + pointB.isOnCenter());
        System.out.println();
        System.out.println("C(" + pointC.getX() + "," + pointC.getY() + ")");
        System.out.println("Punkt jest w pierwszej ćwiartce - " + pointC.isOnFirstQuarter());
        System.out.println("Punkt jest w drugiej ćwiartce - " + pointC.isOnSecondQuarter());
        System.out.println("Punkt jest w trzeciej ćwiartce - " + pointC.isOnThirdQuarter());
        System.out.println("Punkt jest w czwartej ćwiartce - " + pointC.isOnFourthQuarter());
        System.out.println("Punkt jest na osi x - " + pointC.isOnAxisX());
        System.out.println("Punkt jest na osi y - " + pointC.isOnAxisY());
        System.out.println("Punkt jest na środku układu - " + pointC.isOnCenter());
        System.out.println();


        MathClass mathClass = new MathClass();

        Line lineAB = new Line(pointA, pointB);
        Line lineAC = new Line(pointA, pointC);
        Line lineCB = new Line(pointC, pointB);

        System.out.println("Dlugosc odcinka AB policzona klasą MathClass - " + mathClass.countLineLenght(lineAB));
        System.out.println("Dlugosc odcinka AB policzona klasą Line - " + lineAB.countLineLenght());
        System.out.println();
        System.out.println("Dlugosc odcinka AC policzona klasą MathClass - " + mathClass.countLineLenght(lineAC));
        System.out.println("Dlugosc odcinka AC policzona klasą Line - " + lineAC.countLineLenght());
        System.out.println();
        System.out.println("Dlugosc odcinka CB policzona klasą MathClass - " + mathClass.countLineLenght(lineCB));
        System.out.println("Dlugosc odcinka AC policzona klasą Line - " + lineCB.countLineLenght());
        System.out.println();
        System.out.println("Można z tych punktów zbudować trójkąt - " + mathClass.checkIfCanBuildTriangle(pointA, pointB, pointC));



    }

}
