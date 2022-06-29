package Tcs;

public class Libro {
    protected String nombre;
    protected String categoria;
    protected int paginas;

    public Libro(String nombre, String categoria, int paginas) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.paginas = paginas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Libro [categoria=" + categoria + ", nombre=" + nombre + ", paginas=" + paginas + "]";
    }
}
