package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal{
	
	private static ArrayList<Ave> listado = new ArrayList<>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave() {
		listado.add(this);
        setTotalAves(1);
        
		
		
	}
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        listado.add(this);
        setTotalAves(1);
        
	}
	public static ArrayList<Ave> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Ave> listado) {
		Ave.listado = listado;
	}

	public int getHalcones() {
		return halcones;
	}

	public void setHalcones(int halcones) {
		this.halcones = halcones;
	}

	public int getAguilas() {
		return aguilas;
	}

	public void setAguilas(int aguilas) {
		this.aguilas = aguilas;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	public int cantidadAves(){
        return listado.size();

    }

    public String movimiento(){
        return "volar";
        
    }
    public static Ave crearHalcon(String nombre,int edad,String genero){
        halcones ++;
        String colorPlumas = "cafe glorioso";
        String habitat = "montanas";
        Ave halcon = new Ave(nombre,edad,habitat,genero,colorPlumas);
        listado.add(halcon);
        return halcon;
    }

    public static Ave crearAguila(String nombre,int edad,String genero){
        aguilas ++;

        String colorPlumas = "blanco y amarillo";
        String habitat = "montanas";

        Ave aguila = new Ave(nombre,edad,habitat,genero,colorPlumas);
        listado.add(aguila);
        return aguila;
    }
		
		
		
	
	
}
