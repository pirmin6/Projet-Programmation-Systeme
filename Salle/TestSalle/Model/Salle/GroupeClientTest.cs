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
    public class GroupeClientTest
    {
        [TestMethod()]
        public void GroupeClientTests()
        {
            List<IClient> Clients = new List<IClient>();
            Clients.Add(ClientFactory.getClient("Client1"));
            Assert.IsNotNull(Clients);
        }

        [TestMethod()]
        public void suivreChefRangTest()
        {
            Assert.Fail();
        }

        [TestMethod()]
        public void clientsCommandeTest()
        {
            Assert.Fail();
        }

        [TestMethod()]
        public void quitterTableTest()
        {
            List<IClient> Clients = new List<IClient>();
            Clients.Add(ClientFactory.getClient("Client1"));
            Clients = null;
            Assert.IsNull(Clients);
        }

        [TestMethod()]
        public void updateTest()
        {
            Assert.Fail();
        }
    }
}