package particles;

import java.awt.*;

public class Neutron extends Particle{

    public Neutron(double x, double y) {
        super(x, y);
    }


    @Override
    public double getCharge() {
        return 0.0;
    }

    @Override
    public double getMass() {
        return 1.67492747121 * Math.pow(10,-27);
    }

    @Override
    public double getRadius() {
        return 0.8 * Math.pow(10,-15);
    }

    @Override
    public Color getColor(){
        return Color.GREEN;
    }
}
