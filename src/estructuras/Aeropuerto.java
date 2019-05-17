package estructuras;

import java.util.Vector;

public class Aeropuerto 
{
	
	private static final String Iterator = null;
	protected String nombre;
	protected String pais;
	protected String ciudad;
	
	protected Vector<Ruta> redAerea;
	
	public Aeropuerto(String nombre, String pais, String ciudad) 
	{
		this.nombre = nombre;
		this.pais = pais;
		this.ciudad = ciudad;
		this.redAerea = new Vector<Ruta> ();
	}
	
	public String getNombre() 
	{
		return nombre;
	}
	
	public String getPais() 
	{
		return pais;
	}
	
	public String getCiudad() 
	{
		return ciudad;
	}
	
	public void addRuta(Ruta nuevaRuta)
	{
		this.redAerea.add(nuevaRuta);
	}
	
}
