package services;

import java.util.ArrayList;

import entities.Categorie;

public interface CategorieService {
 boolean categorieExist(Categorie categorie);
 boolean ajouter(Categorie categorie);
 ArrayList<Categorie> lister();
    
} 