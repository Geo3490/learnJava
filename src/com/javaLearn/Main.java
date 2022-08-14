package com.javaLearn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("What do You Choose for choice ?? ");
        System.out.println("Choose 1 = Dog || Choose 2 = Cat ");
        int choices = scanner.nextInt();

        if (choices == 1){
            animal = new Dog();
            animal.speak();

        }else if(choices == 2) {
            animal = new Cat();
            animal.speak();
        }else{
            System.out.println("Invalid Choose Again");
        }

    }
}
