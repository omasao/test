
public class Person1 {
	public String name=null;
	public int age=0;
	
	public Person1(){}
	
	public Person1(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public Person1(String name){
		this.name=name;
		this.age=0;
	}
	
	public Person1(int age){
		this.name="名前なし";
		this.age=age;
	}
	
	public Person1(int age,String name){
		this.name=name;
		this.age=age;
	}
	
	
	
	
	
	
	public void talk(){
		System.out.println(name+"が話す");
	}
	public void walk(){
		System.out.println(name+"が歩く");
	}
	public void run(){
			System.out.println(name+"が走る");
			}
}