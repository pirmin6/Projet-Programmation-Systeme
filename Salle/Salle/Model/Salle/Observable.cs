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
            foreach (IServeur obs in this.observers) obs.update(this, string action);
        }
    }

}
