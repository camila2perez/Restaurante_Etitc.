# diagrama de clases
------

## proceso

Descripción del Proceso del Diagrama UML
El diagrama UML del sistema describe la interacción entre las clases y cómo estas colaboran para implementar las funcionalidades de un sistema de gestión de almuerzos en una cafetería. A continuación, se detalla el proceso paso a paso basado en el flujo representado


Propósito:
Este diseño permite que la Cafeteria actúe como un controlador centralizado que coordina todas las operaciones relacionadas con los pedidos. Esto sigue el principio de responsabilidad única.



### imagen

![image](https://github.com/user-attachments/assets/c0a289fe-4dbb-48aa-aa7f-58210be68436)

ya de manera mas centrada mas al proyecto


### imagen


![image](https://github.com/user-attachments/assets/d4db8f58-c062-4fdc-85b3-f85ca980fab5)

## proceso

El diagrama representa el diseño de clases para el sistema de Registro de Almuerzos , destacando las relaciones entre las clases Estudiante , SistemaAlmuerzos , y RegistroAlmuerzosApp . Aquí tienes un resumen:

1. Clase Estudiante :

Atributos :

nombre: Nombre del estudiante.

id: Identificador único.

historialAlmuerzos: Lista de fechas de asistencia.

Métodos :

getId(), getNombre(): Devuelven el ID y el nombre.

registrarAsistencia(fecha): Agregue una fecha al historial del estudiante.

mostrarHistorial(): Devuelve el historial de almuerzos.

2. Clase SistemaAlmuerzos :

Atributos :

estudiantes: Un HashMapque relaciona los ID de estudiantes con sus objetos correspondientes.

Métodos :

agregarEstudiante(nombre, id): Agrega un nuevo estudiante al sistema.

registrarAsistencia(id, fecha): Registra asistencia para un estudiante dado su identificación.

mostrarHistorialEstudiante(id): Muestra el historial de un estudiante específico.

3. Clase RegistroAlmuerzosApp :

Método principal :

main(args): Punto de entrada de la aplicación, utilice los métodos de SistemaAlmuerzospara interactuar con los estudiantes.

Relaciones :

La clase SistemaAlmuerzos contiene múltiples objetos de la clase Estudiante.

La clase RegistroAlmuerzosApp utiliza lSistemaAlmuerzos.
