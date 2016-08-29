public class Square extends GeometricObject implements Colorable {
	double side;
	public Square(){									//no arg constructor and set side to 5
		side = 5;
	}
	public Square(double side){							//one arg constructor and has a double side
		this.side = side;
	}
	
	public double getArea(){							//get area method *Overriden
		return side*side;
	}
	
	public double getPerimeter(){						//get perimeter method *Overriden
		return side*4;
	}
	
	public void howToColor(){							//Implements from Colorable interface and print description.
		System.out.println("Color all four sides");
	}
}