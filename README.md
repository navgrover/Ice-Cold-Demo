# Ice-Cold-Demo
Initial Creation

# Installation
Download the src folder and pom.xml file to an eclipse development environment.
Using maven build the project. 
Deploy the war file to tomcat webapp directory.

Database setup:
  - I used Mysql.
  - Db name = icecream_db
  - table name = icream
  - run scrip_db to create db and table with four rows populated.  

#Example
Three RESTful apis implemented:

 1) http://localhost:8080/IceColdDemo/icecream/list
      - returns all the flavored icecream in JSON format
      
 2) http://localhost:8080/IceColdDemo/icecream/2
      - returns a flavored icecream with id=2
      
 3) http://localhost:8080/IceColdDemo/icecream/update?id=3&quantity=3
      - updates the quantity to 3 for an icecream with id = 3
      
  
