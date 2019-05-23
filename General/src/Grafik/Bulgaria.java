package Grafik;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Bulgaria extends Group {
	
	public Bulgaria(){
		/**
		 * Skapar gruppen "Bulgaria" med tre rektanglar
		 * Ritar upp flaggan
		 * Lägger in formerna i gruppen
		 */
		Rectangle base = new Rectangle();
		base.setWidth(300);
		base.setHeight(200);
		base.setFill(Color.RED);
		
		Rectangle white = new Rectangle();
		white.setWidth(300);
		white.setHeight(66.66);
		white.setFill(Color.WHITE);
		
		Rectangle green = new Rectangle();
		green.setWidth(300);
		green.setHeight(66.66);
		green.setTranslateY(66.66);
		green.setFill(Color.GREEN);
		
		
		
		this.getChildren().addAll(base,green,white);
	}
}
