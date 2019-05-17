package main;

import java.util.Vector;

import archivos.CSVReader;
import estructuras.Aeropuerto;
import estructuras.Graph;
import estructuras.Ruta;

public class Main {

	protected final static String CSV_AEROPUERTOS_FILE = "data/Aeropuertos.csv";
	protected final static String CSV_RESERVAS_FILE = "data/Reservas.csv";
	protected final static String CSV_RUTAS_FILE = "data/Rutas.csv";
	
	
	public static void main(String[] args) {
		CSVReader reader = new CSVReader();
		Vector<Aeropuerto> aeropuertos = reader.getAeropuertos(CSV_AEROPUERTOS_FILE);
		Vector<Ruta> rutas = reader.getRutas(CSV_RUTAS_FILE);
		Graph grafo = new Graph();
		for (Aeropuerto nodo : grafo.getGraph(aeropuertos,rutas)) {
			System.out.println(nodo.getNombre());
		}
	}
	
}
