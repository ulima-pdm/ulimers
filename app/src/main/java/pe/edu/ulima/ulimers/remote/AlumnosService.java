package pe.edu.ulima.ulimers.remote;

import java.util.List;

import pe.edu.ulima.ulimers.beans.Alumno;
import retrofit2.Call;
import retrofit2.http.GET;

public interface AlumnosService {
    @GET("/alumnos")
    Call<List<Alumno>> obtenerAlumnos();
}
