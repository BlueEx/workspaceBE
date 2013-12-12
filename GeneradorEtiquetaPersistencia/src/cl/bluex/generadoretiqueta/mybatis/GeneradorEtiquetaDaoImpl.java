package cl.bluex.generadoretiqueta.mybatis;

import static cl.bluex.ws.common.util.Constantes.BODEGA;
import static cl.bluex.ws.common.util.Constantes.CODIGO_CLIENTE;
import static cl.bluex.ws.common.util.Constantes.CODIGO_COMUNA;
import static cl.bluex.ws.common.util.Constantes.CODIGO_EMPRESA;
import static cl.bluex.ws.common.util.Constantes.CODIGO_EMPRESA_TRAD;
import static cl.bluex.ws.common.util.Constantes.CODIGO_FORMATO_IMPRESION;
import static cl.bluex.ws.common.util.Constantes.CODIGO_IMPRESORA;
import static cl.bluex.ws.common.util.Constantes.CODIGO_INFLUENCIA;
import static cl.bluex.ws.common.util.Constantes.CODIGO_POSTA;
import static cl.bluex.ws.common.util.Constantes.CODIGO_SUB_ZONA;
import static cl.bluex.ws.common.util.Constantes.CODIGO_SUCURSAL_CLIENTE;
import static cl.bluex.ws.common.util.Constantes.CODIGO_TIPO_CLIENTE;
import static cl.bluex.ws.common.util.Constantes.CODIGO_TIPO_NEGOCIO;
import static cl.bluex.ws.common.util.Constantes.CODIGO_TIPO_SERVICIO;
import static cl.bluex.ws.common.util.Constantes.CODIGO_USUARIO;
import static cl.bluex.ws.common.util.Constantes.CODIGO_ZONA;
import static cl.bluex.ws.common.util.Constantes.CODIGO_ERROR_VALIDO;
import static cl.bluex.ws.common.util.Constantes.CURIER;
import static cl.bluex.ws.common.util.Constantes.EEVV_NMR_ID;
import static cl.bluex.ws.common.util.Constantes.ID_ENCABEZADO;
import static cl.bluex.ws.common.util.Constantes.NOMBRE_COMUNA;
import static cl.bluex.ws.common.util.Constantes.NOMBRE_USUARIO;
import static cl.bluex.ws.common.util.Constantes.NRO_BULTO;
import static cl.bluex.ws.common.util.Constantes.NUMERO_FOLIO;
import static cl.bluex.ws.common.util.Constantes.NUMERO_REFERENCIA;
import static cl.bluex.ws.common.util.Constantes.NUMERO_SERIE_OSER;
import static cl.bluex.ws.common.util.Constantes.OFICINA;
import static cl.bluex.ws.common.util.Constantes.RESULTADO;
import static cl.bluex.ws.common.util.Constantes.TIPO_DOCUMENTO;
import static cl.bluex.ws.common.util.Constantes.TIPO_ETIQUETA;
import static cl.bluex.ws.common.util.Constantes.TIPO_BODEGA;
import static cl.bluex.ws.common.util.Constantes.UNCHECKED;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import cl.bluex.generadoretiqueta.GeneradorEtiquetaDao;
import cl.bluex.generadoretiqueta.mapper.GeneradorEtiquetaMapper;
import cl.bluex.generadoretiqueta.to.CodigoBultoTO;
import cl.bluex.generadoretiqueta.to.DatosGeneracionEtiquetaHubTO;
import cl.bluex.generadoretiqueta.to.DatosGeneracionEtiquetaTO;
import cl.bluex.generadoretiqueta.to.DatosOperacionalesTO;
import cl.bluex.generadoretiqueta.to.DestinoTO;
import cl.bluex.generadoretiqueta.to.EntradaDatosOperacionalesTO;
import cl.bluex.generadoretiqueta.to.GuiaTO;
import cl.bluex.generadoretiqueta.to.OrdenServicioTO;
import cl.bluex.generadoretiqueta.to.ParamOrdenServicioTO;
import cl.bluex.generadoretiqueta.to.ParametroDestinoTO;
import cl.bluex.generadoretiqueta.to.ParametrosCodigoBultoTO;
import cl.bluex.generadoretiqueta.to.ParametrosGuiaPiezaTO;
import cl.bluex.generadoretiqueta.to.ParametrosGuiaTO;
import cl.bluex.generadoretiqueta.to.ParametrosReferenciaTO;
import cl.bluex.generadoretiqueta.to.TemplateTO;
import cl.bluex.ws.common.dao.AbstractDao;
import cl.bluex.ws.common.exceptions.BluexException;

