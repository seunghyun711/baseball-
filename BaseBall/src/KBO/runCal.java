package KBO;

import java.util.Scanner;

public class runCal {

	public static void main(String[] args) {
		double ER=0;
		double IP=0;
		int ball = 0;
		int K = 0;
		int win = 0;
		int lose = 0;
		
		int hit=0;
		int _2B = 0;
		int _3B = 0;
		int HR = 0;
		int num=0;
		int hitByPitched = 0;
		int SF = 0;
		double avg=0;
		double slg=0;
		
		Scanner menu = new Scanner(System.in);
		Scanner pit = new Scanner(System.in);
		Scanner bat = new Scanner(System.in);
		Pitcher pitcher = new Pitcher();
		Batter batter = new Batter();
		while(true) {
			System.out.println("");
			System.out.println("***** 야구기록계산기 *****");
			System.out.println("1. 투수기록 | 2. 타자기록 | 3. 종료 ");
			int menuNo = menu.nextInt();
			
			switch(menuNo) {
			
			case 1:
				System.out.println("<투수기록 계산>");
				System.out.println("1. 평균자책점(ERA) | 2. 9이닝당 볼넷 개수(BB/9) | 3. 9이닝당 탈삼진 개수(K/9) | 4.승률(WPCT) | 5. 이닝당 출루 허용율(WHIP) | 6. 뒤로 가기");
				int mN1 = menu.nextInt();
				
				switch(mN1) {
				case 1:
					System.out.println("평균자책점 계산");
					pitcher.ERA(ER, IP);
					break;
				case 2:
					System.out.println("9이닝당 볼넷 개수 계산");
					pitcher.BB_9(ball, IP);
					break;
				case 3:
					System.out.println("9이닝당 탈삼진 개수 계산");
					pitcher.k_9(K, IP);
					break;
				case 4:
					System.out.println("승률 계산");
					pitcher.WPCT(win, lose);
					break;
				case 5:
					System.out.println("이닝당 출루 허용율 계산");
					pitcher.WHIP(ball, hit, IP);
				case 6:
					break;
				}if(mN1==3) {
					break;
				}break;
				
			case 2:
				System.out.println("<타자기록 계산>");
				System.out.println("1. 타율(AVG) | 2. 출루율(OBP) | 3. 장타율(SLG) | 4. OPS | 5. 뒤로 가기");
				int mN2 = menu.nextInt();
				
				switch(mN2) {
				case 1:
					System.out.println("타율 계산");
					batter.AVG(hit, num);
					break;
				case 2:
					System.out.println("출루율 계산");
					batter.OBP(hit, ball, hitByPitched, num, SF);
					break;
				case 3:
					System.out.println("장타율 계산");
					batter.SLG(num,hit , _2B,_3B, HR);
					break;
				case 4:
					System.out.println("OPS 계산");
					batter.OPS(avg, slg);
					break;
				case 5:
					break;
				}if(mN2==3) {
					break;
				}break;	
			case 3:
				System.out.println("계산기 종료");
				break;
			}if(menuNo==3) {
				break;
			}
		}

	}

}
