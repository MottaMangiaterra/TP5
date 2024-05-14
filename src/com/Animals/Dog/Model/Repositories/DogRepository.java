package com.Animals.Dog.Model.Repositories;

import com.Animals.Dog.Model.Entities.Dog;
import com.Interfaces.CRUD;

import java.util.ArrayList;

public class DogRepository implements CRUD <Dog> {

    private ArrayList <Dog> dogArrayList;

    public DogRepository() {
        this.dogArrayList = new ArrayList<>();
    }

    @Override
    public boolean create(Dog dog) {
        boolean check = false;

        this.dogArrayList.add(dog);

        if (this.dogArrayList.contains(dog)) {
            check = true;
        }

        return check;
    }

    @Override
    public Dog read(Integer ID) {
        return this.dogArrayList.get(searchByID(ID));
    }

    @Override
    public boolean update(Integer ID, Dog updatedobject) {
        boolean check = false;

        if (searchByID(ID) != null){
            this.dogArrayList.set(searchByID(ID),updatedobject);
            check = true;
        }

        return check;
    }

    @Override
    public boolean delete(Integer ID) {
        boolean check = false;

        if (this.dogArrayList.get(searchByID(ID)) != null){
            this.dogArrayList.remove(this.dogArrayList.get(searchByID(ID)));
            check = true;
        }

        return true;
    }

    public Integer searchByID(Integer id){
        Integer index = null;

        if(!this.dogArrayList.isEmpty()){
            for (Dog p:this.dogArrayList){
                if (p.getId().equals(id)) {
                    index = this.dogArrayList.indexOf(p);
                }
            }
        }

        return id;
    }

    public ArrayList<Dog> getDogArrayList() {
        return dogArrayList;
    }

}
