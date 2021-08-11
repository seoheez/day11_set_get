package day11_set_get;

import java.util.Scanner;

public class LoginMain {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num = 0, result = 0; 
		String inputId = null, inputPw = null;
		Login lo = new Login();
		boolean flag = true;

		while(flag) {
			System.out.println("1. 로그인 | 2. 가입 | 3. 로그아웃  \n>>");
			num = input.nextInt();

			switch(num) {
			case 1: System.out.println("아이디 입력: ");
			inputId = input.next();
			System.out.println("비밀번호 입력: ");
			inputPw = input.next();
			result = lo.compare(inputId, inputPw);
			if(result == 0) System.out.println("인증 완료");
			else System.out.println("인증 실패");
			break;
			
			case 2: System.out.print("가입 id: ");
			inputId = input.next();
			System.out.print("가입 pw: ");
			inputPw = input.next();
			lo.setUserId(inputId);
			lo.setUserPw(inputPw);
			System.out.println("저장 완료");
			break;

			case 3: flag = lo.out();
			System.out.println("종료합니다.");

			}

		}
	}

}
