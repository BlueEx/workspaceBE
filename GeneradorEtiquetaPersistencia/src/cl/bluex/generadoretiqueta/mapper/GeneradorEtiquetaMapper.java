package cl.bluex.generadoretiqueta.mapper;

import java.util.Map;

import cl.bluex.ws.common.exceptions.BluexException;

/**
 * interfaz de mapeo.
 * 
 * @author Edgardo Herrera
 *
 */
public interface GeneradorEtiquetaMapper {
    
    /**
     * Mapper para destino.
     * 
     * @param {@link Map<String, Object> params}
     */
    void obtieneDestino(Map<String, Object> params) throws BluexException;

    /**
     * Mapper para template.
     * 
     * @param {@link Map<String, Object> params}
     */
    void obtieneTemplate(Map<String, Object> params) throws BluexException;

    /**
     * Mapper para obtener datos para la etiqueta.
     * 
     * @param {@link Map<String, Object> params}
     */
	void obtieneDatosImpresion(Map<String, Object> params) throws BluexException;

	/**
	 * Mapper para obtener datos de las guias.
	 * 
	 * @param {@link Map<String, Object> params}
	 */
	void obtieneGuiasPorEncabezado(Map<String, Object> params) throws BluexException;

	/**
	 * Mapper para obtener guias por folio.
	 * 
	 * @param {@link Map<String, Object> params}
	 */
	void obtieneGuiasPorFolio(Map<String, Object> params) throws BluexException;

	/**
	 * Mapper para obtener guias por referencia.
	 * 
	 * @param {@link Map<String, Object> params}
	 */
	void obtieneGuiasPorReferencia(Map<String, Object> params) throws BluexException;

	/**
	 * Mapper para obtener los datos de impresion de la etiqueta HUB.
	 * 
	 * @param {@link Map<String, Object> params}
	 */
	void obtieneDatosImpresionHub(Map<String, Object> params) throws BluexException;

	/**
	 * Mapper para obtener guias por referencia.
	 * 
	 * @param {@link Map<String, Object> params}
	 */
	void obtieneGuiasPorPieza(Map<String, Object> params) throws BluexException;

	/**
	 * Mapper para obtener orden de servicio.
	 * 
	 * @param {@link Map<String, Object> params}
	 */
	void obtieneOrdenesServicio(Map<String, Object> params) throws BluexException;

	/**
	 * Mapper para obtener codigo bulto L28.
	 * 
	 * @param {@link Map<String, Object> params}
	 */
	void obtieneCodigoBultoL28(Map<String, Object> params) throws BluexException;
    
	
	/**
	 * Mapper 
	 * 
	 * @param {@link Map<String, Object> params}
	 */
	void obtieneDatosOperacionales(Map<String, Object> params) throws BluexException;
}
