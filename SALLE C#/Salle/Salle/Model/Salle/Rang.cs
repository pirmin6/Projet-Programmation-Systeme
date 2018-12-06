using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Salle.Model.Salle
{
    class Rang
    {
        List<Table> Tables;

        public Rang(int nbreTables)
        {
            Tables = new List<Table>();
            for (int i=1; i <= nbreTables; i++)
            {
                Tables.Add(new Table());
            }

        }
    }
}
