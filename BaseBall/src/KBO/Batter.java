package KBO;

import java.util.Scanner;

public class Batter {
	public void AVG(int hit, int num) { //타자의 타율을 계산하는 메소드 | hit : 안타 개수, num : 타수
		System.out.println("----타자 타율 계산----");
		
		Scanner q1 = new Scanner(System.in); 
		System.out.println("안타>> ");
		hit = q1.nextInt();
		
		Scanner w1 = new Scanner(System.in);
		System.out.println("타수>> ");
		num = w1.nextInt();
		
		double avg = (double)hit/num;
		System.out.println("타율 : " + String.format("%.3f", avg));
	
	}
	
	public void OBP(int hit, int ball, int hitByPitched, int num, int SF) {//타자의 출루율을 계산하는 메소드 | hit : 안타 개수, ball : 볼넷 개수, hitByPitched : 사구, num : 타수, SF : 희생 플라이
		System.out.println("----타자 출루율 계산----");
		Scanner h = new Scanner(System.in);
		System.out.println("안타>> ");
		hit = h.nextInt();
		
		Scanner b = new Scanner(System.in);
		System.out.println("볼넷 개수>> ");
		ball = b.nextInt();
		
		Scanner hbp =  new Scanner(System.in);
		System.out.println("사구>> ");
		hitByPitched = hbp.nextInt();
		
		Scanner n = new Scanner(System.in);
		System.out.println("타수>> ");
		num = n.nextInt();
		
		Scanner s = new Scanner(System.in);
		System.out.println("희생 플라이>> ");
		SF = s.nextInt();
		
		double obp = (double)(hit+ball+hitByPitched)/(num+ball+hitByPitched+SF);
		System.out.println("출루율 : " + String.format("%.3f", obp));
	}
	
	public void SLG(int num, int H, int _2B,int _3B, int HR) { //장타율을 계산하는 메소드 | num : 타수, H : 안타, _2B : 2루타, _3B : 3루타, HR : 홈런
		System.out.println("----타자 장타율 계산----");
		Scanner n = new Scanner(System.in);
		System.out.println("타수>> ");
		num = n.nextInt();
		
		Scanner h = new Scanner(System.in);
		System.out.println("안타>> ");
		H = h.nextInt();
		
		Scanner _2b = new Scanner(System.in);
		System.out.println("2루타>> ");
		_2B = _2b.nextInt();
		
		Scanner _3b = new Scanner(System.in);
		System.out.println("3루타>> ");
		_3B = _3b.nextInt();
		
		Scanner hr = new Scanner(System.in);
		System.out.println("홈런>> ");
		HR = hr.nextInt();
		
		int _1B = H-(_2B+_3B+HR); //1루타
		
		double slg = (double)(_1B+(2*_2B)+(3*_3B)+(4*HR))/num;
		System.out.println("장타율 : " + String.format("%.3f", slg));
		
	}
	
	public void OPS(double obp, double slg) { //타자의 OPS를 계산하는 메소드
		
		System.out.println("----타자 OPS 계산(OPS를 구하려면 장타율과 출루율을 미리 계산해야 합니다.)----");
		System.out.println("0. 장타율, 출루율 계산하기");
		
		Scanner o = new Scanner(System.in);
		System.out.println("출루율>> ");
		obp = o.nextDouble();
		
		Scanner s = new Scanner(System.in);
		System.out.println("장타율>> ");
		slg = s.nextDouble();
		
		double ops = obp + slg;
		System.out.println("OPS : " + ops);
		
	}
}
