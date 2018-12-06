using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Salle.Model.Commun
{
    class StockagePropre
    {
        List<Vaiselle> vaiselleDispo = new List<Vaiselle>();
        List<Textile> textileDispo = new List<Textile>();

        public StockagePropre(List<Vaiselle> vaiselleDispo, List<Textile> textileDispo)
        {
        }
    }
}
