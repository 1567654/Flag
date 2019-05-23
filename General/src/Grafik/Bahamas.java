package Grafik;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class Bahamas extends Group {
	
	public Bahamas(){
		/**
		 * Skapar gruppen "Bahamas" med två rektanglar och en polygon
		 * ritar upp flaggan 
		 * lägger till formerna i gruppen
		 */
		Rectangle base = new Rectangle();
		base.setWidth(300);
		base.setHeight(200);
		base.setFill(Color.DARKBLUE);
		
		Rectangle yellow = new Rectangle();
		yellow.setWidth(300);
		yellow.setHeight(66.66);
		yellow.setTranslateY(66.66);
		yellow.setFill(Color.YELLOW);
		
		Polygon black = new Polygon(0,0, 120,100, 0,200, 0,0);
		black.setFill(Color.BLACK);
		
		
		this.getChildren().addAll(base,yellow,black);
	}
}