/**
 * Implementacion interfaz Dao.
 * 
 * @version 1.0
 * @author Edgardo Herrera
 * 
 * @version 1.1, 09-12-2013 Ricardo Moscoso. (Blue Express)
 * 			Se agrega nuevo metodo {@link #obtieneDatosOperacionales}.
 * 
 * 
 */
public class GeneradorEtiquetaDaoImpl extends
		AbstractDao<GeneradorEtiquetaMapper> implements GeneradorEtiquetaDao {
	private static final Logger LOGGER = Logger.getLogger(GeneradorEtiquetaDaoImpl.class);
	private Map<String, Object> params = new HashMap<String, Object>();

	public GeneradorEtiquetaDaoImpl(final SqlSession sqlSession) {
		super(sqlSession);
	}

	/* (non-Javadoc)
	 * @see cl.bluex.ws.common.dao.AbstractDao#getMapperClass()
	 */
	@Override
	public Class<GeneradorEtiquetaMapper> getMapperClass() {
		return GeneradorEtiquetaMapper.class;
	}

	/* (non-Javadoc)
	 * @see cl.bluex.generadoretiqueta.GeneradorEtiquetaDao#obtieneDestino(cl.bluex.generadoretiqueta.to.ParametroDestinoTO)
	 */
	@Override
	public DestinoTO obtieneDestino(final ParametroDestinoTO parametroDestinoTO) throws BluexException {
		params = new HashMap<String, Object>();
		params.put(CODIGO_EMPRESA, parametroDestinoTO.getCodigoEmpresaTrad());
		params.put(CODIGO_TIPO_NEGOCIO, parametroDestinoTO.getCodigoTipoNegocio());
		params.put(CODIGO_POSTA, parametroDestinoTO.getCodigoPosta());
		params.put(CODIGO_INFLUENCIA, parametroDestinoTO.getCodigoInfluencia());
		params.put(CODIGO_TIPO_SERVICIO, parametroDestinoTO.getCodigoTipoServicio());
		
		LOGGER.info("codigoEmpresa " + parametroDestinoTO.getCodigoEmpresaTrad());
		LOGGER.info("codigoTipoNegocio " + parametroDestinoTO.getCodigoTipoNegocio());
		LOGGER.info("codigoPosta " + parametroDestinoTO.getCodigoPosta());
		LOGGER.info("codigoInfluencia " + parametroDestinoTO.getCodigoInfluencia());
		LOGGER.info("codigoTipoServicio " + parametroDestinoTO.getCodigoTipoServicio());
		
		getMapper().obtieneDestino(params);
		
		this.esExcepcion();

		final DestinoTO destinoTO = new DestinoTO();
		destinoTO.setCodigoComuna((String) params.get(CODIGO_COMUNA));
		destinoTO.setNombreComuna((String) params.get(NOMBRE_COMUNA));
		destinoTO.setCodigoSubZona((String)params.get(CODIGO_SUB_ZONA));
		destinoTO.setCodigoZona((String) params.get(CODIGO_ZONA));

		return destinoTO;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.generadoretiqueta.GeneradorEtiquetaDao#obtieneTemplate(long,
	 * long, int)
	 */
	@Override
	public List<TemplateTO> obtieneTemplate(
			final long codigoUsuario,
			final long codigoImpresora, 
			final long codigoFormatoImpresion,
			final String tipoEtiqueta) 
			throws BluexException {
		params = new HashMap<String, Object>();
		params.put(CODIGO_USUARIO, codigoUsuario);
		params.put(CODIGO_IMPRESORA, codigoImpresora);
		params.put(CODIGO_FORMATO_IMPRESION, codigoFormatoImpresion);
		params.put(TIPO_ETIQUETA, tipoEtiqueta);

		getMapper().obtieneTemplate(params);

		this.esExcepcion();

		@SuppressWarnings(UNCHECKED)
		final List<TemplateTO> respuesta = (List<TemplateTO>) params
				.get(RESULTADO);

		return respuesta;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.generadoretiqueta.GeneradorEtiquetaDao#obtieneDatosImpresion
	 * (long)
	 */
	@Override
	public DatosGeneracionEtiquetaTO obtieneDatosImpresion(final long eevvNmrId)
			throws BluexException {
		DatosGeneracionEtiquetaTO to = new DatosGeneracionEtiquetaTO();

		params = new HashMap<String, Object>();
		params.put(EEVV_NMR_ID, eevvNmrId);

		getMapper().obtieneDatosImpresion(params);

		this.esExcepcion();

		@SuppressWarnings(UNCHECKED)
		final List<DatosGeneracionEtiquetaTO> resultados = (List<DatosGeneracionEtiquetaTO>) params
				.get(RESULTADO);

		if (!resultados.isEmpty()) {
			to = resultados.get(0);
		}
		return to;
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.generadoretiqueta.GeneradorEtiquetaDao#obtieneGuiasPorEncabezado(int, int)
	 */
	@Override
	public List<GuiaTO> obtieneGuiasPorEncabezado(
			final int idEncabezado)
			throws BluexException {
		params = new HashMap<String, Object>();
		params.put(ID_ENCABEZADO, idEncabezado);
		
		getMapper().obtieneGuiasPorEncabezado(params);
		
		this.esExcepcion();
		
		@SuppressWarnings(UNCHECKED)
		final List<GuiaTO> respuesta = (List<GuiaTO>) params.get(RESULTADO);
		
		return respuesta;
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.generadoretiqueta.GeneradorEtiquetaDao#obtieneGuiasPorFolio(int, int)
	 */
	@Override
	public List<GuiaTO> obtieneGuiasPorFolio(
			final ParametrosGuiaTO to)
			throws BluexException {
		params = new HashMap<String, Object>();
		
		params.put(CODIGO_EMPRESA, to.getCodigoEmpresa());
		params.put(NRO_BULTO, to.getNroBulto());
		params.put(TIPO_DOCUMENTO, to.getTipoDocumento());
		params.put(NUMERO_FOLIO, to.getNumeroFolio());
		
		getMapper().obtieneGuiasPorFolio(params);
		
		this.esExcepcion();
		
		@SuppressWarnings(UNCHECKED)
		final List<GuiaTO> respuesta = (List<GuiaTO>) params.get(RESULTADO);
		
		return respuesta;
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.generadoretiqueta.GeneradorEtiquetaDao#obtieneGuiasPorReferencia(int)
	 */
	@Override
	public List<GuiaTO> obtieneGuiasPorReferencia(final ParametrosReferenciaTO to)
			throws BluexException {
		params = new HashMap<String, Object>();
		
		params.put(CODIGO_CLIENTE, to.getCodigoCliente());
		params.put(CODIGO_EMPRESA, to.getCodigoEmpresa());
		params.put(CODIGO_SUCURSAL_CLIENTE, to.getCodigoSucursalCliente());
		params.put(CODIGO_TIPO_CLIENTE, to.getCodigoTipoCliente());
		params.put(NUMERO_REFERENCIA, to.getNumeroReferencia());
		
		getMapper().obtieneGuiasPorReferencia(params);
		
		this.esExcepcion();
		
		@SuppressWarnings(UNCHECKED)
		final List<GuiaTO> respuesta = (List<GuiaTO>) params.get(RESULTADO);
		
		return respuesta;
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.generadoretiqueta.GeneradorEtiquetaDao#obtieneGuiasPorPieza(cl.bluex.generadoretiqueta.to.ParametrosGuiaPiezaTO)
	 */
	@Override
	public List<GuiaTO> obtieneGuiasPorPieza(
			final ParametrosGuiaPiezaTO to) throws BluexException {
		params = new HashMap<String, Object>();
		
		params.put(CODIGO_EMPRESA_TRAD, to.getCodigoEmpresaTrad());
		params.put(NRO_BULTO, to.getNroBulto());
		params.put(NUMERO_FOLIO, to.getNumeroFolio());
		params.put(TIPO_DOCUMENTO, to.getTipoDocumento());
		
		getMapper().obtieneGuiasPorPieza(params);
		
		this.esExcepcion();
		
		@SuppressWarnings(UNCHECKED)
		final List<GuiaTO> respuesta = (List<GuiaTO>) params.get(RESULTADO);
		
		return respuesta;
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.generadoretiqueta.GeneradorEtiquetaDao#obtieneDatosImpresionHub(int)
	 */
	@Override
	public DatosGeneracionEtiquetaHubTO obtieneDatosImpresionHub(final long eevvNroId) 
			throws BluexException {
		DatosGeneracionEtiquetaHubTO to = new DatosGeneracionEtiquetaHubTO();

		params = new HashMap<String, Object>();
		params.put(EEVV_NMR_ID, eevvNroId);
		
		getMapper().obtieneDatosImpresionHub(params);
		
		this.esExcepcion();

		@SuppressWarnings(UNCHECKED)
		final List<DatosGeneracionEtiquetaHubTO> resultados = (List<DatosGeneracionEtiquetaHubTO>) params
				.get(RESULTADO);

		if (!resultados.isEmpty()) {
			to = resultados.get(0);
		}
		return to;
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.generadoretiqueta.GeneradorEtiquetaDao#obtieneOrdenesServicio(cl.bluex.generadoretiqueta.to.ParamOrdenServicioTO)
	 */
	@Override
	public List<OrdenServicioTO> obtieneOrdenesServicio(
			final ParamOrdenServicioTO parametrosTO) throws BluexException {
		params = new HashMap<String, Object>();
		params.put(NUMERO_SERIE_OSER, parametrosTO.getNumeroSerieOser());
		params.put(TIPO_DOCUMENTO, parametrosTO.getIdTipoDocumento());
		params.put(CODIGO_EMPRESA, parametrosTO.getCodigoEmpresa());
		
		getMapper().obtieneOrdenesServicio(params);
		
		this.esExcepcion();
		
		@SuppressWarnings(UNCHECKED)
		final List<OrdenServicioTO> respuesta = (List<OrdenServicioTO>) params.get(RESULTADO);
		
		return respuesta;
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.generadoretiqueta.GeneradorEtiquetaDao#obtieneCodigoBultoL28(cl.bluex.generadoretiqueta.to.ParametrosCodigoBultoTO)
	 */
	@Override
	public CodigoBultoTO obtieneCodigoBultoL28(
			final ParametrosCodigoBultoTO parametrosTO) throws BluexException {
		CodigoBultoTO to = new CodigoBultoTO();
		
		params = new HashMap<String, Object>();
		params.put(CODIGO_EMPRESA, parametrosTO.getCodigoEmpresa());
		params.put(TIPO_DOCUMENTO, parametrosTO.getIdTipoDocumento());
		params.put(NUMERO_SERIE_OSER, parametrosTO.getNumeroSerieOser());
		
		getMapper().obtieneCodigoBultoL28(params);
		
		this.esExcepcion();

		@SuppressWarnings(UNCHECKED)
		final List<CodigoBultoTO> resultados = (List<CodigoBultoTO>) params
				.get(RESULTADO);

		if (!resultados.isEmpty()) {
			to = resultados.get(0);
		}
		return to;
	}

	/**
	 * Metodo encargado de obtener los datos operacionales.
	 * @author 	Ricardo Moscoso.
	 * @param 	parametrosTO objeto con datos de entrada.
	 * @return 	DatosOperacionalesTO 
	 * @throws 	BluexException
	 */
	@Override
	public DatosOperacionalesTO obtieneDatosOperacionales(
			final EntradaDatosOperacionalesTO parametrosTO) throws BluexException {
		
			LOGGER.info("[GeneradorEtiquetaDaoImpl] obtieneDatosOperacionales :");
			LOGGER.info(" Nombre Usuario : " + parametrosTO.getNombreUsuario());
		
			params = new HashMap<String, Object>();
			params.put(NOMBRE_USUARIO, parametrosTO.getNombreUsuario());
			getMapper().obtieneDatosOperacionales(params);
			
			LOGGER.info("Parametros de salida	: "	+ params.toString());
			
			final DatosOperacionalesTO datosoperacionalesTO = 
					new DatosOperacionalesTO((String)params.get(CURIER),(String)params.get(OFICINA),(String)params.get(BODEGA),
							(String)params.get(TIPO_BODEGA));
			
			return datosoperacionalesTO;
	}
	
	
	private void esExcepcion() throws BluexException {
		final Integer codError = (Integer) params.get(COD_ERROR);
		final String descError = (String) params.get(DESC_ERROR);

		if (codError != CODIGO_ERROR_VALIDO) {
			LOGGER.info("codigo de error: " + codError);
			throw new BluexException(codError.toString(), descError);
		}
	}

}
