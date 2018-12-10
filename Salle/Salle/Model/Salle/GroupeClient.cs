using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Salle.Model.Salle
{
    public class GroupeClient : Observable, Observer
    {

        List<IClient> Clients;
        Boolean reservation;
        private Observer obs;
        
        public GroupeClient()
        {
            GroupeClient groupeClient = new GroupeClient();

            List<string> ClientType = new List<string>();
            ClientType.Add("Client1");
            ClientType.Add("Client2");

            List<IClient> Clients = new List<IClient>();
            Random random = new Random();
            int rdmNb = random.Next(1, 10);

            for (int i=0; i< rdmNb ;i++ )
            {
                int rdmType = random.Next(1, 2);
                    if (rdmType == 1) 
                    {
                    Clients.Add(ClientFactory.getClient(ClientType[0]));
                    }
                    else if (rdmType == 2)
                    {
                    Clients.Add(ClientFactory.getClient(ClientType[1]));
                    }
                i++;
            }
            
            
        }

        public void suivreChefRang()
        {

        }

        public void clientsCommande()
        {

        }

        //public void quitterTable(MaitreHotel maitrehotel)
        //
        //    maitreHotel.encaisseClient();
        //    Clients = null; 
        //}

        public void update()
        {

        }
    }
}
