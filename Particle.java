package particles;

import java.awt.Color;

public abstract class Particle {
	private double x;
	private double y;
	private double xVelocity = 0.0;
	private double yVelocity = 0.0;
	public static final double K = 8.9875517873681764E9; // N m^2 C^-2 
	
	public abstract double getRadius();
	public abstract double getMass();
	public abstract double getCharge();
	public abstract Color getColor();
	
	public Particle(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getXVelocity() {
		return xVelocity;
	}
	
	public double getYVelocity() {
		return yVelocity;
	}
	
	public final void update(Particle[] particles, double seconds) {
		double xAcceleration = 0.0;
		double yAcceleration = 0.0;
		
		for(Particle particle : particles ) {
			if(particle != this) {
				double deltaX = x - particle.x;
				double deltaY = y - particle.y;
				double distance = Math.sqrt(deltaX*deltaX + deltaY*deltaY);
				//F = ma
				double distanceCubed = distance*distance*distance;
				double xForce = K*getCharge()*particle.getCharge()*deltaX/distanceCubed; 
				double yForce = K*getCharge()*particle.getCharge()*deltaY/distanceCubed;
				xAcceleration += xForce/getMass();
				yAcceleration += yForce/getMass();
			}
		}
		
		xVelocity += xAcceleration * seconds;
		yVelocity += yAcceleration * seconds;
		x += xVelocity * seconds;
		y += yVelocity * seconds;
	}
	public final void draw() {
		Color oldColor = StdDraw.getPenColor();		
		StdDraw.setPenColor(getColor());
		double log = Math.log10(getRadius()); //expected values between -15 and -18
		double radius = 1.0/(log*log); 
		StdDraw.filledCircle(x, y, radius);
		StdDraw.setPenColor(oldColor);
	}
}
