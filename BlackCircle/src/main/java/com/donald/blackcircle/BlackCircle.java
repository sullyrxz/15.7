/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.donald.blackcircle;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author mount
 */
public class BlackCircle {

    public static void main(String[] args) {
        @Override 
	public void start(Stage primaryStage) {	
              
		StackPane pane = new StackPane();

		// Create a circle and set its properties
		Circle circle = new Circle(50);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		pane.getChildren().add(circle);

		// Create and register the handler
		pane.setOnMousePressed(e -> {
			circle.setFill(Color.BLACK);
		});

		pane.setOnMouseReleased(e -> {
			circle.setFill(Color.WHITE);
			circle.setStroke(Color.BLACK);
		});

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 120, 120);
		primaryStage.setTitle("Exercise_15_07"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

    }
}
