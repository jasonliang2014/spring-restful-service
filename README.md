spring-restful-service
==========================

RESTful web services using Spring Platform 1.1.0


##Features

Spring IO Platform 1.1.0<br />
Spring MVC<br />
Restful service<br />
Factory pattern using injection for extensibility<br />
Exception handling<br />
Logging<br />
Integration using resource<br />


##Develop and run using Eclipse

First run following commands in project folder

mvn clean package<br />
mvn eclipse:eclipse<br />

Then import maven project into Eclipse, publish to Tomcat server.

The context path is TaxService by default.

##Calculate Tax

URL: http://localhost:8080/TaxService/personaltax<br />
Parameters:<br />
province - code of province<br />
year - tax year<br />
income - taxable income<br />

For example: http://localhost:8080/TaxService/personaltax?province=BC&year=2014&income=100000



