package Entities.Exo1;

import javax.print.attribute.standard.Sides;
import java.util.ArrayList;

public class Cours implements ICalcul, Comparable<Cours>
{
    private double prixCours;
    private int idCours;

    @Override
    public double getPrix() {
        return prixCours = 5;
    }

    @Override
    public int compareTo(Cours o) {
        return 0;
    }
    public String getInfos(){
        return null;
    }
}
