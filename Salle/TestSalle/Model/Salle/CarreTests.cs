using Microsoft.VisualStudio.TestTools.UnitTesting;
using Salle.Model.Salle;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Salle.Model.Salle.Tests
{
    [TestClass()]
    public class CarreTests
    {
        private List<Rang> listeRang = new List<Rang>();
        int nmbreRang = 6;
        [TestMethod()]
        public void CarreTest()
        {
            
            for (int i = 0; i <= nmbreRang; i++)
            {
                listeRang.Add(new Rang(i));
            }
            int test = listeRang.Count();
            Assert.AreEqual(nmbreRang, test);
        }


    }
}

namespace TestSalle
{
    [TestClass()]
    public class CarreTests
    {
        private List<Rang> listeRang = new List<Rang>();
        private int nmbreRang = 6;

        [TestMethod()]
        public void CarreTest()
        {
            for (int i=0; i < nmbreRang; i++)
                {
                listeRang.Add(new Rang(0));
                }

            foreach(Rang rang in listeRang)
            {
                Assert.IsNotNull(rang);
            }
        }
    }
}