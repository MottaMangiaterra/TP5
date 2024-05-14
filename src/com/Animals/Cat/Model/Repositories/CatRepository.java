package com.Animals.Cat.Model.Repositories;

import com.Animals.Cat.Model.Entities.Cat;
import com.Interfaces.CRUD;

import java.util.ArrayList;

public class CatRepository implements CRUD <Cat> {

    private ArrayList <Cat> CatArrayList;

    public CatRepository() {
        this.CatArrayList = new ArrayList<>();
    }

    @Override
    public boolean create(Cat Cat) {
        boolean check = false;

        this.CatArrayList.add(Cat);

        if (this.CatArrayList.contains(Cat)) {
            check = true;
        }

        return check;
    }

    @Override
    public Cat read(Integer ID) {
        return this.CatArrayList.get(searchByID(ID));
    }

    @Override
    public boolean update(Integer ID, Cat updatedobject) {
        boolean check = false;

        if (searchByID(ID) != null){
            this.CatArrayList.set(searchByID(ID),updatedobject);
            check = true;
        }

        return check;
    }

    @Override
    public boolean delete(Integer ID) {
        boolean check = false;

        if (this.CatArrayList.get(searchByID(ID)) != null){
            this.CatArrayList.remove(this.CatArrayList.get(searchByID(ID)));
            check = true;
        }

        return true;
    }

    public Integer searchByID(Integer id){
        Integer index = null;

        if(!this.CatArrayList.isEmpty()){
            for (Cat p:this.CatArrayList){
                if (p.getId().equals(id)) {
                    index = this.CatArrayList.indexOf(p);
                }
            }
        }

        return id;
    }

    public ArrayList<Cat> getCatArrayList() {
        return CatArrayList;
    }
}

