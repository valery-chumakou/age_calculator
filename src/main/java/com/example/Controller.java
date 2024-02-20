package com.example;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;

public class Controller {
    @FXML
    private void getController() throws IOException {
        Calculator.setRoot("mainscene");
    }

    @FXML
    private TextField text;
    @FXML
    private Button btn;
    @FXML
    private Label label_years;
    @FXML
    private Label label_months;
    @FXML
    private Label label_days;
    @FXML
    private DatePicker birthdate;
    @FXML
    private DatePicker current_date;
    @FXML
    ImageView myImageView;

 
    public void displayImage() {
        Image image1 = new Image(getClass().getResourceAsStream("age.jpg"));
        myImageView.setImage(image1);
    }
  
    @FXML
    void calculateAge(ActionEvent event) {
         LocalDate today_date = current_date.getValue();
         LocalDate birthday = birthdate.getValue();
         Period period  = Period.between(birthday, today_date);
         label_days.setText(String.valueOf(period.getDays()));
         label_months.setText(String.valueOf(period.getMonths()));
         label_years.setText(String.valueOf(period.getYears()));
    
        }
}