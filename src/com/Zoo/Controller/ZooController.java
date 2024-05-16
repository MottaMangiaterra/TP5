package com.Zoo.Controller;

import com.Zoo.Model.Entities.Abstracts.Animals;
import com.Zoo.View.ZooView;
import com.Zoo.Model.Repositories.ZooRepository;


public class ZooController {

    private ZooRepository zooRepository;
    private ZooView zooView;

    public ZooController() {
        this.zooRepository = new ZooRepository();
        this.zooView = new ZooView();
    }

    public void create(){

        String type = chooseYourType();
        Animals aZoo = typecreate(type);

        if (aZoo != null){
            this.zooRepository.create(aZoo);
        }else {
            this.zooView.check(false);
        }
    }

    public Animals typecreate(String type){

        switch (type){
            case "Dog":
                return this.zooView.createDog();
            case "Cat":
                return this.zooView.createCat();
            case "Bird":
                return this.zooView.createBird();
            default:
                return null;
        }
    }
    private String chooseYourType(){
        String type = null;
        Integer option = 0;

        while (option == 0){

            option = this.zooView.choseurclass();

            switch (option) {
                case 1:
                    type = "Dog";
                    break;
                case 2:
                    type = "Cat";
                    break;
                case 3:
                    type = "Bird";
                    break;
                default:
                    option = 0;
                    break;
            }
        }

        return type;
    }

    private void read(Integer id){

       this.zooView.read(this.zooRepository.read(id));
    }

    public void readZooArrayList(){
        for (Animals p:this.zooRepository.getAnimalsArrayList()){
            read(p.getId());
        }
    }

    public void update(){
        Integer id = this.zooView.enterID();
        String type = chooseYourType();
        Animals aZoo = typecreate(type);

        boolean c = this.zooRepository.update(id,aZoo);
        this.zooView.check(c);
    }

    public void delete(){
        Integer id = this.zooView.enterID();

        boolean c = this.zooRepository.delete(id);
        this.zooView.check(c);
    }
}
