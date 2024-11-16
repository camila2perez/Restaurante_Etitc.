# diagrama de caso de uso
------

## proceso

Descripción del Proceso del Diagrama UML
El diagrama UML del sistema describe la interacción entre las clases y cómo estas colaboran para implementar las funcionalidades de un sistema de gestión de almuerzos en una cafetería. A continuación, se detalla el proceso paso a paso basado en el flujo representado:

1. Creación de Almuerzos (Herencia)

Clases involucradas:
Almuerzo (Clase base).
AlmuerzoVegetariano y AlmuerzoNoVegetariano (Subclases).
Proceso:

La clase Almuerzo define los atributos generales de un almuerzo: nombre y precio, junto con métodos para obtener estos valores.
Las subclases AlmuerzoVegetariano y AlmuerzoNoVegetariano heredan de Almuerzo y configuran valores específicos para el nombre y precio según el tipo de almuerzo.
Propósito:
Este diseño permite extender fácilmente el sistema para agregar nuevos tipos de almuerzos sin modificar la clase base, respetando el principio de abierto/cerrado de diseño de software.

2. Registro de Pedidos (Composición y Asociación)

Clases involucradas:
Pedido
Estudiante
Almuerzo
Proceso:

Un objeto Pedido se crea asociando:

Un estudiante (representado por la clase Estudiante con atributos como nombre y matrícula).
Un almuerzo (una instancia de AlmuerzoVegetariano o AlmuerzoNoVegetariano).
El estado inicial del pedido es "Pendiente". Esto se almacena como un atributo dentro de la clase Pedido.
Propósito:

La composición asegura que un pedido esté compuesto por exactamente un estudiante y un almuerzo. Además, encapsular el estado del pedido permite controlar su ciclo de vida (de "Pendiente" a "Entregado").

3. Gestión de Pedidos en la Cafetería

Clases involucradas:

Cafeteria
Pedido
Proceso:

La clase Cafeteria mantiene una lista de pedidos (List<Pedido>), lo que representa la asociación entre la cafetería y los pedidos que administra.
Funciones principales de la clase:

Recibir Pedido:
Agrega un pedido a la lista y confirma su recepción mostrando un mensaje con el nombre del estudiante y el almuerzo solicitado.

Entregar Pedido:
Cambia el estado del pedido a "Entregado", indicando que el estudiante recibió su almuerzo.

Mostrar Pedidos:
Itera sobre la lista de pedidos y muestra información detallada de cada uno (estudiante, almuerzo y estado).

Propósito:
Este diseño permite que la Cafeteria actúe como un controlador centralizado que coordina todas las operaciones relacionadas con los pedidos. Esto sigue el principio de responsabilidad única.

4. Flujo Completo en la Clase Principal

Clases involucradas:
Todas las clases (Cafeteria, Pedido, Estudiante, Almuerzo, AlmuerzoVegetariano, AlmuerzoNoVegetariano).
Proceso del flujo principal:

Creación de la cafetería:
Se instancia un objeto de la clase Cafeteria.
Registro de estudiantes y almuerzos:
Se crean objetos de Estudiante y se asocian a pedidos con instancias de AlmuerzoVegetariano o AlmuerzoNoVegetariano.
Registro de pedidos:
Los pedidos se reciben en la cafetería mediante el método recibirPedido.
Entrega de pedidos:
El estado del pedido cambia a "Entregado" cuando se llama al método entregarPedido.
Visualización de pedidos:
La cafetería muestra los pedidos y sus estados actualizados.
Relaciones Representadas en el Diagrama
Herencia:

AlmuerzoVegetariano y AlmuerzoNoVegetariano heredan de Almuerzo.
Composición:

Pedido tiene una relación de composición con Estudiante y Almuerzo, ya que cada pedido se asocia con un estudiante y un tipo de almuerzo.
Asociación:

Cafeteria tiene una asociación con Pedido, administrando múltiples instancias de pedidos.
Resumen del Proceso General
Registro de almuerzos y estudiantes: Se crean instancias que representan las opciones de almuerzos y los estudiantes.
Creación de pedidos: Los pedidos vinculan un estudiante con un tipo de almuerzo, iniciando con un estado pendiente.
Gestión de la cafetería: La cafetería organiza la recepción y entrega de pedidos y muestra el estado de cada uno.

### imagen

![image](https://github.com/user-attachments/assets/c0a289fe-4dbb-48aa-aa7f-58210be68436)
