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
        private int _StockEau = 1000;
        private int _StockPain = 1000;

        public int StockEau { get => _StockEau; set => _StockEau = value; }
        public int StockPain { get => _StockPain; set => _StockPain = value; }

        
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
            StockPain = StockPain -1;
        }

        public void servirEau()
        {
            StockEau = StockEau - 1;

        }

        public void servirVin()
        {

        }

        public void update(Observable observable, string actionUpdate)
        {
            Console.WriteLine("Le groupe client {0} doit être servis en {1}", observable, actionUpdate);
            
            switch(actionUpdate)
            {
                case "ManquePain":
                    this.servirPain(observable);
                    break;

                case "ManqueEau":
                    this.servirEau(observable);
                    break;

                case "ManqueVin":
                    this.servirVin(observable);
                    break;
            }
        }

        
    }
}
