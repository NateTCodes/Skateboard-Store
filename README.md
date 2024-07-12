# Vacation Rental Booking Website

## Project Description

This project is a vacation rental booking website designed to provide users with a seamless experience in searching for and booking vacation rentals. The website includes features such as amenities management, order confirmation, and real-time booking tracking. This project was designed following UML diagrams to ensure comprehensive planning and efficient implementation.

## Features

- **User-Friendly Booking Interface**: Easily search and book vacation rentals.
- **Amenities Management**: Add and manage amenities for each rental property.
- **Order Confirmation**: Receive instant booking confirmations.
- **Booking Tracking**: Track the status of your bookings in real-time.
- **Multithreaded Language Translation**: Support for messages across diverse time zones.
- **Currency Exchange Integration**: Enhance global usability by supporting multiple currencies.

## Technologies Used

- **Frontend**: Angular
- **Backend**: Spring Boot, Java
- **Database**: MySQL
- **Containerization**: Docker
- **Version Control**: Git
- **Others**: UML diagrams for planning and design

## Installation

### Prerequisites

- Node.js
- Angular CLI
- Java JDK
- Spring Boot
- MySQL
- Docker (optional, for containerization)

### Steps

1. **Clone the repository**:
    ```bash
    git clone https://github.com/NateTCodes/Vacation-Website.git
    cd Vacation-Website
    ```

2. **Backend Setup**:
    - Navigate to the `backend` directory:
        ```bash
        cd src/main
        ```
    - Update `application.properties` with your MySQL database credentials.
    - Build the Spring Boot application:
        ```bash
        ./mvnw clean install
        ```
    - Run the Spring Boot application:
        ```bash
        ./mvnw spring-boot:run
        ```

3. **Frontend Setup**:
    - Navigate to the `frontend` directory:
        ```bash
        cd D288 Front End
        ```
    - Install dependencies:
        ```bash
        npm install
        ```
    - Start the Angular application:
        ```bash
        ng serve
        ```

4. **Access the Application**:
    - Open your web browser and navigate to `http://localhost:4200`.

## Usage

- **Search and Book Rentals**: Use the search functionality to find available rentals, view details, and make bookings.
- **Manage Amenities**: Property owners can add and update amenities for their rentals.
- **Track Bookings**: Users can track their booking status and receive order confirmations.

## Project Structure

- **frontend**: Contains the Angular application.
- **backend**: Contains the Spring Boot application.
- **docs**: Contains UML diagrams and other documentation.

## Contributing

We welcome contributions to this project! If you have any ideas, suggestions, or improvements, please open an issue or submit a pull request.

### Steps to Contribute

1. Fork the repository.
2. Create a new branch:
    ```bash
    git checkout -b feature-branch
    ```
3. Make your changes and commit them:
    ```bash
    git commit -m "Description of changes"
    ```
4. Push to the branch:
    ```bash
    git push origin feature-branch
    ```
5. Open a pull request and describe your changes.

