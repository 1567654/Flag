package Grafik;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Flagmaker extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		/**
		 * Skapar ett fönster med en mörkgrå bakgrund
		 * Skapar en flagga beroende på vilken grupp som läggs in
		 * Flaggorna har en bas på 300px och en höjd av 200px 
		 */
		Group root = new Group();
		Scene scene = new Scene(root,500,500,Color.DARKGREY);
		arg0.setScene(scene);
		arg0.show();
		Japan flag = new Japan();
		//root.getChildren().add(flag);
		Kongo kongo = new Kongo();
		//root.getChildren().add(kongo);
		UK uk = new UK();
		//root.getChildren().add(uk);
		laos laos = new laos();
		//root.getChildren().add(laos);
		kuwait kuwait = new kuwait();
		//root.getChildren().add(kuwait);
		Sverige sverige = new Sverige();
		//root.getChildren().add(sverige);
		Denmark denmark = new Denmark();
		//root.getChildren().add(denmark);
		Finland finland = new Finland();
		//root.getChildren().add(finland);
		Norway norway = new Norway();
		//root.getChildren().add(norway);
		Iceland iceland = new Iceland();
		//root.getChildren().add(iceland);
		Palau palau = new Palau();
		//root.getChildren().add(palau);
		North_Korea northkorea= new North_Korea();
		//root.getChildren().add(northkorea);
		Armenia armenia = new Armenia();
		root.getChildren().add(armenia);
		Austria austria = new Austria();
		//root.getChildren().add(austria);
		Bahamas bahamas = new Bahamas();
		//root.getChildren().add(bahamas);
		Benin benin = new Benin();
		//root.getChildren().add(benin);
		Bangladesh bangladesh = new Bangladesh();
		//root.getChildren().add(bangladesh);
		Bulgaria bulgaria = new Bulgaria();
		//root.getChildren().add(bulgaria);
		}
	   
	
	
	public static void main(String[] args) {
		launch();
	}

}
