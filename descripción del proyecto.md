# Plantamiento 
-----
### descripcion del problema 

Problema Principal:

El sistema actual de distribución de almuerzos en la universidad presenta ineficiencias y desequilibrios, afectando tanto a los estudiantes como a la gestión de los recursos. Los principales problemas identificados son:

Frecuencia de distribución: El almuerzo solo se entrega una vez a la semana, lo que puede generar insatisfacción entre los estudiantes y dificultades para mantener la calidad de los alimentos.

Inasistencias y sobras: Existe un desajuste entre la cantidad de almuerzos preparados y la cantidad de estudiantes que asisten, lo que resulta en desperdicio de alimentos y costos innecesarios.

Multiples universidades: La presencia de otras dos universidades en el mismo lugar complica la logística de entrega, ya que es necesario asegurar que solo los estudiantes de la universidad objetivo reciban los almuerzos.

Desequilibrio en la dieta: La variedad y el balance nutricional de los almuerzos no son óptimos, lo que afecta la salud de los estudiantes.

Problemas Específicos:

Falta de flexibilidad: El sistema actual no se adapta a cambios en la demanda o a necesidades dietéticas especiales de los estudiantes.

Dificultad en el control de inventario: No existe un sistema eficiente para llevar el control de los alimentos disponibles y su fecha de caducidad.

Escasa trazabilidad: Es difícil rastrear el consumo de alimentos por estudiante y identificar posibles alergias o intolerancias.

Falta de información en tiempo real: No se dispone de datos actualizados sobre la cantidad de almuerzos disponibles y la asistencia de los estudiantes.

Consecuencias de estos problemas:

Desperdicio de alimentos: El exceso de comida preparada y no consumida genera un desperdicio económico y ambiental.

Insatisfacción de los estudiantes: La falta de variedad, la mala calidad de los alimentos y la escasez pueden generar quejas y descontento entre los estudiantes.

Problemas de salud: Una dieta desequilibrada puede afectar la salud de los estudiantes a largo plazo.

Costos elevados: El desperdicio de alimentos y la ineficiencia en la gestión de recursos aumentan los costos del programa de almuerzos.

Dificultad en la toma de decisiones: La falta de información precisa dificulta la toma de decisiones informadas sobre la planificación de menús y la gestión de recursos.

### análisis

El sistema busca mejorar la gestión de almuerzos para estudiantes, proporcionando control de acceso, monitoreo de asistencia, y generación de informes y estadísticas en esto se tine mas encuenta lo de manera más especifica:

• Control de Acceso: Asegurar que cada estudiante reciba el almuerzo diario autorizado.

• Monitoreo Automático: Registra automáticamente la asistencia de los estudiantes al servicio de almuerzos.

• Trazabilidad y Transparencia: Proveer un historial de consumo de almuerzos que permita supervisar y dar seguimiento a cada estudiante.

• Generación de Reportes y Estadísticas: Crear informes detallados del consumo de almuerzos y estadísticas sobre la demanda.

para dar más detalle de los procedimientos en Los patrones creacionales permiten instanciar objetos de manera controlada, optimizando los recursos y facilitando la extensibilidad.

• en el sistema de almuerzos, el patrón Singleton se utilizaría en clases como ConexionBaseDatos para que exista solo una conexión compartida por todo el sistema.

• ReporteFactory podría determinar el tipo de informe (diario, semanal, mensual) en función de los requerimientos del usuario, devolviendo instancias de clases específicas. 

• Un ReporteBuilderpodría ensamblar informes complejos con diferentes componentes, permitiendo a los administradores seleccionar el nivel de detalle en los informes generados.

• con mayor parte al diseño del sistema se puede tomar en cuenta 
1. Autenticación y acceso:

• Usar Proxy para restringir el acceso a funciones de informes y datos sensibles.

• Usar Adapterpara integrar sistemas de acceso externos, como tarjetas o biometría.

• Implementar Cadena de Responsabilidad para verificar las credenciales y registrar la asistencia de cada estudiante.

2. Registro y Notificación de Asistencia:

• La clase ServicioAlmuerzoFacade proporciona una interfaz simplificada para gestionar el acceso y notificación de asistencia.

• Implementar Observer para que los estudiantes suscritos reciban notificaciones automáticas cuando se actualice el menú o se generen informes de consumo.

