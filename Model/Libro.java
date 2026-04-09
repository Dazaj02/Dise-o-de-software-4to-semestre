package Model;

public class Libro extends Publicacion {
    private int numeroPaginas;
    private int anioPublicacion;

    public Libro(String titulo, double precio, int anioPublicacion, int numeroPaginas) {
        super(titulo, precio);
        this.numeroPaginas = numeroPaginas;
        this.anioPublicacion = anioPublicacion;
    }

    public Libro(int numeroPaginas, int anioPublicacion) {
        this.numeroPaginas = numeroPaginas;
        this.anioPublicacion = anioPublicacion;
    }

    public Libro() {
        super();
        this.anioPublicacion = 0;
        this.numeroPaginas = 0;

    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "numeroPaginas=" + numeroPaginas +
                ", anioPublicacion=" + anioPublicacion +
                ", " + super.toString() +
                '}';
    }
}