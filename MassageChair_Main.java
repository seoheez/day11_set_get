package day11_set_get;

import java.util.Scanner;


public class MassageChair_Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num; 
		
		MassageChair mChair;
		mChair = new MassageChair();
		MassageChair ch = new MassageChair();
		
		while(true) {
			System.out.println("====================");
			System.out.println("1. 전원 설정");
			System.out.println("2. 안마 강도");
			System.out.println("3. 안마 부위");
			System.out.println("4. 시간 설정");
			System.out.println("5. 안마의자 설정 상태 \n>>");

			num = input.nextInt();
			switch(num) {
			case 1: mChair.power();
			if(mChair.power == true) {
				System.out.println("전원을 킵니다.");
				} else {
					System.out.println("전원을 끕니다.");
				}
				break;
				
			case 2: if(mChair.power == true) {
				System.out.println("1. 안마 세게  2. 안마 약하게 ");
				int i = input.nextInt();
				if(i == 1 && mChair.intensity <= 9) {
					System.out.println("안마 강도를 한 단계 올립니다.");
					mChair.intensityUp();
					System.out.println("안마 강도: " + mChair.intensity);
				} else if(i == 2 && mChair.intensity > 1) {
					System.out.println("안마 강도를 한 단계 내립니다.");
					mChair.intensityDown();
					System.out.println("안마 강도: " + mChair.intensity);
				}	
				
				}break;
			
			case 3: if(mChair.power == true) {
				System.out.println("안마 부위를 입력하세요.");
				System.out.println( "머리 | 상체 | 하체 | 전신 \n >>");
				mChair.area = input.next();
				System.out.println(mChair.area +" 안마를 시작합니다.");
				}break;
				
			case 4: if(mChair.power == true) {
				System.out.println("1) 안마시간 입력  2) 안마시간 추가  3) 안마시간 감소");
				int t = input.nextInt();
				if(t == 1) {
					mChair.timer = input.nextInt();
					System.out.println("설정한 안마시간: " + mChair.timer + "분");
				} else if(t == 2) {
					mChair.timerUp();
					System.out.println("안마시간을 5분 추가했습니다.");
					System.out.println("현재 설정된 안마시간: " + mChair.timer + "분");
				} else if(t == 3) {
					mChair.timerDown();
					System.out.println("안마시간을 5분 감소했습니다.");
					System.out.println("현재 설정된 안마시간: " + mChair.timer + "분");
				}break;
				
			}
			case 5: if(mChair.power == true) {
				System.out.println("안마의자가 " + mChair.area + " 부위를 강도 " 
										+ mChair.intensity + " 단계로 " 
										+ mChair.timer + "분 동안  작동합니다.");
				
			}
			
			}	
		}

	}

}
