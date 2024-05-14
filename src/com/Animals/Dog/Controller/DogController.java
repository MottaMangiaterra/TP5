package com.Animals.Dog.Controller;

import com.Animals.Dog.Model.Entities.Dog;
import com.Animals.Dog.Model.Repositories.DogRepository;
import com.Animals.Dog.View.DogView;

public class DogController {

    private DogRepository dogRepository;
    private DogView dogView;

    public DogController() {
        this.dogRepository = new DogRepository();
        this.dogView = new DogView();
    }

    public void create(){
        Dog adog = this.dogView.create();

        if (!this.dogRepository.getDogArrayList().contains(adog)){
            boolean b = this.dogRepository.create(adog);
            this.dogView.check(b);
            this.dogView.read(this.dogRepository.getDogArrayList().
                    get(this.dogRepository.searchByID(adog.getId())));
        }
        else {
            this.dogView.check(false);
        }
    }

    public void read(Integer id){

        if (this.dogRepository.getDogArrayList().contains(this.dogRepository.
                getDogArrayList().get(this.dogRepository.searchByID(id)))){
            dogView.read(this.dogRepository.read(id));
        }
        else {this.dogView.check(false);}

    }

    public void readDogArrayList(){
        for (Dog p:this.dogRepository.getDogArrayList()){
            read(p.getId());
        }
    }

    public void update(){
        Integer id = dogView.enterID();
        Dog dog = this.dogView.create();

        boolean c = this.dogRepository.update(id,dog);
        dogView.check(c);
    }

    public void delete(){
        Integer id = dogView.enterID();

        boolean c = this.dogRepository.delete(id);
        dogView.check(c);
    }
}
