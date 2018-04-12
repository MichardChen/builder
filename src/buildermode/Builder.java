package buildermode;

public class Builder {

	String name;
	int age;
	
	static class StudentBuilder{
		String name;
		int age;
		public StudentBuilder setName(String name){
			this.name = name;
			return this;
		}
		
		public StudentBuilder setAge(int age){
			this.age = age;
			return this;
		}
		
		public StudentBuilder setParams(String name,int age){
			this.age = age;
			this.name = name;
			return this;
		}
		
		public Builder builder(){
			return new Builder(this);
		}
	}
	
	public Builder(StudentBuilder builder){
		this.age = builder.age;
		this.name = builder.name;
	}
	
	public static void main(String[] args){
		Builder builder = new Builder.StudentBuilder().setAge(10).setName("chen").builder();
		System.out.println("age:"+builder.age);
	}
}
