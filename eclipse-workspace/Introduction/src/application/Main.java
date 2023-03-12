package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Image icon = new Image("icons8-bullseye-48.png");
			primaryStage.getIcons().add(icon);
			
			primaryStage.setTitle("Can you please work");
			primaryStage.setHeight(800);
			primaryStage.setWidth(600);
//			primaryStage.setFullScreen(true);
			primaryStage.setResizable(false);
			primaryStage.setFullScreenExitHint("You've been hacked");
			primaryStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("esc"));
			
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root, Color.BLUE);
			
//			Text text = new Text();
//			text.setText("Level up!");
//			text.setX(50);
//			text.setY(200);
//			text.setFont(Font.font("Aharoni", 50));
//			text.setFill(Color.PINK);
			
//			Rectangle rectangle = new Rectangle();
//			rectangle.setX(70);
//			rectangle.setY(90);
//			rectangle.setWidth(130);
//			rectangle.setHeight(130);
//			rectangle.setFill(Color.BEIGE);
			
			Circle circle1 = new Circle();
			circle1.setCenterX(300);
			circle1.setCenterY(370);
			circle1.setRadius(140);
			circle1.setFill(Color.HOTPINK);
			
			Circle circle2 = new Circle();
			circle2.setCenterX(300);
			circle2.setCenterY(200);
			circle2.setRadius(100);
			circle2.setFill(Color.YELLOW);
			
			Circle circle3 = new Circle();
			circle3.setCenterX(300);
			circle3.setCenterY(550);
			circle3.setRadius(100);
			circle3.setFill(Color.YELLOW);
			
			Circle circle4 = new Circle();
			circle4.setCenterX(140);
			circle4.setCenterY(370);
			circle4.setRadius(100);
			circle4.setFill(Color.YELLOW);
			
			Circle circle5 = new Circle();
			circle5.setCenterX(460);
			circle5.setCenterY(370);
			circle5.setRadius(100);
			circle5.setFill(Color.YELLOW);
			
			Circle circle6 = new Circle();
			circle6.setCenterX(400);
			circle6.setCenterY(280);
			circle6.setRadius(100);
			circle6.setFill(Color.LIGHTPINK);
			
			Circle circle7 = new Circle();
			circle7.setCenterX(200);
			circle7.setCenterY(280);
			circle7.setRadius(100);
			circle7.setFill(Color.LIGHTPINK);
			
			Circle circle8 = new Circle();
			circle8.setCenterX(200);
			circle8.setCenterY(480);
			circle8.setRadius(100);
			circle8.setFill(Color.LIGHTPINK);
			
			Circle circle9 = new Circle();
			circle9.setCenterX(400);
			circle9.setCenterY(480);
			circle9.setRadius(100);
			circle9.setFill(Color.LIGHTPINK);
			

			
//			root.getChildren().add(text);
//			root.getChildren().add(rectangle);
			root.getChildren().add(circle9);
			root.getChildren().add(circle8);
			root.getChildren().add(circle7);
			root.getChildren().add(circle6);
			root.getChildren().add(circle5);
			root.getChildren().add(circle4);
			root.getChildren().add(circle3);
			root.getChildren().add(circle2);
			root.getChildren().add(circle1);
			
			       
	        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
