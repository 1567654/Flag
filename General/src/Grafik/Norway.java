package Grafik;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Norway extends Group {
	
	public Norway(){
		Rectangle base = new Rectangle();
		base.setWidth(300);
		base.setHeight(200);
		base.setFill(Color.RED);
		
		Rectangle crossV = new Rectangle();
		crossV.setWidth(300);
		crossV.setHeight(40);
		crossV.setTranslateY(80);
		crossV.setFill(Color.WHITE);
		
		Rectangle crossVblue = new Rectangle();
		crossVblue.setWidth(300);
		crossVblue.setHeight(20);
		crossVblue.setTranslateY(90);
		crossVblue.setFill(Color.DARKBLUE);
		
		Rectangle crossH = new Rectangle();
		crossH.setWidth(40);
		crossH.setHeight(200);
		crossH.setTranslateX(100);
		crossH.setFill(Color.WHITE);
		
		Rectangle crossHblue = new Rectangle();
		crossHblue.setWidth(20);
		crossHblue.setHeight(200);
		crossHblue.setTranslateX(110);
		crossHblue.setFill(Color.DARKBLUE);
		
		
		this.getChildren().addAll(base, crossV, crossH, crossVblue, crossHblue);
	}
}
