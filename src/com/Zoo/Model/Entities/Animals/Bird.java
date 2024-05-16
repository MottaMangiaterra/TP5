package com.Zoo.Model.Entities.Animals;

import com.Zoo.Model.Entities.Abstracts.Animals;

public final class Bird extends Animals {

    private String subtype;

    public Bird(Float length, Float weight, Integer age, Integer id, String name) {
        super(length, weight, age, id, name);
        this.subtype = "Bird";
    }

    public String getSubtype() {
        return subtype;
    }

    @Override
    public String doAction() {
        return "Tweet";
    }
}
