package org.example.bmi;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField weightInput;

    @FXML
    private TextField heightInput;

    @FXML
    private Label bmiResultLabel;

    @FXML
    private Label bmiStatusLabel;

    @FXML
    protected void onCalculateBMI() {
        try {
            double weight = Double.parseDouble(weightInput.getText());
            double height = Double.parseDouble(heightInput.getText());

            double bmi = weight / (height * height);
            bmiResultLabel.setText(String.format("BMI: %.2f", bmi));

            // Determine the BMI status
            String status = getBMIStatus(bmi);
            bmiStatusLabel.setText("Status: " + status);
        } catch (NumberFormatException e) {
            bmiResultLabel.setText("Invalid input. Please enter numbers.");
        }
    }

    private String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    @FXML
    protected void onClearFields() {
        weightInput.clear();
        heightInput.clear();
        bmiResultLabel.setText("BMI: ");
        bmiStatusLabel.setText("Status: ");
    }
}