package cl.inacap.listviewsandadapters.models;

public class Contacto {
    // Atributos
    private int codContacto;
    private String nombre;
    private int fono;
    private String email;
    public final static Contacto contactos[] = {
        new Contacto(1, "Juanito Nieve", 111, "jn@westeros.cl"),
        new Contacto(2, "Daenerys Targaryen", 222, "dt@khaleesi.cl"),
        new Contacto(3, "Tyrion Lannister", 333, "tl@lannister.cl"),
        new Contacto(4, "Jorah Friendzone Mormont", 444, "jf@mormont.cl")
    };

    // Constructor
    public Contacto(int codContacto, String nombre, int fono, String email) {
        this.codContacto = codContacto;
        this.nombre = nombre;
        this.fono = fono;
        this.email = email;
    }

    public Contacto() { }

    // Métodos
    public int getCodContacto() {
        return codContacto;
    }

    public void setCodContacto(int codContacto) {
        this.codContacto = codContacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFono() {
        return fono;
    }

    public void setFono(int fono) {
        this.fono = fono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
