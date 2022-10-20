package ar.edu.unq.po2.tp6;

public class SolicitudCréditoHipotecario extends SolicitudDeCrédito {
	private PropiedadInmobiliaria propiedadInmobiliaria; 
	
	public SolicitudCréditoHipotecario(Cliente cliente, double monto, int plazoDeMeses, PropiedadInmobiliaria propiedad) {
		super(cliente, monto, plazoDeMeses);
		this.propiedadInmobiliaria = propiedad; 
	}

	public PropiedadInmobiliaria getPropiedadInmobiliaria() {
		return propiedadInmobiliaria;
	}

	public void setPropiedadInmobiliaria(PropiedadInmobiliaria propiedadInmobiliaria) {
		this.propiedadInmobiliaria = propiedadInmobiliaria;
	}
	
	public boolean isCumpleConRequisitos() {
		double porcentajeDeIngresosMensuales = (getCliente().getSueldoNeto()*50)/100;
		double porcentajeDeValorFiscal = (getPropiedadInmobiliaria().getValorFiscal()*70)/100;
		return getCuotaMensual()< porcentajeDeIngresosMensuales & getMontoSolicitado()< porcentajeDeValorFiscal & getCliente().getEdad() < 65; 
	}

}
