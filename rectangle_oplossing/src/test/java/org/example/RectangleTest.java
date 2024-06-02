package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getArea_WidthChangedAfterCtor_AreaChanged() {
        //Arrange
        Rectangle r = new Rectangle(10,5);
        //r.length =5;
        r.setLength(5);

        //Act
        double area = r.getArea();

        //Assert
        assertEquals(25, area);
    }
}