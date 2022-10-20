package ar.edu.unq.po2.tpEnum;

public class ActividadSemanal {
	
	private DiaDeSemana día;
	private String hora;
	private int duración;
	private Deporte deporte;
	 
	
	public ActividadSemanal(DiaDeSemana día, String hora, int duración, Deporte deporte) {
		this.día = día;
		this.hora = hora;
		this.duración = duración;
		this.deporte = deporte; 
		
	}
	
	public DiaDeSemana getDía() {
		return día;
	}
	
	public void setDía(DiaDeSemana día) {
		this.día = día;
	}
	
	public String getHora() {
		return hora;
	}
	
	public void setHora(String hora) {
		this.hora = hora;
	}
	
	public int getDuración() {
		return duración;
	}
	
	public void setDuración(int duración) {
		this.duración = duración;
	}
	
	public Deporte getDeporte() {
		return deporte;
	}
	
	public void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	} 
	
	public double getPrecioFinal() {
		return getPrecioPorDía() + deporte.getComplejidad()*200;
	}
	
	public double getPrecioPorDía() {
		double precioPorDía; 
		if(día == DiaDeSemana.LUNES || día == DiaDeSemana.MARTES || día == DiaDeSemana.MIERCOLES) {
			precioPorDía = 500;
		} else {
			precioPorDía = 1000; 
		}
		return precioPorDía;
	}
	
	
	public void printIn() {
		System.out.print("Deporte: " + deporte.toString()+". Dia: " + día.toString() + " a las: " + hora + " Duracion: " + duración + " "); 
	}
	

}
