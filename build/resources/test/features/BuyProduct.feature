Feature: SearchBook
  I as a user of the application YourLogo
  I want to access the application with my username and password
  So that buy thnew products


  @LoginSuccessful
   Scenario Outline: usuario realiza compra de un producto
     Given que el usuario ingresa a la pagina de YourLogo
     When ingresa sus credenciales <mail> y <password>
     And busca un producto con descuento del veinte porciento
     And anade un producto con las caracteristicas de talla y color
     Then valida la orden de compra

     Examples:

       | mail                   | password |
       | vaneatehortu@gmail.com | 300490   |




