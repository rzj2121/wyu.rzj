package wyu.rzj;

public class TestBirthday {
	public void change1(int i) {
		i=1234;
	
	}
	public Birthday change2(Birthday b) {
		return new Birthday(22,2,2004);

	}
	public void change3(Birthday b) {
		b.setDay(22);
	}
	public static void main(String[] args) {
		TestBirthday test=new TestBirthday();
		int date=9;
		Birthday d1=new Birthday(7,7,1970);
		Birthday d2=new Birthday(1,1,2000);
		test.change1(date);
		d1=test.change2(d1);
		System.out.println(d1.getDay());
		test.change3(d2);
		System.out.println(d2.getDay());
		System.out.println(date);
		System.out.println(d1.toString());
		System.out.println(d2.toString());
		
	}
}
