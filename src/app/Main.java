/***********************************************************************************************************************
 * Grade Point Average Tracker Application
 *
 * The Main.java file contains the main method along with the start and stop overrides, to initialize the application's
 * FXML files, database connection, and launch the application using the JavaFX API Application class. To initialize
 * the views (UI screens) the app uses the AppScenes class, which initializes and stores the scene objects inside a map
 * for fast access throughout the application. The database connection however is stored here inside the Main class.
 **********************************************************************************************************************/
package app;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override public void start(Stage stage) throws Exception {
    }



    public static void main(String[] args) {
        launch();
    }
}
