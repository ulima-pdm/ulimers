package pe.edu.ulima.ulimers.beans;

/**
 * Created by hquintana on 3/05/16.
 */
public class Alumno {
    private long id;
    private String nombre;
    private String codigo;
    private String puntos;
    private String urlFofo;

    public Alumno() {
    }

    public Alumno(long id, String nombre, String codigo, String puntos, String urlFofo) {
        this.id = id;
        this.nombre = nombre;
        this.codigo = codigo;
        this.puntos = puntos;
        this.urlFofo = urlFofo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPuntos() {
        return puntos;
    }

    public void setPuntos(String puntos) {
        this.puntos = puntos;
    }

    public String getUrlFofo() {
        return urlFofo;
    }

    public void setUrlFofo(String urlFofo) {
        this.urlFofo = urlFofo;
    }
}
