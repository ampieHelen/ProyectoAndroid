package tareasemana3;
/**
 *
 * @author Helen
 */
public class Pelicula extends Cine implements IVisualizable {
    public Pelicula(String titulo, String genero, String creador, String duracion, boolean visto, int anio) {
		super(titulo, genero, creador, duracion, visto);
		
		this.anio = anio;
	}

	private int anio;

   
	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	@Override
	public void marcarVisto() {
		// TODO Auto-generated method stub
		this.setVisto(true);
	
	}

	@Override
	public boolean esVisto() {
		// TODO Auto-generated method stub
		boolean esVisto = false;
		if(this.getVisto()){
			esVisto = true;
		}
		return esVisto;
	}

	@Override
	public String tiempoVisto() {
		// TODO Auto-generated method stub
		return null;
	}

    @Override
	public String toString (){
		String visto = "No";
		if(this.getVisto()){
			visto = "Si";
		}
        String mensaje="*Pelicula mas Reciente\n" + "TITULO:" + this.getTitulo() + "\nGENERO: " + this.getGenero() + "\nCREADOR: " + this.getCreador() + "\nDURACION: " + this.getDuracion() + "\nVISTO: " + visto + "\nAÑO: " + this.getAnio()+ "\n";
        return mensaje;
    }

    
}
