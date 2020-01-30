package app;

import model.Line;
import model.Point;

public class TestClass {
    public static void main(String[] args){
        Point pointA = new Point(10,15);
        Point pointC = new Point(10, 0);
        Point pointB = new Point(0,0);

        System.out.println("A(" + pointA.getX() + "," + pointA.getY() + ")");
        System.out.println("Czy punkt jest w pierwszej ćwiartce - " + pointA.isFirstQuarter());
        System.out.println("Czy punkt jest w drugiej ćwiartce - " + pointA.isSecondQuarter());
        System.out.println("Czy punkt jest w trzeciej ćwiartce - " + pointA.isThirdQuarter());
        System.out.println("Czy punkt jest w czwartej ćwiartce - " + pointA.isFourthQuarter());
        System.out.println("Czy jest na osi x - " + pointA.isOnAxisX());
        System.out.println("Czy jest na osi y - " + pointA.isOnAxisY());
        System.out.println("Czy punkt jest na środku układu - " + pointA.isCenter());
        System.out.println();
        System.out.println("B(" + pointB.getX() + "," + pointB.getY() + ")");
        System.out.println("Czy punkt jest w pierwszej ćwiartce - " + pointB.isFirstQuarter());
        System.out.println("Czy punkt jest w drugiej ćwiartce - " + pointB.isSecondQuarter());
        System.out.println("Czy punkt jest w trzeciej ćwiartce - " + pointB.isThirdQuarter());
        System.out.println("Czy punkt jest w czwartej ćwiartce - " + pointB.isFourthQuarter());
        System.out.println("Czy jest na osi x - " + pointB.isOnAxisX());
        System.out.println("Czy jest na osi y - " + pointB.isOnAxisY());
        System.out.println("Czy punkt jest na środku układu - " + pointB.isCenter());
        System.out.println();
        System.out.println("C(" + pointC.getX() + "," + pointC.getY() + ")");
        System.out.println("Czy punkt jest w pierwszej ćwiartce - " + pointC.isFirstQuarter());
        System.out.println("Czy punkt jest w drugiej ćwiartce - " + pointC.isSecondQuarter());
        System.out.println("Czy punkt jest w trzeciej ćwiartce - " + pointC.isThirdQuarter());
        System.out.println("Czy punkt jest w czwartej ćwiartce - " + pointC.isFourthQuarter());
        System.out.println("Czy jest na osi x - " + pointC.isOnAxisX());
        System.out.println("Czy jest na osi y - " + pointC.isOnAxisY());
        System.out.println("Czy punkt jest na środku układu - " + pointC.isCenter());
        System.out.println();


        MathClass mathClass = new MathClass();

        Line lineAB = new Line(pointA, pointB);
        Line lineAC = new Line(pointA, pointC);
        Line lineCB = new Line(pointC, pointB);

        System.out.println("Dlugosc odcinka AB policzona klasą MathClass - " + mathClass.getLineLenght(lineAB));
        System.out.println("Dlugosc odcinka AB policzona klasą Line - " + lineAB.getLineLenght());
        System.out.println();
        System.out.println("Dlugosc odcinka AC policzona klasą MathClass - " + mathClass.getLineLenght(lineAC));
        System.out.println("Dlugosc odcinka AC policzona klasą Line - " + lineAC.getLineLenght());
        System.out.println();
        System.out.println("Dlugosc odcinka CB policzona klasą MathClass - " + mathClass.getLineLenght(lineCB));
        System.out.println("Dlugosc odcinka AC policzona klasą Line - " + lineCB.getLineLenght());
        System.out.println();
        System.out.println("Można z tych punktów zbudować trójkąt - " + mathClass.checkIfCanBuildTriangle(pointA, pointB, pointC));



    }

}
