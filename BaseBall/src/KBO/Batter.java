package KBO;

import java.util.Scanner;

public class Batter {
	public void AVG(int hit, int num) { //Ÿ���� Ÿ���� ����ϴ� �޼ҵ� | hit : ��Ÿ ����, num : Ÿ��
		System.out.println("----Ÿ�� Ÿ�� ���----");
		
		Scanner q1 = new Scanner(System.in); 
		System.out.println("��Ÿ>> ");
		hit = q1.nextInt();
		
		Scanner w1 = new Scanner(System.in);
		System.out.println("Ÿ��>> ");
		num = w1.nextInt();
		
		double avg = (double)hit/num;
		System.out.println("Ÿ�� : " + String.format("%.3f", avg));
	
	}
	
	public void OBP(int hit, int ball, int hitByPitched, int num, int SF) {//Ÿ���� ������� ����ϴ� �޼ҵ� | hit : ��Ÿ ����, ball : ���� ����, hitByPitched : �籸, num : Ÿ��, SF : ��� �ö���
		System.out.println("----Ÿ�� ����� ���----");
		Scanner h = new Scanner(System.in);
		System.out.println("��Ÿ>> ");
		hit = h.nextInt();
		
		Scanner b = new Scanner(System.in);
		System.out.println("���� ����>> ");
		ball = b.nextInt();
		
		Scanner hbp =  new Scanner(System.in);
		System.out.println("�籸>> ");
		hitByPitched = hbp.nextInt();
		
		Scanner n = new Scanner(System.in);
		System.out.println("Ÿ��>> ");
		num = n.nextInt();
		
		Scanner s = new Scanner(System.in);
		System.out.println("��� �ö���>> ");
		SF = s.nextInt();
		
		double obp = (double)(hit+ball+hitByPitched)/(num+ball+hitByPitched+SF);
		System.out.println("����� : " + String.format("%.3f", obp));
	}
	
	public void SLG(int num, int H, int _2B,int _3B, int HR) { //��Ÿ���� ����ϴ� �޼ҵ� | num : Ÿ��, H : ��Ÿ, _2B : 2��Ÿ, _3B : 3��Ÿ, HR : Ȩ��
		System.out.println("----Ÿ�� ��Ÿ�� ���----");
		Scanner n = new Scanner(System.in);
		System.out.println("Ÿ��>> ");
		num = n.nextInt();
		
		Scanner h = new Scanner(System.in);
		System.out.println("��Ÿ>> ");
		H = h.nextInt();
		
		Scanner _2b = new Scanner(System.in);
		System.out.println("2��Ÿ>> ");
		_2B = _2b.nextInt();
		
		Scanner _3b = new Scanner(System.in);
		System.out.println("3��Ÿ>> ");
		_3B = _3b.nextInt();
		
		Scanner hr = new Scanner(System.in);
		System.out.println("Ȩ��>> ");
		HR = hr.nextInt();
		
		int _1B = H-(_2B+_3B+HR); //1��Ÿ
		
		double slg = (double)(_1B+(2*_2B)+(3*_3B)+(4*HR))/num;
		System.out.println("��Ÿ�� : " + String.format("%.3f", slg));
		
	}
	
	public void OPS(double obp, double slg) { //Ÿ���� OPS�� ����ϴ� �޼ҵ�
		
		System.out.println("----Ÿ�� OPS ���(OPS�� ���Ϸ��� ��Ÿ���� ������� �̸� ����ؾ� �մϴ�.)----");
		System.out.println("0. ��Ÿ��, ����� ����ϱ�");
		
		Scanner o = new Scanner(System.in);
		System.out.println("�����>> ");
		obp = o.nextDouble();
		
		Scanner s = new Scanner(System.in);
		System.out.println("��Ÿ��>> ");
		slg = s.nextDouble();
		
		double ops = obp + slg;
		System.out.println("OPS : " + ops);
		
	}
}
