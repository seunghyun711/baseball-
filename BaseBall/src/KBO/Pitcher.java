package KBO;

import java.util.Scanner;

public class Pitcher{
	public void ERA(double ER, double IP) { //������ �����å���� ����ϴ� �޼ҵ� ER:�� ��å��, innings : ���� �̴� ��
		System.out.println("----���� ERA���-----");
		
		Scanner x1 = new Scanner(System.in);
		System.out.println("�� ��å��>> ");
		ER = x1.nextDouble();
		
		Scanner y1 = new Scanner(System.in);
		System.out.println("���� �̴� ��>> ");
		IP = y1.nextDouble();
		
		double era = ER*9/IP;
		System.out.println("ERA : " + String.format("%.2f", era));
		
	}

	public void BB_9(int ball, double IP) {
		System.out.println("----���� 9�̴״� ���� ��� ��(BB/9)----");
		
		Scanner b = new Scanner(System.in);
		System.out.println("���� ����>> ");
		ball = b.nextInt();
		
		Scanner i = new Scanner(System.in);
		System.out.println("���� �̴� ��>> ");
		IP = i.nextDouble();
		
		double bb = (ball/IP)*9;
		System.out.println("9�̴� �� ���� ��� �� : " + String.format("%.2f", bb));
		
	}
	
	public void k_9(int K, double IP) { //9�̴״� Ż���� ���� ����ϴ� �޼ҵ� ,K : Ż���� ��  IP : ���� �̴� ��
		System.out.println("----���� 9�̴״� Ż���� ��(K/9)----");
		
		Scanner k = new Scanner(System.in);
		System.out.println("Ż���� ����>> ");
		K = k.nextInt();
		
		Scanner i = new Scanner(System.in);
		System.out.println("���� �̴� ��>> ");
		IP = i.nextDouble();
		
		double bb = (K/IP)*9;
		System.out.println("9�̴� �� ���� ��� �� : " + String.format("%.2f", bb));
		
	}
	
	public void WPCT(int win, int lose) { //������ �·��� ����ϴ� �޼ҵ�, win : �¸��� ��� �� lose : �й��� ��� ��   
		System.out.println("----���� �·� ���----");
		
		Scanner w = new Scanner(System.in);
		System.out.println("��>> ");
		win = w.nextInt();
		
		Scanner l = new Scanner(System.in);
		System.out.println("��>> ");
		lose = l.nextInt();
		
		double wpct = (double)win/(win+lose);
		System.out.println("�·� : " + String.format("%.3f", wpct));
	}
	
	public void WHIP(int ball, int hit, double IP) {
		System.out.println("----�̴״� ��� ����(WHIP)���----");
		
		Scanner b = new Scanner(System.in);
		System.out.println("����>> ");
		ball = b.nextInt();
		
		Scanner h = new Scanner(System.in);
		System.out.println("�Ǿ�Ÿ ����");
		hit = h.nextInt();
		
		Scanner i = new Scanner(System.in);
		System.out.println("���� �̴� ��>>");
		IP = i.nextDouble();
		
		double whip = (double)(ball+hit)/IP;
		System.out.println("WHIP : " + String.format("%.2f", whip));
	}
	
}
