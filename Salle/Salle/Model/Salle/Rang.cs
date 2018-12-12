using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Salle.Model.Salle
{
    public class Rang
    {
        List<Table> Tables;

        int nmbreTables;


        public Rang(int nbreTables)
        {
            Tables = new List<Table>();
            for (int i = 0; i < nbreTables; i++)
            {
                Tables.Add(new Table(i));
            }


        }

        public void GetTableDisponible()
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
        
    }
}
