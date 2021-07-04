
package Persistencia;

import Logica.Cliente;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
   //generamos una intancia del cliente referenciando al constructor creado en el controlador
    ClienteJpaController  jpaCliente =new ClienteJpaController();
    
    public void crearCliente(Cliente cli){
        //intenta crear el cliente y si no manda exc
        try {
            jpaCliente.create(cli);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
