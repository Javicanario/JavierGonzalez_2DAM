package repasoUD3.pruebaMensajeria;


public class Mensaje {
	
	private String autor;
	private String contenido;
	private int longitud;
	private int palabras;
	
	
	public Mensaje(String autor, String contenido) {
		super();
		this.autor = autor;
		this.contenido = contenido;
		this.longitud = 0;
		
		for (int i = 0; i < contenido.length(); i++) {
				if (contenido.charAt(i) != ' ' 	) {
					this.longitud++;
				}
			}
		
	
		this.palabras = 0;
	    boolean cuentaPalabra = false;
	    
	    for (int i = 0; i < contenido.length(); i++) {
	        if (contenido.charAt(i) != ' ') {
	        	
	            if (!cuentaPalabra) {
	                this.palabras++;
	                cuentaPalabra = true;
	            }
	        } else {
	       
	        	cuentaPalabra = false;
	        }
	    }
	}	 	

	public void mostrar() {
		 	System.out.println("");
	}

	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getContenido() {
		return contenido;
	}


	public void setContenido(String contenido) {
		this.contenido = contenido;
	}


	public int getLongitud() {
		return longitud;
	}


	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}


	public int getPalabras() {
		return palabras;
	}


	public void setPalabras(int palabras) {
		this.palabras = palabras;
	}
		
	
}
