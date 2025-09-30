# City Nursing Home Management System

This is a Java Swing application for managing a nursing service. It provides a graphical user interface for different user roles to manage patients, consultants, and other administrative tasks.

## Features

*   **User Authentication:** Secure login for different user roles (Manager, Cashier, Staff).
*   **Role-Based Access:** Different dashboards and functionalities based on the user's role.
*   **Patient Management:** Add, view, and manage patient details.
*   **Consultant Management:** Add, view, and manage consultant details.
*   **Dashboard:** A central dashboard for each user role to access different features.

## Technologies Used

*   **Java:** The core programming language for the application.
*   **Java Swing:** Used for creating the graphical user interface.
*   **NetBeans:** The integrated development environment (IDE) used for this project.

## How to Run the Application

### Prerequisites

*   Java Development Kit (JDK) installed.
*   Apache NetBeans IDE installed.

### Running from NetBeans

1.  Open the project in NetBeans.
2.  Right-click on the project in the "Projects" pane.
3.  Select "Run". The application will start, and the Sign-In page will be displayed.

### Running from the Command Line

1.  Navigate to the project's root directory.
2.  Compile the source code using the following command:
    ```bash
    ant jar
    ```
3.  Run the application using the following command:
    ```bash
    java -jar "dist/CityNursing.jar"
    ```

## User Roles & Credentials

The application has three user roles: Manager, Cashier, and Staff. You can use the following example credentials to log in. The actual credentials are stored in the `.txt` files in the root directory.

### Manager

| Email                         | Password         |
| ----------------------        | ---------------- |
| shenalmanelka774@gmail.com    | shenal@10        |

### Cashier

| Email                  | Password         |
| ---------------------- | ---------------- |
| nadeekas@gmail.com     | nadeeka@10       |

