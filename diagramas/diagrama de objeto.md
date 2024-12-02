# diagrama de objeto
------

## proceso

Este diagrama representa una simplificación de un sistema de pedidos en una cafetería, mostrando las clases involucradas y sus relaciones.


### imagen

![image](https://github.com/user-attachments/assets/f8c9a4c8-8115-43eb-a31f-3b630da04032)

ya de manera mas centrada mas al proyecto

### imagen

![image](https://github.com/user-attachments/assets/71c6f373-16e0-4c07-a95f-3c3d4afff4f4)


## proceso

Este diagrama representa una instancia del sistema de Registro de Almuerzos , mostrando cómo interactúan los objetos en ejecución. Aquí está el desglose:

1. ClaseRegistroAlmuerzosApp :

Es el punto de entrada del programa.

Utiliza un objeto sistemapara gestionar la información de los estudiantes y sus registros de almuerzos.

2. ClaseSistemaAlmuerzos (continuación):

Atributoestudiantes :

Es una colección que asocia identificadores de estudiantes con los objetos correspondientes ( estudiante1, estudiante2).

Relación :

Cada estudiante registrado en el sistema tiene su propia información almacenada, como su nombre, identificación y el historial de almuerzos registrados.

Objetos estudiante1yestudiante2 :

Representan estudiantes individuales dentro del sistema.

Propiedades :

estudiante1:

Nombre: "Juan Pérez"
Identificación: "001"
Historial de almuerzos:["2024-12-01", "2024-12-02"]

estudiante2:

Nombre: "María López"
Identificación: "002"
Historial de almuerzos:["2024-12-01"]

Relaciones :

RegistroAlmuerzosApp utilice a SistemaAlmuerzospara acceder y gestionar los estudiantes.

SistemaAlmuerzos Contiene múltiples objetos Estudianteen su estructura de datos 

Propósito:
Este modelo muestra cómo el sistema organiza la información de los estudiantes y sus almuerzos, permitiendo que el programa acceda fácilmente a registros individuales o grupales. También ilustra cómo se estructura una aplicación real basada en clases y objetos.
