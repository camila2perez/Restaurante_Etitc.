# Restaurante_ETITC 
------

## Objetivo 

### General 

Desarrollar una plataforma tecnológica integral y sostenible que revolucione la gestión de los servicios de alimentación en el entorno universitario, optimizando procesos, personalizando la experiencia del usuario, fomentando hábitos alimenticios saludables y generando datos valiosos para la toma de decisiones estratégicas, todo ello con el fin de satisfacer las necesidades de la comunidad universitaria y contribuir a un modelo de alimentación más eficiente y responsable.

### Auxiliares

1. Centralizar y automatizar la gestión de pedidos:

•	Automatizar el proceso de toma de pedidos, procesamiento de pagos y generación 
de informes.

2. Optimizar la logística de entrega:

•	Diseñar rutas de entrega eficientes para cubrir la sede universitaria y garantizar la entrega a tiempo de los pedidos.

•	Implementar un sistema de gestión de flotas para optimizar el uso de los recursos y reducir costos.

•	Considerar la posibilidad de ofrecer diferentes horarios de entrega para adaptarse a las necesidades de estudiantes con jornadas tarde y noche.

3. Mejorar la comunicación y la experiencia del usuario:

•	Desarrollar una interfaz intuitiva y fácil de usar para la aplicación móvil

## Planteamiento 

### analisis

El sistema busca mejorar la gestión de almuerzos para estudiantes, proporcionando control de acceso, monitoreo de asistencia, y generación de informes y estadísticas en esto se tine mas encuenta lo  de manera mas especifica:

•	Control de Acceso: Asegurar que cada estudiante reciba el almuerzo diario autorizado.

•	Monitoreo Automático: Registrar automáticamente la asistencia de los estudiantes al servicio de almuerzos.

•	Trazabilidad y Transparencia: Proveer un historial de consumo de almuerzos que permita supervisar y dar seguimiento a cada estudiante.

•	Generación de Reportes y Estadísticas: Crear informes detallados del consumo de almuerzos y estadísticas sobre la demanda.

para dar mas detlalle de los procedimientos en Los patrones creacionales permiten instanciar objetos de manera controlada, optimizando los recursos y facilitando la extensibilidad.

•	en el sistema de almuerzos, el patrón Singleton se utilizaría en clases como ConexionBaseDatospara que exista solo una conexión compartida por todo el sistema.

• ReporteFactory podría determinar el tipo de informe (diario, semanal, mensual) en función de los requerimientos del usuario, devolviendo instancias de clases específicas 

• Un ReporteBuilderpodría ensamblar informes complejos con diferentes componentes, permitiendo a los administradores seleccionar el nivel de detalle en los informes generados.

• con mayor parte al diseño del sistema se puede tomar en cuenta 
1. Autenticación y acceso :

•	Usar Proxypara restringir el acceso a funciones de informes y datos sensibles.

•	Usar Adapterpara integrar sistemas de acceso externos, como tarjetas o biometría.

•	Implementar Chain of Responsibilitypara verificar las credenciales y registrar la asistencia de cada estudiante.

2. Registro y Notificación de Asistencia :

•	La clase ServicioAlmuerzoFacade proporciona una interfaz simplificada para gestionar el acceso y notificación de asistencia.

•	Implementar Observerpara que los estudiantes suscritos reciban notificaciones automáticas cuando se actualice el menú o se generen informes de consumo.

3.  Generación de Reportes :

•	ReporteFactoryselecciona y genera el tipo de informe deseado (diario, semanal o mensual).

•	ReporteBuildercomponer el informe con diferentes secciones según lo solicitado por el administrador.

•	Strategyse emplea para aplicar diferentes métodos de análisis estadístico según el periodo.

4.  Visualización del Historial :

•	Usar Compositepara agrupar múltiples elementos de datos en un solo informe unificado.

•	Stategestiona el estado de los usuarios en función de su acceso y permite cambiar el flujo según las condiciones.

### conclusion




## Justificaion 

La implementación de esta plataforma revolucionará nuestro servicio de alimentación, brindando una experiencia superior a los estudiantes, optimizando operaciones y promoviendo hábitos saludables. Al automatizar procesos, personalizar pedidos y recopilar datos valiosos, lograremos una mayor eficiencia, satisfacción del usuario y sostenibilidad. Esto se traducirá en una reducción de costos, una mejora en la imagen institucional y un mayor compromiso con el bienestar de nuestra comunidad universitaria.



## Referencias 
