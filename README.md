Introduction

TODO: El test consta de un script
 
El script desarrollado es alusivo a la  búsqueda de un producto en la store YourLog, para la busqueda de dicho producto se deben seguir las seiguientes caracteristicas:
Producto con un descuento del 20%
La talla del producto debe ser L
El color del producto debe ser verde

para lo cuál es necesario loguearse exitosamente en la página, buscar el producto con los criterios especificados,validar el producto agregado al carrito 
y finalmente validar la orden de compra.

El escenario desarrollado corresponde al escenario con loguin correcto, busqueda y compra exitosa:

   Scenario Outline: user makes the buy of a product
     Given that the user enters to the page YourLogo
     When enter your credentials <mail> y <password>
     And search a product with twenty porcentage discount
     And add a product with size and color characteristics
     Then the message is displayed <msg>
     And make the checkout
     And validate the order buy <msgOrder> y <amount>

Getting Started
La entrega del proyecto "automationTest" se realiza mediante la entrega del link del gitHub

El proceso siguiente es abrir el IDE de Intellij IDEA Community edition
Version: 2013-03-03

-Installation process

Seleccionar la Opción Open del Menu File, seleccionar el proyecto en la carpeta correspondiente 

Validar estructura del proyecto al finalizar de importar las dependencias y gradle.




Questions
Tasks
UI
Runners
Stepdefinitions
Feature

Los anteriores paquetes integran la base del patrón Screenplay, el cuál fue usado para el desarrollo del test.

