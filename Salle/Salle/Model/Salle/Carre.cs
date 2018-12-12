using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Salle.Model.Salle
{
    public class Carre
    {
        private List<Rang> listeRang;
        private int nmbreRang;

        // on a ici un tableau a deux dimensions pour le nombre de places par table
        // la premiere case du tableau correspond donc au nombre du rang concerné et la deuxieme au nombre de places pour la table
        public Carre(int nmbreRang, int[] nbrTableParRang, int[][] nbrPlacesParTable)
        {
            listeRang = new List<Rang>();

            for (int i = 0; i < nmbreRang; i++)
            {
                for (int j = 0; j < nbrTableParRang[i]; i++)
                listeRang.Add(new Rang(nbrTableParRang[i], nbrPlacesParTable[j]));
            }

        }

        public List<Table> getTablesDispo() {

            List<Table> tablesDispo = new List();

            for (Rang rang : listeRang) {

                for(Table table : rang.Tables) {

                    if (table.groupeClient == null)
                    {
                    tablesDispo.Add(table);
                    }
                }
            }

            return tablesDispo;
        }
    }
}
