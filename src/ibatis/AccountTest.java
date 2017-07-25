package ibatis;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.ibatis.sqlmap.client.SqlMapClient;

public class AccountTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				int menu = showMenu(sc);
				
				switch (menu) {
				case 1:
					insertAccount(sc);
//					System.out.println("고객 입력");
					break;
				case 2:
					listAccount(sc);
//					System.out.println("고객 리스트");
					break;
				case 3:
					detailAccount(sc);
					break;
				case 4:
					updateAccount(sc);
					break;
				case 5:
					deleteAccount(sc);
					break;
				case 0:
					System.out.println("프로그램을 종료합니다.");
					System.exit(1);
					break;
				default:
					System.out.println("없는 메뉴입니다.");
					break;
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("잘못된 메뉴가 입력되었습니다.");
			} 
		}
		
		
	}


	private static void deleteAccount(Scanner sc) {
		System.out.println("삭제 할 고객의 id를 입력하세요 > ");
		int id = Integer.parseInt(sc.nextLine());	
		
		
		SqlMapClient sqlMap = QueryHandler.getInstance(); //query를 수행하기 위해서 instance를 만들어야지!!
		try {
			AccountVO accountVO = (AccountVO) sqlMap.queryForObject("detailAccount", id);
			if (accountVO == null) {
				System.out.println("잘못된 고객 ID 입니다");
			} else {
				System.out.println(accountVO.getId() + "고객 정보 삭제합니다.");
				System.out.println("old : " + accountVO.getFirstName() + " | " + accountVO.getLastName() + " | " 
											+ accountVO.getEmailAddress());

				
				int result = sqlMap.delete("deleteAccount", id);
				if (result == 1) {
					System.out.println(id + "고객정보가 삭제되었습니다.");
				} else {
					System.out.println(id + "고객정보 삭제실패");
				}
				

			}
		} catch (SQLException e) {
			// TODO: handle exception
		}			

	}


	private static void updateAccount(Scanner sc) {
		System.out.println("수정 할 고객의 id를 입력하세요 > ");
		int id = Integer.parseInt(sc.nextLine());	
		
		SqlMapClient sqlMap = QueryHandler.getInstance(); //query를 수행하기 위해서 instance를 만들어야지!!
		try {
			AccountVO accountVO = (AccountVO) sqlMap.queryForObject("detailAccount", id);
			if (accountVO == null) {
				System.out.println("잘못된 고객 ID 입니다");
			} else {
				System.out.println(accountVO.getId() + "고객 정보 수정합니다.");
				System.out.println("old : " + accountVO.getFirstName());
				System.out.println("new : ");
				String firstName = sc.nextLine();
				
				System.out.println("old : " + accountVO.getLastName());
				System.out.println("new : ");
				String lastName = sc.nextLine();

				System.out.println("old : " + accountVO.getEmailAddress());
				System.out.println("new : ");
				String emailAddress = sc.nextLine();
				
				AccountVO up_accountVO = new AccountVO();
				up_accountVO.setId(id);
				up_accountVO.setFirstName(firstName);
				up_accountVO.setLastName(lastName);
				up_accountVO.setEmailAddress(emailAddress);
				
				int result = sqlMap.update("updateAccount", up_accountVO);
				if (result == 1) {
					System.out.println(id + "고객정보가 수정되었습니다.");
				} else {
					System.out.println(id + "고객정보 수정실패");
				}
				

			}
		} catch (SQLException e) {
			// TODO: handle exception
		}			
		
	}


	private static void detailAccount(Scanner sc) {
		System.out.println("조회 할 고객의 id를 입력하세요 > ");
		int id = Integer.parseInt(sc.nextLine());
		
		SqlMapClient sqlMap = QueryHandler.getInstance();
		try {
			AccountVO accountVO = (AccountVO) sqlMap.queryForObject("detailAccount", id);
			if (accountVO == null) {
				System.out.println("잘못된 고객 ID 입니다");
			} else {
				System.out.println(id + "고객님의 상세정보입니다.");
				System.out.println(accountVO + "\n");
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}


	private static void listAccount(Scanner sc) throws SQLException {
		SqlMapClient sqlMap = QueryHandler.getInstance();
			List<AccountVO> list = sqlMap.queryForList("listAccount");
			for (AccountVO accountVO : list) {
				System.out.println(accountVO);
			}
		
	}


	private static void insertAccount(Scanner sc) throws SQLException {
		AccountVO accountVO = new AccountVO();
		System.out.println("\n 1. 고객 입력");
		System.out.print("firstName : ");
		accountVO.setFirstName(sc.nextLine());
		System.out.print("lastName : ");
		accountVO.setLastName(sc.nextLine());
		System.out.print("email : ");
		accountVO.setEmailAddress(sc.nextLine());
		SqlMapClient sqlMap = QueryHandler.getInstance();
		sqlMap.insert("insertAccount", accountVO);  //queryforlist, queryforobject, queryformap 많이 쓴다!!
		System.out.println(
				accountVO.getLastName() + " 고객이 입력되었습니다.");
}

	private static int showMenu(Scanner sc) throws Exception {
		System.out.println();
		System.out.println("* * * menu * * * *");
		System.out.println("1. 고객 입력      ");
		System.out.println("2. 고객 리스트    ");
		System.out.println("3. 고객 상세보기  ");
		System.out.println("4. 고객 수정      ");
		System.out.println("5. 고객 삭제      ");
		System.out.println("0. 종료           ");
		System.out.println("* * * * * * * * * ");
		System.out.print("> ");
		return Integer.parseInt(sc.nextLine().trim());
	}
}
