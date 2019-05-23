package Grafik;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Japan extends Group {
	
	public Japan(){
		/**
		 * Skapar gruppen "Japan" med en rektangel och en cirkel
		 * Ritar flaggan
		 * lägger in formerna i gruppen
		 */
		Rectangle base = new Rectangle();
		base.setWidth(300);
		base.setHeight(200);
		base.setFill(Color.WHITE);
		
		Circle red = new Circle();
		red.setTranslateX(150);
		red.setTranslateY(100);
		red.setRadius(50);
		red.setFill(Color.RED);
		
		this.getChildren().addAll(base,red);
	}
}

