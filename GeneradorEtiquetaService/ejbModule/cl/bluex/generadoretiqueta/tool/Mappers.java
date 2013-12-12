package cl.bluex.generadoretiqueta.tool;

import java.util.ArrayList;
import java.util.List;

import cl.bluex.generadoretiqueta.bean.DatosImpresion;
import cl.bluex.generadoretiqueta.bean.DatosOperacionales;
import cl.bluex.generadoretiqueta.bean.Destino;
import cl.bluex.generadoretiqueta.bean.EntradaDatosOperacionales;
import cl.bluex.generadoretiqueta.bean.Etiqueta;
import cl.bluex.generadoretiqueta.bean.Guia;
import cl.bluex.generadoretiqueta.bean.OrdenServicio;
import cl.bluex.generadoretiqueta.bean.ParamOrdenServicio;
import cl.bluex.generadoretiqueta.bean.ParametroDestino;
import cl.bluex.generadoretiqueta.bean.ParametrosCodigoBulto;
import cl.bluex.generadoretiqueta.bean.ParametrosGuia;
import cl.bluex.generadoretiqueta.bean.ParametrosGuiaPieza;
import cl.bluex.generadoretiqueta.bean.ParametrosReferencia;
import cl.bluex.generadoretiqueta.bean.request.RequestGeneraEtiquetaDigExpress;
import cl.bluex.generadoretiqueta.to.DatosImpresionTO;
import cl.bluex.generadoretiqueta.to.DatosOperacionalesTO;
import cl.bluex.generadoretiqueta.to.DestinoTO;
import cl.bluex.generadoretiqueta.to.EntradaDatosOperacionalesTO;
import cl.bluex.generadoretiqueta.to.EtiquetaTO;
import cl.bluex.generadoretiqueta.to.GuiaTO;
import cl.bluex.generadoretiqueta.to.OrdenServicioTO;
import cl.bluex.generadoretiqueta.to.ParamOrdenServicioTO;
import cl.bluex.generadoretiqueta.to.ParametroDestinoTO;
import cl.bluex.generadoretiqueta.to.ParametrosCodigoBultoTO;
import cl.bluex.generadoretiqueta.to.ParametrosGuiaPiezaTO;
import cl.bluex.generadoretiqueta.to.ParametrosGuiaTO;
import cl.bluex.generadoretiqueta.to.ParametrosReferenciaTO;

/**
 * Mapeos de objetos.
 * 
 * @author Edgardo Herrera
 * 
 */
public final class Mappers {

	private Mappers() {
		super();
	}

	/**
	 * Mapea datos desde {@link DestinoTO} a {@link Destino}.
	 * 
	 * @param {@link DestinoTO}
	 * @return {@link Destino}
	 */
	public static Destino mapperTo(final DestinoTO to) {
		final Destino bean = new Destino();

		bean.setCodigoComuna(to.getCodigoComuna());
		bean.setCodigoSubZona(to.getCodigoSubZona());
		bean.setCodigoZona(to.getCodigoZona());
		bean.setNombreComuna(to.getNombreComuna());

		return bean;
	}

	/**
	 * Mapea datos desde {@link DatosImpresion} a {@link DatosImpresionTO}.
	 * 
	 * @param {@link DatosImpresion}
	 * @return {@link DatosImpresionTO}
	 */
	public static DatosImpresionTO mapperTo(final DatosImpresion bean) {
		final DatosImpresionTO to = new DatosImpresionTO();
		to.setCodigoBarra(bean.getCodigoBarra());
		to.setTipoEtiqueta(bean.getTipoEtiqueta());
		to.setEmpresa(bean.getEmpresa());
		to.setInicialTipoEtiqueta(bean.getInicialTipoEtiqueta());
		to.setFecha(bean.getFecha());
		to.setCodigoPosta(bean.getCodigoPosta());
		to.setNombrePosta(bean.getNombrePosta());
		to.setCodigoImpresora(bean.getCodigoImpresora());
		to.setCantidad(bean.getCantidad());
		to.setCodigoUsuario(bean.getCodigoUsuario());
		to.setCodigoFormatoImpresion(bean.getCodigoFormatoImpresion());
		to.setZona(bean.getZona());
		to.setComunaine(bean.getComunaine());

		return to;
	}

	/**
	 * Mapea datos desde {@link EtiquetaTO} a {@link Etiqueta}.
	 * 
	 * @param {@link EtiquetaTO}
	 * @return {@link Etiqueta}
	 */
	public static Etiqueta mapperTo(final EtiquetaTO to) {
		final Etiqueta bean = new Etiqueta();

		bean.setContenidoEtiqueta(to.getContenidoEtiqueta());

		return bean;
	}

	/**
	 * @param request
	 * @return
	 */
	public static DatosImpresionTO mapperTo(
			final RequestGeneraEtiquetaDigExpress bean) {
		final DatosImpresionTO to = new DatosImpresionTO();
		
		to.setEmpresa(bean.getEmpresa());
		to.setCourier(bean.getCourier());
		to.setCantidad(bean.getCantidad());
		to.setFecha(bean.getFecha());
		to.setCodigoBarra(bean.getCodigoBarra());
		to.setBulto(bean.getBulto());
		to.setDescripcion(bean.getDescripcion());
		to.setCodigoUsuario(bean.getCodigoUsuario());
		to.setCodigoImpresora(bean.getCodigoImpresora());
		to.setCodigoFormatoImpresion(bean.getCodigoFormatoImpresion());

		return to;
	}

	/**
	 * @param guiasTO
	 * @return
	 */
	public static List<Guia> mapperGuias(
			final List<GuiaTO> tos) {
		final List<Guia> beans = new ArrayList<Guia>();
		for (final GuiaTO to : tos) {
			beans.add(new Guia(to));
		}
		return beans;
	}

