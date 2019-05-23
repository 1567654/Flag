package Grafik;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class laos extends Group {
	
	public laos(){
		Rectangle base = new Rectangle();
		base.setWidth(300);
		base.setHeight(200);
		base.setFill(Color.RED);
		
		Rectangle blue = new Rectangle();
		blue.setWidth(300);
		blue.setHeight(100);
		blue.setFill(Color.BLUE);
		blue.setTranslateY(50);
		
		Circle white = new Circle();
		white.setRadius(40);
		white.setTranslateX(150);
		white.setTranslateY(100);
		white.setFill(Color.WHITE);
		
		
		
		this.getChildren().addAll(base,blue,white);
	}
}