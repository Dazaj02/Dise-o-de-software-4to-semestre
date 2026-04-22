import java.util.List;

public class Usuario {
    private String id;
    private String nombreCompleto;
    private String email;
    private String telefono;
    private List<Medio> preferenciasNotificacion;

    public Usuario(String id, String nombreCompleto, String email, String telefono, List<Medio> preferenciasNotificacion) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.telefono = telefono;
        this.preferenciasNotificacion = preferenciasNotificacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Medio> getPreferencias() {
        return preferenciasNotificacion;
    }

    public void setPreferencias(List<Medio> preferenciasNotificacion) {
        this.preferenciasNotificacion = preferenciasNotificacion;
    }
}

