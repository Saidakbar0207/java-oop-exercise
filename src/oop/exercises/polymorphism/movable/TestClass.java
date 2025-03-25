package oop.exercises.polymorphism.movable;

public class TestClass {
    public static void main(String[] args) {
        MovablePoint movablePoint= new MovablePoint(100,200,30,40);
        movablePoint.moveUp();
        movablePoint.moveDown();
        movablePoint.moveLeft();
        movablePoint.moveRight();
        System.out.println(movablePoint.toString());

    }
}
