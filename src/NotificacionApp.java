import java.util.Date;

public class NotificacionApp extends Notificacion {
    private String idDispositivoApp;

    public NotificacionApp(String codigo, String mensaje, Date fechaEnvio, EstadoNotificacion estado, TipoNotificacion tipo, String idDispositivoApp) {
        super(codigo, mensaje, fechaEnvio, estado, tipo);
        this.idDispositivoApp = idDispositivoApp;
    }

    public String getIdDispositivoApp() {
        return idDispositivoApp;
    }

    public void setIdDispositivoApp(String idDispositivoApp) {
        this.idDispositivoApp = idDispositivoApp;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando notificación push al dispositivo " + idDispositivoApp + " con mensaje: " + getMensaje());
        setEstado(EstadoNotificacion.ENVIADO);
    }
}

