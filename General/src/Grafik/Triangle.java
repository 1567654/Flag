package Grafik;

import javafx.scene.shape.Polygon;

public class Triangle extends Polygon {
	
	public Triangle(double base, double angle) {
		getPoints().add(0.0);
		double x = Math.sin(angle)*base;
		getPoints().add(x);
		getPoints().add(base);
		getPoints().add(0.0);
	}

}
