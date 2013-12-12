package cl.bluex.digexpress.bean;

import cl.bluex.digmodel.to.HojaRutaTO;

/**
 * Almacena datos de la hoja de ruta.
 * 
 * @author Edgardo Herrera
 *
 */
public class HojaRuta {
    private String  courier;
    private long  codigoRuta;
    private String  codigoPosta;
    private String  codigoBodega;
    private String  codigoOficina;
    private long  codigoEmpresa;
    private long  tipoNegocio;
    private String  tipoHojaRuta;
    
    public HojaRuta() {
	super();
    }
    
    public HojaRuta(final HojaRutaTO hojaRutaTO) {
	if (hojaRutaTO != null) {
	    this.courier = hojaRutaTO.getCourier();
	    this.codigoRuta = hojaRutaTO.getCodigoRuta();
	    this.codigoPosta = hojaRutaTO.getCodigoPosta();
	    this.codigoBodega = hojaRutaTO.getCodigoBodega();
	    this.codigoOficina = hojaRutaTO.getCodigoOficina();
	    this.codigoEmpresa = hojaRutaTO.getCodigoEmpresa();
	    this.tipoNegocio = hojaRutaTO.getTipoNegocio();
	    this.tipoHojaRuta = hojaRutaTO.getTipoHojaRuta();
	    
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
     * @return the codigoRuta
     */
    public long getCodigoRuta() {
        return codigoRuta;
    }

    /**
     * @param codigoRuta the codigoRuta to set
     */
    public void setCodigoRuta(final long codigoRuta) {
        this.codigoRuta = codigoRuta;
    }

    /**
     * @return the codigoPosta
     */
    public String getCodigoPosta() {
        return codigoPosta;
    }

    /**
     * @param codigoPosta the codigoPosta to set
     */
    public void setCodigoPosta(final String codigoPosta) {
        this.codigoPosta = codigoPosta;
    }

    /**
     * @return the codigoBodega
     */
    public String getCodigoBodega() {
        return codigoBodega;
    }

    /**
     * @param codigoBodega the codigoBodega to set
     */
    public void setCodigoBodega(final String codigoBodega) {
        this.codigoBodega = codigoBodega;
    }

    /**
     * @return the codigoOficina
     */
    public String getCodigoOficina() {
        return codigoOficina;
    }

    /**
     * @param codigoOficina the codigoOficina to set
     */
    public void setCodigoOficina(final String codigoOficina) {
        this.codigoOficina = codigoOficina;
    }

    /**
     * @return the codigoEmpresa
     */
    public long getCodigoEmpresa() {
        return codigoEmpresa;
    }

    /**
     * @param codigoEmpresa the codigoEmpresa to set
     */
    public void setCodigoEmpresa(final long codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    /**
     * @return the tipoNegocio
     */
    public long getTipoNegocio() {
        return tipoNegocio;
    }

    /**
     * @param tipoNegocio the tipoNegocio to set
     */
    public void setTipoNegocio(final long tipoNegocio) {
        this.tipoNegocio = tipoNegocio;
    }

    /**
     * @return the tipoHojaRuta
     */
    public String getTipoHojaRuta() {
        return tipoHojaRuta;
    }

    /**
     * @param tipoHojaRuta the tipoHojaRuta to set
     */
    public void setTipoHojaRuta(final String tipoHojaRuta) {
        this.tipoHojaRuta = tipoHojaRuta;
    }

}
