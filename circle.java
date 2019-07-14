import java.util.*;
public class circle extends shape
{
	double radi;
	
	public circle(double r)
	{
		radi=r;
	}
	public double area()
	{
		double a = Math.PI*radi*radi;
		return a;
	}
	
	
}