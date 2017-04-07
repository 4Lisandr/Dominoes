# Dominoes
Implement a small web application - DOMINO
Requirements to the functional.
The application should be able to:
1. randomly obtain from the "market" (a common pool containing all the bones) domino bones - a random number or a predetermined number.
2. build a chain of bones from the provided (formed earlier) set. The user can specify whether to give him all the variants of the chains or only one - the longest one.
Interface requirements.
The interface should be simple and clear - no more complicated than a pair of buttons and a pair of input-output fields.
Do not use CSS.
The interface should consist of a pair of pages. The first - to generate sets of bones, the second - to build chains and output the results. There should also be a title page from which you can access any of the above.

Features of the implementation.
The results of building chains should be stored in the database and displayed in the history on the page of building chains.
Sets and chains built from them should be stored in different tables.
Requirements for the toolkit.
1. OS - any (Windows, Linux)
2. Programming language - Java 1.6+
3. Servlet container - Jetty
4. Creating web pages - JSP + JSTL without using scriptlets.
5. Database - any JDBC compatible, freely distributed - PostgreSQL, MySQL, Derby, HQSQL.
6. Do not use web frameworks (Spring, Struts, Stripes, etc.)
7. Do not use ready-made JPA and ORM implementations. Working with the database through JDBC. Configure the connection in the properties file.
8. Use Entity and Service Classes
9. Maven for project assembly and dependencies. Pom.xml manually. The output file is web-app.war

There must be goals:
Creating a database, necessary tables
Filling in with test data (for the story to be filled at once)
Run - launch of an application running embedded Jetty
For operations with the base and the launch of jetty, you can use the maven plugins.
Requirements for registration.
* Must be the ability to "from scratch" to collect and run the project in the "bare console".
* There must be an instruction (Readme in the project root) with a brief description of the project, its functionality, the way of assembling and launching (indicating the necessary commands). Examples are welcome.
* Welcome to bat and bash scripts for initialization and test run.