﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Salle.Model.Commun;

namespace Salle.Model.Salle
{
    class ChefRang : Observable, Observer
    {
        private Carre carre;
        private Carte carte;
        List<Observer> groupesClients;

        public ChefRang()
        {
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