package wyu.rzj;

public class MysqlDaoImpl implements MysqlDao {

	
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("11");
	}

	
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("22");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MysqlDao md=new MysqlDaoImpl();
		md.insert();
		md.update();
	}

}
