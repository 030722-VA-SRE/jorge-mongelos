# PROJECT NAME
Project Item Shop

The Item Shop app is a simple API that facilitates
interactions with some kind of item, the choice is up to you.

## Technologies Used
* Tech 1 - Java Programing Language
* Tech 2 - Spring Boot Suite
* Tech 3 - AWS Postgresql instance
* Features

## List of features ready and TODOs for future development

* As a user, I can view all items.
* As a user, I can add a new item.
* As a user, I can update a item.
* As a user, I can view items by ID.
* As a user, I can search items by a criteria

## To-do list:
* As a user, I can login.
* As a user, I can register for a customer account.* As an employee, I can add an item to the shop.
* As a customer, I can view the available items.
* As a customer, I can purchase an item.
* As an employee, I can remove an item from the shop.
* As a customer, I can view the items that I own.

### Clone Repository

* git clone https://github.com/030722-VA-SRE/jorge-mongelos.git
* git commands work cross-platform
### After cloning the repository:
* Open with Spring Tool Suite 4 (STS)
* Run the software with the "Run" button provided in the STS

<img src="https://github.com/030722-VA-SRE/jorge-mongelos/blob/main/images/STS.jpg">

* Download and install Postman

<img src="https://github.com/030722-VA-SRE/jorge-mongelos/blob/main/images/Postman.jpg">

## Project's source code

* main method

<img src="https://github.com/030722-VA-SRE/jorge-mongelos/blob/main/images/mainMethod.jpg">

* Auth Controller folder

<img src="https://github.com/030722-VA-SRE/jorge-mongelos/blob/main/images/AuthController.java.jpg">
<img src="https://github.com/030722-VA-SRE/jorge-mongelos/blob/main/images/ItemsController.jpg">
<img src="https://github.com/030722-VA-SRE/jorge-mongelos/blob/main/images/UsersController.jpg">

* DTO folder

<img src="https://github.com/030722-VA-SRE/jorge-mongelos/blob/main/images/ItemsDTO.jpg">
<img src="https://github.com/030722-VA-SRE/jorge-mongelos/blob/main/images/UsersDTO.jpg">

* Exceptions folder

<img src="https://github.com/030722-VA-SRE/jorge-mongelos/blob/main/images/AuthenticationException.c">
<img src="https://github.com/030722-VA-SRE/jorge-mongelos/blob/main/images/ItemsNotFoundException.png">
<img src="https://github.com/030722-VA-SRE/jorge-mongelos/blob/main/images/UserNotFoundException.png">

* Models folder

<img src="https://github.com/030722-VA-SRE/jorge-mongelos/blob/main/images/Items.png">
<img src="https://github.com/030722-VA-SRE/jorge-mongelos/blob/main/images/Users.png">
<img src="https://github.com/030722-VA-SRE/jorge-mongelos/blob/main/images/UsersRole.png">

* Persistence folder

<img src="https://github.com/030722-VA-SRE/jorge-mongelos/blob/main/images/UsersRepository.png">
<img src="https://github.com/030722-VA-SRE/jorge-mongelos/blob/main/images/ItemsRepository.png">

* Services folder

<img src="https://github.com/030722-VA-SRE/jorge-mongelos/blob/main/images/AuthServices.png">
<img src="https://github.com/030722-VA-SRE/jorge-mongelos/blob/main/images/UsersRepository.png">
<img src="https://github.com/030722-VA-SRE/jorge-mongelos/blob/main/images/UsersRepository.png">

## Instructions:
1. clone git repository.
2. Must attach a DBMS to source code.
3. Start IDE of preference (Spring Tool Suite 4 Recommended).
4. Open as an existing project.
5. Run the program with Spring Boot initializer button.

## Postman

1. Open Postman.
2. initial url: http://localhost:8081
3. To access users: http://localhost:8081/users
4. To create an user: http://localhost:8081/users
   - click on Body tab
   - click on "raw" sub-tab
   - click format sub-tab and set it to "JSON"
   - Use following Json notation
        *  {
            "username": "user",
            "userPassword: "pass",
            "role": "BASIC_USER"
           }
5. To delete user:
    * Input url: http://localhost:8081/users/# ID
    * Click on "Send"
6. To login:
    * input url: http://localhost:8081/auth
    * Click "Body" sub-tab
    * Click "x-www-form-urlencoded" sub-tab
    * On "Key" option:
        - input: username
        - input: password
    * On Value option:
        - input credentials
7. To get security token:
    * Click on "Body" under "Response" tab.
    * Copy contents of "Authorization"
    * Go back to "Request" tab.
    * Under "password" key write "Token"
    * Under "password" value copy/paste copied token.
8. To update user:
    * input url: http://localhost:8081/ID#
    * click on Body tab
    * click on "raw" sub-tab
    * click format sub-tab and set it to "JSON"
    * Use following Json notation
        -  {
            "username": "user",
            "userPassword: "pass"
           }

## To work with items in the shop
1. initial url: http://localhost:8081
2. To access users: http://localhost:8081/items
3. To create an user: http://localhost:8081/items
   - click on Body tab
   - click on "raw" sub-tab
   - click format sub-tab and set it to "JSON"
   - Use following Json notation
        *  {
            "itemName": "Roma Tomatoes",
            "itemCategory": "produce",
            "itemPrice": "1.33"
           }
4. To delete item:
    * Input url: http://localhost:8081/items/ID#
    * Click on "Send"
5. To update item:
    * input url: http://localhost:8081/ID#
    * click on Body tab
    * click on "raw" sub-tab
    * click format sub-tab and set it to "JSON"
    * Use following Json notation
        -  {
            "itemName": "Roma Tomatoes",
            "itemCategory": "produce",
            "itemPrice": "1.33"
           }
6. To get item by ID:
    * Input url: http://localhost:8081/items/ID#
    * Click on "Send"
    


# Contributors
   * Aaron Cunanan
   * Ayan Williams
   * Fentry Martin
   * Alex Pazmino
   * Kyle Pfunder


# License
## MIT Standard.