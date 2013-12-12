package cl.bluex.generadoretiqueta.to;

/**
 * @author rmoscoso
 *
 */
public class DatosOperacionalesTO {

	
	
	private String courier;
	private String oficina;
	private String bodega;
	private String tipoBodega;
	
	/**
	 * crea instancia de DatosOperacionalesTO
	 *
	 */
	public DatosOperacionalesTO() {
		super();
	
	}
	
	public DatosOperacionalesTO(String courier, String oficina, String bodega, String tipoBodega) {
		super();
		this.courier = courier;
		this.oficina = oficina;
		this.bodega = bodega;
		this.tipoBodega = tipoBodega;
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
