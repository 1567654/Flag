package Grafik;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Armenia extends Group {
	
	public Armenia(){
		/**
		 * Skapar gruppen "Armenia" med tre rektanglar
		 * Ritar flaggan med hjälp av rektanglarna, färger, positionering och med definerade höjd och bredd
		 * lägger in formerna i gruppen
		 */
		Rectangle base = new Rectangle();
		base.setWidth(300);
		base.setHeight(200);
		base.setFill(Color.DARKBLUE);
		
		Rectangle red = new Rectangle();
		red.setWidth(300);
		red.setHeight(66.66);
		red.setFill(Color.RED);
		
		Rectangle orange = new Rectangle();
		orange.setWidth(300);
		orange.setHeight(66.66);
		orange.setTranslateY(66.66);
		orange.setFill(Color.ORANGE);
		
		
		
		
		this.getChildren().addAll(base, orange, red);
	}
}
