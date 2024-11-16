# diagrama de objeto
------

## proceso

Este diagrama representa una simplificación de un sistema de pedidos en una cafetería, mostrando las clases involucradas y sus relaciones.

Clases y Atributos:

Estudiante: Representa a un estudiante que realiza un pedido.

Atributos:

nombre: El nombre del estudiante (ej: "Juan Pérez").

matrícula: El número de matrícula del estudiante (ej: "A001").

Cafetería: Representa la entidad que administra los pedidos.

Atributo:

pedidos: Una lista o conjunto de pedidos que la cafetería administra.
Pedido: Representa un pedido realizado por un estudiante.

Atributo:

estado: El estado actual del pedido (ej: "Pendiente", "Preparado", "Entregado").
Almuerzo: Representa el artículo pedido por el estudiante.

Atributos:

nombre: El nombre del almuerzo (ej: "Almuerzo Vegetariano").
precio: El precio del almuerzo.

Relaciones:

Estudiante - Pedido (realiza): Un estudiante puede realizar uno o más pedidos. Esta es una relación de uno a muchos, donde un estudiante se relaciona con múltiples pedidos, pero un pedido solo puede ser realizado por un estudiante.

Cafetería - Pedido (administra): Una cafetería administra múltiples pedidos. Esta es otra relación de uno a muchos, donde una cafetería se relaciona con muchos pedidos, pero un pedido solo puede ser administrado por una cafetería.

Pedido - Almuerzo (contiene): Un pedido contiene un almuerzo. Esta es una relación de uno a uno, donde un pedido siempre contiene un almuerzo y un almuerzo siempre pertenece a un pedido.

Descripción del Proceso:

Un estudiante realiza un pedido: Se crea un nuevo objeto de tipo "Pedido" asociado al estudiante específico.

El pedido se agrega a la lista de pedidos de la cafetería: El nuevo pedido se añade a la lista de pedidos que la cafetería está administrando.

El pedido tiene un estado inicial: Al momento de crearse, el pedido se establece en un estado inicial, como "Pendiente".

El pedido contiene un almuerzo: Se especifica el almuerzo que el estudiante desea, el cual queda asociado al pedido.

### imagen

![image](https://github.com/user-attachments/assets/f8c9a4c8-8115-43eb-a31f-3b630da04032)
