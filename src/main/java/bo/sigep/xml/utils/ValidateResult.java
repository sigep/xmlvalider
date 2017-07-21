package bo.sigep.xml.utils;

/**
 *
 * @author jheredia
 */
public class ValidateResult {
    private String estado;
    private long lineaError;
    private long columnaError;
    private String mensajeError;

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the lineaError
     */
    public long getLineaError() {
        return lineaError;
    }

    /**
     * @param lineaError the lineaError to set
     */
    public void setLineaError(long lineaError) {
        this.lineaError = lineaError;
    }

    /**
     * @return the columnaError
     */
    public long getColumnaError() {
        return columnaError;
    }

    /**
     * @param columnaError the columnaError to set
     */
    public void setColumnaError(long columnaError) {
        this.columnaError = columnaError;
    }

    /**
     * @return the mensajeError
     */
    public String getMensajeError() {
        return mensajeError;
    }

    /**
     * @param mensajeError the mensajeError to set
     */
    public void setMensajeError(String mensajeError) {
        this.mensajeError = mensajeError;
    }
}
