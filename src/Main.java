import java.util.Date;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(
            "1",
            "Juan Perez",
            "juan.perez@example.com",
            "1234567890",
            Arrays.asList(Medio.CORREO_ELECTRONICO, Medio.SMS)
        );

        SistemaDeEnvio sistema = new SistemaDeEnvio();

        NotificacionCorreo notificacionCorreo = new NotificacionCorreo(
            "N001",
            "Su pago de matricula ha sido procesado con exito.",
            new Date(),
            EstadoNotificacion.PENDIENTE,
            TipoNotificacion.PAGO_MATRICULA,
            usuario.getEmail()
        );

        NotificacionSMS notificacionSMS = new NotificacionSMS(
            "N002",
            "Clase de Diseno de Software cancelada el dia de hoy.",
            new Date(),
            EstadoNotificacion.PENDIENTE,
            TipoNotificacion.CANCELACION_CLASE,
            usuario.getTelefono()
        );

        NotificacionApp notificacionApp = new NotificacionApp(
            "N003",
            "Nuevas calificaciones subidas al sistema.",
            new Date(),
            EstadoNotificacion.PENDIENTE,
            TipoNotificacion.CALIFICACIONES,
            "Device-XYZ-123"
        );


        System.out.println("--- Prueba de Envío Individual ---");
        sistema.enviarNotificacionIndividual(notificacionCorreo);


        System.out.println("\n--- Prueba de Envío Grupal ---");
        List<Notificacion> notificaciones = Arrays.asList(notificacionSMS, notificacionApp);
        sistema.enviarNotificacionGrupal(notificaciones);
    }
}
