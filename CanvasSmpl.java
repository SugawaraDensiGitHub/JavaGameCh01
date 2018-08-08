// CanvasSmpl.java

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CanvasSmpl extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("CanvasSmpl");
        stage.setWidth(260);
        stage.setHeight(180);

        Group root = new Group();

        final Canvas canvas = new Canvas(250,250);
        GraphicsContext gc = canvas.getGraphicsContext2D();
  
        // 線を描く
        gc.setLineWidth(2.0);
        gc.setStroke(Color.DARKGRAY);
        gc.strokeLine(10, 10, 230, 10);
        // 塗り潰した矩形を描く
        gc.setFill(Color.BLUE);
        gc.fillRect(15,25,100,100);
        // 楕円を描く
        gc.strokeOval(150,  40,  50,  80);
  
        root.getChildren().add(canvas);

        stage.setScene(new Scene(root, 300, 300));
        stage.show();
    }
}

/**
Stage
 +-Scene
    +-Group (root)
	   +-xxxx  <-- root.getChildren()
          +-Canvas 
**/
