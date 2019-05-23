package Grafik;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Bangladesh extends Group {
	
	public Bangladesh(){
		/**
		 * Skapar gruppen "Bangladesh" med en rektangel och en cirkel
		 * Ritar upp flaggan
		 * lägger in formerna i gruppen
		 */
		Rectangle base = new Rectangle();
		base.setWidth(300);
		base.setHeight(200);
		base.setFill(Color.GREEN);
		
		Circle red = new Circle();
		red.setRadius(50);
		red.setTranslateX(120);
		red.setTranslateY(100);
		red.setFill(Color.RED);
		
		this.getChildren().addAll(base,red);
	}
}
