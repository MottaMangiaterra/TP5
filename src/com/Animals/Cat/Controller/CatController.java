package com.Animals.Cat.Controller;

import com.Animals.Cat.Model.Entities.Cat;
import com.Animals.Cat.Model.Repositories.CatRepository;
import com.Animals.Cat.View.CatView;

public class CatController {

    private CatRepository CatRepository;
    private CatView CatView;

    public CatController() {
        this.CatRepository = new CatRepository();
        this.CatView = new CatView();
    }

    public void create(){
        Cat aCat = this.CatView.create();

        if (!this.CatRepository.getCatArrayList().contains(aCat)){
            boolean b = this.CatRepository.create(aCat);
            this.CatView.check(b);
            this.CatView.read(this.CatRepository.getCatArrayList().
                    get(this.CatRepository.searchByID(aCat.getId())));
        }
        else {
            this.CatView.check(false);
        }
    }

    public void read(Integer id){

        if (this.CatRepository.getCatArrayList().contains(this.CatRepository.
                getCatArrayList().get(this.CatRepository.searchByID(id)))){
            CatView.read(this.CatRepository.read(id));
        }
        else {this.CatView.check(false);}

    }

    public void readCatArrayList(){
        for (Cat p:this.CatRepository.getCatArrayList()){
            read(p.getId());
        }
    }

    public void update(){
        Integer id = CatView.enterID();
        Cat Cat = this.CatView.create();

        boolean c = this.CatRepository.update(id,Cat);
        CatView.check(c);
    }

    public void delete(){
        Integer id = CatView.enterID();

        boolean c = this.CatRepository.delete(id);
        CatView.check(c);
    }
}
