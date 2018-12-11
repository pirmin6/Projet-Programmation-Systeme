using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Salle.Model.Salle
{
    delegate void DelegateAction();

    public class Serveur : IServeur
    {
        public int stockPain;
        public int stockEau;
        //public delegate void DelegateAction();
        

        public Serveur()
        {
        }

        public void ramasserAssietteCouverts()
        {

        }

        public void servirClients()
        {

        }

        public void debarrasserTable()
        {

        }

        public void servirPain()
        { 
           // stockPain - (client.Count);
        }

        public void servirEau()
        {

        }

        public void servirVin()
        {

        }

        public void update(GroupeClient groupe, DelegateAction actionNecessaire)
        {
            Console.WriteLine("Le groupe client {0} doit être servis en {1}" );
            //DelegateAction action = actionNecessaire;
            actionNecessaire();

            throw new NotImplementedException();

        }

        
    }
}
