package com.factory;

public class ShapeFactory {
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if ("CIRCLE".equals(shapeType)) {
			return new Circle();
		}
		if ("RECTANGLE".equals(shapeType)) {
			return new Rectangle();
		}

		return null;
	}

}
