package Grafik;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Palau extends Group {
	
	public Palau(){
		Rectangle base = new Rectangle();
		base.setWidth(300);
		base.setHeight(200);
		base.setFill(Color.LIGHTBLUE);
		
		Circle yellow = new Circle();
		yellow.setTranslateY(100);
		yellow.setTranslateX(100);
		yellow.setRadius(50);
		yellow.setFill(Color.YELLOW);
		
		this.getChildren().addAll(base, yellow);
	}
}