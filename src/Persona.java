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
    public boolean adoptarPerro(Perro perro) {
        if (lstPerrosadoptados.size() < 3) {
            lstPerrosadoptados.add(perro);
            return true;
        }
        return false;
    }

    public Perro perroMasGrande() {
        if (lstPerrosadoptados.isEmpty()) return null;
        Perro mayor = lstPerrosadoptados.get(0);
        for (Perro p : lstPerrosadoptados) {
            if (p.getEdad() > mayor.getEdad()) {
                mayor = p;
            }
        }
        return mayor;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", documento='" + documento + '\'' +
                '}';
    }
}
