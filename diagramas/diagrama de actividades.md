# diagrama de actividades
------

## proceso

Este diagrama describe paso a paso las acciones que se llevan a cabo desde que un estudiante decide realizar un pedido hasta que recibe su almuerzo.

Descripción del Proceso:

Seleccionar almuerzo: El proceso inicia cuando el estudiante selecciona el almuerzo que desea.

Solicitar pedido a la cafetería: Una vez seleccionado el almuerzo, el estudiante realiza la solicitud del pedido a la cafetería.

Validar datos del pedido: La cafetería verifica si los datos del pedido son correctos (por ejemplo, si el almuerzo está disponible, si el estudiante está registrado, etc.).

Si los datos son correctos: Se procede a registrar el pedido.

Si los datos son incorrectos: Se rechaza el pedido.

Registrar el pedido: Si los datos son correctos, se crea un registro del pedido en el sistema.

Crear instancia del pedido: Se crea una representación del pedido en el sistema (por ejemplo, una entrada en una base de datos).

Guardar pedido en lista: El pedido se agrega a una lista de pedidos pendientes.

Entregar pedido al estudiante: Una vez que el pedido está listo, se entrega al estudiante.

Actualizar estado del pedido: Se actualiza el estado del pedido en el sistema para indicar que ha sido entregado.

Interpretación:

Este diagrama muestra un flujo típico de un proceso de pedido en una cafetería. Representa las decisiones que se toman en cada etapa (validar datos, entregar o rechazar) y las acciones que se realizan (crear el pedido, actualizar el estado).

Aspectos a destacar:

Decisiones: El diagrama muestra claramente las decisiones que se toman en función de si los datos del pedido son correctos o no.

Secuencia: Las acciones se presentan en un orden lógico, mostrando cómo se avanza de una etapa a otra.

Finalización: El diagrama indica que el proceso finaliza cuando el pedido se entrega y su estado se actualiza.

Posibles Ampliaciones:

Pagos: Se podría agregar un paso para el pago del pedido.

Cancelación: Se podría incluir una opción para que el estudiante cancele el pedido.

Notificaciones: Se podrían enviar notificaciones al estudiante sobre el estado de su pedido.

Opciones adicionales: Se podrían agregar opciones como "para llevar" o "consumir en el lugar".

### imagen

![Descripción de la imagen](https://www.planttext.com/api/plantuml/png/PP0nRW9134NxbVOEBfShG0D24Q9D97hBumLBPWPvF0rtuXIvMBmhI81CDRAV_V_tkZgQjxFstVphk-KNAnD9oMY0UcvirxAQwaM5922uS99K044H24TsjkyR1YCZ30TKIG4bz58XiTxn1VY9CmpROiOKlKNVGRpb9n-bkiN8BxkwjxR6KPOSrZ89Fcrx4Bk6bluiXO36iiaBQsKOzfd-wz49hszod9EC4V8Zk_7nAQC2Lsz9C3jFLzYGjqWupuTG82-cgfTBtwrZtNpJ7m00)