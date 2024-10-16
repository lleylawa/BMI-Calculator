# BMI Calculator

## Project Description
This is a simple **BMI Calculator** application built using **JavaFX**. The app allows users to calculate their Body Mass Index (BMI) by entering their weight (in kilograms) and height (in meters). It displays the BMI result along with a status that indicates whether the user is underweight, normal, overweight, or obese based on their BMI.

The BMI formula used is: BMI = weight (kg) / (height (m) * height (m))

## Features
- Input fields for weight (kg) and height (m).
- Calculates BMI and displays it in real-time.
- Displays BMI status (Underweight, Normal, Overweight, or Obese).
- Clear button to reset all fields and results.

## How to Use
1. Clone the repository or download the source code.
2. Ensure you have JavaFX configured in your project.
3. Run the `HelloApplication.java` file to launch the application.

### Instructions
1. Enter your weight in kilograms in the **Weight** field.
2. Enter your height in meters in the **Height** field.
3. Click the **Calculate BMI** button.
4. The BMI result and corresponding status will be displayed.
5. To reset the fields, click the **Clear** button.

## Screenshot
![Снимок экрана 2024-10-16 210718](https://github.com/user-attachments/assets/84463171-bb47-4e3e-919a-dfb7ed8ea645)
![Снимок экрана 2024-10-16 210611](https://github.com/user-attachments/assets/c3cca628-4356-4080-b048-be213d665f47)

## FXML Structure
The user interface is defined in the `hello-view.fxml` file using a `GridPane` layout, and the app logic is implemented in the `HelloController.java` class.

### FXML File Highlights:
- **Weight and Height Input Fields:** Collect user input for BMI calculation.
- **Calculate Button:** Triggers BMI calculation and displays results.
- **Clear Button:** Resets all fields to default values.
- **BMI and Status Labels:** Display the calculated BMI and its interpretation.


