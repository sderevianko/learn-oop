package application;

import circle.Circle;
import rectangle.Rectangle;

public class Main {

    public static void main(String[] args) {
	    Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        rectangle.draw();
        circle.draw();
        rectangle.initPointRectangle();
        //circle.initPointCircle();


    }
}
