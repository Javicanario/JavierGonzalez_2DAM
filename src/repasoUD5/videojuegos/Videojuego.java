package repasoUD5.videojuegos;

public class Videojuego {

	private String titulo;
	private String genero;
	private double precioBase;
	private String valoracion;
	
	public Videojuego(String titulo, String genero, double precioBase, String valoracion) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.precioBase = precioBase;
		this.valoracion = valoracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getValoracion() {
		return valoracion;
	}

	public void setValoracion(String valoracion) {
		this.valoracion = valoracion;
	}

	@Override
	public String toString() {
		return "["+genero+"]"+ titulo + " - " + "Precio: " + precioBase + "(" + "Puntos: " + valoracion + ")" ;
	}
}
