using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Salle.Model.Salle
{
    public abstract class Observable 
    {
        private List<IServeur> observers = new List<IServeur>();

        /*private int _painCorbeille = 3;
        private bool _vin = true;
        private bool _eau = true;



        public int PainCorbeille
        {
            get { return this._painCorbeille; }
            set
            {
                this._painCorbeille = value;
                if (this._painCorbeille == 0) NotifyObservers("ManquePain");
            }
        }

        public bool Vin
        {
            get { return this._vin; }
            set
            {
                this._vin = value;
                if (this._vin == false) NotifyObservers("ManqueVin");
            }
        }

        public bool Eau
        {
            get { return this._eau; }
            set
            {
                this._eau = value;
                if (this._eau == false) NotifyObservers("ManqueEau");
            }
        }
        */

        public void Attach(IServeur serveur)
        {
            if(!this.observers.Contains(serveur)) this.observers.Add(serveur);
        }

        public void Dettach(IServeur serveur)
        {
            if(this.observers.Contains(serveur)) this.observers.Add(serveur);
        }

        protected void NotifyObservers(string action)
        {
            foreach (IServeur obs in this.observers) obs.update(this, action);
        }
    }

}
