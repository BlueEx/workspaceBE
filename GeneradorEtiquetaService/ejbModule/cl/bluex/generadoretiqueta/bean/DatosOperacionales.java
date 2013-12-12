package cl.bluex.generadoretiqueta.bean;

import cl.bluex.generadoretiqueta.to.DatosOperacionalesTO;
import cl.bluex.generadoretiqueta.to.OrdenServicioTO;

public class DatosOperacionales {

	private String courier;
	private String oficina;
	private String bodega;
	private String tipoBodega;
	
	/**
	 * crea instancia de DatosOperacionales
	 *
	 */
	public DatosOperacionales() {
		super();
	}
	
	/**
	 * crea instancia de OrdenServicio
	 *
	 * @param to
	 */
	public DatosOperacionales(final DatosOperacionalesTO to) {
		if (to != null) {
			this.bodega = to.getBodega();
			this.courier = to.getCourier();
			this.oficina = to.getOficina();
			this.tipoBodega = to.getTipoBodega();
		}
	}
	
	/**
	 * @return the courier
	 */
	public String getCourier() {
		return courier;
	}

	/**
	 * @param courier the courier to set
	 */
	public void setCourier(final String courier) {
		this.courier = courier;
	}

	/**
	 * @return the courier
	 */
	public String getOficina() {
		return oficina;
	}

	/**
	 * @param oficina the oficina to set
	 */
	public void setOficina(final String oficina) {
		this.oficina = oficina;
	}

	/**
	 * @return the bodega
	 */
	public String getBodega() {
		return bodega;
	}

	/**
	 * @param bodega the bodega to set
	 */
	public void setBodega(final String bodega) {
		this.bodega = bodega;
	}

	/**
	 * @return the tipoBodega
	 */
	public String getTipoBodega() {
		return tipoBodega;
	}

	/**
	 * @param tipoBodega the tipoBodega to set
	 */
	public void setTipoBodega(final String tipoBodega) {
		this.tipoBodega = tipoBodega;
	}
}
