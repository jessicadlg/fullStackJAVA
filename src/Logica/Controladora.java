
package Logica;

import Persistencia.ControladoraPersistencia;

public class Controladora {
    //creo el obj controlPersis para poder acceder al metodo de crerCliente
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
   public void crearCliente(int nroCliente, String nombre, String raza, String color, String alergico, String atEspecial, String nombreDueño, String celular, String observaciones){
           //instanciamos un cliente seteando los datos
        Cliente cli= new Cliente(); 
       cli.setNroCliente(nroCliente);
       cli.setNombre(nombre);
       cli.setRaza(raza);
       cli.setColor(color);
       cli.setAlergico(alergico);
       cli.setAtEspecial(atEspecial);
       cli.setNombreDueño(nombreDueño);
       cli.setCelular(celular);
       cli.setObservaciones(observaciones);
       //mando a la persistencia que realice la creacion    
       controlPersis.crearCliente(cli);
   } 

}    
