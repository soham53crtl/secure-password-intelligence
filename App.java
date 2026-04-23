import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        TextField passwordField = new TextField();
        passwordField.setPromptText("Enter password");

        Button analyzeBtn = new Button("Analyze");

        Label resultLabel = new Label();

        analyzeBtn.setOnAction(e -> {
            String password = passwordField.getText();

            int score = PasswordAnalyzer.calculateScore(password);
            String strength = PasswordAnalyzer.getStrength(score);

            resultLabel.setText("Strength: " + strength + " | Score: " + score);
        });

        VBox layout = new VBox(10, passwordField, analyzeBtn, resultLabel);

        stage.setScene(new Scene(layout, 300, 200));
        stage.setTitle("Password Analyzer");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
