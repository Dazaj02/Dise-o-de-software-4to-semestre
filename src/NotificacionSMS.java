import java.util.Date;

public class NotificacionSMS extends Notificacion {
    private String numeroCelular;

    public NotificacionSMS(String codigo, String mensaje, Date fechaEnvio, EstadoNotificacion estado, TipoNotificacion tipo, String numeroCelular) {
        super(codigo, mensaje, fechaEnvio, estado, tipo);
        this.numeroCelular = numeroCelular;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS al número " + numeroCelular + " con mensaje: " + getMensaje());
        setEstado(EstadoNotificacion.ENVIADO);
    }
}

