package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FormularioJava extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Crear  el anchorpane
        AnchorPane anchorPane = new AnchorPane();
        
        // Crear el  GridPane
        GridPane gridPane = new GridPane();
        gridPane.setLayoutX(10);
        gridPane.setLayoutY(10);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        
        // Agregar los componentes al GridPane
        gridPane.add(new Label("Button:"), 0, 0);
        gridPane.add(new Button("Button"), 1, 0);
        
        gridPane.add(new Label("CheckBox:"), 0, 1);
        gridPane.add(new CheckBox("CheckBox"), 1, 1);
        
        gridPane.add(new Label("Hyperlink:"), 0, 2);
        gridPane.add(new Hyperlink("Hyperlink"), 1, 2);
        
        gridPane.add(new Label("ToggleButton:"), 0, 3);
        gridPane.add(new ToggleButton("ToggleButton"), 1, 3);
        
        gridPane.add(new Label("RadioButton:"), 0, 4);
        gridPane.add(new RadioButton("RadioButton"), 1, 4);
        
        gridPane.add(new Label("Label:"), 0, 5);
        gridPane.add(new Label("Label"), 1, 5);
        
        gridPane.add(new Label("TextField:"), 0, 6);
        TextField textField = new TextField("TAREA");
        gridPane.add(textField, 1, 6);
        
        gridPane.add(new Label("PasswordField:"), 0, 7);
        PasswordField passwordField = new PasswordField();
        passwordField.setText("contraseña1234");
        gridPane.add(passwordField, 1, 7);
        
        gridPane.add(new Label("TextArea:"), 0, 8);
        TextArea textArea = new TextArea("ESTE ES EL FORMULARIO");
        textArea.setWrapText(true);
        gridPane.add(textArea, 1, 8);
        
        gridPane.add(new Label("ProgressIndicator:"), 0, 9);
        ProgressIndicator progressIndicator = new ProgressIndicator(0.59);
        gridPane.add(progressIndicator, 1, 9);
        
        gridPane.add(new Label("ProgressBar:"), 0, 10);
        ProgressBar progressBar = new ProgressBar(0.59);
        gridPane.add(progressBar, 1, 10);
        
        gridPane.add(new Label("Slider:"), 0, 11);
        Slider slider = new Slider(0, 100, 49);
        gridPane.add(slider, 1, 11);
        
        
        anchorPane.getChildren().add(gridPane);
        
        
        Scene scene = new Scene(anchorPane, 400, 600);
        primaryStage.setTitle("Formulario Tarea");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

