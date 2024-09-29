<!-- @format -->

# Web Calculator

This is a simple Web Calculator built using Java Servlets and JSP (JavaServer Pages). The calculator performs basic arithmetic operations and provides a clean user interface for interaction.

## Project Structure

The main files and folders in this project are as follows:

├── images/
│ └── [Image files used in the project, e.g., icons, logos]
├── MyServlet.java
├── index.html
├── result.jsp
├── style.css

- **images/**: Contains any images used within the project, such as icons or background images.
- **MyServlet.java**: The Java Servlet file that handles the backend logic for the calculator, including processing user input and performing the calculations.
- **index.html**: The main HTML file which serves as the landing page for the web calculator. It includes a form for user input (e.g., entering numbers and selecting operations).
- **result.jsp**: The JSP page that displays the result of the calculation after processing the input from `MyServlet.java`.
- **style.css**: The stylesheet responsible for styling the web calculator's UI, ensuring a clean and user-friendly experience.

## Features

- Perform basic arithmetic operations (Addition, Subtraction, Multiplication, Division)
- Clean and simple UI
- Servlet for handling backend logic
- JSP for dynamic result display

## How It Works

1. **User Input**: Users can input numbers and select an arithmetic operation on the **index.html** page.
2. **Form Submission**: The form is submitted to the **MyServlet.java**, which processes the input and performs the calculation.
3. **Result Display**: The result of the operation is passed to **result.jsp**, which dynamically displays the output to the user.

## Technologies Used

- **Java Servlet**: For backend processing of user input.
- **JSP (JavaServer Pages)**: For dynamically rendering the results.
- **HTML/CSS**: For building the front-end interface.
- **Apache Tomcat**: For running the web application.

## Setup and Running the Project

1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/web-calculator.git
   ```
2. Open the project in your IDE (e.g., Eclipse).
3. Build and deploy the project using a Java servlet container (like Apache Tomcat).
4. Access the calculator by navigating to `http://localhost:8080/web-calculator/` in your browser.

## Screenshots

![Calculator Interface](images/calculator_screenshot.png)

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

Feel free to modify the paths and details according to your actual project setup!

---

 

