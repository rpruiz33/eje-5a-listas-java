package modelo;
import java.util.List;

public class Incaa {
private List <Pelicula> catalogo;


public Incaa() {
	super();
	
	this.catalogo =new ArrayList<Pelicula>();

}


public List<Pelicula> getCatalogo() {
	return catalogo;
}
public void setCatalogo(List<Pelicula> catalogo) {
	this.catalogo = catalogo;
}


}
public boolean agregarPelicula (String pelicula) {

		
	}
		
	}
}
public boolean buscarPelicula(List<Pelicula> catalogo, String pelicula) {
    for (int i = 0; i < catalogo.size(); i++) {
        if (catalogo.get(i).getTitulo().equals(pelicula)) {
            return true; // Si se encuentra la película, retornar true
        }
    }
    return false; // Si no se encuentra la película en todo el catálogo
}

}