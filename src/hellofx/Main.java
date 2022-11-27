package hellofx;

import javafx.application.Application;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.scene.Parent;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    private Deck deck = new Deck();
    private Hand dealer,player;
    private Text message = new Text();

    private SimpleBooleanProperty playable = new SimpleBooleanProperty(false);

    private HBox dealerCards = new HBox(20);
    private HBox playerCards = new HBox(20);

    private Parent createContent() {

    }

    private void startNewGame() {

    }

    private void endGame() {

    }

    public void start(Stage primaryStage) {

    }  

    public static void main(String[] args) {
        launch(args);
    }
}