import java.util.Date;

public abstract class Notificacion {
    private String codigo;
    private String mensaje;
    private Date fechaEnvio;
    private EstadoNotificacion estado;
    private TipoNotificacion tipo;

    public Notificacion() {}

    public Notificacion(String codigo, String mensaje, Date fechaEnvio, EstadoNotificacion estado, TipoNotificacion tipo) {
        this.codigo = codigo;
        this.mensaje = mensaje;
        this.fechaEnvio = fechaEnvio;
        this.estado = estado;
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public EstadoNotificacion getEstado() {
        return estado;
    }

    public void setEstado(EstadoNotificacion estado) {
        this.estado = estado;
    }

    public TipoNotificacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoNotificacion tipo) {
        this.tipo = tipo;
    }

    public abstract void enviar();
}

