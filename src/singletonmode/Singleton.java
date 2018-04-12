package singletonmode;

public class Singleton {

	//重新构造函数，
	public Singleton(){}
	
	public static Singleton getInstance(){
		Singleton ton = new Singleton();
		return ton;
	}
}
