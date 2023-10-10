package views;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Categorie;
import repositories.CategorieBdRepository;
import repositories.CategorieExcelRepository;
import repositories.CategorieRepository;
import services.CategorieService;
import services.CategorieServiceImpl;

public class App {
    public static void main(String[] args) throws Exception {
        //Couplage Fort
         CategorieRepository repository=new CategorieExcelRepository();
         CategorieService categorieService=new CategorieServiceImpl(repository);
           Scanner cs=new Scanner(System.in);
           int choix;
            do {
                System.out.println("1-Lister les categories");
                System.out.println("2-Ajouter une Categorie");
                System.out.println("3-Quiiter");
                System.out.println("Entrer votre choix ?");
                    choix=cs.nextInt();
                    switch (choix) {
                            case 1:
                                ArrayList<Categorie> categories = categorieService.lister();
                                for (Categorie cat : categories) {
                                    System.out.println(cat);
                                }
                            break;
                            case 2:
                               cs.nextLine();
                               System.out.println("Entrer le libelle");
                               String libelle=cs.nextLine();
                               Categorie categorie=new Categorie(libelle);
                               boolean ok=  categorieService.ajouter(categorie);
                               if(ok){
                                 System.out.println("Categorie ajoutee");
                               }else{
                                System.out.println("Categorie existe deja");
                               }
                                break;
                        default:
                            break;
                    }
            } while (choix !=3);
           cs.close();
           

    }
}
