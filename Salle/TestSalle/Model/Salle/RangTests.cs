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
    }
}