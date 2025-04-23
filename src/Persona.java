import java.util.ArrayList;
import java.util.List;

public class Persona {
    protected String nombre, apellido;
    protected int edad;
    protected String documento;
    protected List<Perro> lstPerrosadoptados = new ArrayList<>();

    public Persona(String nombre, String apellido, int edad, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public List<Perro> getLstPerrosadoptados() {
        return lstPerrosadoptados;
    }

    public void setLstPerrosadoptados(List<Perro> lstPerrosadoptados) {
        this.lstPerrosadoptados = lstPerrosadoptados;
    }


    @Override
    public String toString() {
        return "Persona " +
                " Nombre: " + nombre + " /" +
                " Apellido: " + apellido + " /" +
                " Edad: " + edad + " /" +
                " Documento: " + documento + " /" ;
    }
}
