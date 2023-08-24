package modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Incaa {
	private List<Pelicula> catalogo;

	public Incaa() {
		super();

		this.catalogo = new ArrayList<Pelicula>();

	}

	public List<Pelicula> getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(List<Pelicula> catalogo) {
		this.catalogo = catalogo;
	}

	public boolean agregarPelicula(String pelicula) {
		for (int i = 0; i < catalogo.size(); i++) {
			if (pelicula.equals(catalogo.get(i).getPelicula())) {
				return false;
			}
		}
		Pelicula nuevaPelicula = new Pelicula(catalogo.size() + 1, pelicula);
		catalogo.add(nuevaPelicula);
		return true;
	}

	public Pelicula traerPelicula(int id_Pelicula) {
		int i;
		for (i = 0; i < catalogo.size(); i++) {
			if ((id_Pelicula == catalogo.get(i).getId_pelicula())) {

				return catalogo.get(i);

			}

		}
		return null;
	}

	public Pelicula traerPelicula(String partePelicula) {
		int i = 0;
		Pelicula pelicula = new Pelicula();
		while (i < catalogo.size()) {
			if (catalogo.get(i).getPelicula().contains(partePelicula)) {
				pelicula = catalogo.get(i);
			}
			i++;

		}
		return pelicula;
	}
	
	public void modificarPelicula (int idPelicula, String pelicula) {
		
		int i = 0;
		Pelicula peli=new Pelicula();
		while (i < catalogo.size()) {
		
			if ((catalogo.get(i).getId_pelicula()==(idPelicula))){
				peli.setPelicula(pelicula);
				
				System.out.println("nombre ->"+peli.getPelicula()+"--id->"+peli.getId_pelicula());
				break;
			
			}
			else {
				System.out.println("null");
			}
			i++;


	}
		
	}
	public void total() {
		for (int i = 0; i <catalogo.size(); i++) {
			System.out.println(catalogo.get(i).getPelicula());
			
		}
	}
	

	
public boolean eliinarPelicula(int idPelicula) {
	for (int i = 0; i < catalogo.size(); i++) {
		if (idPelicula==(catalogo.get(i).getId_pelicula())) {
			catalogo.remove(catalogo.get(i));
		return true;
		}
	}

		return false;
		
	}
	

}