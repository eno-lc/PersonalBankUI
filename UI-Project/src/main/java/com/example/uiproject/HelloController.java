package com.example.uiproject;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Circle circle;
    @FXML
    private BarChart<String,Double> chart;

    public void initialize(URL url, ResourceBundle rb){
        circle.setFill(new ImagePattern(new Image("Screenshot_1.png")));
        XYChart.Series<String, Double> series_01 = new XYChart.Series();
        series_01.setName("2021");
        series_01.getData().add(new XYChart.Data("Jan", 500));
        series_01.getData().add(new XYChart.Data("Feb", 400));
        series_01.getData().add(new XYChart.Data("Mar", 300));
        series_01.getData().add(new XYChart.Data("Apr", 200));
        series_01.getData().add(new XYChart.Data("May", 600));
        chart.getData().add(series_01);



    }
}