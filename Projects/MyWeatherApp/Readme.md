<!-- @format -->

# Weather App

This is a Weather App built using Java Servlets and JSP (JavaServer Pages), which fetches weather data from the [OpenWeather API](https://openweathermap.org/) based on a city name entered by the user.

## Project Structure

The main files and folders in this project are as follows:

├── images/
│ └── [Image files used in the project, e.g., weather icons]
├── MyServlet.java
├── index.html
├── index.jsp
├── style.css
├── script.js

- **images/**: Contains any images used in the app, such as weather icons.
- **MyServlet.java**: The Java Servlet file that handles backend logic, including making requests to the OpenWeather API and processing the weather data.
- **index.html**: The main landing page where users can enter a city name and submit the form to get weather information.
- **index.jsp**: The JSP page responsible for displaying the weather details after the data is fetched.
- **style.css**: The CSS file for styling the UI components of the weather app.
- **script.js**: A JavaScript file that adds any client-side interactivity, like form validation or dynamic updates.

## Features

- Search weather information by city name
- Displays current weather conditions such as temperature, humidity, and weather description
- Utilizes the OpenWeather API for fetching live weather data
- Clean and responsive UI

## How It Works

1. **User Input**: The user enters a city name on the **index.html** page.
2. **API Call**: The form data is submitted to **MyServlet.java**, which then sends a request to the OpenWeather API to retrieve the weather data.
3. **Result Display**: The weather data is processed and displayed on the **index.jsp** page.

## Technologies Used

- **Java Servlet**: For backend logic and interacting with the OpenWeather API.
- **JSP (JavaServer Pages)**: For dynamically rendering weather data.
- **HTML/CSS**: For the front-end interface.
- **JavaScript**: For additional client-side functionality.
- **Apache Tomcat**: For running the web application.
- **OpenWeather API**: To fetch real-time weather data.

## Setup and Running the Project

### Prerequisites

1. Sign up on the [OpenWeather website](https://openweathermap.org/) to get your free API key.
2. Ensure you have a servlet container like Apache Tomcat set up.

### Steps

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/weather-app.git
   ```
2. Open the project in your IDE (e.g., Eclipse).
3. Replace `YOUR_API_KEY` in **MyServlet.java** with your actual OpenWeather API key:
   ```java
   String apiKey = "YOUR_API_KEY";
   ```
4. Build and deploy the project using Apache Tomcat.
5. Access the app at `http://localhost:8080/weather-app/` in your browser.

## Example

Here's how the weather app interface looks:

![Weather App Interface](images/weather_screenshot.png)

## API Usage

- **OpenWeather API**: This app uses the `/weather` endpoint from the OpenWeather API to get current weather data based on a city name. [API Documentation](https://openweathermap.org/current).

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
