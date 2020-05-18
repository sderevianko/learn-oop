package rectangle;

import shape.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Rectangle extends Shape {
    List<Integer> rectanglePointX = new ArrayList<>();
    List<Integer> rectanglePointY = new ArrayList<>();

    public void initPointRectangle(){
        rectanglePointX.add(0);
        rectanglePointY.add(0);
        rectanglePointX.add(0);
        rectanglePointY.add(100);
        rectanglePointX.add(100);
        rectanglePointY.add(0);
        rectanglePointX.add(100);
        rectanglePointY.add(100);

        for (int i = 0; i <= 3; i++){
            System.out.print(rectanglePointX.get(i));
            System.out.print(" ");
            System.out.println(rectanglePointY.get(i));
        }
    }

    @Override
    public void draw(){
        System.out.println("Rectangle");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Objects.equals(rectanglePointX, rectangle.rectanglePointX) &&
            Objects.equals(rectanglePointY, rectangle.rectanglePointY);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rectanglePointX, rectanglePointY);
    }
}
