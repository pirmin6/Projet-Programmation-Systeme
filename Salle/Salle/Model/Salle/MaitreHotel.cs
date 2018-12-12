using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Salle.Model.Salle
{
    public class MaitreHotel : Observable
    {
        private ChefRang chefRang;
        private int Attente;
        private List<Table> tablesLibres;

        public MaitreHotel()
        {
        }

        public void attribuerTable()
        {

            List<Table> tables = new List();
            
            for (int i = 0; i < chefRang.getCarres.length; i++)
            {
                tables.AddRange(chefRang.getCarres.getTablesDispo());
            }
            // Reste plus qu'a faire le traitement sur la liste de tables dispo récupérées.


        }

        public void encaisseClient()
        {

        }

        public void appelleChefRang()
        {

        }

        public void ajouteClient()
        {

        }
    }
}
