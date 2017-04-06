package com.factory;

/**
 * @author Sudheer Vedanaparthi
 *
 */
public class FactoryPatternApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ShapeFactory sf = new ShapeFactory();
		
		Shape obj = sf.getShape("RECTANGLE");
		obj.draw();
	}
}
