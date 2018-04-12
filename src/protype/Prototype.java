package protype;

public class Prototype implements Cloneable{

	private String name;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		try {
			return super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			return null;
		}
		
	}
	
	public static void main(String[] args){
		Prototype prototype = new Prototype();
		try {
			Prototype prototype2 = (Prototype)prototype.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
