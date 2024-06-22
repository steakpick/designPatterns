package org.example.structural.decorator.dec;

import org.example.structural.decorator.shape.Shape;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw(){
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape shape) {
        System.out.println("Border Color: Red");
    }
}
