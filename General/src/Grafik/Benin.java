package Grafik;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Benin extends Group {
	
	public Benin(){
		/**
		 * Skapar gruppen "Benin" med tre rektanglar
		 * Ritar upp flaggan
		 * lägger in formerna i gruppen
		 */
		Rectangle base = new Rectangle();
		base.setWidth(300);
		base.setHeight(200);
		base.setFill(Color.GREEN);
		
		Rectangle yellow = new Rectangle();
		yellow.setWidth(180);
		yellow.setHeight(100);
		yellow.setTranslateX(120);
		yellow.setFill(Color.YELLOW);
		
		Rectangle red = new Rectangle();
		red.setWidth(180);
		red.setHeight(100);
		red.setTranslateX(120);
		red.setTranslateY(100);
		red.setFill(Color.RED);
		
		this.getChildren().addAll(base,red, yellow);
	}
}
