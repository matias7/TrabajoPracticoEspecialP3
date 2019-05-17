package archivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

import estructuras.Aeropuerto;
import estructuras.Ruta;

public class CSVReader {
	
	
    public CSVReader() 
    {
    	
    }
    public Vector<Aeropuerto> getAeropuertos(String csvFile)
    {
    	Vector<Aeropuerto> aeropuertos = new Vector<Aeropuerto> ();
    	Aeropuerto aeropuerto = null;
        String line = "";
        String cvsSplitBy = ";";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                String[] items = line.split(cvsSplitBy);
                aeropuerto = new Aeropuerto(items[0]
                						   ,items[1]
                						   ,items[2]);
                aeropuertos.add(aeropuerto);
                
            }
            return aeropuertos;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    public Vector<Ruta> getRutas(String csvFile)
    {
    	Vector<Ruta> rutas = new Vector<Ruta> ();
    	Ruta ruta = null;
    	Vector<String> aerolineas = new Vector<String> ();
        String line = "";
        String cvsSplitBy = ";";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                String[] items = line.split(cvsSplitBy);
                String[] aeros = items[4].split(",");
                for (String aerolinea : aeros) {
                	aerolineas.add(aerolinea);
                }
                Aeropuerto origen = new Aeropuerto(items[0],"","");
                Aeropuerto destino = new Aeropuerto(items[1],"","");
                
                ruta = new Ruta(origen
                			   ,destino
                			   ,aerolineas
                			   ,Double.valueOf(items[2])
                			   ,items[3]);
                rutas.add(ruta);
                
            }
            return rutas;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
