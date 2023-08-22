package modelo;

public class Pelicula {
private int id_pelicula;
private String pelicula;
public Pelicula(int id_pelicula, String pelicula) {
	super();
	this.id_pelicula = id_pelicula;
	this.pelicula = pelicula;
}
public int getId_pelicula() {
	return id_pelicula;
}
public void setId_pelicula(int id_pelicula) {
	this.id_pelicula = id_pelicula;
}
public String getPelicula() {
	return pelicula;
}
public void setPelicula(String pelicula) {
	this.pelicula = pelicula;
}
}
