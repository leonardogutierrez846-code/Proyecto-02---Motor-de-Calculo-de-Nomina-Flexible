Motor de Calculo de Nomina Flexible

Este proyecto consiste en el desarrollo de un motor de cálculo de nómina 
en Java, capaz de procesar diferentes tipos de empleados según su contrato
y calcular sus salarios considerando bonificaciones adicionales.
Se implementan conceptos de programación orientada a objetos junto con 
características avanzadas de Java como Streams, Optional, Genéricos y Enums,
logrando un sistema eficiente, seguro y extensible.

CARACTERISTICAS PRINCIPALES

1.- Uso de Enums
Se implementa un tipo enumerado (TipoContrato) para definir de manera clara y segura los distintos tipos de contrato.

2.- Programacion Orientada a Objetos (POO
Se utiliza herencia y polimorfismo para modelar distintos tipos de empleados con comportamientos específicos.

3.- Streams y expresiones de Lambda
Se emplea la API de Streams para procesar listas de empleados de forma declarativa, especialmente mediante el uso de map y reduce para calcular la nómina total.

4.- Uso de Optional
Se maneja el valor del bono extra de forma segura, evitando errores por valores nulos mediante Optional y el método orElse()

5.- Genericos
Se implementa una clase Calculadora<T extends Empleado> para asegurar que únicamente se procesen objetos que hereden de la clase base Empleado.

TECNOLOGIAS UTILIZADAS 

Java (JDK 8 o superior), Programación Orientada a 
Objetos (POO), API Streams de Java, Optional (manejo de 
nulidad), Genéricos

ESTRUCTURA DEL SITIO

Proyecto 02 - Motor de Calculo de Nomima Flexible

TipoContrato.java
Enum que define los tipos de contrato disponibles (HORAS, PLANTA, PROYECTO), permitiendo un manejo seguro y claro de estos valores.

Empleado.java
Clase abstracta base que contiene los atributos comunes (nombre, salario, tipo de contrato y bono) y define el método calcularSalario() que será implementado por las clases hijas.

EmpleadoTiempoCompleto.java
Clase que representa empleados de planta; calcula el salario sumando el sueldo base más el bono extra.

EmpleadoPorHoras.java
Clase que representa empleados por horas; calcula el salario multiplicando las horas trabajadas por el pago por hora, más el bono.

Calculadora.java
Clase genérica encargada de calcular la nómina total utilizando Streams y reduce, asegurando que solo se procesen objetos que hereden de Empleado.

Main.java
Clase principal que crea la lista de empleados, ejecuta el cálculo de la nómina y muestra los resultados en consola.