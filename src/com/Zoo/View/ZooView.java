package com.Zoo.View;

import com.Zoo.Model.Entities.Abstracts.Animals;
import com.Zoo.Model.Entities.Animals.Bird;
import com.Zoo.Model.Entities.Animals.Cat;
import com.Zoo.Model.Entities.Animals.Dog;

import java.util.Scanner;

public class ZooView {
    public Dog createDog(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Set the name:");
        String name = scanner.next();

        System.out.println("Set the length:");
        Float length = scanner.nextFloat();

        System.out.println("Set the weight:");
        Float weight = scanner.nextFloat();

        System.out.println("Set the age:");
        Integer age = scanner.nextInt();

        System.out.println("Set the ID:");
        Integer ID = scanner.nextInt();


        return new Dog(length,weight,age,ID,name);
    }

    public Cat createCat(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Set the name:");
        String name = scanner.next();

        System.out.println("Set the length:");
        Float length = scanner.nextFloat();

        System.out.println("Set the weight:");
        Float weight = scanner.nextFloat();

        System.out.println("Set the age:");
        Integer age = scanner.nextInt();

        System.out.println("Set the ID:");
        Integer ID = scanner.nextInt();

        return new Cat(length,weight,age,ID,name);
    }

    public Bird createBird(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Set the name:");
        String name = scanner.next();

        System.out.println("Set the length:");
        Float length = scanner.nextFloat();

        System.out.println("Set the weight:");
        Float weight = scanner.nextFloat();

        System.out.println("Set the age:");
        Integer age = scanner.nextInt();

        System.out.println("Set the ID:");
        Integer ID = scanner.nextInt();

        return new Bird(length,weight,age,ID,name);
    }

    public void read(Animals animals){
        System.out.println("Name = "+animals.getName());
        System.out.println("ID = "+animals.getId());
        System.out.println("Age = "+animals.getAge());
        System.out.println("Weight = "+animals.getWeight());
        System.out.println("Length = "+animals.getLength());
        System.out.println(animals.doAction());
    }

    public void check(boolean c){
        if (c){
            System.out.println("The changes went successfully");
        }else {
            System.out.println("An error ocurred");
        }
    }

    public Integer enterID(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the ID parameter: ");

        return scanner.nextInt();
    }

    public Integer choseurclass(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the animal type: ");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Bird");

        return scanner.nextInt();
    }

    public void doAction(Animals animal){
        System.out.println(animal.doAction());
    }
}

