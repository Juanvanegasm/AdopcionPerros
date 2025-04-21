import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Persona> lstpersonas = new ArrayList<>();
        List<Perro> lstperrosDisponibles = new ArrayList<>();
        int opcion;

        do{


        System.out.println("""
                    MENÚ
                1. Registrar persona
                2. Registrar perro
                3. Ver personas registradas
                4. Ver perros disponibles
                5. Adoptar perro
                 Elige una opción:""");
        opcion = teclado.nextInt();



            switch (opcion) {
                case 1 -> {
                    teclado.nextLine();
                    String nombre, apellido, documento;
                    int edad;
                    System.out.println("Ingrese el nombre");
                    nombre = teclado.nextLine();
                    System.out.println("Ingrese el apellido");
                    apellido = teclado.nextLine();
                    System.out.println("Ingrese el numero de documento");
                    documento = teclado.nextLine();
                    System.out.println("Ingrese la edad");
                    edad = teclado.nextInt();
                    lstpersonas.add(new Persona(nombre, apellido, edad, documento));
                    System.out.println("Persona Registrada");
                }
                case 2 -> {
                    teclado.nextLine();
                    String placa, nombre, raza, tamaño;
                    int edad;
                    System.out.println("Ingrese el nombre");
                    nombre = teclado.nextLine();
                    System.out.println("Ingrese la raza");
                    raza = teclado.nextLine();
                    System.out.println("Ingrese el numero de placa");
                    placa = teclado.nextLine();
                    System.out.println("Ingrese el tamaño");
                    tamaño = teclado.nextLine();
                    System.out.println("Ingrese la edad");
                    edad = teclado.nextInt();
                    lstperrosDisponibles.add(new Perro(placa, nombre, raza, tamaño, edad));
                    System.out.println("Perro Registrado");
                }
                case 3 -> {
                    if (lstpersonas.isEmpty()) {
                        System.out.println("No hay personas registradas");
                    } else {
                        for (Persona p : lstpersonas) {
                            System.out.println(p);
                        }
                    }
                }
                case 4 -> {
                    if (lstperrosDisponibles.isEmpty()) {
                        System.out.println("No hay perros disponibles");
                    } else {
                        for (Perro p : lstperrosDisponibles) {
                            System.out.println(p);
                        }
                    }
                }
                case 5 -> {
                    System.out.print("Documento de la persona: ");
                    String documento = teclado.nextLine();
                    Persona persona = lstpersonas(documento);

                    if (persona == null) {
                        System.out.println("Persona no encontrada.");
                        break;
                    }

                    System.out.print("Placa del perro a adoptar: ");
                    String placa = teclado.nextLine();
                    Perro perro = placa(placa);

                    if (perro == null) {
                        System.out.println("Perro no encontrado o ya adoptado.");
                        break;
                    }

                    if (persona.adoptarPerro(perro)) {
                        lstperrosDisponibles.remove(perro);
                        System.out.println("Adopción realizada con éxito.");
                    } else {
                        System.out.println("La persona ya adoptó 3 perros.");
                    }
                }





            }
        }while (opcion != 5) ;
    }


}