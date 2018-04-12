package factorymode;

public class CommonFactory {

	public Object createObj(Class<?> clazz){
		if(clazz.getName().equals(Plane.class.getName())){
			return new Plane();
		}
		
		if(clazz.getName().equals(Boom.class.getName())){
			return new Boom();
		}
		
		return null;
	}
}
