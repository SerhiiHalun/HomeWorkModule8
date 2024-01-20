import controller.ControllerShape;
import model.*;

public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        Rhombus rhombus = new Rhombus();
        Ellipse ellipse = new Ellipse();

        ControllerShape controllerShape = new ControllerShape();

        controllerShape.inputShapeName(square);
        controllerShape.inputShapeName(triangle);
        controllerShape.inputShapeName(circle);
        controllerShape.inputShapeName(rhombus);
        controllerShape.inputShapeName(ellipse);
    }
}