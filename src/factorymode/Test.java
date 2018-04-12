package factorymode;

public class Test {

	public static void main(String[] args) {
		CommonFactory factory = new CommonFactory();
		Plane plane = (Plane)factory.createObj(Plane.class);
		plane.run();
	}
}