3. Generación de Reportes:

• ReporteFactoryselecciona y genera el tipo de informe deseado (diario, semanal o mensual).

• ReporteBuilder componer el informe con diferentes secciones según lo solicitado por el administrador.

• Strategyse emplea para aplicar diferentes métodos de análisis estadístico según el período.

4. Visualización del Historial:

• Usar Composite para agrupar múltiples elementos de datos en un solo informe unificado.

• Stategestiona el estado de los usuarios en función de su acceso y permite cambiar el flujo según las condiciones.

## diseño de arquitectura

Análisis de los Requisitos

Basándonos en los requerimientos del sistema, podemos identificar las siguientes funcionalidades clave:

Control de acceso: Autenticación de usuarios y autorización de acciones.

Registro de asistencia: Seguimiento automático de la asistencia de los estudiantes.

Generación de reportes: Creación de informes personalizados y estadísticos.

Gestión de menús: Administración de los menús diarios.

Propuesta de Arquitectura en Capas

Una arquitectura en capas es una opción adecuada para este sistema, ya que permite una clara separación de responsabilidades y facilita el mantenimiento.

Capas:

Presentación: Interfaz de usuario (web, móvil) para la interacción con el sistema.

Lógica de negocio: Contiene la lógica del sistema, como la gestión de usuarios, pedidos, reportes y la interacción con la base de datos.

Acceso a datos: Interacción con la base de datos para almacenar y recuperar información.

Componentes clave y patrones:

Capa de Presentación:

Patrón MVC: Separación de la interfaz de usuario (vista), la lógica de negocio (controlador) y los datos (modelo).

Frameworks: Utilizar frameworks como Angular o React para construir interfaces web interactivas.

Capa de Lógica de Negocio:

ServicioAlmuerzoFacade: Facilita la interacción con el sistema, encapsulando la lógica de negocio.

Patrón Singleton: Para la conexión a la base de datos (ConexionBaseDatos).

Patrón Factory: Para crear diferentes tipos de reportes (ReporteFactory).

Patrón Builder: Para construir informes personalizados (ReporteBuilder).

Patrón Strategy: Para aplicar diferentes algoritmos de análisis estadístico.

Patrón Observer: Para notificar a los usuarios sobre cambios en el sistema (por ejemplo, nuevos menús).

Patrón Composite: Para agrupar elementos de datos en un informe.

Patrón State: Para gestionar los estados de los usuarios y controlar el flujo de la aplicación.

### propuesta de solucion

Para abordar estos problemas, se propone implementar un sistema de gestión de almuerzos más eficiente y flexible, que incluya las siguientes características:

Mayor frecuencia de distribución: Aumentar la frecuencia de entrega de almuerzos, por ejemplo, de dos a tres veces por semana.

Sistema de pre-orden: Implementar un sistema de pre-orden en línea para que los estudiantes puedan seleccionar sus opciones de menú con anticipación.

Control de inventario dinámico: Utilizar un sistema de inventario que se actualice en tiempo real para ajustar la cantidad de alimentos preparados según la demanda.

Identificación de los estudiantes: Implementar un sistema de identificación (tarjetas, códigos QR) para verificar la identidad de los estudiantes y garantizar que solo los estudiantes autorizados reciban almuerzos.

Menús balanceados y variados: Diseñar menús que cumplan con los requerimientos nutricionales y que ofrezcan una variedad de opciones.

Seguimiento del consumo: Registrar el consumo de alimentos por estudiante para identificar patrones y preferencias.

Generación de reportes: Crear informes detallados sobre el consumo de alimentos, el desperdicio y los costos.

Beneficios de la Solución Propuesta:

Reducción del desperdicio de alimentos: Al ajustar la cantidad de alimentos preparados a la demanda real.

Mayor satisfacción de los estudiantes: Al ofrecer una mayor variedad de opciones y una mejor calidad de los alimentos.

Optimización de costos: Al reducir el desperdicio y mejorar la eficiencia en la gestión de recursos.

Mejora en la salud de los estudiantes: Al proporcionar una alimentación balanceada y variada.

Mayor transparencia: Al contar con información detallada sobre el consumo de alimentos y los costos.


Al implementar estas mejoras, se puede lograr un sistema de gestión de almuerzos más eficiente, sostenible y que satisfaga las necesidades de los estudiantes.
