using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Salle.Model.Commun;

namespace Salle.Model.Salle
{
    public class ChefRang : Observable
    {
        private List<Carre> carres;
        private List<Observer> groupesClients;

        public ChefRang()
        {
        }

        public List<Carre> getCarres() {
            return carres;
        }

        public void distribueCartes()
        {

        }

        public void prendreCommande()
        {

        }

        public void placerClientTable()
        {

        }

        public void dresserTable()
        {

        }

        public void update()
        {

        }
    }
}
