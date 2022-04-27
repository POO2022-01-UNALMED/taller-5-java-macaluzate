package gestion;
import zooAnimales.Anfibio;
import zooAnimales.Animal;
import zooAnimales.Ave;
import zooAnimales.Mamifero;
import zooAnimales.Pez;
import zooAnimales.Reptil;

public class FGR {
	
	public static void main(String[] args) {
		
		Animal animal = new Animal ("Herme",10,"rora","M");
		Mamifero mamifero= new Mamifero("heheh",18,"grrg","dgd",false,10);
		Mamifero mamifero1 = new Mamifero();
		Ave ave=new Ave();
		
		
		
		System.out.println(mamifero1);
		System.out.println(ave);
		System.out.println(Animal.totalPorTipo());
		
		
		
		
	}

}
 