package tareasemana3;
/**
 *
 * @author Helen
 */
public class Cine {
     private String titulo;
	private String genero;
	private String creador;
	private String duracion;
	private boolean visto = false;
	
	public Cine(String titulo, String genero, String creador, String duracion, boolean visto) {
		// TODO Auto-generated constructor stub
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.duracion = duracion;
		this.visto = visto;
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
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public void setVisto(boolean visto) {
		this.visto = visto;
	}
	
	public boolean getVisto(){
		return visto;
	}
        
}
