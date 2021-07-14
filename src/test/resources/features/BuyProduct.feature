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
     Then se muestra el mensaje <msg>
     And se realiza checkout
     And valida la orden de compra <amount>

     Examples:

       | mail                   | password | msg                                            |amount|
       | vaneatehortu@gmail.com | 300490   |Product successfully added to your shopping cart|$18.40|




