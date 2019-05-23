package Grafik;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class UK extends Group {
	
	public UK(){
		Rectangle base = new Rectangle();
		base.setWidth(300);
		base.setHeight(200);
		base.setFill(Color.DARKBLUE);
		
		Rectangle crosswhiteH = new Rectangle();
		crosswhiteH.setWidth(300);
		crosswhiteH.setHeight(66.66);
		crosswhiteH.setTranslateY(66.66);
		crosswhiteH.setFill(Color.WHITE);
		
		Rectangle crosswhiteV = new Rectangle();
		crosswhiteV.setWidth(50);
		crosswhiteV.setHeight(200);
		crosswhiteV.setTranslateX(125);
		crosswhiteV.setFill(Color.WHITE);
		
		Rectangle crossredH = new Rectangle();
		crossredH.setWidth(300);
		crossredH.setHeight(33.33);
		crossredH.setTranslateY(83.325);
		crossredH.setFill(Color.RED);
		
		Rectangle crossredV = new Rectangle();
		crossredV.setWidth(25);
		crossredV.setHeight(200);
		crossredV.setTranslateX(137.5);
		crossredV.setFill(Color.RED);
		
		Polygon diagonalWhite = new Polygon(0,0, 25,0, 300,187.5, 300,200, 275,200, 0,12.5);
		diagonalWhite.setFill(Color.WHITE);
		
		Polygon diagonalWhite2 = new Polygon(300,0, 275,0, 0,187.5, 0,200, 25,200, 300,12.5);
		diagonalWhite2.setFill(Color.WHITE);
		
		Polygon thickdiagonalredLower = new Polygon(0,200, 18.75,200, 117,133.32, 98.25,133.32, 0,200);
		thickdiagonalredLower.setFill(Color.RED);
		
		Polygon thickdiagonalredLower2 = new Polygon(300,200, 300,190.625, 217,133.32, 204,133.32, 300,200);
		thickdiagonalredLower2.setFill(Color.RED);
		
		Polygon thickdiagonalredUpper = new Polygon(300,0, 281.25,0, 183,66.66, 201.75,66.66, 300,0);
		thickdiagonalredUpper.setFill(Color.RED);
		
		Polygon thickdiagonalredUpper2 = new Polygon(0,0, 0,9.375, 83,66.66, 96,66.66, 0,0);
		thickdiagonalredUpper2.setFill(Color.RED);
		
		this.getChildren().addAll(base,diagonalWhite,diagonalWhite2,thickdiagonalredLower,thickdiagonalredLower2,thickdiagonalredUpper,thickdiagonalredUpper2,crosswhiteH,crosswhiteV,crossredH,crossredV);
	}
}
