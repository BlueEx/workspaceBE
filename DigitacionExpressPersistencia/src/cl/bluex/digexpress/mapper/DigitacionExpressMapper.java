package cl.bluex.digexpress.mapper;

import java.util.Map;

/**
 * interfaz de mapeo.
 * 
 * @author Edgardo Herrera
 *
 */
public interface DigitacionExpressMapper {

    /**
     * Mapper para actualizacion de la cabecera de agrupacion. 
     * @param {@link Map<String, Object> params}
     */
    void actualizaCabeceraAgrupacion(Map<String, Object> params);
    /**
     * Mapper para insercion digitacion express.
     * 
     * @param {@link Map<String, Object> params}
     */
    void insertaDigitExpress(Map<String, Object> params);
    /**
     * Mapper para eliminacion digitacion express.
     * 
     * @param {@link Map<String, Object> params}
     */    
    void eliminaDigitExpress(Map<String, Object> params);
    /**
     * Mapper para eliminacion agrupacion.
     * 
     * @param {@link Map<String, Object> params}
     */
    void eliminarAgrupacion(Map<String, Object> params);
    /**
     * Mapper para cierre de agrupacion.
     * 
     * @param {@link Map<String, Object> params}
     */
    void cerrarAgrupacion(Map<String, Object> params);
    /**
     * Mapper que modifica estado agrupacion.
     * 
     * @param {@link Map<String, Object> params}
     */
    void modificarEstadoAgrupacion(Map<String, Object> params);
    /**
     * Mapper para obtener agrupacion.
     * 
     * @param {@link Map<String, Object> params}
     */
    void obtieneAgrupacion(Map<String, Object> params);
    /**
     * Mapper para obtener la cabecera de la agrupacion.
     * 
     * @param {@link Map<String, Object> params}
     */
    void obtieneCabeceraAgrupacion(Map<String, Object> params);
    /**
     * Mapper para obtener datos de la hoja de ruta.
     * 
     * @param {@link Map<String, Object> params}
     */
    void obtieneDatosHojaRuta(Map<String, Object> params);
    /**
     * Mapper para validar la especie valorada.
     * 
     * @param {@link Map<String, Object> params}
     */
    void validaEspecieValorada(Map<String, Object> params);
    /**
     * Mapper para obtener los clientes valorados.
     * 
     * @param {@link Map<String, Object> params}
     */
    void obtieneClientesValorados(Map<String, Object> params);
    /**
     * Mapper para obtener valorados.
     * 
     * @param {@link Map<String, Object> params}
     */
    void obtieneValorados(Map<String, Object> params);
    /**
     * Mapper para obtener digitacion express.
     * 
     * @param {@link Map<String, Object> params}
     */
    void obtieneDigitExpress(Map<String, Object> params);
}
