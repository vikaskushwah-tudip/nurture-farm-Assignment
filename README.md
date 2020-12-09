# nurture.farm-Assignment
Restaurant Management System

Run the DemoApplication.main() with a Java 8 runtime to start the embedded Tomcat on port 8090.
Roles 
id:1 name:"Admin",
id:2 name:"Waiter,
id:3 name:"Customer"

Some URL to try:

To GET all User JSON   :http://localhost:8090/user/findAll
Create User JSON       :http://localhost:8090/user/create
Create Table           :http://localhost:8090/table/create
GET all the Table      :http://localhost:8090/table/findAll
GET table by Id        :http://localhost:8090/table/findById
Create Table booking   :http://localhost:8090/create
GET all booking        :http://localhost:8090/booking/create
Menu and Item List GET :http://localhost:8090/menu/findAll
Place a Order          :http://localhost:8090/order/Create
Get the Invoice        :http://localhost:8090/invoice/findAll
Get the Invoice by Id  :http://localhost:8090/invoice/findById




Description of API List

To GET all User JSON:http://localhost:8090/user/findAll

Create User : http://localhost:8090/user/create
Request Body:{
    "id": Integr,
    "firstname": "String",
    "lastname": "String",
    "email": "String",
    "phoneNumber": "String",
    "roles": {
        "id": Integer,
        "name": "String"
    }
}

Admin able to add Restaurant Table and Assign a waiter URL:http://localhost:8090/table/create
Request Body: {
        "tableId": Integer,
        "tableType": "String",
        "description": "Four people Only",
        "createdby": {
            "id": 1,
            "firstname": "String",
            "lastname": "String",
            "email": "String",
            "phoneNumber": "String",
            "roles": {
                "id": 1,
                "name": "Admin"
            }
        },
        "status": "Available",
        "assignee": {
            "id": 2,
            "name": "Waiter"
        }
    }
    
    GET all the Table Available:http://localhost:8090/table/findAll

    
    Customer able to book a table URL: 
    GET all the Booked Table GET:http://localhost:8090/booking/findAll
    Book a table URL POST:http://localhost:8090/create
    Request Body: {
        "bookingId": 1,
        "restaurantTable": {
            "tableId": 1,
            "tableType": "4 seat",
            "description": "Four people Only",
            "createdby": {
                "id": 1,
                "firstname": "Brian",
                "lastname": "Clozel",
                "email": "bclozel@pivotal.io",
                "phoneNumber": "123",
                "roles": {
                    "id": 1,
                    "name": "Admin"
                }
            },
            "status": "Available",
            "assignee": {
                "id": 2,
                "name": "Waiter"
            }
        },
        "customerPersonalInfo": {
            "id": 3,
            "firstname": "Rossen",
            "lastname": "Stoyanchev",
            "email": "rstoyanchev@pivotal.io",
            "phoneNumber": "32456",
            "roles": {
                "id": 3,
                "name": "Customer"
            }
        },
        "startDateAndTime": null,
        "numberOfPerson": "4",
        "bookingStatus": "Processing"
        
       Customer can see the Menu URL:
       GET:http://localhost:8090/menu/findAll
       
       As a waiter, you should be able to place the order URL
       Request URL POST:http://localhost:8090/order/Create
       Request Body:{
        "orderId": 1,
        "customerInfo": {
            "id": 3,
            "firstname": "Rossen",
            "lastname": "Stoyanchev",
            "email": "rstoyanchev@pivotal.io",
            "phoneNumber": "32456",
            "roles": {
                "id": 3,
                "name": "Customer"
            }
        },
        "restaurantItem": {
            "item_ID": 2,
            "item_Name": "ChikenLolipop",
            "item_Price": "200",
            "MenuId": {
                "menuId": 2,
                "menuType": "NON-VEG"
            },
            "item_Description": "HOT N CRISPY",
            "menuId": {
                "menuId": 2,
                "menuType": "NON-VEG"
            }
        },
        "quantity": "1",
        "restaurantTable": {
            "tableId": 3,
            "tableType": "1 seat",
            "description": "One person can sit",
            
            "status": "Available",
            "assignee": {
           
                "name": "Waiter"
            }
        }
    }
       
   As a waiter, you should be able to see the bill
   Request URL GET:http://localhost:8090/invoice/findAll
   GET By Invoice Id: http://localhost:8090/invoice/{id}

       
       
       
    
    
