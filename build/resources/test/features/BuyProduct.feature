Feature: SearchBook
  I as a user of the application YourLogo
  I want to access the application with my username and password
  So that buy thnew products


  @LoginSuccessful
   Scenario Outline: user makes the buy of a product
     Given that the user enters to the page YourLogo
     When enter your credentials <mail> y <password>
     And search a product with twenty porcentage discount
     And add a product with size and color characteristics
     Then the message is displayed <msg>
     And make the checkout
     And validate the order buy <msgOrder> y <amount>

     Examples:

       | mail                   | password | msg                                            |msgOrder                           |amount|
       | vaneatehortu@gmail.com | 300490   |Product successfully added to your shopping cart|Your order on My Store is complete.|$18.40|




