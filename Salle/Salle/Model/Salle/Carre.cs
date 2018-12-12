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
        private int nmbreRang;

        public Carre(int nmbreRang)
        {
            for (int i = 0; i < nmbreRang; i++)
            {
                listeRang.Add(new Rang(i));
            }

        }
    }
}
