package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		final Image tableBackgroundImg = new Image("assets/Table.png");
		final Image logoImg = new Image("assets/logo.png");
		final ImageView gameLogo = new ImageView();
		final Image startButtonImg = new Image("assets/startButton.png");
		
		BackgroundSize bSize = new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, false);
		
		Button startButton = new Button();
		startButton.setMinSize(500, 100);
		startButton.setBackground(new Background(new BackgroundImage(startButtonImg, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, bSize)));
		
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,1280,720);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			VBox menuButtons = new VBox();
			menuButtons.setAlignment(Pos.CENTER);
			menuButtons.setSpacing(20);
			menuButtons.getChildren().addAll(startButton);
			root.setCenter(menuButtons);
			
			HBox logoArea = new HBox();
			logoArea.setAlignment(Pos.CENTER);
			gameLogo.setImage(logoImg);
			logoArea.setMargin(gameLogo, new Insets(200, 0, 0, 0));
			logoArea.getChildren().add(gameLogo);
			root.setTop(logoArea);
			
			root.setBackground(new Background(new BackgroundImage(tableBackgroundImg, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, bSize)));
			primaryStage.setTitle("Bid Euchre");
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
