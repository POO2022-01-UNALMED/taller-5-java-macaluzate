package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal{
	
	private static ArrayList<Reptil> listado = new ArrayList<>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil () {
		
	
	}
	
	public Reptil(String nombre,int edad,String colorEscamas,String genero,int largoCola,String habitat) {
		super(nombre,edad,genero,habitat);
		this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        listado.add(this);
		
	}

	public static ArrayList<Reptil> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Reptil> listado) {
		Reptil.listado = listado;
	}

	public int getIguanas() {
		return iguanas;
	}

	public void setIguanas(int iguanas) {
		this.iguanas = iguanas;
	}

	public int getSerpientes() {
		return serpientes;
	}

	public void setSerpientes(int serpientes) {
		this.serpientes = serpientes;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getLargoCola() {
		return largoCola;
	}

	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
		
		
	}
	public int cantidadReptiles(){
        return listado.size();
    }

    public String movimiento(){
        return "reptar";
    }
    
    public static Reptil crearIguana(String nombre,int edad,String genero) {
    	iguanas++;
    	String colorEscamas="verde";
    	int largoCola= 3;
    	String habitat="humedal";
    	
    	Reptil iguana = new Reptil(nombre,edad,colorEscamas,genero,largoCola,habitat);
    	listado.add(iguana);
    	return iguana;
    	
    		
    	
    	
    }
	

}
