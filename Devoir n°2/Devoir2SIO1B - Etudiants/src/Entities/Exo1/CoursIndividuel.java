package Entities.Exo1;

public class CoursIndividuel extends Cours implements ICalcul
{
    private Instrument instrument;
    private double prixCours;
    private int idCours;

    public CoursIndividuel(Instrument instrument, double prixCours, int idCours) {
        this.instrument = instrument;
        this.prixCours = prixCours;
        this.idCours = idCours;
    }

    public double getPrix(){
         prixCours = 5;
        if (instrument.getNomInstrument() == "guitare")
        {
            prixCours += 7.5;
        }
        if (instrument.getNomInstrument() == "piano")
        {
            prixCours+=10.5;
        }
        else
        {
            prixCours += 9;
        }
        return prixCours;
   }


}
