import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
/*
10 x 10 random 1s and 0s generator 
robert oleary
cis 171
*/
public class randomGrid extends Application {
    
    private static int HEIGHT = 240;
    private static int WIDTH = 240;
    public void start(Stage primaryStage) {

//        creates the grid places the numbers in each spot as well as setting the size of the cells
        GridPane pane = new GridPane();
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                TextField randNumb = new TextField ();
                randNumb.setText (Integer.toString((int)(Math.random() * 2)));
                randNumb.setMinWidth(WIDTH / 10.0);
                randNumb.setMaxWidth(WIDTH / 10.0);
                randNumb.setMinHeight(HEIGHT / 10.0);
                randNumb.setMaxHeight(HEIGHT / 10.0);
                pane.add(randNumb, x, y);
            }
        }
        //creates the window
        Scene scene = new Scene(pane, WIDTH, HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.setMinWidth(WIDTH);
        primaryStage.setMinHeight(HEIGHT);
        primaryStage.setTitle("10 by 10 random 1s and 0s");
        primaryStage.show();
    }

    public static void main(String[] args) {

        Application.launch(args);
    }
}