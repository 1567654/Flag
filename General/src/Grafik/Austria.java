package Grafik;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Austria extends Group {
	
	public Austria(){
		Rectangle base = new Rectangle();
		base.setWidth(300);
		base.setHeight(200);
		base.setFill(Color.RED);
		
		Rectangle white = new Rectangle();
		white.setWidth(300);
		white.setHeight(66.66);
		white.setTranslateY(66.66);
		white.setFill(Color.WHITE);
		
		
		
		this.getChildren().addAll(base,white);
	}
}
