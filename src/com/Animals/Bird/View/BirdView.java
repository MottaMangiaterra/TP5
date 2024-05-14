package com.Animals.Bird.View;

import com.Animals.Bird.Model.Entities.Bird;

import java.util.Scanner;

public class BirdView {
    public Bird create(){
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

    public void read(Bird Bird){
        System.out.println("Name = "+Bird.getName());
        System.out.println("ID = "+Bird.getId());
        System.out.println("Age = "+Bird.getAge());
        System.out.println("Weight = "+Bird.getWeight());
        System.out.println("Length = "+Bird.getLength());
        System.out.println("Group = "+Bird.getGroup());
        System.out.println("Subtype = "+Bird.getSubtype());
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

    public void doAction(Bird Bird){
        System.out.println("The Bird = "+Bird.doAction());
    }
}

