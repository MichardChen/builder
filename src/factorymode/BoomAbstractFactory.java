package factorymode;

public class BoomAbstractFactory extends VehicleFactory{

	@Override
	public Moveable create() {
		return new Boom2();
	}
}
