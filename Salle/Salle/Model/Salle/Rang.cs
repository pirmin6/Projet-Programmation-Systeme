using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Salle.Model.Salle
{
    public class Rang
    {
        private List<Table> Tables;
        private int nmbres;

        public Rang(int nbreTables)
        {
            Tables = new List<Table>();
            for (int i = 1; i <= nbreTables; i++)
            {
                Tables.Add(new Table());
            }
        }
/*
        public void TableDisponible()
        {
            List<Table> tableDispo = new List<Table>();
            
            foreach(Table table in Tables)
            {
                if(table.clients != null)
                {
                    tableDispo.Add(table);
                }
            }
        }
        */
    }
}
