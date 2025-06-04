package particles;

import java.awt.Color;
import java.util.Random;

public class Simulator {

	public static void main(String[] args) {
		Particle[] particles = new Particle[100];
		Random random = new Random();
		
		for(int i = 0; i < particles.length; ++i) {
			int choice = random.nextInt(3);
			double x = 0.5*random.nextDouble() + 0.25; // [.25, 75)
			double y = 0.5*random.nextDouble() + 0.25; // [.25, 75)
			switch(choice) {
			case 0:
				particles[i] = new Electron(x, y);
				break;
			case 1:
				particles[i] = new Proton(x, y);
				break;
			case 2:
				particles[i] = new Neutron(x, y);
				break;
			}			
		}
		
		StdDraw.enableDoubleBuffering();
		double time = 0.001/60.0; // 1/1000 true speed
		int step = (int)(1000.0/60.0); // 60 fps in milliseconds
		
		
		while(true) {
			for(Particle particle : particles)
				particle.update(particles, time);

			StdDraw.clear(Color.BLACK);
			
			for(Particle particle : particles)
				particle.draw();			
			
			StdDraw.show();
			StdDraw.pause(step);
		}
	}

}
