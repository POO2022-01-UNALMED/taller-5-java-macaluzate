package gestion;

import java.util.ArrayList;

import zooAnimales.Animal;
public class Zona {
	
	
		
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales= new ArrayList<>();
	
	public Zona() {
		this(null,null);
		
	}
	
	public Zona(String nombre,Zoologico zoo) {
		this.nombre=nombre;
		this.zoo = zoo;
		
	}
	
	public void agregarAnimales(Animal animalNuevo) {
		animales.add(animalNuevo);
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Zoologico getZoo() {
		return zoo;
	}

	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}

	public int cantidadAnimales() {
		return animales.size();
		
	}
		
		

}
