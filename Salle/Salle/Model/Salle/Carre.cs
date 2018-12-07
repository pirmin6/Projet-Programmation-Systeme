using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Salle.Model.Salle
{
    public class Carre
    {
        List<Rang> Rangs;
        
        public Carre(int nbreCarres, int nbreTables)
        {
            Rangs = new List<Rang>();

            for (int i = 1; i <= nbreCarres; i++)
            {
                Rangs.Add(new Rang(nbreTables));
            }

        }
    }
}
