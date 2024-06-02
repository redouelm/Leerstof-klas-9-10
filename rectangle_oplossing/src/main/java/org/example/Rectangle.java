package org.example;

public class Rectangle {

    private double length;
    private double width;
    private double area;

    public Rectangle(final double length, final double width){
        this.width = width;
        this.length = length;
        calculateArea();
    }

    private void calculateArea(){
        area = length * width;
    }

    public void setLength(final double length){
        this.length = length;
        calculateArea();
    }

    public void setWidth(final double width){
        this.width = width;
        calculateArea();
    }

    public double getArea(){
        return area;
    }
}
