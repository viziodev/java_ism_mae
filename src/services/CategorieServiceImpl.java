package services;

import java.util.ArrayList;

import entities.Categorie;
import repositories.CategorieRepository;

public class CategorieServiceImpl implements CategorieService {
     
//couplage faible ou Inversion de Control
      private CategorieRepository categorieRepository ;
      //Injection de dependance
       public CategorieServiceImpl(CategorieRepository categorieRepository) {
              this.categorieRepository = categorieRepository;
       }

      @Override
      public boolean categorieExist(Categorie categorie){
        ArrayList<Categorie> categories = categorieRepository.findAll();
        for (Categorie cat : categories) {
                if (cat.equals(categorie)) {
                       return true;
                }
        }
        return false;
      }
     @Override
      public boolean ajouter(Categorie categorie){
             if(!categorieExist(categorie)){
              return categorieRepository.insert(categorie)==1;
             }
             return false;

      }
     @Override
      public ArrayList<Categorie> lister(){
             return categorieRepository.findAll();

      }
}
