<!-- @format -->

#### **JDBC (Java Database Connectivity)**

JDBC is a Java API used for connecting and executing queries with databases. It allows Java applications to interact with databases such as MySQL, PostgreSQL, etc.

**Key Components of JDBC:**

- **DriverManager:** Manages the list of database drivers.
- **Connection:** Represents a connection to the database.
- **Statement:** Used for executing SQL queries.
- **PreparedStatement:** A subclass of `Statement`, used for executing parameterized queries.
- **ResultSet:** Holds the results returned by executing SQL queries.

#### **Servlets**

A Servlet is a Java class that handles HTTP requests and responses. It acts as a middle layer between a web browser (client) and a database or application (server).

#### **JSP (JavaServer Pages)**

JSP is a technology used to create dynamic web pages. It allows embedding Java code directly into HTML, making it easier to manage server-side scripts.

---

### **DoGet vs DoPost Services**

#### **DoGet Method:**

- Used to **retrieve information** from the server.
- It appends request parameters in the **URL**.
- Suitable for simple queries, bookmarking, and not secure for sensitive data.
- Example: `http://example.com?user=mayur`

#### **DoPost Method:**

- Used to **send information** to the server (like form submission).
- Request parameters are sent in the **body** of the request, making it secure.
- Better for sending large and sensitive data.

**Key Differences:**

- **Data Handling:** DoGet sends data via URL; DoPost sends data in the body.
- **Size Limit:** DoGet has a size limit; DoPost does not.
- **Security:** DoPost is more secure for sensitive data as parameters are not exposed in the URL.

---

### **One Servlet to Second Servlet Communication**

Servlets can communicate with each other using **RequestDispatcher** or **sendRedirect**.

1. **Using `RequestDispatcher`:**

   - Forward the request from one servlet to another on the same server.
   - Example:
     ```java
     RequestDispatcher rd = request.getRequestDispatcher("/SecondServlet");
     rd.forward(request, response);
     ```

2. **Using `sendRedirect`:**
   - Sends a new request from the client to another servlet.
   - Example:
     ```java
     response.sendRedirect("SecondServlet");
     ```

**Key Difference:** `forward()` keeps the original request and response objects, while `sendRedirect()` creates a new request.

---

### **Servlet API Life Cycle**

1. **Loading and Instantiation:** Servlet is loaded when the server starts or when the servlet is requested for the first time.
2. **Initialization (`init()` method):** Initializes the servlet with configuration parameters.
3. **Request Handling (`service()` method):** Forwards requests to `doGet()`, `doPost()`, etc., based on HTTP methods.
4. **Destruction (`destroy()` method):** Cleans up resources before the servlet is destroyed.

**Flowchart:**

```plaintext
Client Request -> Server -> Servlet Initialization -> Service Methods (doGet/doPost) -> Response to Client
                                                           |
                                                      Lifecycle Ends
                                                     Servlet Destroyed
```

---

### **Ways to Send and Retrieve Data**

1. **Send Data (to Client):**

   - Use `HttpServletResponse` object to write data back to the client.
     ```java
     response.getWriter().write("Hello World");
     ```

2. **Retrieve Data (from Client):**
   - Use `HttpServletRequest` object to read data sent from the client.
     ```java
     String username = request.getParameter("username");
     ```

---

### **Servlet Responsibilities in Real Time**

- **Request Handling:** Process incoming HTTP requests and send appropriate responses.
- **Session Management:** Maintain user sessions using cookies or `HttpSession`.
- **Security:** Handle user authentication, authorization, and data encryption.
- **Data Interaction:** Interact with databases to retrieve or store information.
- **Error Handling:** Catch and manage errors or exceptions that occur during request processing.

---

### **Servlet Filters and Listeners**

#### **Servlet Filters:**

- Used to modify request and response objects before they reach the servlet or after the servlet has processed them.
- Examples of filters: Authentication, logging, compression, etc.
- Example filter:
  ```java
  public class LoggingFilter implements Filter {
      public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) {
          // Modify request or response here
          chain.doFilter(req, res); // Pass to next filter/servlet
      }
  }
  ```

#### **Servlet Listeners:**

- Listen to specific events in a web application such as application startup, session creation, or attribute changes.
- Examples of listeners: `HttpSessionListener`, `ServletContextListener`.

**Example (Session Listener):**

```java
public class MySessionListener implements HttpSessionListener {
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("Session Created: " + se.getSession().getId());
    }
}
```

---
