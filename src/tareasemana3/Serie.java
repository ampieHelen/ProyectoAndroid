package tareasemana3;
/**
 *
 * @author Helen
 */
public class Serie extends Cine implements IVisualizable {
    public Serie(String titulo, String genero, String creador, String duracion, boolean visto, int noDeTemporadas) {
		super(titulo, genero, creador, duracion, visto);
		// TODO Auto-generated constructor stub
		this.noDeTemporadas = noDeTemporadas;
	}

	private int noDeTemporadas = 1;
	
	public int getNoDeTemporadas() {
		return noDeTemporadas;
	}

	public void setNoDeTemporadas(int numeroTemporadas) {
		this.noDeTemporadas = noDeTemporadas;
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
        String mensaje="*Serie con mas temporadas\n" + "TITULO:" + this.getTitulo() + "\nTEMPORADAS: " + this.getNoDeTemporadas() + "\nGENERO: " + this.getGenero() + "\nCREADOR: " + this.getCreador() + "\nDURACION: " + this.getDuracion() + "\nVISTO: " + visto;
        return mensaje;
    }

    
}
