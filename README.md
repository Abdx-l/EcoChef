# TerraHacks
This Java project is an eco-friendly appliance management system, which provides a way to manage different household appliances, retrieve details about them, and find the most cost-effective appliances based on specific criteria. The project uses Java Swing for its graphical user interface.

Project Structure
Appliance.java: Defines the Appliance class, which includes attributes such as name, energy consumed (in kWh), cost, eco rating (scale of 1-10), and type. It includes setters, getters, and a toString method for displaying appliance details.

ApplianceDatabase.java: Manages a list of appliances, with methods to add appliances, retrieve an appliance by name, and find the cheapest appliance of a given type.

Freezer.java, Fridge.java, Grill.java, StoveTop.java, SteamTable.java, Oven.java, Dishwasher.java, DeepFyrer.java: These files define specific types of appliances, presumably extending or utilizing the Appliance class.

home.java: The main file of the project, which sets up the application interface and integrates the appliance management functionality.

Features
Add Appliances: Add new appliances to the database.
Retrieve Appliance by Name: Find and display details of an appliance by its name.
Find Cheapest Appliance: Find and display the cheapest appliance of a given type.
Graphical User Interface: A user-friendly GUI to interact with the appliance database.

ScreenShots:
![image](https://github.com/user-attachments/assets/461f2df1-b757-4e8b-a820-6ff9b194f84c)
![image](https://github.com/user-attachments/assets/c7dcc08d-42ea-4f6f-ac19-bfa67321c851)
