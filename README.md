spring-restful-service
==========================

RESTful web services using Spring Platform 1.1.0


##Features

Spring IO Platform 1.1.0
Spring MVC
Restful service
Factory pattern using injection for extensibility
Exception handling
Logging
Integration using resource


##Develop and run using Eclipse

First run following commands in project folder

mvn clean package
mvn eclipse:eclipse

Then import maven project into Eclipse, publish to Tomcat server.

The context path is TaxService by default.

##Calculate Tax

URL: http://localhost:8080/TaxService/personaltax
Parameters:
province - code of province
year - tax year
income - taxable income

For example: http://localhost:8080/TaxService/personaltax?province=BC&year=2014&income=100000



