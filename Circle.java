public class Circle extends GeometricObject {
	double radius;
	public Circle(){							//no arg constructor and set radius to 5
		radius = 5;
	}
	public Circle(double radius){				//one arg constructor and has a double radius
		this.radius = radius;
	}
	
	public double getArea(){					//get area method *Overriden
		return Math.PI*radius*radius;
	}
	
	public double getPerimeter(){				//get perimeter method *Overriden
		return 2*Math.PI*radius;
	}
}