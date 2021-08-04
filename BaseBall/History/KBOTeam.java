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
		
		JButton j1 = new JButton("SSG 랜더스");
		JButton j2 = new JButton("두산 베어스");
		JButton j3 = new JButton("LG 트윈스");
		JButton j4 = new JButton("키움 히어로즈");
		JButton j5 = new JButton("한화 이글스");
		JButton j6 = new JButton("삼성 라이온스");
		JButton j7 = new JButton("KT 위즈");
		JButton j8 = new JButton("KIA 타이거즈");
		JButton j9 = new JButton("NC 다이노스");
		JButton j10 = new JButton("롯데 자이언츠");
		
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
		setTitle("구단별 역대 한국시리즈 우승 기록");
		setSize(600,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		j1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println();
				System.out.println("<SSG 랜더스>");
				System.out.println();
				System.out.println("======= 역대 한국시리즈 우승 기록 =======");
				System.out.println("4회(2007, 2008, 2010, 2018) ※SK 와이번스 기록 포함");
				System.out.println();
				System.out.println("======= 2007★ =======");
				System.out.println("상대팀(전적) >> 두산 베어스 (4:2)");
				System.out.println("MVP >> 김재현(SK 와이번스)");
				System.out.println();
				System.out.println("======= 2008★★ =======");
				System.out.println("상대팀(전적) >> 두산 베어스 (4:1)");
				System.out.println("MVP >> 최정(SK 와이번스)");
				System.out.println();
				System.out.println("======= 2010★★★ =======");
				System.out.println("상대팀(전적) >> 삼성 라이온스(4:0)");
				System.out.println("MVP >> 박정권(SK 와이번스)");
				System.out.println();
				System.out.println("======= 2018★★★★ =======");
				System.out.println("상대팀(전적) >> 두산 베어스 (4:2)");
				System.out.println("MVP >> 한동민(SK 와이번스)");
				System.out.println();
				System.out.println("==================================");
				
			}
			
		});
		
		j2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println();
				System.out.println("<두산 베어스>");
				System.out.println();
				System.out.println("======= 역대 한국시리즈 우승 기록 =======");
				System.out.println("6회(1982, 1995, 2001, 2015, 2016, 2019) ※OB 베어스 기록 포함");
				System.out.println();
				System.out.println("======= 1982★ =======");
				System.out.println("상대팀(전적) >> 삼성 라이온스 (4:1, 1무)");
				System.out.println("MVP >> 김유동(OB 베어스)");
				System.out.println();
				System.out.println("======= 1995★★ =======");
				System.out.println("상대팀(전적) >> 롯데 자이언츠 (4:3)");
				System.out.println("MVP >> 김민호(OB 베어스)");
				System.out.println();
				System.out.println("======= 2001★★★ =======");
				System.out.println("상대팀(전적) >> 삼성 라이온스(4:2)");
				System.out.println("MVP >> 우즈(두산 베어스)");
				System.out.println();
				System.out.println("======= 2015★★★★ =======");
				System.out.println("상대팀(전적) >> 삼성 라이온스(4:1)");
				System.out.println("MVP >> 정수빈(두산 베어스)");
				System.out.println();
				System.out.println("======= 2016★★★★★ =======");
				System.out.println("상대팀(전적) >> NC 다이노스(4:0)");
				System.out.println("MVP >> 양의지(두산 베어스)");
				System.out.println();
				System.out.println("======= 2019★★★★★★ =======");
				System.out.println("상대팀(전적) >> 키움 히어로즈(4:2)");
				System.out.println("MVP >> 오재일(두산 베어스)");
				System.out.println();
				System.out.println("==================================");
				
				
			}
			
		});
		
		j3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println();
				System.out.println("<LG 트윈스>");
				System.out.println();
				System.out.println("======= 역대 한국시리즈 우승 기록 =======");
				System.out.println("2회(1990, 1994)");
				System.out.println();
				System.out.println("======= 1990★ =======");
				System.out.println("상대팀(전적) >> 삼성 라이온스(4:0)");
				System.out.println("MVP >> 김용수(LG 트윈스)");
				System.out.println();
				System.out.println("======= 1994★★ =======");
				System.out.println("상대팀(전적) >> 태평양 돌핀스(4:0)");
				System.out.println("MVP >> 김용수(LG 트윈스)");
				System.out.println();
				System.out.println("==================================");
				
			}
			
		});
		
		j4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println();
				System.out.println("<키움 히어로즈>");
				System.out.println();
				System.out.println("======= 역대 한국시리즈 우승 기록 =======");
				System.out.println();
				System.out.println("-");
				System.out.println();
				System.out.println("==================================");
				
			}
			
		});
		
		j5.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println();
				System.out.println("<한화 이글스>");
				System.out.println();
				System.out.println("======= 역대 한국시리즈 우승 기록 =======");
				System.out.println("1회(1999)");
				System.out.println();
				System.out.println("======= 1999★ =======");
				System.out.println("상대팀(전적) >> 롯데 자이언츠(4:1)");
				System.out.println("MVP >> 구대성(한화 이글스)");
				System.out.println();
				System.out.println("==================================");
				
			}
			
		});
		
		j6.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println();
				System.out.println("<삼성 라이온스>");
				System.out.println();
				System.out.println("======= 역대 한국시리즈 우승 기록 =======");
				System.out.println("8회(1985, 2002, 2005, 2006, 2011~2014)");
				System.out.println();
				System.out.println("======= 1985★ =======");
				System.out.println("전,후기 통합우승으로 	한국시리즈 열리지 않음");
				System.out.println();
				System.out.println("======= 2002★★ =======");
				System.out.println("상대팀(전적) >> LG 트윈스(4:2)");
				System.out.println("MVP >> 마해영(삼성 라이온스)");
				System.out.println();
				System.out.println("======= 2005★★★ =======");
				System.out.println("상대팀(전적) >> 두산 베어스(4:0)");
				System.out.println("MVP >> 오승환(삼성 라이온스)");
				System.out.println();
				System.out.println("======= 2006★★★★ =======");
				System.out.println("상대팀(전적) >> 한화 이글스(4:!, 1무)");
				System.out.println("MVP >> 박진만(삼성 라이온스)");
				System.out.println();
				System.out.println("======= 2011★★★★★ =======");
				System.out.println("상대팀(전적) >> SK 와이번스(4:1)");
				System.out.println("MVP >> 오승환(삼성 라이온스)");
				System.out.println();
				System.out.println("======= 2012★★★★★★ =======");
				System.out.println("상대팀(전적) >> SK 와이번스(4:2)");
				System.out.println("MVP >> 이승엽(삼성 라이온스)");
				System.out.println();
				System.out.println("======= 2013★★★★★★★ =======");
				System.out.println("상대팀(전적) >> 두산 베어스(4:3)");
				System.out.println("MVP >> 박한이(삼성 라이온스)");
				System.out.println();
				System.out.println("======= 2014★★★★★★★★ =======");
				System.out.println("상대팀(전적) >> 넥센 히어로즈(4:2)");
				System.out.println("MVP >> 나바로(삼성 라이온스)");
				System.out.println();
				System.out.println("==================================");
				
				
			}
			
		});
		
		j7.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println();
				System.out.println("<KT 위즈>");
				System.out.println();
				System.out.println("======= 역대 한국시리즈 우승 기록 =======");
				System.out.println();
				System.out.println("-");
				System.out.println();
				System.out.println("==================================");
				
			}
			
		});
		
		j8.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println();
				System.out.println("<KIA 타이거즈>");
				System.out.println();
				System.out.println("======= 역대 한국시리즈 우승 기록 =======");
				System.out.println("11회(1983, 1986~1989, 1991, 1993, 1996, 1997, 2009, 2017) ※해태 타이거즈 기록 포함");
				System.out.println();
				System.out.println("======= 1983★ =======");
				System.out.println("상대팀(전적) >> MBC 청룡(4:0, 1무)");
				System.out.println("MVP >> 김봉연(해태 타이거즈)");
				System.out.println();
				System.out.println("======= 1986★★ =======");
				System.out.println("상대팀(전적) >> 삼성 라이온스(4:1)");
				System.out.println("MVP >> 김정수(해태 타이거즈)");
				System.out.println();
				System.out.println("======= 1987★★★ =======");
				System.out.println("상대팀(전적) >> 삼성라이온스(4:0)");
				System.out.println("MVP >> 김준환(해태 타이거즈)");
				System.out.println();
				System.out.println("======= 1988★★★★ =======");
				System.out.println("상대팀(전적) >> 빙그레 이글스(4:2)");
				System.out.println("MVP >> 문희수(해태 타이거즈)");
				System.out.println();
				System.out.println("======= 1989★★★★★ =======");
				System.out.println("상대팀(전적) >> 빙그레 이글스(4:1)");
				System.out.println("MVP >> 박철우(해태 타이거즈)");
				System.out.println();
				System.out.println("======= 1991★★★★★★ =======");
				System.out.println("상대팀(전적) >> 빙그레 이글스(4:0)");
				System.out.println("MVP >> 장채근(해태 타이거즈)");
				System.out.println();
				System.out.println("======= 1993★★★★★★★ =======");
				System.out.println("상대팀(전적) >> 삼성 라이온스(4:2, 1무)");
				System.out.println("MVP >> 이종범(해태 타이거즈)");
				System.out.println();
				System.out.println("======= 1996★★★★★★★★ =======");
				System.out.println("상대팀(전적) >> 현대 유니콘스(4:2)");
				System.out.println("MVP >> 이강철(해태 타이거즈)");
				System.out.println();
				System.out.println("======= 1997★★★★★★★★★ =======");
				System.out.println("상대팀(전적) >> LG 트윈스(4:1)");
				System.out.println("MVP >> 이종범(해태 타이거즈)");
				System.out.println();
				System.out.println("======= 2009★★★★★★★★★★ =======");
				System.out.println("상대팀(전적) >> SK 와이번스(4:3)");
				System.out.println("MVP >> 나지완(KIA 타이거즈)");
				System.out.println();
				System.out.println("======= 2017★★★★★★★★★★★ =======");
				System.out.println("상대팀(전적) >> 두산 베어스(4:1)");
				System.out.println("MVP >> 양현종(KIA 타이거즈)");
				System.out.println();
				System.out.println("==================================");
				
				
			}
			
		});
		
		j9.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println();
				System.out.println("<NC 다이노스>");
				System.out.println();
				System.out.println("======= 역대 한국시리즈 우승 기록 =======");
				System.out.println("1회(2020)");
				System.out.println();
				System.out.println("======= 2020★ =======");
				System.out.println("상대팀(전적) >> 두산 베어스(4:2)");
				System.out.println("MVP >> 양의지(NC 다이노스)");
				System.out.println();
				System.out.println("==================================");
				
			}
			
		});
		
		j10.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println();
				System.out.println("<홋데 자이언츠>");
				System.out.println();
				System.out.println("======= 역대 한국시리즈 우승 기록 =======");
				System.out.println("2회(1984, 1992)");
				System.out.println();
				System.out.println("======= 1984★ =======");
				System.out.println("상대팀(전적) >> 삼성 라이온스(4:3)");
				System.out.println("MVP >> 유두열(롯데 자이언츠)");
				System.out.println();
				System.out.println("======= 1992★★ =======");
				System.out.println("상대팀(전적) >> 빙그레 이글스(4:1)");
				System.out.println("MVP >> 박동희(롯데 자이언츠)");
				System.out.println();
				System.out.println("==================================");
				
			}
			
		});
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

}
