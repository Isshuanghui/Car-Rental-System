# Car-Rental-System
Fleet Management in Car Rental Systems
# 🎙️System Overview
This car rental system is a console application developed in Java, primarily designed to simulate the rental business process for cars and buses. It allows users to select the type of vehicle (car or bus) they want to rent, followed by choosing the brand and specific model (for cars) or the number of seats (for buses). Finally, users input the number of rental days. The system then assigns a specific vehicle based on the user's selection and calculates the total rental cost.
# 🛠️Tool Usage Process
  
Environment Setup: Ensure that the Java Development Kit (JDK) is installed on your system. This application is a pure Java console program, so no additional complex development tools are required. You can use simple text editors like Notepad++ or professional integrated development environments (IDEs) such as IntelliJ IDEA or Eclipse.

Code Compilation: Compile the Java source code files in the Carhire01 package. For example, if you are using the command - line, navigate to the directory containing the source code and use the javac command to compile all the .java files.

Running the Program: After successful compilation, use the java command to run the Carhire class, which is the entry - point of the program.

# 🔖Functional Modules

Vehicle Information Management: The system pre - defines various vehicle information, including the brand, model, license plate number, and daily rental price of cars and buses. This information is stored in static arrays and mapping structures for easy access by the system.

User Interaction: The system interacts with users through the console. It guides users step - by - step to select the vehicle type, brand, model or number of seats, and enter the rental days.

Vehicle Matching: Based on the user's selection, the system matches a specific vehicle from the pre - defined vehicle information.

Rental Calculation: The system calculates the total rental cost according to the selected vehicle and the number of rental days. Different types of vehicles (cars and buses) and different rental durations have different rental calculation rules.

# 📜Workflow
 Welcome Screen: When the program starts, it displays a welcome message and the types of vehicles available for rent (cars and buses), prompting the user to select the type of vehicle they want to rent.

Select Vehicle Type: The user enters the number corresponding to the vehicle type. The system then displays the list of available brands based on the user's selection and prompts the user to choose a brand.

Select Vehicle Brand: The user enters the brand number. The system then displays the list of models (for cars) or the number of seats (for buses) corresponding to the selected brand and prompts the user to choose a model or the number of seats.

Select Vehicle Model or Number of Seats: The user enters the number of the model or the number of seats. The system matches a specific vehicle from the pre - defined vehicle information based on the user's selection.

Enter Rental Days: The user enters the number of rental days. The system calculates the total rental cost based on the matched vehicle and the number of rental days.

Display Results: The system displays the license plate number of the matched vehicle and the total rental cost.

