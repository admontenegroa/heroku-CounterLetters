## Contador de Carácteres de una Palabra

 ### 1.	Introducción 

Con el objetivo de contar los carácteres que contiene una palabra en el idioma español con una longitud máxima de 20 caracteres. Se diseñó un servicio web en lenguaje Java bajo la arquitectura Modelo Vista Controlador.

El servicio web se encuentra alojado en la siguiente URL:
```
https://heroku-counterletters.herokuapp.com/
```
La contraseña para iniciar sesión es la siguiente:
```
MCICLeones
```
### 1.1	Herramientas utilizadas

*	Eclipse 4.12.0
*	Apache Tomcat v9.0
*	Java JDK 1.8.0_221

 ### 2.	Requerimientos del Sistema 

### 2.1. Requerimientos Funcionales

*	Solo pueden usarlo las personas que conozcan un clave que debe ser ingresada en un campo.
*	Recibir una palabra en español sin espacios ni caracteres especiales de máximo 20 caracteres.
*	Se debe restringir que el usuario ingrese una palabra con más de 20 caracteres.
*	La palabra se debe ingresar por teclado en un campo dispuesto para ello.
*	Devolver en pantalla el número de caracteres palabra escrito en letras en español.


### 2.2. Requerimientos no Funcionales

*	La interfaz gráfica debe cumplir los estándares WCAG A

 ### 3.	Flujo del proceso
 Para el proceso se diseñó un diagrama de flujo, el primer paso en la ejecución es ingresar la contraseña requerida, una vez la contraseña sea correcta pide que se ingrese una palabra de máximo 20 caracteres los reconocidos por el idioma español y caracteres especiales, la casilla donde se va a ingresar la palabra solo dejara ingresar hasta el 20 carácter si se ingresa más este no los reconocerá. Después de ingresada la palabra el desarrollo realiza el conteo de cada carácter y arroja el resultado en una palabra con el número total de los caracteres ingresados.

El desarrollo pregunta al usuario si desea ingresar una palabra nueva o si desea terminar; si escoge la opción de ingresar una nueva palabra se ejecutará otra vez el mismo proceso cuantas veces el usuario lo desee y si se escoge la opción de finalizar el desarrollo finaliza de manera correcta. 

![FlujoProceso](https://raw.githubusercontent.com/admontenegroa/heroku-CounterLetters/master/FlujoProceso.png)

 ### 4.	Arquitectura del Sistema

![Diagrama de Clases](https://raw.githubusercontent.com/admontenegroa/heroku-CounterLetters/master/DiagramaClases.png)

Controlador: Gestiona los eventos que provoca el usuario al interactuar con la interfaz gráfica, en este proyecto está compuesto por las clases:
```
CounterLettersController
LoginController
```
Vista: Es cada una de las interfaces gráficas con las que interactúa el usuario y en este proyecto son:
```
Index.jsp
CounterView.jsp
numberLetters.jsp
```
Modelo: Contiene la logica del programa y está compuesto por las clases: 
```
Usuario 
Contador  
```
 ### 5. Casos de Prueba
 Para evaluar los requerimientos funcionales del servicio web se consideraron los siguientes escenarios de prueba unitaria:
 ![Compatibility](https://raw.githubusercontent.com/admontenegroa/heroku-CounterLetters/master/Escenario_PruebaContraseña.png)
 ![Compatibility](https://raw.githubusercontent.com/admontenegroa/heroku-CounterLetters/master/Escenario_LongitudPalabraTest.png)
 ### 6. Revisión estándar WCAG
 Para validar el cumplimiento del estándar Pautas de accesibilidad al contenido web (WCAG) se acudió a la herramienta online SortSite de PowerMapper (https://try.powermapper.com/Demo/SortSite).

 Primero, se puso a prueba la compatibilidad del servicio web ante diversos navegadores web. Se encontró que el servicio web puede ser usado sin mayores inconvenientes en una gran variedad de navegadores web.
 ![Compatibility](https://raw.githubusercontent.com/admontenegroa/heroku-CounterLetters/master/Compatibility.png)
 Por otro lado, al realizar la prueba de accesibilidad se encontró que el servicio web cumplía con los estándares WCAG 2.0 nivel A, AA y AAA.
 ![WCAG](https://raw.githubusercontent.com/admontenegroa/heroku-CounterLetters/master/WCAG.png)
 