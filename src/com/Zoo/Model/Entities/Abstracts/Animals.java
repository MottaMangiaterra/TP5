package com.Zoo.Model.Entities.Abstracts;

public abstract class Animals {
    private Float length;
    private Float weight;
    private Integer age;
    private Integer id;
    private String name;

    public Animals(Float length, Float weight, Integer age, Integer id, String name) {
        this.length = length;
        this.weight = weight;
        this.age = age;
        this.id = id;
        this.name = name;
    }

    public Float getLength() {
        return length;
    }

    public void setLength(Float length) {
        this.length = length;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String doAction();
}
