package cl.bluex.generadoretiqueta;

import java.util.List;

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
import cl.bluex.ws.common.exceptions.BluexException;

/**
 * Interfaz metodos listas.
 * 
 * @author Edgardo Herrera
 *
 */
public interface GeneradorEtiquetaDao {

    /**
     * Metodo que obtiene el destino.
     * 
     * @param parametroDestinoTO
     * @return
     * @throws BluexException
     */
    DestinoTO obtieneDestino(ParametroDestinoTO parametroDestinoTO) throws BluexException;

    
    /**
     * Metodo que obtiene el template.
     * 
     * @param codigoUsuario el codigo del usuario
     * @param codigoImpresora el codigo de la impresora
     * @param codigoFormatoImpresion el codigo del formato de impresion
     * @param tipoEtiqueta el tipo de etiqueta
     * @return una lista de {@link TemplateTO}
     * @throws BluexException
     */
    List<TemplateTO> obtieneTemplate(
    		long codigoUsuario, 
    		long codigoImpresora, 
    		long codigoFormatoImpresion,
    		String tipoEtiqueta) throws BluexException;

	/**
	 * @param eevvNmrId
	 * @return
	 */
    DatosGeneracionEtiquetaTO obtieneDatosImpresion(long eevvNmrId) throws BluexException;

    /**
     * Método que obtiene las guias por encabezado.
     * 
     * @param idEncabezado
     * @return
     * @throws BluexException
     */
    List<GuiaTO> obtieneGuiasPorEncabezado(int idEncabezado) throws BluexException;

	/**
	 * Metodo que obtiene las guias por folio.
	 * 
	 * @param parametrosGuiaTO
	 * @return
	 * @throws BluexException
	 */
	List<GuiaTO> obtieneGuiasPorFolio(ParametrosGuiaTO parametrosGuiaTO) throws BluexException;

	/**
	 * Metodo que obtiene las guias por referencia.
	 * 
	 * @param parametrosReferenciaTO
	 * @return
	 * @throws BluexException
	 */
	List<GuiaTO> obtieneGuiasPorReferencia(ParametrosReferenciaTO parametrosReferenciaTO) throws BluexException;


	/**
	 * Metodo que obtiene los datos para la impresion de la etiqueta HUB.
	 * 
	 * @param eevvId el id de la especie valorada
	 * @return {@link DatosGeneracionEtiquetaHubTO}
	 */
	DatosGeneracionEtiquetaHubTO obtieneDatosImpresionHub(long eevvNroId) throws BluexException;


	/**
	 * Metodo que obtiene las guias por pieza.
	 * 
	 * @param parametrosPiezaTO
	 * @return lista de {@link GuiaTO}
	 */
	List<GuiaTO> obtieneGuiasPorPieza(ParametrosGuiaPiezaTO parametrosPiezaTO) throws BluexException;


	/**
	 * Metodo que obtiene las ordenes de servicio.
	 * 
	 * @param parametrosTO
	 * @return lista de {@link OrdenServicioTO}
	 */
	List<OrdenServicioTO> obtieneOrdenesServicio(
			ParamOrdenServicioTO parametrosTO) throws BluexException;


	/**
	 * Metodo que obtiene el codigo bulto L28.
	 * 
	 * @param parametrosTO
	 * @return {@link CodigoBultoTO}
	 */
	CodigoBultoTO obtieneCodigoBultoL28(ParametrosCodigoBultoTO parametrosTO) throws BluexException;
	
	/**
	 * Metodo.
	 * 
	 * @param parametrosTO
	 * @return lista de {@link DatosOperacionalesTO}
	 */
	DatosOperacionalesTO obtieneDatosOperacionales(
			EntradaDatosOperacionalesTO parametrosTO) throws BluexException;

}
