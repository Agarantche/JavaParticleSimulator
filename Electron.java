package particles;

import java.awt.*;

public class Electron extends Particle{

    public Electron(double x, double y) {
        super(x, y);
    }


    @Override
    public double getCharge() {
        return -1.602176620898 * Math.pow(10,-19);
    }

    @Override
    public double getMass() {
        return 9.1093835611 * Math.pow(10,-31);
    }

    @Override
    public double getRadius() {
        return 1.0 * Math.pow(10,-18);
    }

    @Override
    public  Color getColor(){
        return Color.RED;
    }
}
