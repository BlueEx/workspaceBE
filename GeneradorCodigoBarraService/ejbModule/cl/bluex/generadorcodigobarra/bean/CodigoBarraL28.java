package cl.bluex.generadorcodigobarra.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.generadorcodigobarramodel.to.CodigoBarraL28TO;


/**
 * @author eherrera
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "codigoBarraL28",
		propOrder = {
		"codigoBarraL28",
		"codigoComunaIne",
		"codigoZona",
		"codigoSubZona",
		"codigoProducto",
		"nombreProducto",
		"codigoServicio",
		"nombreServicio",
		"codigoBase",
		"nombreBase",
		"codigoPosta",
		"nombrePosta",
		"codigoPieza",
		"codigoBarraGuia",
		"numeroPieza",
		"totalPieza"
		})
public class CodigoBarraL28 {
	
	private String codigoBarraL28;
	private String codigoComunaIne;
	private String codigoZona;
	private String codigoSubZona;
	private String codigoProducto;
	private String nombreProducto;
	private String codigoServicio;
	private String nombreServicio;
	private String codigoBase;
	private String nombreBase;
	private String codigoPosta;
	private String nombrePosta;
	private String codigoPieza;
	private String codigoBarraGuia;
	private String numeroPieza;
	private String totalPieza;
	
	/**
	 * crea instancia de TrackingReferencia
	 *
	 */
	public CodigoBarraL28() {
		super();
	}

	
	/**
	 * crea instancia de CodigoBarraL28
	 *
	 * @param to {@link CodigoBarraL28TO}
	 */
	public CodigoBarraL28(final CodigoBarraL28TO to) {
		if (to != null) {
			this.codigoBarraL28 = to.getCodigoBarraL28();
			this.codigoComunaIne = to.getCodigoComunaIne();
			this.codigoZona = to.getCodigoZona();
			this.codigoSubZona = to.getCodigoSubZona();
			this.codigoProducto = to.getCodigoProducto();
			this.nombreProducto = to.getNombreProducto();
			this.codigoServicio = to.getCodigoServicio();
			this.nombreServicio = to.getNombreServicio();
			this.codigoBase = to.getCodigoBase();
			this.nombreBase = to.getNombreBase();
			this.codigoPosta = to.getCodigoPosta();
			this.nombrePosta = to.getNombrePosta();
			this.codigoPieza = to.getCodigoPieza();
			this.codigoBarraGuia = to.getCodigoBarraGuia();
			this.numeroPieza = to.getNumeroPieza();
			this.totalPieza = to.getTotalPieza();
		}
	}


	/**
	 * @return the codigoBarraL28
	 */
	public String getCodigoBarraL28() {
		return codigoBarraL28;
	}


	/**
	 * @param codigoBarraL28 the codigoBarraL28 to set
	 */
	public void setCodigoBarraL28(final String codigoBarraL28) {
		this.codigoBarraL28 = codigoBarraL28;
	}


	/**
	 * @return the codigoComunaIne
	 */
	public String getCodigoComunaIne() {
		return codigoComunaIne;
	}


	/**
	 * @param codigoComunaIne the codigoComunaIne to set
	 */
	public void setCodigoComunaIne(final String codigoComunaIne) {
		this.codigoComunaIne = codigoComunaIne;
	}


	/**
	 * @return the codigoZona
	 */
	public String getCodigoZona() {
		return codigoZona;
	}


	/**
	 * @param codigoZona the codigoZona to set
	 */
	public void setCodigoZona(final String codigoZona) {
		this.codigoZona = codigoZona;
	}


	/**
	 * @return the codigoSubZona
	 */
	public String getCodigoSubZona() {
		return codigoSubZona;
	}


	/**
	 * @param codigoSubZona the codigoSubZona to set
	 */
	public void setCodigoSubZona(final String codigoSubZona) {
		this.codigoSubZona = codigoSubZona;
	}

	/**
	 * @return the codigoSubZona
	 */
	public String getCodigoProducto() {
		return codigoProducto;
	}

	/**
	 * @param codigoProducto the codigoProducto to set
	 */
	public void setCodigoProducto(final String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	/**
	 * @return the codigoSubZona
	 */
	public String getNombreProducto() {
		return nombreProducto;
	}

	/**
	 * @param nombreProducto the nombreProducto to set
	 */
	public void setNombreProducto(final String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	/**
	 * @return the codigoSubZona
	 */
	public String getCodigoServicio() {
		return codigoServicio;
	}

	/**
	 * @param codigoServicio the codigoServicio to set
	 */
	public void setCodigoServicio(final String codigoServicio) {
		this.codigoServicio = codigoServicio;
	}

	/**
	 * @return the codigoSubZona
	 */
	public String getNombreServicio() {
		return nombreServicio;
	}

	/**
	 * @param nombreServicio the nombreServicio to set
	 */
	public void setNombreServicio(final String nombreServicio) {
		this.nombreServicio = nombreServicio;
	}

	/**
	 * @return the codigoSubZona
	 */
	public String getCodigoBase() {
		return codigoBase;
	}

	/**
	 * @param codigoBase the codigoBase to set
	 */
	public void setCodigoBase(final String codigoBase) {
		this.codigoBase = codigoBase;
	}

	/**
	 * @return the codigoSubZona
	 */
	public String getNombreBase() {
		return nombreBase;
	}

	/**
	 * @param nombreBase the nombreBase to set
	 */
	public void setNombreBase(final String nombreBase) {
		this.nombreBase = nombreBase;
	}

	/**
	 * @return the codigoSubZona
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
	 * @return the codigoSubZona
	 */
	public String getNombrePosta() {
		return nombrePosta;
	}

	/**
	 * @param nombrePosta the nombrePosta to set
	 */
	public void setNombrePosta(final String nombrePosta) {
		this.nombrePosta = nombrePosta;
	}

	/**
	 * @return the numeroPieza
	 */
	public String getNumeroPieza() {
		return numeroPieza;
	}

	/**
	 * @param numeroPieza the numeroPieza to set
	 */
	public void setNumeroPieza(final String numeroPieza) {
		this.numeroPieza = numeroPieza;
	}

	/**
	 * @return the codigoSubZona
	 */
	public String getCodigoBarraGuia() {
		return codigoBarraGuia;
	}

	/**
	 * @param codigoBarraGuia the codigoBarraGuia to set
	 */
	public void setCodigoBarraGuia(final String codigoBarraGuia) {
		this.codigoBarraGuia = codigoBarraGuia;
	}
	
	

	/**
	 * @return the codigoPieza
	 */
	public String getCodigoPieza() {
		return codigoPieza;
	}

	/**
	 * @param codigoPieza the codigoPieza to set
	 */
	public void setCodigoPieza(final String codigoPieza) {
		this.codigoPieza = codigoPieza;
	}
	
	/**
	 * @return the totalPieza
	 */
	public String getTotalPieza() {
		return totalPieza;
	}

	/**
	 * @param totalPieza the totalPieza to set
	 */
	public void setTotalPieza(final String totalPieza) {
		this.totalPieza = totalPieza;
	}
}
