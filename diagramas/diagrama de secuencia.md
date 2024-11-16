# diagrama de secuencia
-------

## proceso

Este diagrama describe la interacción entre un Estudiante y un Sistema de Cafetería cuando el estudiante realiza un pedido de almuerzo. Los objetos involucrados son:

Estudiante: El usuario final que inicia el proceso.

Cafetería: Representa el sistema o servicio que procesa el pedido.

Pedido: Un objeto que encapsula la información de un pedido específico (estudiante, alimento, estado, etc.).

Almuerzo: Un objeto que representa el alimento que el estudiante ha pedido.

Descripción del Proceso:

El estudiante crea un pedido: El estudiante inicia el proceso enviando una solicitud al sistema de la cafetería para crear un nuevo pedido.

La cafetería instancia un nuevo pedido: Al recibir la solicitud, el sistema crea un nuevo objeto de tipo "Pedido" para almacenar los detalles del pedido.

Se asocia el estudiante al pedido: El sistema asocia el pedido al estudiante específico que lo realizó.

Se asocia el almuerzo al pedido: El sistema asocia el alimento seleccionado (almuerzo) al pedido recién creado.

El pedido se guarda en la lista: El sistema almacena el pedido en una lista o base de datos para su posterior seguimiento.

El estudiante consulta el estado del pedido: El estudiante puede consultar el estado actual de su pedido en cualquier momento.

La cafetería obtiene el estado del pedido: El sistema busca el pedido correspondiente al estudiante y obtiene su estado actual.

La cafetería devuelve el estado al estudiante: El sistema informa al estudiante sobre el estado actual del pedido (en este caso, "Pendiente").
Interpretación:

Este diagrama simplificado muestra un flujo básico de cómo un estudiante realiza un pedido en una cafetería y cómo el sistema lo gestiona. Representa una interacción típica entre un usuario y un sistema, donde el usuario inicia una acción y el sistema responde de manera secuencial.

### imagen

