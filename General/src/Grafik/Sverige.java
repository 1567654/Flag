package Grafik;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Sverige extends Group {
	
	public Sverige(){
		/**
		 * Skapar gruppen "Sverige" med tre olika rektanglar
		 * Varje rektangel är färgade och har sin egen bredd och höjd med vissa som är positionerade
		 * lägger sedan in alla formerna i gruppen
		 */
		Rectangle base = new Rectangle();
		base.setWidth(300);
		base.setHeight(200);
		base.setFill(Color.BLUE);
		
		Rectangle crossV = new Rectangle();
		crossV.setWidth(300);
		crossV.setHeight(40);
		crossV.setTranslateY(80);
		crossV.setFill(Color.YELLOW);
		
		Rectangle crossH = new Rectangle();
		crossH.setWidth(40);
		crossH.setHeight(200);
		crossH.setTranslateX(100);
		crossH.setFill(Color.YELLOW);
		
		
		this.getChildren().addAll(base, crossV, crossH);
	}
}
