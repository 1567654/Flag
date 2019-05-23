package Grafik;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class Kongo extends Group {
	
	public Kongo(){
		Rectangle base = new Rectangle();
		base.setWidth(300);
		base.setHeight(200);
		
		Polygon green = new Polygon(0,0, 200,0, 0,200, 0,0);
		green.setFill(Color.GREEN);
		
		Polygon yellow = new Polygon(200,0, 300,0, 100,200, 0,200, 200,0);
		yellow.setFill(Color.YELLOW);
		
		Polygon red = new Polygon(300,0, 300,200, 100,200, 300,0);
		red.setFill(Color.RED);
		
		this.getChildren().addAll(base,green,yellow,red);
	}
}