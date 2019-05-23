package Grafik;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class kuwait extends Group {
	
	public kuwait(){
		Rectangle base = new Rectangle();
		base.setWidth(300);
		base.setHeight(200);
		base.setFill(Color.WHITE);
		
		Rectangle green = new Rectangle();
		green.setWidth(300);
		green.setHeight(66.66);
		green.setFill(Color.GREEN);
		
		Rectangle red = new Rectangle();
		red.setWidth(300);
		red.setHeight(66.66);
		red.setFill(Color.RED);
		red.setTranslateY(133.34);
		
		Polygon black = new Polygon(0,0, 75,66.66, 75,133.34, 0,200, 0,0);
		black.setFill(Color.BLACK);
		
		
		
		this.getChildren().addAll(base, green, red, black);
	}
}