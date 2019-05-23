package Grafik;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Denmark extends Group {
	
	public Denmark(){
		Rectangle base = new Rectangle();
		base.setWidth(300);
		base.setHeight(200);
		base.setFill(Color.RED);
		
		Rectangle crossV = new Rectangle();
		crossV.setWidth(300);
		crossV.setHeight(40);
		crossV.setTranslateY(80);
		crossV.setFill(Color.WHITE);
		
		Rectangle crossH = new Rectangle();
		crossH.setWidth(40);
		crossH.setHeight(200);
		crossH.setTranslateX(100);
		crossH.setFill(Color.WHITE);
		
		
		this.getChildren().addAll(base, crossV, crossH);
	}
}
