package History;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class KBOTeam extends JFrame implements ActionListener {
	public KBOTeam(){
		Container c =  getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		
		JButton j1 = new JButton("SSG ������");
		JButton j2 = new JButton("�λ� ���");
		JButton j3 = new JButton("LG Ʈ����");
		JButton j4 = new JButton("Ű�� �������");
		JButton j5 = new JButton("��ȭ �̱۽�");
		JButton j6 = new JButton("�Ｚ ���̿½�");
		JButton j7 = new JButton("KT ����");
		JButton j8 = new JButton("KIA Ÿ�̰���");
		JButton j9 = new JButton("NC ���̳뽺");
		JButton j10 = new JButton("�Ե� ���̾���");
		
		jp.add(j1);
		jp.add(j2);
		jp.add(j3);
		jp.add(j4);
		jp.add(j5);
		jp.add(j6);
		jp.add(j7);
		jp.add(j8);
		jp.add(j9);
		jp.add(j10);
		
		c.add(jp);
		setTitle("���ܺ� ���� �ѱ��ø��� ��� ���");
		setSize(600,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		j1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println();
				System.out.println("<SSG ������>");
				System.out.println();
				System.out.println("======= ���� �ѱ��ø��� ��� ��� =======");
				System.out.println("4ȸ(2007, 2008, 2010, 2018) ��SK ���̹��� ��� ����");
				System.out.println();
				System.out.println("======= 2007�� =======");
				System.out.println("�����(����) >> �λ� ��� (4:2)");
				System.out.println("MVP >> ������(SK ���̹���)");
				System.out.println();
				System.out.println("======= 2008�ڡ� =======");
				System.out.println("�����(����) >> �λ� ��� (4:1)");
				System.out.println("MVP >> ����(SK ���̹���)");
				System.out.println();
				System.out.println("======= 2010�ڡڡ� =======");
				System.out.println("�����(����) >> �Ｚ ���̿½�(4:0)");
				System.out.println("MVP >> ������(SK ���̹���)");
				System.out.println();
				System.out.println("======= 2018�ڡڡڡ� =======");
				System.out.println("�����(����) >> �λ� ��� (4:2)");
				System.out.println("MVP >> �ѵ���(SK ���̹���)");
				System.out.println();
				System.out.println("==================================");
				
			}
			
		});
		
		j2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println();
				System.out.println("<�λ� ���>");
				System.out.println();
				System.out.println("======= ���� �ѱ��ø��� ��� ��� =======");
				System.out.println("6ȸ(1982, 1995, 2001, 2015, 2016, 2019) ��OB ��� ��� ����");
				System.out.println();
				System.out.println("======= 1982�� =======");
				System.out.println("�����(����) >> �Ｚ ���̿½� (4:1, 1��)");
				System.out.println("MVP >> ������(OB ���)");
				System.out.println();
				System.out.println("======= 1995�ڡ� =======");
				System.out.println("�����(����) >> �Ե� ���̾��� (4:3)");
				System.out.println("MVP >> ���ȣ(OB ���)");
				System.out.println();
				System.out.println("======= 2001�ڡڡ� =======");
				System.out.println("�����(����) >> �Ｚ ���̿½�(4:2)");
				System.out.println("MVP >> ����(�λ� ���)");
				System.out.println();
				System.out.println("======= 2015�ڡڡڡ� =======");
				System.out.println("�����(����) >> �Ｚ ���̿½�(4:1)");
				System.out.println("MVP >> ������(�λ� ���)");
				System.out.println();
				System.out.println("======= 2016�ڡڡڡڡ� =======");
				System.out.println("�����(����) >> NC ���̳뽺(4:0)");
				System.out.println("MVP >> ������(�λ� ���)");
				System.out.println();
				System.out.println("======= 2019�ڡڡڡڡڡ� =======");
				System.out.println("�����(����) >> Ű�� �������(4:2)");
				System.out.println("MVP >> ������(�λ� ���)");
				System.out.println();
				System.out.println("==================================");
				
				
			}
			
		});
		
		j3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println();
				System.out.println("<LG Ʈ����>");
				System.out.println();
				System.out.println("======= ���� �ѱ��ø��� ��� ��� =======");
				System.out.println("2ȸ(1990, 1994)");
				System.out.println();
				System.out.println("======= 1990�� =======");
				System.out.println("�����(����) >> �Ｚ ���̿½�(4:0)");
				System.out.println("MVP >> ����(LG Ʈ����)");
				System.out.println();
				System.out.println("======= 1994�ڡ� =======");
				System.out.println("�����(����) >> ����� ���ɽ�(4:0)");
				System.out.println("MVP >> ����(LG Ʈ����)");
				System.out.println();
				System.out.println("==================================");
				
			}
			
		});
		
		j4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println();
				System.out.println("<Ű�� �������>");
				System.out.println();
				System.out.println("======= ���� �ѱ��ø��� ��� ��� =======");
				System.out.println();
				System.out.println("-");
				System.out.println();
				System.out.println("==================================");
				
			}
			
		});
		
		j5.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println();
				System.out.println("<��ȭ �̱۽�>");
				System.out.println();
				System.out.println("======= ���� �ѱ��ø��� ��� ��� =======");
				System.out.println("1ȸ(1999)");
				System.out.println();
				System.out.println("======= 1999�� =======");
				System.out.println("�����(����) >> �Ե� ���̾���(4:1)");
				System.out.println("MVP >> ���뼺(��ȭ �̱۽�)");
				System.out.println();
				System.out.println("==================================");
				
			}
			
		});
		
		j6.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println();
				System.out.println("<�Ｚ ���̿½�>");
				System.out.println();
				System.out.println("======= ���� �ѱ��ø��� ��� ��� =======");
				System.out.println("8ȸ(1985, 2002, 2005, 2006, 2011~2014)");
				System.out.println();
				System.out.println("======= 1985�� =======");
				System.out.println("��,�ı� ���տ������ 	�ѱ��ø��� ������ ����");
				System.out.println();
				System.out.println("======= 2002�ڡ� =======");
				System.out.println("�����(����) >> LG Ʈ����(4:2)");
				System.out.println("MVP >> ���ؿ�(�Ｚ ���̿½�)");
				System.out.println();
				System.out.println("======= 2005�ڡڡ� =======");
				System.out.println("�����(����) >> �λ� ���(4:0)");
				System.out.println("MVP >> ����ȯ(�Ｚ ���̿½�)");
				System.out.println();
				System.out.println("======= 2006�ڡڡڡ� =======");
				System.out.println("�����(����) >> ��ȭ �̱۽�(4:!, 1��)");
				System.out.println("MVP >> ������(�Ｚ ���̿½�)");
				System.out.println();
				System.out.println("======= 2011�ڡڡڡڡ� =======");
				System.out.println("�����(����) >> SK ���̹���(4:1)");
				System.out.println("MVP >> ����ȯ(�Ｚ ���̿½�)");
				System.out.println();
				System.out.println("======= 2012�ڡڡڡڡڡ� =======");
				System.out.println("�����(����) >> SK ���̹���(4:2)");
				System.out.println("MVP >> �̽¿�(�Ｚ ���̿½�)");
				System.out.println();
				System.out.println("======= 2013�ڡڡڡڡڡڡ� =======");
				System.out.println("�����(����) >> �λ� ���(4:3)");
				System.out.println("MVP >> ������(�Ｚ ���̿½�)");
				System.out.println();
				System.out.println("======= 2014�ڡڡڡڡڡڡڡ� =======");
				System.out.println("�����(����) >> �ؼ� �������(4:2)");
				System.out.println("MVP >> ���ٷ�(�Ｚ ���̿½�)");
				System.out.println();
				System.out.println("==================================");
				
				
			}
			
		});
		
		j7.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println();
				System.out.println("<KT ����>");
				System.out.println();
				System.out.println("======= ���� �ѱ��ø��� ��� ��� =======");
				System.out.println();
				System.out.println("-");
				System.out.println();
				System.out.println("==================================");
				
			}
			
		});
		
		j8.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println();
				System.out.println("<KIA Ÿ�̰���>");
				System.out.println();
				System.out.println("======= ���� �ѱ��ø��� ��� ��� =======");
				System.out.println("11ȸ(1983, 1986~1989, 1991, 1993, 1996, 1997, 2009, 2017) ������ Ÿ�̰��� ��� ����");
				System.out.println();
				System.out.println("======= 1983�� =======");
				System.out.println("�����(����) >> MBC û��(4:0, 1��)");
				System.out.println("MVP >> �����(���� Ÿ�̰���)");
				System.out.println();
				System.out.println("======= 1986�ڡ� =======");
				System.out.println("�����(����) >> �Ｚ ���̿½�(4:1)");
				System.out.println("MVP >> ������(���� Ÿ�̰���)");
				System.out.println();
				System.out.println("======= 1987�ڡڡ� =======");
				System.out.println("�����(����) >> �Ｚ���̿½�(4:0)");
				System.out.println("MVP >> ����ȯ(���� Ÿ�̰���)");
				System.out.println();
				System.out.println("======= 1988�ڡڡڡ� =======");
				System.out.println("�����(����) >> ���׷� �̱۽�(4:2)");
				System.out.println("MVP >> �����(���� Ÿ�̰���)");
				System.out.println();
				System.out.println("======= 1989�ڡڡڡڡ� =======");
				System.out.println("�����(����) >> ���׷� �̱۽�(4:1)");
				System.out.println("MVP >> ��ö��(���� Ÿ�̰���)");
				System.out.println();
				System.out.println("======= 1991�ڡڡڡڡڡ� =======");
				System.out.println("�����(����) >> ���׷� �̱۽�(4:0)");
				System.out.println("MVP >> ��ä��(���� Ÿ�̰���)");
				System.out.println();
				System.out.println("======= 1993�ڡڡڡڡڡڡ� =======");
				System.out.println("�����(����) >> �Ｚ ���̿½�(4:2, 1��)");
				System.out.println("MVP >> ������(���� Ÿ�̰���)");
				System.out.println();
				System.out.println("======= 1996�ڡڡڡڡڡڡڡ� =======");
				System.out.println("�����(����) >> ���� �����ܽ�(4:2)");
				System.out.println("MVP >> �̰�ö(���� Ÿ�̰���)");
				System.out.println();
				System.out.println("======= 1997�ڡڡڡڡڡڡڡڡ� =======");
				System.out.println("�����(����) >> LG Ʈ����(4:1)");
				System.out.println("MVP >> ������(���� Ÿ�̰���)");
				System.out.println();
				System.out.println("======= 2009�ڡڡڡڡڡڡڡڡڡ� =======");
				System.out.println("�����(����) >> SK ���̹���(4:3)");
				System.out.println("MVP >> ������(KIA Ÿ�̰���)");
				System.out.println();
				System.out.println("======= 2017�ڡڡڡڡڡڡڡڡڡڡ� =======");
				System.out.println("�����(����) >> �λ� ���(4:1)");
				System.out.println("MVP >> ������(KIA Ÿ�̰���)");
				System.out.println();
				System.out.println("==================================");
				
				
			}
			
		});
		
		j9.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println();
				System.out.println("<NC ���̳뽺>");
				System.out.println();
				System.out.println("======= ���� �ѱ��ø��� ��� ��� =======");
				System.out.println("1ȸ(2020)");
				System.out.println();
				System.out.println("======= 2020�� =======");
				System.out.println("�����(����) >> �λ� ���(4:2)");
				System.out.println("MVP >> ������(NC ���̳뽺)");
				System.out.println();
				System.out.println("==================================");
				
			}
			
		});
		
		j10.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println();
				System.out.println("<Ȫ�� ���̾���>");
				System.out.println();
				System.out.println("======= ���� �ѱ��ø��� ��� ��� =======");
				System.out.println("2ȸ(1984, 1992)");
				System.out.println();
				System.out.println("======= 1984�� =======");
				System.out.println("�����(����) >> �Ｚ ���̿½�(4:3)");
				System.out.println("MVP >> ���ο�(�Ե� ���̾���)");
				System.out.println();
				System.out.println("======= 1992�ڡ� =======");
				System.out.println("�����(����) >> ���׷� �̱۽�(4:1)");
				System.out.println("MVP >> �ڵ���(�Ե� ���̾���)");
				System.out.println();
				System.out.println("==================================");
				
			}
			
		});
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

}
