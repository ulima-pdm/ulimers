package pe.edu.ulima.ulimers.listadoalumnos;

import java.util.List;

import pe.edu.ulima.ulimers.beans.Alumno;

/**
 * Created by hquintana on 3/05/16.
 */
public interface ListadoAlumnosPresenter {
    public List<Alumno> obtenerAlumnos();
    public void aumentarPuntaje();
}
