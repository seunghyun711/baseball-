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
			System.out.println("***** �߱���ϰ��� *****");
			System.out.println("1. ������� | 2. Ÿ�ڱ�� | 3. ���� ");
			int menuNo = menu.nextInt();
			
			switch(menuNo) {
			
			case 1:
				System.out.println("<������� ���>");
				System.out.println("1. �����å��(ERA) | 2. 9�̴״� ���� ����(BB/9) | 3. 9�̴״� Ż���� ����(K/9) | 4.�·�(WPCT) | 5. �̴״� ��� �����(WHIP) | 6. �ڷ� ����");
				int mN1 = menu.nextInt();
				
				switch(mN1) {
				case 1:
					System.out.println("�����å�� ���");
					pitcher.ERA(ER, IP);
					break;
				case 2:
					System.out.println("9�̴״� ���� ���� ���");
					pitcher.BB_9(ball, IP);
					break;
				case 3:
					System.out.println("9�̴״� Ż���� ���� ���");
					pitcher.k_9(K, IP);
					break;
				case 4:
					System.out.println("�·� ���");
					pitcher.WPCT(win, lose);
					break;
				case 5:
					System.out.println("�̴״� ��� ����� ���");
					pitcher.WHIP(ball, hit, IP);
				case 6:
					break;
				}if(mN1==3) {
					break;
				}break;
				
			case 2:
				System.out.println("<Ÿ�ڱ�� ���>");
				System.out.println("1. Ÿ��(AVG) | 2. �����(OBP) | 3. ��Ÿ��(SLG) | 4. OPS | 5. �ڷ� ����");
				int mN2 = menu.nextInt();
				
				switch(mN2) {
				case 1:
					System.out.println("Ÿ�� ���");
					batter.AVG(hit, num);
					break;
				case 2:
					System.out.println("����� ���");
					batter.OBP(hit, ball, hitByPitched, num, SF);
					break;
				case 3:
					System.out.println("��Ÿ�� ���");
					batter.SLG(num,hit , _2B,_3B, HR);
					break;
				case 4:
					System.out.println("OPS ���");
					batter.OPS(avg, slg);
					break;
				case 5:
					break;
				}if(mN2==3) {
					break;
				}break;	
			case 3:
				System.out.println("���� ����");
				break;
			}if(menuNo==3) {
				break;
			}
		}

	}

}
