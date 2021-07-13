Introduction

TODO: El test consta de un script
 
El script desarrollado es alusivo a la  búsqueda de un libro en la página Librería Naciona, para lo
cuál es necesario loguearse exitosamente en la página, buscar un libro, validar los resultados obtenidos
y finalmente cerrar sesión.

El escenario desarrollado corresponde al escenario con loguin correcto y busqueda exitosa de un libro:

@LoginSuccessful
   Scenario Outline: user search a book on search bar successful
     Given that the user want do login in the application libreria nacional successful
     When the user enter credentials <mail> y <password>
     And the user search the <book>
     Then validate that search throw results
     And the user close session

Getting Started
La entrega del proyecto "MobileTec" se realiza en formato ZIP

El proceso siguiente es abrir el IDE de Intellij IDEA Community edition
Version: 2013-03-03

-Installation process

Seleccionar la Opción Open del Menu File, seleccionar el proyecto en la carpeta correspondiente 

Validar estructura del proyecto al finalizar de importar las dependencias y gradle.



Actions
Questions
Tasks
UI
Runners
Stepdefinitions
Feature

Los anteriores paquetes integran la base del patrón Screenplay, el cuál fue usado para el desarrollo del test.

