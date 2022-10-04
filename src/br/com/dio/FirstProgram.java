package br.com.dio;

import br.com.dio.model.Cat;

public class FirstProgram {
    public static void main(String[] args) {
        System.out.println("Main function inside FirstProgram class");

        int a = 5;
        int b = 8;
        int sum = a + b;
        System.out.println("Sum example: a = " + a + ", b = " + b + ", sum = " + sum + "\n");

        System.out.println("Using the Cat class, and its parameters and functions, including getters and setters:");

        Cat cat = new Cat("Pancake", "Yellow", 5);
        System.out.println("Cat initial values:"
                + " name = " + cat.getName()
                + ", color = " + cat.getColor()
                + ", age = " + cat.getAge()
        );

        cat.setName("Skittles");
        cat.setColor("Black");
        cat.setAge(10);

        System.out.println("Cat final values:"
                + " name = " + cat.getName()
                + ", color = " + cat.getColor()
                + ", age = " + cat.getAge()
                + "\n"
        );
    }
}
