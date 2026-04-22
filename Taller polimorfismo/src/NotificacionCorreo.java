import java.util.Date;

public class NotificacionCorreo extends Notificacion {
    private String destinatarioEmail;

    public NotificacionCorreo(String codigo, String mensaje, Date fechaEnvio, EstadoNotificacion estado, TipoNotificacion tipo, String destinatarioEmail) {
        super(codigo, mensaje, fechaEnvio, estado, tipo);
        this.destinatarioEmail = destinatarioEmail;
    }

    public String getDestinatarioEmail() {
        return destinatarioEmail;
    }

    public void setDestinatarioEmail(String destinatarioEmail) {
        this.destinatarioEmail = destinatarioEmail;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando correo a " + destinatarioEmail + " con mensaje: " + getMensaje());
        setEstado(EstadoNotificacion.ENVIADO);
    }
}

