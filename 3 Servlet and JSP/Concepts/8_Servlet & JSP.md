<!-- @format -->

### **Servlet URL Parameters**

**URL Parameters** (also known as **Query Strings**) are used to pass data from the client to the server by appending key-value pairs to the URL.

#### **How to Send Parameters:**

When a client sends a request to the server with parameters in the URL, it typically looks like this:

```
http://example.com/ServletName?name=Mayur&age=25
```

- **Key-Value Pair Format:** `key=value`
- In the example above, `name=Mayur` and `age=25` are the parameters.

#### **How to Retrieve URL Parameters in a Servlet:**

In the Servlet, you can retrieve these parameters using the `HttpServletRequest` object’s `getParameter()` method.

```java
String name = request.getParameter("name");
String age = request.getParameter("age");
```

---

### **Request Attributes**

**Request Attributes** allow you to store data in the request scope, which is available until the request is processed. This is useful when you want to share data between servlets or forward a request to another resource (like JSP or another servlet).

#### **Setting a Request Attribute:**

You can set a request attribute using the `setAttribute()` method.

```java
request.setAttribute("username", "Mayur");
```

#### **Getting a Request Attribute:**

To retrieve the request attribute, use `getAttribute()`.

```java
String username = (String) request.getAttribute("username");
```

Request attributes are mainly used when forwarding a request using `RequestDispatcher`.

---

### **Session Attributes**

**Session Attributes** are used to store information about a user across multiple requests (such as login sessions). Data stored in the session is maintained for the entire duration of the user's interaction with the web application.

#### **Setting a Session Attribute:**

You can store attributes in the `HttpSession` object using the `setAttribute()` method.

```java
HttpSession session = request.getSession();
session.setAttribute("user", "Mayur");
```

#### **Getting a Session Attribute:**

Retrieve session attributes using `getAttribute()`.

```java
String user = (String) session.getAttribute("user");
```

Session attributes persist until the session expires or is manually invalidated.

---

### **Adding Cookies**

Cookies are small pieces of data that are stored on the client side and sent to the server with each request. Cookies can be used for session tracking, user preferences, or any persistent information between client and server.

#### **How to Create and Add Cookies in Servlet:**

1. **Create a Cookie:**
   Use the `Cookie` class to create a cookie.

   ```java
   Cookie cookie = new Cookie("username", "Mayur");
   ```

2. **Set Cookie Attributes (Optional):**
   You can set optional attributes like expiration time, domain, and path.

   ```java
   cookie.setMaxAge(60 * 60 * 24); // Cookie will expire in 1 day
   ```

3. **Add Cookie to the Response:**
   Add the cookie to the response object to send it to the client.

   ```java
   response.addCookie(cookie);
   ```

#### **How to Retrieve Cookies:**

1. **Get Cookies from the Request:**
   Use `getCookies()` method to retrieve all cookies sent by the client.

   ```java
   Cookie[] cookies = request.getCookies();
   ```

2. **Find a Specific Cookie:**
   Loop through the array of cookies to find a specific one.

   ```java
   if (cookies != null) {
       for (Cookie c : cookies) {
           if ("username".equals(c.getName())) {
               String username = c.getValue();
               // Use the username value
           }
       }
   }
   ```

---

### **Summary:**

- **URL Parameters**: Data sent via URL using key-value pairs. Retrieved using `request.getParameter()`.
- **Request Attributes**: Data shared between servlets or forwarded to JSPs. Set using `request.setAttribute()` and retrieved using `request.getAttribute()`.
- **Session Attributes**: Data persisted across multiple requests during a session. Set using `session.setAttribute()` and retrieved using `session.getAttribute()`.
- **Cookies**: Client-side data storage, sent with every request. Set using `response.addCookie()` and retrieved using `request.getCookies()`.
