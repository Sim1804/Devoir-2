package Tools;

import Entities.Exo1.Cours;
import Entities.Exo1.CoursCollectif;
import Entities.Exo1.CoursIndividuel;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModelJTable extends AbstractTableModel
{
    private String[] colonnes;
    private Object[][] lignes;
    @Override
    public int getRowCount() {
        return lignes.length;
    }

    @Override
    public int getColumnCount() {
        return colonnes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return lignes[rowIndex][columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return colonnes[column];
    }

    public void loadDatasCours(ArrayList<Cours> uneListe) {

        // A compléter ici
        colonnes = new String[]{"Description","Prix"};
        lignes = new Object[uneListe.size()][2];
        int i = 0;

        for(Cours cours : uneListe)
        {
            lignes[i][0] = cours.getInfos();
            lignes[i][1] = cours.getPrix();
            i++;
        }
        fireTableChanged(null);
    }
}
