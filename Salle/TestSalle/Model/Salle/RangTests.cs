using Microsoft.VisualStudio.TestTools.UnitTesting;
using Salle.Model.Salle;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TestSalle
{
    [TestClass()]
    public class RangTests
    {
        private List<Table> listeTable = new List<Table>();
        int nmbreTable = 4;

        public GroupeClient Null { get; private set; }

        [TestMethod()]
        public void RangTest()
        {
            for (int i = 0; i < nmbreTable; i++)
            {
                listeTable.Add(new Table());
            }

            foreach (Table table in listeTable)
            {
                Assert.IsNotNull(table);
            }
        }

        [TestMethod()]
        public void TableDisponible()
        {
            Rang rang = new Rang(5);
            List<Table> tableDispo = new List<Table>();

            foreach (Table table in listeTable)
            {
                if (table.clients != Null)
                {
                    tableDispo.Add(table);
                }
            }

            foreach (Table table in listeTable)
            {
                Assert.IsNotNull(table);
            }

            foreach (Table tableRef in tableDispo)
            {
                Assert.IsNotNull(tableRef);
            }
        }
    }
}