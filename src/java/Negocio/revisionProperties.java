/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Andre
 */
public class revisionProperties extends capturaProperties{
    
    
            public static void creaProperties(String fecha,String carnet,String nombre,String correo,String detalle,String fechaPro) {
        try {
			Properties properties = new Properties();
			properties.setProperty("Fecha", fecha);
			properties.setProperty("Carnet", carnet);
			properties.setProperty("Nombre", nombre);
                        properties.setProperty("Correo", correo);
                        properties.setProperty("Detalle", detalle);
                        properties.setProperty("FechaPropuesta", fechaPro);

			File file = new File("ticketReclamo.properties");
			FileOutputStream fileOut = new FileOutputStream(file);
			fileOut.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    @Override
    public void creaProperties() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}