package wyu.rzj;

public class HelloWorld {
	public static void main(String[] args ) {
		Person person =new Person();
		person.setAge(11);
		person.setName("zhangsan");
		System.out.println(person.toString());
		System.out.println(person.getName()+" "+person.getAge());
	} 
}
