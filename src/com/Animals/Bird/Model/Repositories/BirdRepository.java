package com.Animals.Bird.Model.Repositories;

import com.Animals.Bird.Model.Entities.Bird;
import com.Interfaces.CRUD;

import java.util.ArrayList;

public class BirdRepository implements CRUD <Bird> {

    private ArrayList <Bird> BirdArrayList;

    public BirdRepository() {
        this.BirdArrayList = new ArrayList<>();
    }

    @Override
    public boolean create(Bird Bird) {
        boolean check = false;

        this.BirdArrayList.add(Bird);

        if (this.BirdArrayList.contains(Bird)) {
            check = true;
        }

        return check;
    }

    @Override
    public Bird read(Integer ID) {
        return this.BirdArrayList.get(searchByID(ID));
    }

    @Override
    public boolean update(Integer ID, Bird updatedobject) {
        boolean check = false;

        if (searchByID(ID) != null){
            this.BirdArrayList.set(searchByID(ID),updatedobject);
            check = true;
        }

        return check;
    }

    @Override
    public boolean delete(Integer ID) {
        boolean check = false;

        if (this.BirdArrayList.get(searchByID(ID)) != null){
            this.BirdArrayList.remove(this.BirdArrayList.get(searchByID(ID)));
            check = true;
        }

        return true;
    }

    public Integer searchByID(Integer id){
        Integer index = null;

        if(!this.BirdArrayList.isEmpty()){
            for (Bird p:this.BirdArrayList){
                if (p.getId().equals(id)) {
                    index = this.BirdArrayList.indexOf(p);
                }
            }
        }

        return id;
    }

    public ArrayList<Bird> getBirdArrayList() {
        return BirdArrayList;
    }
}

