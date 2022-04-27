package gestion;

import java.util.ArrayList;
public class Zoologico {
	
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<>();
	
	
	public Zoologico () {
		
		
	}
	
	public Zoologico(String nombre, String ubicacion) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		
	}
	

	public void agregarZonas(Zona zonanueva) {
		zonas.add(zonanueva);
	}
	
	
	public int cantidadTotalAnimales() {
		int contadorAnimales=0;
		for (int i=0;i<zonas.size()-1; i++) {
			Zona zona = zonas.get(i);
			contadorAnimales+=zona.cantidadAnimales();
		}
		return contadorAnimales;
			
			
			
			

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	


	
}

