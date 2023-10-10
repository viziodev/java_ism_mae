package repositories;

import java.util.ArrayList;

import entities.Categorie;

public class CategorieListRepository implements CategorieRepository {
    //Couplage Fort
    ArrayList<Categorie> categories =new ArrayList<>();

    @Override
    public int insert(Categorie categorie){
       categories.add(categorie) ;
       return 1;
    }
    @Override
    public     ArrayList<Categorie> findAll(){
        return categories;
    }
    
}
