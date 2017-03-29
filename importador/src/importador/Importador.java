/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package importador;

import com.opencsv.CSVReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adrians
 */
public class Importador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        InputStream is = null;
        try {
            is = new FileInputStream("src/importador/config.properties");
            prop.load(is);
//            System.out.println("Propiedades por nombre:");
//            System.out.println("-----------------------");
//            System.out.println(prop.getProperty("origen"));
//            System.out.println(prop.getProperty("destino"));
        
            if(prop.getProperty("origen").equals("null")){
//                tirar un alert y configurar un origen y destino desde menu superior
//                prop.setProperty("origen", "C:/Users/adrians/Desktop/EXPO99026145-MASNTHG_CLIENTES.csv");
            }
            
            if(prop.getProperty("destino").equals("null")){
//                tirar un alert y configurar origen y destino desde menu superior              
//                prop.setProperty("destino", "C:/Users/adrians/Desktop/EXPO99026145-MASNTHG_.csv");
            }
            
//            prop.store(new FileWriter("src/importador/config.properties"),"un comentario");
//            
//            System.out.println("-----------------------");
//            System.out.println(prop.getProperty("origen"));
//            System.out.println(prop.getProperty("destino"));
        
        } catch(IOException e) {
                System.out.println(e.toString());
        }
        
        
        
//        try {
//            CSVReader csvReader = new CSVReader(new FileReader("C:/Users/adrians/Desktop/EXPO99026145-MASNTHG_CLIENTES.csv"));
//            List<String[]> allData = csvReader.readAll();
//            for(String[] data : allData)
//            {
//                for(String s : data)
//                {
//                    System.out.print(s+";");
//                }
//                System.out.println();
//            }
//            csvReader.close();
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Importador.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    
}
