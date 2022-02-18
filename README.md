Employee Management System 

Project WAR path: target/EmpProject-1.0-SNAPSHOT.war

How to run:
1. set Tomcat Server(port,url...)
2. run Tomcat Server



Core Technology Stack
1. Project framework: Java Web(Servlet)

2. Basic tools: Maven/Tomcat/MySQL/JDK17

3. The front-end technology: JSP(EL+JSTL)

4. Other technologies: JDBC(Dbutils,Druid) 



1. Dao: EmpDao, EmpManagerDao

2. Entity: Emp, EmpManager, Page

3. Service:
   Emp(addEmp, removeEmp, modifyEmp, showEmp, showAllEmpByPage)
   EmpManager(login)

4. Controller:
   EmpManagerLogin, InsertEmp, RemoveEmp, ShowAllEmp, ShowEmp, UpdateEmp

5. Filter: CheckFilter



MVC framework 
Model (service+dao+entity)
View (jsp, html)
Controller (servlet)

Three tier architecture
View -> Service(interface) -> Dao(interface)

Web development steps:
1. Dao: table, entity, Dao interface, Dao implementation
2. Service: Service interface, Service implementation
3. Controller(Servlet):
   collect data from request;
   call Service implementation 
   store data in scope
   sendRedirect and forward
4. JSP: get data from scope; put data in html tag（EL+JSTL）
5. Filter: CheckFilter

