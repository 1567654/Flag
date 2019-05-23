package Grafik;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Finland extends Group {
	
	public Finland(){
		Rectangle base = new Rectangle();
		base.setWidth(300);
		base.setHeight(200);
		base.setFill(Color.WHITE);
		
		Rectangle crossV = new Rectangle();
		crossV.setWidth(300);
		crossV.setHeight(40);
		crossV.setTranslateY(80);
		crossV.setFill(Color.DARKBLUE);
		
		Rectangle crossH = new Rectangle();
		crossH.setWidth(40);
		crossH.setHeight(200);
		crossH.setTranslateX(100);
		crossH.setFill(Color.DARKBLUE);
		
		
		this.getChildren().addAll(base, crossV, crossH);
	}
}
