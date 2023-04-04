package Entities.Exo1;

import java.util.PrimitiveIterator;

public class CoursCollectif extends Cours implements ICalcul
{
  private String nomCours;
  private int nbPlacesMaxi;
  private int ageMini;

    public CoursCollectif(String nomCours, int nbPlacesMaxi, int ageMini) {
        this.nomCours = nomCours;
        this.nbPlacesMaxi = nbPlacesMaxi;
        this.ageMini = ageMini;
    }

    public String getInfos(){
        return null;
    }

    @Override
    public double getPrix() {
        double prixCours = 5;
        if (ageMini < 10)
        {
            prixCours += 12;
        }
        if (ageMini < 20)
        {
            prixCours += 15;
        }
        else
        {
          prixCours += 17;
        }
        return prixCours;
    }
}
