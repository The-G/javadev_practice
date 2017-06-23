package basic.exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
//import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.Scanner;

import org.apache.commons.codec.digest.DigestUtils;

public class ExceptionTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("id : ");String user_id = sc.nextLine();
		System.out.println("pw : ");String user_pw = sc.nextLine();
		
//		String pw = "12345678";
//		System.out.println(DigestUtils.sha512Hex(pw));  // **암호화 하는데 많이 사용한다!!!!!!!!!!!!!!!!!!!!!**
//														// sha512Hex를 많이 사용한다!!!
		
		MemberVO userInfo = new MemberVO();
		userInfo.setUser_id(user_id);
		userInfo.setUser_pw(user_pw);
		
		try {
			userInfo = login(userInfo);
			System.out.println(userInfo.getUser_name() + "님이 로그인 하셨습니다.");
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println(e.getMessage()); //"It is wrong ID or Password" 출력해 주네..
		}
		
	}

	private static MemberVO login(MemberVO userInfo) throws Exception {
		Connection cn = null;
		PreparedStatement st = null;
//		Statement st = null;
		ResultSet rs = null;
		
		StringBuffer sql = new StringBuffer(); //문자열을 만들기 위한 buffer 한개 만들어 둠!!
//		Dynamic Query
//		sql.append(" SELECT user_name "); // 주의사항! 왼쪽 공백을 줘야 한다!! nameFROM 이 되지 않게 하기 위해서!!
//		sql.append(" FROM   t_mem  ");
//		sql.append(" WHERE user_id='"+ userInfo.getUser_id() +"' and user_pw='"+ userInfo.getUser_pw() +"'");
//		"multi' --" 로 id 입력하면 뒷부분 날려버리고 login 되지!!!!! 
//		SQL injection 의 간단한 예!!!이다!!

//		Parameter Query (1. 쿼리작성이 간결, 
//						 2. 성능good[why? 항상 날리는 query 문이 parameter query는 같기 때문에!!!!!], 
//		  				 3. SQL Injection 방어!!)
//		parameter query 걍 써!!!! 
		sql.append(" SELECT user_name"); // 주의사항! 왼쪽 공백을 줘야 한다!! nameFROM 이 되지 않게 하기 위해서!!
		sql.append(" FROM   t_mem");
		sql.append(" WHERE user_id=?");
		sql.append(" and   user_pw=?"); // oracle 서버에 이렇게만 던지고 나중에 ? 채워줌! 변수처리해서!!!

		
		
		try {
//			JDBC driver가 존재하는지 않하는지 미리 알아보지!! 
			Class.forName("oracle.jdbc.OracleDriver");
			cn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"bigdata",
					"bigdata");
//			st = cn.createStatement();
			st = cn.prepareStatement(sql.toString());
			st.setString(1, userInfo.getUser_id()); // To Parameter Query
			st.setString(2, userInfo.getUser_pw());
			rs = st.executeQuery();
//			rs = st.executeQuery(sql.toString()); // 결과 받아옴! Dynamic query 때 사용함!
			if (rs.next()) {
				userInfo.setUser_name(rs.getString("user_name"));
				return userInfo;
			} else {
				throw new LoginFailException("It is wrong ID or Password", userInfo); // exception 처리 하네.
			}
		} /*catch (Exception e) { // 없어도 된다.

		}*/ finally {
			// 역순으로 close 해줘야 한다!!!
			if (rs != null) try {rs.close();} catch(Exception e){}
			if (st != null) try {st.close();} catch(Exception e){}
			if (cn != null) try {cn.close();} catch(Exception e){}
		}
		
		/*if (userInfo.getUser_id().equals("multi") &&  
			userInfo.getUser_pw().equals(DigestUtils.sha512Hex("12345678"))) { //12345678			
			userInfo.setUser_name("라랄랋뢇");
			return userInfo;
		} else {
			throw new LoginFailException("It is wrong ID or Password", userInfo); // exception 처리 하네.
		}*/ // JDBC 아닌 그냥 할 때 썼던 부분
	}
}
