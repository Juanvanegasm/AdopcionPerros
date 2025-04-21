public class Perro {
    protected String placa;
    protected String nombre;
    protected String raza, tamaño;
    protected int edad;

    public Perro(String placa, String nombre, String raza, String tamaño, int edad) {
        this.placa = placa;
        this.nombre = nombre;
        this.raza = raza;
        this.tamaño = tamaño;
        this.edad = edad;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "placa='" + placa + '\'' +
                ", nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", tamaño='" + tamaño + '\'' +
                ", edad=" + edad +
                '}';
    }
}

