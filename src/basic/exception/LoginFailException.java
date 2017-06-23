package basic.exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LoginFailException extends RuntimeException {
	public LoginFailException(String error_msg, MemberVO memberVO) {
		super(error_msg);
//		File f = new File("log.txt");
		try {
			FileWriter fw = new FileWriter("log.txt", true);
			fw.write("아래와 같은 로그인 시도가 있었음 \n");
			fw.write(memberVO.toString() + "\n"); // IP 같은 거 남기면 좋겠다!!
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
