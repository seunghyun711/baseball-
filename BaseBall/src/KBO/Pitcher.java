package KBO;

import java.util.Scanner;

public class Pitcher{
	public void ERA(double ER, double IP) { //투수의 평균자책점을 계산하는 메소드 ER:총 자책점, innings : 등판 이닝 수
		System.out.println("----투수 ERA계산-----");
		
		Scanner x1 = new Scanner(System.in);
		System.out.println("총 자책점>> ");
		ER = x1.nextDouble();
		
		Scanner y1 = new Scanner(System.in);
		System.out.println("등판 이닝 수>> ");
		IP = y1.nextDouble();
		
		double era = ER*9/IP;
		System.out.println("ERA : " + String.format("%.2f", era));
		
	}

	public void BB_9(int ball, double IP) {
		System.out.println("----투수 9이닝당 볼넷 허용 수(BB/9)----");
		
		Scanner b = new Scanner(System.in);
		System.out.println("볼넷 개수>> ");
		ball = b.nextInt();
		
		Scanner i = new Scanner(System.in);
		System.out.println("등판 이닝 수>> ");
		IP = i.nextDouble();
		
		double bb = (ball/IP)*9;
		System.out.println("9이닝 당 볼넷 허용 수 : " + String.format("%.2f", bb));
		
	}
	
	public void k_9(int K, double IP) { //9이닝당 탈삼진 수를 계산하는 메소드 ,K : 탈삼진 수  IP : 등판 이닝 수
		System.out.println("----투수 9이닝당 탈삼진 수(K/9)----");
		
		Scanner k = new Scanner(System.in);
		System.out.println("탈삼진 개수>> ");
		K = k.nextInt();
		
		Scanner i = new Scanner(System.in);
		System.out.println("등판 이닝 수>> ");
		IP = i.nextDouble();
		
		double bb = (K/IP)*9;
		System.out.println("9이닝 당 볼넷 허용 수 : " + String.format("%.2f", bb));
		
	}
	
	public void WPCT(int win, int lose) { //투수의 승률을 계산하는 메소드, win : 승리한 경기 수 lose : 패배한 경기 수   
		System.out.println("----투수 승률 계산----");
		
		Scanner w = new Scanner(System.in);
		System.out.println("승>> ");
		win = w.nextInt();
		
		Scanner l = new Scanner(System.in);
		System.out.println("패>> ");
		lose = l.nextInt();
		
		double wpct = (double)win/(win+lose);
		System.out.println("승률 : " + String.format("%.3f", wpct));
	}
	
	public void WHIP(int ball, int hit, double IP) {
		System.out.println("----이닝당 출루 허용률(WHIP)계산----");
		
		Scanner b = new Scanner(System.in);
		System.out.println("볼넷>> ");
		ball = b.nextInt();
		
		Scanner h = new Scanner(System.in);
		System.out.println("피안타 개수");
		hit = h.nextInt();
		
		Scanner i = new Scanner(System.in);
		System.out.println("등판 이닝 수>>");
		IP = i.nextDouble();
		
		double whip = (double)(ball+hit)/IP;
		System.out.println("WHIP : " + String.format("%.2f", whip));
	}
	
}
