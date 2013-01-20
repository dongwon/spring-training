package one;

import java.sql.SQLException;

public class Main {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		ConnectionMaker cm = new DConnectionMaker();
		
		UserDao dao = new UserDao(cm);
		User user = new User();
		
		user.setId("whiteship");
		user.setName("백기");
		user.setPassword("passwd");
		
		dao.add(user);
		
		System.out.println(user.getId() + " 등록 성공");
		
		User user2 = dao.get(user.getId());
		System.out.println(user2.getName());
		System.out.println(user2.getPassword());
		
		System.out.println(user2.getId() + " 조회 성공");
		
	}

}
