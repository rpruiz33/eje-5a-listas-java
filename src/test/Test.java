package test;
import java.util.List;
import modelo.Incaa;
import modelo.Pelicula;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pelicula pelicula=new Pelicula(3,"volver al futuro2");

		
		Incaa incaa=new Incaa();
		Pelicula alicia=new Pelicula(1,"alicia en el pais de las maravillas");
		Pelicula transformer=new Pelicula(2,"transformers");
		System.out.println("**********Boolean agregarPelicula************");
		System.out.println(incaa.agregarPelicula(alicia.toString()));
		System.out.println("**********Mostrar alicia toString************");
		System.out.println(alicia.toString());
		System.out.println("**********Boolean agregarPelicula************");
		System.out.println(incaa.agregarPelicula(transformer.toString()));
		System.out.println(incaa.agregarPelicula(pelicula.toString()));
		System.out.println("*********Traer pelicula**********************");
		System.out.println(incaa.traerPelicula(1).toString());	
		//System.out.println(incaa.traerPelicula ("alicia en el pais de las maravillas".toString()));
		System.out.println(incaa.traerPelicula("tasdasd"));
		System.out.println("*********Modificar Pelicula******************");
		incaa.modificarPelicula(3, "volver adasdasdl futuro2");
		System.out.println("********Mostrar total de peliculas***********");
		incaa.total();
		System.out.println("********Boolean elimanar pelicula************");
		System.out.println(incaa.eliinarPelicula(2));
		System.out.println("********Mostrar total de peliculas***********");
		incaa.total();
}
}