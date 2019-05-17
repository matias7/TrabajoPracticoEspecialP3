package estructuras;

import java.util.Vector;

public class Ruta {
	protected double distancia;
	protected boolean cabotaje;
	protected Vector<String> aerolineas;
	protected Aeropuerto origen;
	protected Aeropuerto destino;
	
	public Ruta (
				Aeropuerto origen,
				Aeropuerto destino,
				Vector<String> aerolineas,
				double distancia,
				String cabotaje
			) 
	{
		this.origen = origen;
		this.destino = destino;
		this.distancia = distancia;
		this.cabotaje = cabotaje == "1";
		this.aerolineas = aerolineas;
	}
	
	public Ruta(
			Aeropuerto origen,
			Vector<String> aerolineas,
			double distancia,
			String cabotaje
			)
	{
		this(origen,null,aerolineas,distancia,cabotaje);
	}

	public Aeropuerto getOrigen() 
	{
		return origen;
	}
	
	public Aeropuerto getDestino() 
	{
		return destino;
	}
	
	public double getDistancia() 
	{
		return distancia;
	}
	
	
	public void setDestino(Aeropuerto destino)
	{
		if (this.destino == null) {
			this.destino = destino;
		}
	}
	
	public void addAerolinea(String aerolinea)
	{
		this.aerolineas.add(aerolinea);
	}

	public void setOrigen(Aeropuerto origen) {
		this.origen = origen;
	}
}