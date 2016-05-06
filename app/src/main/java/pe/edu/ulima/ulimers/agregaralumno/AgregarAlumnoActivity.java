package pe.edu.ulima.ulimers.agregaralumno;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import pe.edu.ulima.ulimers.R;
import pe.edu.ulima.ulimers.beans.Alumno;

public class AgregarAlumnoActivity extends AppCompatActivity implements AgregarAlumnoView {

    EditText eteNombreAlumno, eteCodigoAlumno, eteUrlFotoAlumno;

    AgregarAlumnoPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_alumno);

        eteNombreAlumno = (EditText) findViewById(R.id.eteNombreAlumno);
        eteCodigoAlumno = (EditText) findViewById(R.id.eteCodigoAlumno);
        eteUrlFotoAlumno = (EditText) findViewById(R.id.eteUrlFotoAlumno);
    }


    @Override
    public void setPresenter(AgregarAlumnoPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void mostrarAlumnoRegistrado() {
        Toast.makeText(this, "Alumno Registrado", Toast.LENGTH_SHORT).show();
    }

    public void guardarAlumnoClick(View view) {
        Alumno alumno = new Alumno(
                "",
                eteNombreAlumno.getText().toString(),
                eteCodigoAlumno.getText().toString(),
                0,
                eteUrlFotoAlumno.getText().toString()
        );
        setPresenter(new AgregarAlumnosPresenterImpl(this));

        presenter.agregarAlumno(alumno);
    }
}
