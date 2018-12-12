using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Salle.Model.Salle
{
    public class Table
    {
        private int nbrPlaces;
        private GroupeClient groupeClient;

        public Table(int nbrPlaces)
        {
            this.nbrPlaces = nbrPlaces;
        }

        public int getNbrPlaces() {
            return nbrPlaces;
        }

        public void setGroupeClient(GroupeClient grp) {
            groupeClient = grp;
        }

        public GroupeClient getGroupeClient() {
            return groupeClient;
        }
    }
}
