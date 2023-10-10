package repositories;

import java.util.ArrayList;

import entities.Categorie;

public interface CategorieRepository {
    int insert(Categorie categorie);
    ArrayList<Categorie> findAll();
}
