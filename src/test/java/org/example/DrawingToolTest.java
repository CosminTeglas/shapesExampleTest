package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrawingToolTest {
    @Test
    void givenSpecificShapeShouldAddShapeToList() {
        //given
        DrawingTool drawingTool = new DrawingTool();
        Circle circle = new Circle(10);
        //when
        drawingTool.addShape(circle);
        //then
        Circle circleInList = (Circle) drawingTool.shapeList.iterator().next();
        assertEquals(1, drawingTool.shapeList.size());
        assertEquals(circle.getRadius(), circleInList.getRadius());
    }

    @Test
    void givenTwoSpecificShapesShouldAddShapeToList() {
        //given
        DrawingTool drawingTool = new DrawingTool();
        Circle circle = new Circle(10);
        Triangle triangle = new Triangle(5, 6, 7);
        //when
        drawingTool.addShape(circle);
        drawingTool.addShape(triangle);
        //then
        assertEquals(2, drawingTool.shapeList.size());
    }

    @Test
    void givenTwoDuplicatedShapesShouldNotAddShapeToList() {
        //given
        DrawingTool drawingTool = new DrawingTool();
        Circle circle = new Circle(10);
        Circle circle2 = new Circle(10);

        //when
        drawingTool.addShape(circle);
        drawingTool.addShape(circle2);
        //then
        assertEquals(1, drawingTool.shapeList.size());
    }


    @Test
    void calculateTotalPerimeter() {
        //given
        DrawingTool drawingTool = new DrawingTool();
        Circle circle = new Circle(10);
        Circle circle2 = new Circle(15);
        //when
        drawingTool.addShape(circle);
        drawingTool.addShape(circle2);
        //then
        assertEquals(157.07963267948963,drawingTool.calculateTotalPerimeter(),0.000001);

    }

    @Test
    void calculateTotalSurface() {
        //given
        DrawingTool drawingTool = new DrawingTool();
        Circle circle = new Circle(10);
        Circle circle2 = new Circle(15);
        //when
        drawingTool.addShape(circle);
        drawingTool.addShape(circle2);
        //then
        assertEquals(1021.0176124166828,drawingTool.calculateTotalSurface(),0.000001);
    }
    @Test
    void calculateTotalSurfaceAllShapes() {
        //given
        DrawingTool drawingTool = new DrawingTool();
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(3D, 4D);
        Square square = new Square(5);
        //when
        drawingTool.addShape(circle);
        drawingTool.addShape(rectangle);
        drawingTool.addShape(square);
        //then
        assertEquals(351.1592653589793,drawingTool.calculateTotalSurface(),0.00001);

    }
}