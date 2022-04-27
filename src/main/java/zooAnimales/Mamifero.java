package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal{
	
	private static ArrayList<Mamifero> listado = new ArrayList<>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {
		listado.add(this);
		setTotalMamiferos(1);
    }
			
	
	
	 public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		 super(nombre, edad, habitat, genero);
		 this.pelaje = pelaje;
	        this.patas = patas;
	        listado.add(this);
	        setTotalMamiferos(1);
	        
		 
	 }

	public static void setListado(ArrayList<Mamifero> listado) {
		Mamifero.listado = listado;
	}

	public int getCaballos() {
		return caballos;
	}

	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}

	public int getLeones() {
		return leones;
	}

	public void setLeones(int leones) {
		this.leones = leones;
	}

	public boolean isPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
	

    public int cantidadMamiferos() {
        return listado.size();
        
        
    }
    public static Mamifero crearCaballo(String nombre, int edad, String genero) {
        caballos++;

        boolean pelaje = true;
        int patas = 4;
        String habitat = "pradera";
        
        
        Mamifero caballo = new Mamifero(nombre, edad, habitat, genero, pelaje, patas);{
        	
        listado.add(caballo);
        return caballo;
    }   
    }
    public static Mamifero crearLeon(String nombre, int edad, String genero) {
        leones++;

        boolean pelaje = true;
        int patas = 4;
        String habitat = "selva";

        Mamifero leon = new Mamifero(nombre, edad, habitat, genero, pelaje, patas);
        listado.add(leon);
        return leon;
    }
}
