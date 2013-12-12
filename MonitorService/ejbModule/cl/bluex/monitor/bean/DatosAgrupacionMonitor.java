package cl.bluex.monitor.bean;

import java.io.Serializable;

import cl.bluex.monitor.to.DatosAgrupacionMonitorTO;

/**
 * Clase con los datos de la agrupacion del monitor.
 * 
 * @author Edgardo Herrera
 *
 */
public class DatosAgrupacionMonitor implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 7791687495442022117L;
    private long idAgrupacion;
    private long voucher;
    private String ruta;
    private String courier;
    private String fechaCreacionAgrupacion;
    private String tipoBulto;
    private long cantidadEstimada;
    private long cantidadIngresada;
    private String estado;
    private long totalPorSorter;
    
    /**
     * Constructor.
     */
    public DatosAgrupacionMonitor() {
	super();
    }
    
    public DatosAgrupacionMonitor(final DatosAgrupacionMonitorTO to) {
	if (to != null) {
	    this.idAgrupacion = to.getIdAgrupacion();
	    this.voucher = to.getVoucher();
	    this.ruta = to.getRuta();
	    this.courier = to.getCourier();
	    this.fechaCreacionAgrupacion = to.getFechaCreacionAgrupacion();
	    this.tipoBulto = to.getTipoBulto();
	    this.cantidadEstimada = to.getCantidadEstimada();
	    this.cantidadIngresada = to.getCantidadIngresada();
	    this.estado = to.getEstado();
	    this.totalPorSorter = to.getTotalPorSorter();
	}
    }

    /**
     * @return the idAgrupacion
     */
    public long getIdAgrupacion() {
        return idAgrupacion;
    }

    /**
     * @param idAgrupacion the idAgrupacion to set
     */
    public void setIdAgrupacion(final long idAgrupacion) {
        this.idAgrupacion = idAgrupacion;
    }

    /**
     * @return the ruta
     */
    public String getRuta() {
        return ruta;
    }

    /**
     * @param ruta the ruta to set
     */
    public void setRuta(final String ruta) {
        this.ruta = ruta;
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
     * @return the fechaCreacionAgrupacion
     */
    public String getFechaCreacionAgrupacion() {
        return fechaCreacionAgrupacion;
    }

    /**
     * @param fechaCreacionAgrupacion the fechaCreacionAgrupacion to set
     */
    public void setFechaCreacionAgrupacion(final String fechaCreacionAgrupacion) {
        this.fechaCreacionAgrupacion = fechaCreacionAgrupacion;
    }

    /**
     * @return the tipoBulto
     */
    public String getTipoBulto() {
        return tipoBulto;
    }

    /**
     * @param tipoBulto the tipoBulto to set
     */
    public void setTipoBulto(final String tipoBulto) {
        this.tipoBulto = tipoBulto;
    }

    /**
     * @return the cantidadEstimada
     */
    public long getCantidadEstimada() {
        return cantidadEstimada;
    }

    /**
     * @param cantidadEstimada the cantidadEstimada to set
     */
    public void setCantidadEstimada(final long cantidadEstimada) {
        this.cantidadEstimada = cantidadEstimada;
    }

    /**
     * @return the cantidadIngresada
     */
    public long getCantidadIngresada() {
        return cantidadIngresada;
    }

    /**
     * @param cantidadIngresada the cantidadIngresada to set
     */
    public void setCantidadIngresada(final long cantidadIngresada) {
        this.cantidadIngresada = cantidadIngresada;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(final String estado) {
        this.estado = estado;
    }

    /**
     * @return the totalPorSorter
     */
    public long getTotalPorSorter() {
        return totalPorSorter;
    }

    /**
     * @param totalPorSorter the totalPorSorter to set
     */
    public void setTotalPorSorter(final long totalPorSorter) {
        this.totalPorSorter = totalPorSorter;
    }

    /**
     * @return the voucher
     */
    public long getVoucher() {
        return voucher;
    }

    /**
     * @param voucher the voucher to set
     */
    public void setVoucher(final long voucher) {
        this.voucher = voucher;
    }

}
