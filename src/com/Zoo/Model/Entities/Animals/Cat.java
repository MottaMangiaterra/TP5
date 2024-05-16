package com.Zoo.Model.Entities.Animals;

import com.Zoo.Model.Entities.Abstracts.Animals;

public final class Cat extends Animals {

    private String subtype;

    public Cat(Float length, Float weight, Integer age, Integer id, String name) {
        super(length, weight, age, id, name);
        this.subtype = "Cat";
    }

    public String getSubtype() {
        return subtype;
    }

    @Override
    public String doAction() {
        return "Meow";
    }
}

