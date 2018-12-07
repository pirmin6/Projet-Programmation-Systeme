using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Salle.View
{
    abstract class AbstractView : EmployeView, ClientView, MaterielView, PlatView
    {
        void initialiserComposant()
        {

        }

        void update()
        {

        }
    }
}
