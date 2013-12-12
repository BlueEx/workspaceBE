package cl.bluex.digexpress;

import java.util.List;

import cl.bluex.digmodel.to.AgrupacionTO;
import cl.bluex.digmodel.to.CabeceraAgrupacionTO;
import cl.bluex.digmodel.to.ClienteTO;
import cl.bluex.digmodel.to.DetalleDigitacionExpressTO;
import cl.bluex.digmodel.to.EspecieValoradaTO;
import cl.bluex.digmodel.to.HojaRutaTO;
import cl.bluex.digmodel.to.ValoradoTO;
import cl.bluex.ws.common.exceptions.BluexException;

/**
 * Interface Dao.
 * 
 * @author Edgardo Herrera
 *
 */
public interface DigitacionExpressDao {

    /**
     * Metodo que actualiza cabecerca agrupacion.
     * 
     * @param cabeceraAgrupacionTO datos cabecera agrupacion.
     * @return {@link CabeceraAgrupacionTO}
     * @throws BluexException
     */
    CabeceraAgrupacionTO actualizaEncDigExpress(
	    CabeceraAgrupacionTO cabeceraAgrupacionTO) throws BluexException;

    /**
     * Metodo que inserta una digitacion express.
     * 
     * @param detalleDigitacionTO datos de detalle digitacion
     * @return {@link Long}
     * @throws BluexException
     */
    Long insertaDigitExpress(DetalleDigitacionExpressTO detalleDigitacionTO) throws BluexException;

    /**
     * Metodo para eliminar agrupacion.
     * 
     * @param codigo de agrupacion
     * @return {@link Long}
     * @throws BluexException
     */
    Long eliminarAgrupacion(Long codigo) throws BluexException;

    /**
     * Metodo que cierra agrupacion.
     * 
     * @param codigo de agrupacion
     * @return {@link AgrupacionTO}
     * @throws BluexException
     */
    AgrupacionTO cerrarAgrupacion(Long codigo) throws BluexException;

    /**
     * Metodo que obtiene una agrupacion.
     * 
     * @param cabeceraAgrupacionTO datos de la cabecera de la agrupacion
     * @return {@link CabeceraAgrupacionTO}
     * @throws BluexException
     */
    CabeceraAgrupacionTO obtieneAgrupacion(
	    CabeceraAgrupacionTO cabeceraAgrupacionTO) throws BluexException;

    /**
     * Metodo que obtiene la cabecera de una agrupacion.
     * 
     * @param codigo de agrupacion
     * @return {@link CabeceraAgrupacionTO}
     * @throws BluexException
     */
    CabeceraAgrupacionTO obtieneCabeceraAgrupacion(long codigo) throws BluexException;

    /**
     * Metodo que obtiene los datos de una hoja de ruta.
     * 
     * @param folio de la hoja de ruta
     * @return {@link HojaRutaTO}
     * @throws BluexException
     */
    HojaRutaTO obtieneDatosHojaRuta(String folio) throws BluexException;

    /**
     * Metodo que elimina una digitacion express.
     * 
     * @param detalleDigitacionExpressTO datos del detalle de digitacion express
     * @return {@link Long}
     * @throws BluexException
     */
    Long eliminaDigitExpress(
	    DetalleDigitacionExpressTO detalleDigitacionExpressTO) throws BluexException;

    /**
     * @param codigoEmpresa el codigo de la empresa
     * @param codigoTipoDocumento el codigo del tipo de documento
     * @param numeroDocumento el numero de documento
     * @return {@link EspecieValoradaTO}
     * @throws BluexException
     */
    EspecieValoradaTO validaEspecieValorada(long codigoEmpresa,
	    String codigoTipoDocumento, long numeroDocumento) throws BluexException;

    /**
     * @param codigoEmpresa el codigo de la empresa
     * @return lista de {@link ClienteTO}
     * @throws BluexException
     */
    List<ClienteTO> obtieneClientesValorados(long codigoEmpresa) throws BluexException;

    /**
     * @param codigoCliente codigo de cliente
     * @param codigoTipoCliente codigo tipo de cliente
     * @param codigoEmpresa codigo de empresa
     * @param codigoSucursalCliente codigo de sucursal del cliente
     * @return lista de {@link ValoradoTO}
     * @throws BluexException
     */
    List<ValoradoTO> obtieneValorados(long codigoCliente,
	    long codigoTipoCliente, long codigoEmpresa,
	    long codigoSucursalCliente) throws BluexException;

    List<DetalleDigitacionExpressTO> obtieneDigitExpress(long id, long eevvNmrId) throws BluexException;

    /**
     * Metodo que modifica el estado de una agrupacion.
     * Para cambiar a estado cerrado, utilizar metodo {@link #cerrarAgrupacion(Long)}
     * 
     * @param idCabeceraAgrupacion id de la cabecera de agrupacion
     * @param codigoEstado el codigo del estado
     * @return {@link AgrupacionTO}
     * @throws BluexException
     */
    AgrupacionTO modificarEstadoAgrupacion(long idCabeceraAgrupacion, String codigoEstado) throws BluexException;

}
