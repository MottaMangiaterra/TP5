package com.Animals.Dog.View;

import com.Animals.Dog.Model.Entities.Dog;

import java.util.Scanner;

public class DogView {
    public Dog create(){
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

    public void read(Dog dog){
        System.out.println("Name = "+dog.getName());
        System.out.println("ID = "+dog.getId());
        System.out.println("Age = "+dog.getAge());
        System.out.println("Weight = "+dog.getWeight());
        System.out.println("Length = "+dog.getLength());
        System.out.println("Group = "+dog.getGroup());
        System.out.println("Subtype = "+dog.getSubtype());
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

    public void doAction(Dog dog){
        System.out.println("The dog = "+dog.doAction());
    }
}
