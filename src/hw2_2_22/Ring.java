package hw2_2_22;

import universal.Stack;

import java.util.Scanner;

public class Ring {
    private String color;
    private double size;

    public Ring(String color, double size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String toString() {
        return ((Double)size).toString();
    }

    public static void game(Stack<Ring> stack) {
        String color;
        Ring ring;
        Scanner reader = new Scanner(System.in);
        double size = reader.nextDouble();
        while (size != -999) {
            color = "pink";
            ring = new Ring(color, size);
            insertRings(stack, ring);
            size = reader.nextDouble();
        }
    }

    public static void insertRings(Stack<Ring> stack, Ring ring) {
        Ring temp;
        if (stack.isEmpty()) {
            stack.push(ring);
        }
        else if (stack.top().getSize() < ring.getSize()) {
            stack.push(ring);
        }
        else {
            temp = stack.pop();
            insertRings(stack, ring);
            stack.push(temp);
        }
    }

    public static void main(String[] args) {
        Stack<Ring> stack = new Stack<>();
        game(stack);
        System.out.println(stack);
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(5);
        stack1.push(7);
        System.out.println(stack1);
    }
}
