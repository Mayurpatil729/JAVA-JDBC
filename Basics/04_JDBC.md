<!-- @format -->

# JDBC

JDBC is a Technology, which can be used to communicate with Database from Java
Application.

- JDBC is the Part of Java Standard Edition (J2SE|JSE)
- JDBC is a Specification defined by Java Vendor (Sun Micro Systems) and implemented by Database Vendors.
- Database Vendor provided Implementation is called "Driver Software".

## JDBC Features:

1. JDBC API is Standard API. We can communicate with any Database without rewriting our
   Application i.e. it is Database Independent API.
2. JDBC Drivers are developed in Java and hence JDBC Concept is applicable for any Platform. i.e.
   JDBC Is Platform Independent Technology.
3. By using JDBC API, we can perform basic CRUD Operations very easily.
   These Operations also known as CURD/ SCUD Operations (Ameerpet People created Terminology)
   We can also perform Complex Operations (like Inner Joins, Outer Joins, calling Stored Procedures
   etc) very easily by using JDBC API.
4. JDBC API supported by Large Number of Vendors and they developed multiple Products based
   on JDBC API.

---

JDBC Versions:

- JDBC 3.0 is Part J2SE 1.4
- No Update in Java SE 5.0
- JDBC 4.0 is Part Java SE 6.0
- JDBC 4.1 is Part Java SE 7.0
- JDBC 4.2 is Part Java SE 8.0

---

### Evolution of JDBC:

If we want to communicate with Database by using C OR C++, compulsory we have to use
database specific Libraries in our Application directly.

- In the above Diagram C OR C++ Application uses Oracle specific Libraries directly.
- The Problem in this Approach is, if we want to migrate Database to another Database then we
  have to rewrite Total Application once again by using new Database specific Libraries.

The Application will become Database Dependent and creates Maintenance Problems.

- To overcome this Problem, Microsoft People introduced "ODBC" Concept in 1992. It is
  Database Independent API.
- With ODBC API, Application can communicate with any Database just by selecting
  corresponding ODBC Driver.
- We are not required to use any Database specific Libraries in our Application. Hence our
  Application will become Database Independent.

---

#### Differences Between JDBC and ODBC

![ODBC](Images\ODBC.png)



