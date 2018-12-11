using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Salle.Model.Salle
{
    public class GroupeClient : Observable
    {
        List<IClient> Clients;
        Boolean reservation;

        private int _painCorbeille = 3;
        private bool _vin = true;
        private bool _eau = true;



        public int PainCorbeille
        {
            get { return this._painCorbeille; }
            set
            {
                this._painCorbeille = value;
                if (this._painCorbeille == 0) NotifyObservers("ManquePain");
            }
        }

        public bool Vin
        {
            get { return this._vin; }
            set
            {
                this._vin = value;
                if (this._vin == false) NotifyObservers("ManqueVin");
            }
        }

        public bool Eau
        {
            get { return this._eau; }
            set
            {
                this._eau = value;
                if (this._eau == false) NotifyObservers("ManqueEau");
            }
        }


        public GroupeClient()
        {
            //GroupeClient groupeClient = new GroupeClient();

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
