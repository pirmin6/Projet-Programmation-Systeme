using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Salle.Model.Salle
{
    public class GroupeClient : Observable
    {
        private Boolean reservation;
        private int _painCorbeille = 3;
        private bool _vin = true;
        private bool _eau = true;

        public int PainCorbeille
        {
            get { return this._painCorbeille; }
            set
            {
                this._painCorbeille = value;
                if(this._painCorbeille == 0) NotifyObservers("ManquePain");
            }
        }

        public bool Vin
        {
            get { return this._vin; }
            set
            {
                this._vin = value;
                NotifyObservers("ManqueVin");
            }
        }

        public bool Eau
        {
            get { return this._eau; }
            set
            {
                this._eau = value;
                NotifyObservers("ManqueEau");
            }
        }

        public GroupeClient()
        {
         
        }

        public void suivreChefRang()
        {

        }

        public void clientsCommande()
        {

        }

        public void quitterTable()
        {

        }

        public void update()
        {

        }
    }
}
