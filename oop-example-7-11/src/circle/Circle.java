package circle;

import shape.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.lang.Math.*;

public class Circle extends Shape {
    List<Double> circlePointX = new ArrayList<>();
    List<Integer> circlePointY = new ArrayList<>();

    public void initPointCircle(){
        int radius = 20;
        double calculation = 1.3;
        double x = 1;
        for (int i = 0; i <= 20; i++) {
            circlePointY.add(i);
            calculation = sqrt(pow(radius, 2) - pow(circlePointY.get(i), 2));
            circlePointX.add(calculation);
            circlePointY.add(i);
            circlePointX.add(-calculation);
            circlePointY.add(-i);
            circlePointX.add(calculation);
            circlePointY.add(-i);
            circlePointX.add(-calculation);
            System.out.print(circlePointX.get(i));
            System.out.print(" ");
            System.out.println(circlePointY.get(i));
        }
    }

    @Override
    public void draw(){
        System.out.println("Circle");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Objects.equals(circlePointX, circle.circlePointX) &&
            Objects.equals(circlePointY, circle.circlePointY);
    }

    @Override
    public int hashCode() {
        return Objects.hash(circlePointX, circlePointY);
    }
}
