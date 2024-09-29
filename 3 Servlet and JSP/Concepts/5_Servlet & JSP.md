<!-- @format -->

### How to Build a Web App in Java in Eclipse?

1. **Create a New Dynamic Web Project:**

   - Open Eclipse and go to `File > New > Dynamic Web Project`.
   - Name your project, choose the appropriate settings, and click `Finish`.

2. **Add a Servlet:**

   - Right-click on `src` > `New > Servlet`.
   - Enter the class name and package, then click `Finish`.

3. **Configure Deployment Descriptor:**

   - `web.xml` will be automatically configured. You can manually edit it if needed.

4. **Build and Run:**
   - Right-click on the project > `Run As > Run on Server`.
   - Choose Apache Tomcat (or your preferred server) and click `Finish`.

### What is a Servlet?

A Servlet is a Java class used to handle HTTP requests and responses in a web application. It acts as a middle layer between client requests (usually coming from a web browser) and server responses.

### Ways to Create a Servlet

1. **Using Annotations:**
   - Use `@WebServlet("/yourURL")` directly in the Java class.
2. **Using `web.xml`:**
   - Define the servlet in the `web.xml` file and map it to a URL.

### How to Deploy & Integrate Servlet on Server

1. **Build the Project:**
   - Ensure your project is built without errors.
2. **Deploy on Server:**

   - Right-click on the project > `Run As > Run on Server`.
   - Select your server (e.g., Tomcat) and click `Finish`.

3. **Access the Servlet:**
   - Use the browser to navigate to the mapped URL of your servlet.

### How to Configure Servlet?

- **Annotations:** Use `@WebServlet` for URL mapping.
- **web.xml:** Configure servlets, filters, listeners, and URL patterns manually.

### Filters & Listeners

- **Filters:** Intercepts requests and responses to perform additional processing (e.g., logging, authentication).
- **Listeners:** Respond to events like servlet context initialization or session creation.

### Servlet Life Cycle

1. **init():** Initializes the servlet.
2. **service():** Handles requests (invokes `doGet()` or `doPost()`).
3. **destroy():** Cleans up resources before the servlet is destroyed.

### Servlet's Responsibilities in Real-Time

- **Processing Requests:** Handles client requests and generates responses.
- **Managing Sessions:** Maintains state across multiple requests.
- **Interfacing with Databases:** Retrieves and stores data as needed.

### How to Get Data from User?

- **Using `HttpServletRequest`:**
  - Use methods like `getParameter()` to fetch form data sent via GET or POST.

### How to Send Data to User?

- **Using `HttpServletResponse`:**
  - Use methods like `getWriter()` to write HTML or other responses back to the client.

### Servlet's `doGet()` vs `doPost()` Methods

- **doGet():** Handles HTTP GET requests; used for fetching data.
- **doPost():** Handles HTTP POST requests; used for submitting data (e.g., form submission).

### Request Dispatcher in Servlet

- **Purpose:** Forward a request from one servlet to another or include the content of another resource (like a JSP).
- **Methods:**
  - `forward()`
  - `include()`

### `forward()` vs `sendRedirect()`

- **forward():**
  - Internal redirection within the server; the client is unaware.
- **sendRedirect():**
  - External redirection; the client is aware and the URL changes.

### Session Tracking in Servlets

- **Session Management:** Use `HttpSession` to maintain user-specific data across multiple requests.
- **Session ID:** A unique identifier for each user's session.

### Cookies in Servlets

- **What Are Cookies?** Small pieces of data stored on the client side to track user sessions or preferences.
- **Using Cookies:**
  - Create cookies using `new Cookie()`.
  - Add cookies to responses using `response.addCookie()`.
  - Retrieve cookies from requests using `request.getCookies()`.
