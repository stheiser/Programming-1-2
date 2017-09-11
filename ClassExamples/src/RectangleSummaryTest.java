/*
 * This program does things with rectangles
 */

import java.awt.Rectangle;

public class RectangleSummaryTest 
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome to Heiser's Rectangle Extravaganza!");
		Rectangle box1 = new Rectangle(1,2,3,4);
		
		
		System.out.println(box1);
		Rectangle box2 = new Rectangle(3,4,3,3);
		
		Rectangle box3 = new Rectangle();
		box3 = box1.intersection(box2);
		System.out.println(box3);
		System.out.println("After translating 10 right and 20 up");
		box1.translate(10,20);
		System.out.println(box1);
		

	}

}
