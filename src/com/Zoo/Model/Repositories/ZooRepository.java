package com.Zoo.Model.Repositories;

import com.Interfaces.CRUD;
import com.Zoo.Model.Entities.Abstracts.Animals;

import java.util.ArrayList;

public class ZooRepository implements CRUD {

    private ArrayList <Animals> animalsArrayList;

    public ZooRepository() {
        this.animalsArrayList = new ArrayList<>();
    }

    public ArrayList<Animals> getAnimalsArrayList() {
        return animalsArrayList;
    }

    @Override
    public void create(Object animal) {
        this.animalsArrayList.add((Animals) animal);
    }

    @Override
    public Animals read(Integer ID) {
        return this.animalsArrayList.get(getIndexByID(ID));
    }

    @Override
    public boolean update(Integer ID, Object newanimal) {
        boolean check = false;

        if (getIndexByID(ID) != null){
            this.animalsArrayList.set(getIndexByID(ID),(Animals) newanimal);
            check = true;
        }

        return check;
    }

    @Override
    public boolean delete(Integer ID) {
        boolean check = false;

        if (this.animalsArrayList.get(getIndexByID(ID)) != null){
            this.animalsArrayList.remove(this.animalsArrayList.get(getIndexByID(ID)));
            check = true;
        }

        return check;
    }

    public Integer getIndexByID(Integer id){
        Integer index = null;

        if(!this.animalsArrayList.isEmpty()){
            for (Animals p:this.animalsArrayList){
                if (p.getId().equals(id)) {
                    index = this.animalsArrayList.indexOf(p);
                }
            }
        }

        return index;
    }
}
