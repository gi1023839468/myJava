import java.io.*;
import java.util.*;

class TestPolymorphism{		
	public static void main (String [] args) {
		GeometricObject [] Object = new GeometricObject [5];			//initialize GeometricObject type Array
		Object [0] = new Square();										//first contains Square
		Object [1] = new Circle();										//second contains Circle
		Object [2] = new Square();										//third contains Square
		Object [3] = new Circle();										//forth contains Circle
		Object [4] = new Square();										//fifth contains Square
		
		for(int i = 0; i < 5; i++){										//Loop five times
			System.out.print("Object[" + i + "] ");						
			if (Object[i] instanceof Colorable){						//if Object is a Colorable
				Colorable colorable = (Colorable)Object[i];				//Set pointer to subclass
				colorable.howToColor();									//Describle how to color the object
			}																	
			else{														//if Object is not a Colorable
				System.out.println("NOT COLORABLE!");					//print not colorable
			}
			System.out.println("Object's area is: "+ Object[i].getArea() +" and its perimeter: " + Object[i].getPerimeter());		//print area and perimeter of Object
		}																//Loop end
	}
}
