package com.Animals.Dog.Model.Entities;

import com.Animals.Abstracts.Animals;

public final class Dog extends Animals {

    private String subtype;

    public Dog(Float length, Float weight, Integer age, Integer id, String name) {
        super(length, weight, age, id, name);
        this.subtype = "Dog";
    }

    public String getSubtype() {
        return subtype;
    }

    @Override
    public String doAction() {
        return "Bark";
    }
}
