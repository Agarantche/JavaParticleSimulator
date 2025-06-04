package particles;

import java.awt.*;

public class Proton extends Particle{

    public Proton(double x, double y) {
        super(x, y);
    }


    @Override
    public double getCharge() {
        return 1.602176620898 * Math.pow(10,-19);
    }

    @Override
    public double getMass() {
        return 1.6726219236951 * Math.pow(10,-27);
    }

    @Override
    public double getRadius() {
        return 0.876869 * Math.pow(10,-15);
    }

    @Override
    public Color getColor(){
        return Color.BLUE;
    }
}
