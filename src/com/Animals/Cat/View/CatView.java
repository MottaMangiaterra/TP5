package com.Animals.Cat.View;

import com.Animals.Cat.Model.Entities.Cat;

import java.util.Scanner;

public class CatView {
    public Cat create(){
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

    public void read(Cat Cat){
        System.out.println("Name = "+Cat.getName());
        System.out.println("ID = "+Cat.getId());
        System.out.println("Age = "+Cat.getAge());
        System.out.println("Weight = "+Cat.getWeight());
        System.out.println("Length = "+Cat.getLength());
        System.out.println("Group = "+Cat.getGroup());
        System.out.println("Subtype = "+Cat.getSubtype());
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

    public void doAction(Cat Cat){
        System.out.println("The Cat = "+Cat.doAction());
    }
}
