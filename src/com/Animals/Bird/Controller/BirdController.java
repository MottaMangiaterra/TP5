package com.Animals.Bird.Controller;

import com.Animals.Bird.Model.Entities.Bird;
import com.Animals.Bird.Model.Repositories.BirdRepository;
import com.Animals.Bird.View.BirdView;

public class BirdController {

    private BirdRepository BirdRepository;
    private BirdView BirdView;

    public BirdController() {
        this.BirdRepository = new BirdRepository();
        this.BirdView = new BirdView();
    }

    public void create(){
        Bird aBird = this.BirdView.create();

        if (!this.BirdRepository.getBirdArrayList().contains(aBird)){
            boolean b = this.BirdRepository.create(aBird);
            this.BirdView.check(b);
            this.BirdView.read(this.BirdRepository.getBirdArrayList().
                    get(this.BirdRepository.searchByID(aBird.getId())));
        }
        else {
            this.BirdView.check(false);
        }
    }

    public void read(Integer id){

        if (this.BirdRepository.getBirdArrayList().contains(this.BirdRepository.
                getBirdArrayList().get(this.BirdRepository.searchByID(id)))){
            BirdView.read(this.BirdRepository.read(id));
        }
        else {this.BirdView.check(false);}

    }

    public void readBirdArrayList(){
        for (Bird p:this.BirdRepository.getBirdArrayList()){
            read(p.getId());
        }
    }

    public void update(){
        Integer id = BirdView.enterID();
        Bird Bird = this.BirdView.create();

        boolean c = this.BirdRepository.update(id,Bird);
        BirdView.check(c);
    }

    public void delete(){
        Integer id = BirdView.enterID();

        boolean c = this.BirdRepository.delete(id);
        BirdView.check(c);
    }
}

