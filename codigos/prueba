import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

// Clase que representa a un Estudiante
class Estudiante {
    private String nombre;
    private String id;
    private List<String> historialAlmuerzos;

    public Estudiante(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.historialAlmuerzos = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void registrarAsistencia(String fecha) {
        historialAlmuerzos.add(fecha);
        System.out.println("Asistencia registrada para " + nombre + " el " + fecha);
    }

    public void mostrarHistorial() {
        if (historialAlmuerzos.isEmpty()) {
            System.out.println(nombre + " no tiene registros de almuerzos.");
        } else {
            System.out.println("Historial de almuerzos de " + nombre + ":");
            for (String fecha : historialAlmuerzos) {
                System.out.println("- " + fecha);
            }
        }
    }
}

// Clase que representa el Sistema de Registro de Almuerzos
class SistemaAlmuerzos {
    private HashMap<String, Estudiante> estudiantes;

    public SistemaAlmuerzos() {
        this.estudiantes = new HashMap<>();
    }

    public void agregarEstudiante(String nombre, String id) {
        if (estudiantes.containsKey(id)) {
            System.out.println("El estudiante con ID " + id + " ya está registrado.");
        } else {
            Estudiante nuevoEstudiante = new Estudiante(nombre, id);
            estudiantes.put(id, nuevoEstudiante);
            System.out.println("Estudiante " + nombre + " registrado con éxito.");
        }
    }

    public void registrarAsistencia(String id, String fecha) {
        Estudiante estudiante = estudiantes.get(id);
        if (estudiante != null) {
            estudiante.registrarAsistencia(fecha);
        } else {
            System.out.println("Estudiante no encontrado con el ID " + id);
        }
    }

    public void mostrarHistorialEstudiante(String id) {
        Estudiante estudiante = estudiantes.get(id);
        if (estudiante != null) {
            estudiante.mostrarHistorial();
        } else {
            System.out.println("Estudiante no encontrado con el ID " + id);
        }
    }
}

// Clase principal con el menú de opciones
public class RegistroAlmuerzosApp {
    public static void main(String[] args) {
        SistemaAlmuerzos sistema = new SistemaAlmuerzos();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Sistema de Registro de Almuerzos ===");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Registrar asistencia");
            System.out.println("3. Ver historial de estudiante");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del estudiante: ");
                    String nombre = scanner.nextLine();
                    System.out.print("ID del estudiante: ");
                    String id = scanner.nextLine();
                    sistema.agregarEstudiante(nombre, id);
                    break;

                case 2:
                    System.out.print("ID del estudiante: ");
                    id = scanner.nextLine();
                    System.out.print("Fecha (YYYY-MM-DD): ");
                    String fecha = scanner.nextLine();
                    sistema.registrarAsistencia(id, fecha);
                    break;

                case 3:
                    System.out.print("ID del estudiante: ");
                    id = scanner.nextLine();
                    sistema.mostrarHistorialEstudiante(id);
                    break;

                case 4:
                    System.out.println("¡Gracias por usar el sistema!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del menú.");
            }
        }
    }
}

