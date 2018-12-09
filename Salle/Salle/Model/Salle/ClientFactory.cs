using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Salle.Model.Salle
{
    public class ClientFactory
    {
        //string ClientType;
        static public IClient getClient(string ClientType)
        {
            if (ClientType == "Client1")
            {
                return new ClientImpl1();

            }
            else
            {
                return new ClientImpl2();
            }
                
        }

    }
}
