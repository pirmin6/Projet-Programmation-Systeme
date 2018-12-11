using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Salle.Model.Salle
{
    public class Carre
    {
        private List<Rang> listeRang = new List<Rang>();
        private int nmbreRang = 6;

        public Carre(int nbreCarres, int nbreTables)
        {
            for (int i = 0; i < nmbreRang; i++)
            {
                listeRang.Add(new Rang(0));
            }

        }
    }
}
