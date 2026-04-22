import java.util.List;

public class SistemaDeEnvio {

    public void enviarNotificacionIndividual(Notificacion notificacion) {
        System.out.println("Iniciando envío de notificación individual: " + notificacion.getCodigo());
        notificacion.enviar();
    }

    public void enviarNotificacionGrupal(List<Notificacion> notificaciones) {
        System.out.println("Iniciando envío de notificaciones grupales...");
        for (Notificacion notificacion : notificaciones) {
            notificacion.enviar();
        }
        System.out.println("Envío grupal finalizado.");
    }
}

