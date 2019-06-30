/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Rectangle;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/**
 *
 * @author Jsoon
 */
public class main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        TextField totalNOP = new TextField();        
        TextField numberOfPeopleOutside = new TextField();
        Label title = new Label("Elevator Tracker\n");
        
        //Inside
            //Button for Inside
        Button insideButtonLG = new Button("LG");
        Button insideButtonG = new Button("G");
        Button insideButtonF1 = new Button("1");
        Button insideButtonF2 = new Button("2");
        Button insideButtonF3 = new Button("3");
        Button insideButtonF4 = new Button("4");
        Button insideButtonF5 = new Button("5");
        Button insideButtonF6 = new Button("6");
        Button insideButtonF7 = new Button("7");
        Button insideButtonF8 = new Button("8");
        Button insideButtonF9 = new Button("9");
        
            //Number of People
        TextField inopLG = new TextField();    
        TextField inopG = new TextField(); 
        TextField inop1 = new TextField(); 
        TextField inop2 = new TextField(); 
        TextField inop3 = new TextField(); 
        TextField inop4 = new TextField(); 
        TextField inop5 = new TextField(); 
        TextField inop6 = new TextField(); 
        TextField inop7 = new TextField(); 
        TextField inop8 = new TextField();         
        TextField inop9 = new TextField();         
        
        //Outside - Right
            //Number of People
        TextField onopLG = new TextField();
        TextField onopG = new TextField();
        TextField onop1 = new TextField();
        TextField onop2 = new TextField();
        TextField onop3 = new TextField();
        TextField onop4 = new TextField();
        TextField onop5 = new TextField();
        TextField onop6 = new TextField();
        TextField onop7 = new TextField();
        TextField onop8 = new TextField();
        TextField onop9 = new TextField();
        
            //Floor Number
        Button outLG = new Button("LG");
        Button outG = new Button("G"); 
        Button out1 = new Button("1"); 
        Button out2 = new Button("2"); 
        Button out3 = new Button("3"); 
        Button out4 = new Button("4"); 
        Button out5 = new Button("5"); 
        Button out6 = new Button("6"); 
        Button out7 = new Button("7"); 
        Button out8 = new Button("8"); 
        Button out9 = new Button("9"); 
           
        //Center Grid Pane    
        Label LG = new Label("LG");
        Label G = new Label(" G ");
        Label f1 = new Label("1");
        Label f2 = new Label("2");
        Label f3 = new Label("3");
        Label f4 = new Label("4");
        Label f5 = new Label("5");
        Label f6 = new Label("6");
        Label f7 = new Label("7");
        Label f8 = new Label("8");
        Label f9 = new Label("9"); 
        LG.setStyle("-fx-background-color: red;");
        
        GridPane center = new GridPane();
        center.add(f9,0,1);
        center.add(f8,0,2);
        center.add(f7,0,3);
        center.add(f6,0,4);
        center.add(f5,0,5);
        center.add(f4,0,6);
        center.add(f3,0,7);
        center.add(f2,0,8);
        center.add(f1,0,9);
        center.add(G,0,10);
        center.add(LG,0,11);
        
        center.setGridLinesVisible(true);
        center.setAlignment(Pos.CENTER);
        center.setStyle("-fx-font-size:25px;-fx-font-weight:bold;-fx-font-family:Arial;");
        center.setPadding(new Insets(10,10,10,10));
        GridPane.setHalignment(LG,HPos.CENTER);
        GridPane.setHalignment(G,HPos.CENTER);
        GridPane.setHalignment(f1,HPos.CENTER);
        GridPane.setHalignment(f2,HPos.CENTER);
        GridPane.setHalignment(f3,HPos.CENTER);
        GridPane.setHalignment(f4,HPos.CENTER);
        GridPane.setHalignment(f5,HPos.CENTER);
        GridPane.setHalignment(f6,HPos.CENTER);
        GridPane.setHalignment(f7,HPos.CENTER);
        GridPane.setHalignment(f8,HPos.CENTER);
        GridPane.setHalignment(f9,HPos.CENTER);
        
        //Inside Button - Left Side
        VBox insideButton = new VBox(5);
        insideButton.getChildren().addAll(
                new Label("Inside Elevator"),
                new Label("Floor Button"),
                insideButtonF9,
                insideButtonF8,
                insideButtonF7,
                insideButtonF6,
                insideButtonF5,
                insideButtonF4,
                insideButtonF3,
                insideButtonF2,
                insideButtonF1,
                insideButtonG,
                insideButtonLG
        );
        insideButton.setAlignment(Pos.CENTER);
        insideButton.setStyle("-fx-font-size:15px;-fx-font-weight:bold;-fx-font-family:Arial;");
        insideButton.setPadding(new Insets(10,10,10,10));  
        insideButton.setSpacing(10);
        
        //Inside TextField - Left Side
        VBox insideTextField = new VBox(5);
        insideTextField.getChildren().addAll(
                new Label(" "),
                new Label("Out"),                
                inopLG,
                inopG,
                inop1,
                inop2,
                inop3,
                inop4,
                inop5,
                inop6,
                inop7,
                inop8,
                inop9
        );        
        insideTextField.setAlignment(Pos.CENTER);
        insideTextField.setStyle("-fx-font-size:15px;-fx-font-weight:bold;-fx-font-family:Arial;");
        insideTextField.setPadding(new Insets(10,10,10,0));  
        insideTextField.setSpacing(10);
        
        inopLG.setPrefColumnCount(2);
        inopG.setPrefColumnCount(2);
        inop1.setPrefColumnCount(2);
        inop2.setPrefColumnCount(2);
        inop3.setPrefColumnCount(2);
        inop4.setPrefColumnCount(2);
        inop5.setPrefColumnCount(2);
        inop6.setPrefColumnCount(2);
        inop7.setPrefColumnCount(2);
        inop8.setPrefColumnCount(2);
        inop9.setPrefColumnCount(2);
        
        HBox leftInsideElevator = new HBox();
        leftInsideElevator.getChildren().addAll(
                insideButton,
                insideTextField
        );
       
        //Right Side
        
        VBox outsideTextField = new VBox();
        outsideTextField.getChildren().addAll(
                new Label(""),
                new Label("In"),
                onopLG,
                onopG,
                onop1,
                onop2,
                onop3,
                onop4,
                onop5,
                onop6,
                onop7,
                onop8,
                onop9
        );
        outsideTextField.setAlignment(Pos.CENTER);
        outsideTextField.setStyle("-fx-font-size:15px;-fx-font-weight:bold;-fx-font-family:Arial;");
        outsideTextField.setPadding(new Insets(10,10,10,0));  
        outsideTextField.setSpacing(10);
        
        onopLG.setPrefColumnCount(2);
        onopG.setPrefColumnCount(2);
        onop1.setPrefColumnCount(2);
        onop2.setPrefColumnCount(2);
        onop3.setPrefColumnCount(2);
        onop4.setPrefColumnCount(2);
        onop5.setPrefColumnCount(2);
        onop6.setPrefColumnCount(2);
        onop7.setPrefColumnCount(2);
        onop8.setPrefColumnCount(2);
        onop9.setPrefColumnCount(2);
        
        VBox outsideFloorLabel = new VBox();
        outsideFloorLabel.getChildren().addAll(
               new Label("Outside Elevator's"),
               new Label("Floors"),
               out9,
               out8,
               out7,
               out6,
               out5,
               out4,
               out3,
               out2,
               out1,
               outG,
               outLG
        );
        outsideFloorLabel.setAlignment(Pos.CENTER);
        outsideFloorLabel.setStyle("-fx-font-size:15px;-fx-font-weight:bold;-fx-font-family:Arial;");
        outsideFloorLabel.setPadding(new Insets(10,10,10,0));  
        outsideFloorLabel.setSpacing(10);
        

        HBox rightOutsideElevator = new HBox();
        rightOutsideElevator.getChildren().addAll(
                outsideTextField,
                outsideFloorLabel
        );
        
        //Top
        HBox top1 = new HBox();
        top1.getChildren().addAll(
                new Label("Total Number of People in the Elevator: \n"),
                totalNOP
        );
        totalNOP.setPrefColumnCount(2);
        top1.setAlignment(Pos.CENTER);
        
        VBox top = new VBox();
        top.getChildren().addAll(
                title,
                top1
        );

        top.setAlignment(Pos.CENTER);
        top.setStyle("-fx-font-size:15px;-fx-font-weight:bold;-fx-font-family:Arial;");
        top.setPadding(new Insets(10,10,10,10));  
        top.setSpacing(10);
        title.setStyle("-fx-font-size:25px;-fx-font-weight:bold;-fx-font-family:Arial;");
        
        BorderPane mainPage = new BorderPane();
        mainPage.setCenter(center);
        mainPage.setLeft(leftInsideElevator);
        mainPage.setTop(top);
        mainPage.setRight(rightOutsideElevator);
        
        
        Scene scene = new Scene(mainPage, 1000, 650);
        
        primaryStage.setTitle("Elevator Tracker");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
