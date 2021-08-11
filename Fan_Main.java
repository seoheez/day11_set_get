package day11_set_get;

import java.util.Scanner;

public class Fan_Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num;
		Fan f;
		f = new Fan();
		
		while(true) {
			System.out.println("===============");
			System.out.println("1. 전원" );
			System.out.println("2. 시간 설정" );
			System.out.println("3. 강도 설정" );
			System.out.println("4. 현재 상태");
			System.out.println("기능을 선택하세요 >>");
			
			num = input.nextInt();
			
			switch(num) {
			case 1: f.power();
					if(f.power == true) {
						System.out.println("전원을 킵니다.");
					} else {
						System.out.println("전원을 끕니다.");
					}
					break;
					
			case 2: if(f.power == true) {
				System.out.println("1) 작동시간 입력 2) 작동시간 추가  3) 작동시간 줄이기");
				int t = input.nextInt();
				if(t == 1) { 
					System.out.println("작동시간 입력:  ");;
					f.timer = input.nextInt();
					System.out.println(f.timer +"분으로 작동 시간이 설정되었습니다.");
					
				} else if(t == 2) {
					f.timerUP();
					System.out.println("작동 시간을 10분 추가했습니다.");
					System.out.println(f.timer +"분으로 작동 시간이 설정되었습니다.");
				} else if(t == 3) {
					f.timerDown();
					System.out.println("작동 시간을 10분 줄였습니다." );
					System.out.println(f.timer +"분으로 작동 시간이 설정되었습니다.");
				}
			} 
			break;
			
			case 3: 
				System.out.println("1) 강하게   2) 약하게");
				if(f.power == true) {
					int inten = input.nextInt();
					if(inten == 1 && f.intensity <= 4) {
						f.intensityUP();
					} else if(inten == 2 && f.intensity > 1){
						f.intensityDown();
					}
				}
				System.out.println("현재 작동 세기: " + f.intensity);
				break;
				
			case 4:
				System.out.println(f.timer + "분 동안 선풍기가 강도 " 
			                                + f.intensity + "로 작동합니다.");
			}
		}
			
	}		

}
