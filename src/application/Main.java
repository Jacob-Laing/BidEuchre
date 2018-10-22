package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
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
		
		TextField player1Name = new TextField();
		player1Name.setMaxSize(250, 20);
	    player1Name.setPromptText("Enter Player 1's Name");
	    TextField player2Name = new TextField();
		player2Name.setMaxSize(250, 20);
	    player2Name.setPromptText("Enter Player 2's Name");
	    TextField player3Name = new TextField();
		player3Name.setMaxSize(250, 20);
	    player3Name.setPromptText("Enter Player 3's Name");
	    TextField player4Name = new TextField();
		player4Name.setMaxSize(250, 20);
	    player4Name.setPromptText("Enter Player 4's Name");
	    TextField player5Name = new TextField();
		player5Name.setMaxSize(250, 20);
	    player5Name.setPromptText("Enter Player 5's Name");
	    TextField player6Name = new TextField();
		player6Name.setMaxSize(250, 20);
	    player6Name.setPromptText("Enter Player 6's Name");
	    
	    Button playGameBtn = new Button();
	    playGameBtn.setMaxSize(125, 50);
	    playGameBtn.setText("Play Game");
	    
	    Scene scene3 = null;
		
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root, 1280, 720);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			BorderPane newGame = new BorderPane();
			Scene scene2 = new Scene(newGame, 1280, 720);
			scene2.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			newGame.setBackground(new Background(new BackgroundImage(tableBackgroundImg, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, bSize)));
			
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
			
			VBox newGameFields = new VBox();
			newGameFields.setAlignment(Pos.CENTER);
			newGameFields.setSpacing(20);
			newGameFields.getChildren().addAll(player1Name, player2Name, player3Name, player4Name, player5Name, player6Name);
			newGame.setCenter(newGameFields);
			VBox playGameArea = new VBox();
			playGameArea.setAlignment(Pos.CENTER);
			playGameArea.setSpacing(20);
			playGameArea.getChildren().add(playGameBtn);
			playGameArea.setMargin(playGameBtn, new Insets(0, 0, 100, 0));
			newGame.setBottom(playGameArea);
			
			
			startButton.setOnAction(e -> primaryStage.setScene(scene2));
			playGameBtn.setOnAction(e -> primaryStage.setScene(scene3));
			
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
