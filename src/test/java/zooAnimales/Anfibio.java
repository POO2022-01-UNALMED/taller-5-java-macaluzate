package zooAnimales;

import java.util.ArrayList;

public class Anfibio  extends Animal{
	
	private static ArrayList<Anfibio> listado= new ArrayList<>();
	public  int ranas;
	public int salamadras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
			
	}

	public static ArrayList<Anfibio> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Anfibio> listado) {
		Anfibio.listado = listado;
	}

	public int getRanas() {
		return ranas;
	}

	public void setRanas(int ranas) {
		this.ranas = ranas;
	}

	public int getSalamadras() {
		return salamadras;
	}

	public void setSalamadras(int salamadras) {
		this.salamadras = salamadras;
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	
}	
