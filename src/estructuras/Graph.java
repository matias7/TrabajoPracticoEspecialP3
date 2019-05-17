package estructuras;

import java.util.Vector;

public class Graph {

	protected Vector<Aeropuerto> grafo;
	
	public Graph
	(
	) 
	{
	}
	public Vector<Aeropuerto> getGraph
	(
			Vector<Aeropuerto> aeropuertos, 
			Vector<Ruta> rutas
	)
	{
		this.grafo = new Vector<Aeropuerto> ();
		for (Ruta ruta : rutas) {
			for (Aeropuerto origen : aeropuertos) {
				if (ruta.getOrigen().getNombre() == origen.getNombre()) {
					ruta.setOrigen(origen);
					for (Aeropuerto destino : aeropuertos) {
						if (ruta.getDestino().getNombre() == destino.getNombre()) {
							ruta.setDestino(destino);
						}
					}
					origen.addRuta(ruta);
					this.grafo.add(origen);
				}
			}
		}
		return this.grafo;
	}

}
