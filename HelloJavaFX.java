// HelloJavaFX.java

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class HelloJavaFX extends Application {

    @Override
    public void start(Stage stage) {

        stage.setTitle("Hello, JavaFX");
        stage.setWidth(540);
        stage.setHeight(220);

		//stage.widthプロパティの値を参照する
		System.out.println(stage.widthProperty());
		// ReadOnlyDoubleProperty [bean: javafx.stage.Stage@4d4c7159, name: width, value: 540.0]

        Label lblMsg = new Label("Hello, JavaFX");
        lblMsg.setAlignment(Pos.CENTER);
		// PosはEnum(列挙体)でCENTERは定数
        lblMsg.setFont(new Font(64));

        stage.setScene(new Scene(lblMsg));
        stage.show();
    }
}
/*
 Stage
  :title
  :width
  :height
  +-Scene
     +-Label
        :Pos.CENTER
        :font
*/
