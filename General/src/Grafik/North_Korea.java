package Grafik;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class North_Korea extends Group {
	
	public North_Korea(){
		Rectangle base = new Rectangle();
		base.setWidth(300);
		base.setHeight(200);
		base.setFill(Color.WHITE);
		
		Rectangle red = new Rectangle();
		red.setWidth(300);
		red.setHeight(140);
		red.setTranslateY(30);
		red.setFill(Color.RED);
		
		Rectangle blue = new Rectangle();
		blue.setWidth(300);
		blue.setHeight(25);
		blue.setTranslateY(0);
		blue.setFill(Color.DARKBLUE);
		
		Rectangle blue2 = new Rectangle();
		blue2.setWidth(300);
		blue2.setHeight(25);
		blue2.setTranslateY(175);
		blue2.setFill(Color.DARKBLUE);
		
		Circle white = new Circle();
		white.setRadius(47.5);
		white.setTranslateY(100);
		white.setTranslateX(100);
		white.setFill(Color.WHITE);
		
		Star star = new Star(45);
		star.setTranslateX(99);
		star.setTranslateY(104);
		star.setFill(Color.RED);
		star.setRotate(54);
		
		this.getChildren().addAll(base, red, blue, blue2, white, star);
	}
}