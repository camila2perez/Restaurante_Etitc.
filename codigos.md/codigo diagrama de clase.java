import java.util.ArrayList;
import java.util.List;

// Clase Almuerzo (Base)
class Almuerzo {
    private String nombre;
    private double precio;

    public Almuerzo(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}

// Subclase AlmuerzoVegetariano hereda de Almuerzo
class AlmuerzoVegetariano extends Almuerzo {
    public AlmuerzoVegetariano() {
        super("Almuerzo Vegetariano", 5.00); // Precio fijo para el almuerzo vegetariano
    }
}

// Subclase AlmuerzoNoVegetariano hereda de Almuerzo
class AlmuerzoNoVegetariano extends Almuerzo {
    public AlmuerzoNoVegetariano() {
        super("Almuerzo No Vegetariano", 6.50); // Precio fijo para el almuerzo no vegetariano
    }
}

// Clase Pedido que contiene asociación con la clase Almuerzo
class Pedido {
    private Estudiante estudiante;
    private Almuerzo almuerzo;
    private String estado;

    public Pedido(Estudiante estudiante, Almuerzo almuerzo) {
        this.estudiante = estudiante;
        this.almuerzo = almuerzo;
        this.estado = "Pendiente";
    }

    public void marcarComoEntregado() {
        estado = "Entregado";
    }

    public String getEstado() {
        return estado;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Almuerzo getAlmuerzo() {
        return almuerzo;
    }

    public void mostrarPedido() {
        System.out.println("Estudiante: " + estudiante.getNombre());
        System.out.println("Almuerzo: " + almuerzo.getNombre());
        System.out.println("Estado: " + estado);
    }
}

// Clase Estudiante (Composición con Pedido)
class Estudiante {
    private String nombre;
    private String matricula;

    public Estudiante(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMatricula() {
        return matricula;
    }
}

// Clase Cafeteria que maneja los pedidos
class Cafeteria {
    private List<Pedido> pedidos;

    public Cafeteria() {
        pedidos = new ArrayList<>();
    }

    public void recibirPedido(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido recibido de: " + pedido.getEstudiante().getNombre() + " para el almuerzo: " + pedido.getAlmuerzo().getNombre());
    }

    public void entregarPedido(Pedido pedido) {
        pedido.marcarComoEntregado();
        System.out.println("Pedido entregado a: " + pedido.getEstudiante().getNombre());
    }

    public void mostrarPedidos() {
        for (Pedido pedido : pedidos) {
            pedido.mostrarPedido();
            System.out.println("----------------------------");
        }
    }
}

// Clase Principal para probar el sistema
public class Main {
    public static void main(String[] args) {
        // Crear la cafetería
        Cafeteria cafeteria = new Cafeteria();

        // Crear estudiantes
        Estudiante estudiante1 = new Estudiante("Juan Pérez", "A001");
        Estudiante estudiante2 = new Estudiante("Ana López", "B002");

        // Crear almuerzos
        Almuerzo almuerzoVegetariano = new AlmuerzoVegetariano();
        Almuerzo almuerzoNoVegetariano = new AlmuerzoNoVegetariano();

        // Crear pedidos
        Pedido pedido1 = new Pedido(estudiante1, almuerzoVegetariano);
        Pedido pedido2 = new Pedido(estudiante2, almuerzoNoVegetariano);

        // Recibir pedidos en la cafetería
        cafeteria.recibirPedido(pedido1);
        cafeteria.recibirPedido(pedido2);

        // Mostrar todos los pedidos
        System.out.println("----- Lista de pedidos -----");
        cafeteria.mostrarPedidos();

        // Entregar un pedido
        System.out.println("\nEntregando pedido de Ana López...");
        cafeteria.entregarPedido(pedido2);

        // Mostrar estado de los pedidos después de entregar
        System.out.println("\n----- Estado de los pedidos -----");
        cafeteria.mostrarPedidos();
    }
}
