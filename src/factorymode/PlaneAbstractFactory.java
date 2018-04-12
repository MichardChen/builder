package factorymode;

public class PlaneAbstractFactory extends VehicleFactory{

	@Override
	public Moveable create() {
		return new Plane2();
	}
}
