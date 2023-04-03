package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void calculatePerimeter() {
        Triangle triangle = new Triangle(3,7,8);
        double result = triangle.calculatePerimeter();
        assertEquals(18.0,result,0.00001);


    }
}