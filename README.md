Enviro Waste Management

This project implements a RESTful API for managing waste, waste categories and drop-off locations.

Project Structure

Components
•	PickupController - It is responsible to handling HTTP requests associated with pickup request.
•	WasteController : Responsible for endpoints to retrieve waste information and drop-off locations.
•	PickUpRequestDTO - class: Data Transfer Object (DTO) for pickup request.
•	WasteDTO: DTO for waste items and its categories.
•	DropOffLocationsInTheArea: Contains drop off locations for hazardous items.
•	PickupService - Contains logic for handling pickup requests.
•	Main Application
•	EnviroWasteManagementApplication : Main entry point for the Spring Boot application 
•	AppConfig: Configuration Class to define Spring beans

API Endpoints

Pickup Requests
POST /api/pickup
•	Creates a new hazardous pickup request.
•	Request body: PickUpRequestDTO
•	Response: Message for Request Successfully Processed.

Waste Management
GET /api/wastes
•	Retrieves a list of wastes with its categories
GET /api/wasteservice
•	Retrieves a list of waste services and the bins the wastes belong to.
•	Response: List of waste services.
GET /api/dropofflocationsinthearea
•	Retrieves drop-off locations for various items.
•	Response: List of drop off locations available in the area.

Usage
1.	Running the Application
•	Run EnviroWasteManagementApplication.java as a Java application.
•	The application will start on http://localhost:8080.
2.	Testing API Endpoints
•	Use tools like curl to test the API endpoints.
•	Example:
Bash:

curl -X GET http://localhost:8080/api/wastes
curl -X POST -H "Content-Type: application/json" -d '{"name":"Buwa Mabasa","address":"123 Main St","contactNumber":"0123456789","autoPartsDetails":"Engine parts"}' http://localhost:8080/api/pickup

Configuration
•	Spring Boot Configuration: Configure additional Spring beans in AppConfig.java.
•	Database Configuration: Modify database connection details in application. Properties.
Dependencies
•	Spring Boot:(v3.3.1)
•	Spring Web MVC
•	Database (SQL)
Contributors
•	Buwa Mabasa
![image](https://github.com/BeeCodeHub/friendly-environment-springboot/assets/123187043/531d4977-36e8-42b5-9ebc-d0416f9b349d)