	/**
	 * Mapper de ParametrosReferencia a ParametrosReferenciaTO.
	 * 
	 * @param parametrosReferencia
	 * @return {@link ParametrosReferenciaTO}
	 */
	public static ParametrosReferenciaTO mapperParametrosReferencia(
			final ParametrosReferencia bean) {
		final ParametrosReferenciaTO to = new ParametrosReferenciaTO();
		to.setCodigoCliente(bean.getCodigoCliente());
		to.setCodigoEmpresa(bean.getCodigoEmpresa());
		to.setCodigoSucursalCliente(bean.getCodigoSucursalCliente());
		to.setCodigoTipoCliente(bean.getCodigoTipoCliente());
		to.setNumeroReferencia(bean.getNumeroReferencia());
		
		return to;
	}

	/**
	 * Mapeo de ParametrosGuia a ParametrosGuiaTO
	 * @param parametrosGuia
	 * @return {@link ParametrosGuiaTO}
	 */
	public static ParametrosGuiaTO mapperParametrosGuia(
			final ParametrosGuia bean) {
		final ParametrosGuiaTO to = new ParametrosGuiaTO();
		to.setCodigoEmpresa(bean.getCodigoEmpresa());
		to.setNroBulto(bean.getNroBulto());
		to.setNumeroFolio(bean.getNumeroFolio());
		to.setTipoDocumento(bean.getTipoDocumento());
		
		return to;
	}

	/**
	 * Mapeo de ParametrosGuiaPieza a ParametrosGuiaPiezaTO.
	 * 
	 * @param parametrosGuiaPieza
	 * @return {@link ParametrosGuiaPiezaTO}
	 */
	public static ParametrosGuiaPiezaTO mapperParametrosGuiaPieza(
			final ParametrosGuiaPieza bean) {
		final ParametrosGuiaPiezaTO to = new ParametrosGuiaPiezaTO();
		to.setCodigoEmpresaTrad(bean.getCodigoEmpresaTrad());
		to.setNroBulto(bean.getNroBulto());
		to.setNumeroFolio(bean.getNumeroFolio());
		to.setTipoDocumento(bean.getTipoDocumento());
		
		return to;
	}

	/**
	 * Mapeo de ParametroDestino a ParametroDestinoTO.
	 * 
	 * @param parametroDestino
	 * @return {@link ParametroDestinoTO}
	 */
	public static ParametroDestinoTO mapperTo(final ParametroDestino bean) {
		final ParametroDestinoTO to = new ParametroDestinoTO();
		to.setCodigoEmpresaTrad(bean.getCodigoEmpresaTrad());
		to.setCodigoInfluencia(bean.getCodigoInfluencia());
		to.setCodigoPosta(bean.getCodigoPosta());
		to.setCodigoTipoServicio(bean.getCodigoTipoServicio());
		to.setCodigoTipoNegocio(bean.getCodigoTipoNegocio());
		
		return to;
	}

	/**
	 * mapeo de ParamOrdenServicio a ParamOrdenServicioTO
	 * @param paramatros
	 * @return {@link ParamOrdenServicioTO}
	 */
	public static ParamOrdenServicioTO mapperParametrosOser(
			final ParamOrdenServicio bean) {
		final ParamOrdenServicioTO to = new ParamOrdenServicioTO();
		to.setNumeroSerieOser(bean.getNumeroSerieOser());
		to.setIdTipoDocumento(bean.getIdTipoDocumento());
		to.setCodigoEmpresa(bean.getCodigoEmpresa());
		
		return to;
	}

	/**
	 * mapea lista de OrdenServicioTO a lista de OrdenServicio.
	 * @param osersTO
	 * @return lista de {@link OrdenServicio}
	 */
	public static List<OrdenServicio> mapperOsers(final List<OrdenServicioTO> tos) {
		final List<OrdenServicio> beans = new ArrayList<OrdenServicio>();
		for (final OrdenServicioTO to : tos) {
			beans.add(new OrdenServicio(to));
		}
		return beans;
	}
	
	
	/**
	 * mapeo de EntradaDatosOperacionales a EntradaDatosOperacionalesTO
	 * @param paramatros
	 * @return {@link EntradaDatosOperacionalesTO}
	 */
	public static EntradaDatosOperacionalesTO mapperParametrosDatosOperacionales(
			final EntradaDatosOperacionales bean) {
		final EntradaDatosOperacionalesTO to = new EntradaDatosOperacionalesTO();
		to.setNombreUsuario(bean.getNombreUsuario());
		return to;
	}
	
	/**
	 * mapea DatosOperacionalesTO a DatosOperacionales.
	 * @param DatosOperacionalesTO
	 * @return lista de {@link DatosOperacionales}
	 */
	public static DatosOperacionales mapperDatosOperacionales(final DatosOperacionalesTO to) {
		
		final DatosOperacionales bean = new DatosOperacionales();
		bean.setBodega(to.getBodega());
		bean.setCourier(to.getCourier());
		bean.setOficina(to.getOficina());
		bean.setTipoBodega(to.getTipoBodega());

		return bean;
		
	}
	
	/**
	 * Mapea parametros de entrada.
	 * 
	 * @param parametrosCodigoBulto
	 * @return {@link ParametrosCodigoBultoTO}
	 */
	public static ParametrosCodigoBultoTO mapperParametrosCodigoBulto(
			final ParametrosCodigoBulto bean) {
		final ParametrosCodigoBultoTO to = new ParametrosCodigoBultoTO();
		to.setCodigoEmpresa(bean.getCodigoEmpresa());
		to.setIdTipoDocumento(bean.getIdTipoDocumento());
		to.setNumeroSerieOser(bean.getNumeroSerieOser());
		
		return to;
	}

}
