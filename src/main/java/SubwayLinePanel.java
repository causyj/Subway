import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import javax.swing.*;

public class SubwayLinePanel extends JPanel {
	Shape platformNode[][] = new Shape[4][10];
	final int xInterval = 100;
	final int yInterval = 170;

	public SubwayLinePanel()
	{
		for(int i = 0; i < 4; i++)
			for(int j = 0; j < 10; j++)
			{
				int x = xInterval * j + 160;
				int y = yInterval * i + 200;
				int diameter = 20;
				platformNode[i][j] = new Ellipse2D.Double(x, y, diameter, diameter);
			}
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g.setColor(Color.ORANGE);
		for(int i = 0; i < 4; i++)
		{
			/*
			 * 노선도 중 선 그리기
			 */
			// 가로 선 그리기
			int startX = (xInterval * 0 + 235) -100;// 선의 시작 X
			int   endX = (xInterval * 9 + 200) + 60; // 선의 끝 X
			int Y = (yInterval * i + 200) + 10;  // 각 원의 Y + 반지름
			g2d.setStroke(new BasicStroke(3));  // 선 굵기 설정
			g2d.drawLine(startX, Y, endX, Y);

			// 세로 선 그리기
			if(i == 0)
				g2d.drawLine(endX, Y, endX, Y + yInterval);
			else if(i == 1)
				g2d.drawLine(startX, Y, startX, Y + yInterval);
			else if(i == 2)
				g2d.drawLine(endX, Y, endX, Y + yInterval);
			/*
			 * 노선도 중 원(노드) 그리기
			 */
			for(int j = 0; j < 10; j++)
			{
				// 마지막 행은 노드가 8개밖에 없으므로
				// (i = 3, j = 0, 1)인 노드는 그리지 않는다
				if(i == 3 && j < 2)
					continue;
				g2d.fill(platformNode[i][j]);
				g2d.draw(platformNode[i][j]);
			}
		}
	}
//서울남산체 M 다운 필수
	public void paint(Graphics g) {
		super.paint(g);
		Color color5 = new Color(127, 0, 255);
		Color colora = new Color(0, 236, 253);
		Color colorb = new Color(153, 76, 0);
		Color color4 = new Color(0, 128, 255);
		Color color2 = new Color(0, 204, 0);
		Color color3 = new Color(253, 68, 0);
		Color color7 = new Color(51, 102, 0);
		g.setFont(new Font("서울남산체 M", Font.BOLD, 50));
		g.setColor(Color.ORANGE);
		g.drawString("⑨", 85, 735);
		g.drawString("⑨", 85, 225);
		Graphics2D g2d = (Graphics2D) g;
		AffineTransform defaultAt = g2d.getTransform();

		// rotates the coordinate by 90 degree counterclockwise
		AffineTransform at = new AffineTransform();
		g.setFont(new Font("서울남산체 M", Font.BOLD, 30));
		at.rotate(-Math.PI / 4);
		g2d.setTransform(at);
		g2d.drawString("개화", -10, 270);
		g.setColor(Color.BLACK);
		g2d.drawString("김포공항", 55, 335);
		g.setColor(color5);
		g2d.drawString("⑤", 165, 335);
		g.setColor(colora);
		g.setFont(new Font("서울남산체 M", Font.BOLD, 21));
		g2d.drawString("공항", 195, 330);
		g.setColor(colorb);
		g2d.drawString("김포골드", 235, 330);
		g.setFont(new Font("서울남산체 M", Font.BOLD, 30));
		g.setColor(Color.GRAY);
		g2d.drawString("공항시장", 125, 405);
		g2d.drawString("신방화", 200, 480);
		g.setColor(Color.BLACK);
		g2d.drawString("마곡나루", 275, 555);
		g.setColor(colora);
		g.setFont(new Font("서울남산체 M", Font.BOLD, 21));
		g2d.drawString("공항", 390, 550);
		g.setFont(new Font("서울남산체 M", Font.BOLD, 30));
		g.setColor(Color.GRAY);
		g2d.drawString("양천향교", 340, 620);
		g2d.drawString("가양", 410, 690);
		g2d.drawString("증미", 480, 760);
		g2d.drawString("등촌", 555, 835);
		g2d.drawString("염창", 620, 900);
		//2nd line
		g.setColor(Color.BLACK);
		g2d.drawString("동작", -130, 390);
		g.setColor(color4);
		g2d.drawString("④", -70, 390);
		g.setColor(Color.GRAY);
		g2d.drawString("흑석", -60, 460);
		g2d.drawString("노들", 10, 530);
		g.setColor(Color.BLACK);
		g2d.drawString("노량진", 80, 600);
		g.setColor(Color.BLUE);
		g2d.drawString("①", 165, 600);
		g.setColor(Color.GRAY);
		g2d.drawString("샛강", 150, 675);
		g.setColor(Color.BLACK);
		g2d.drawString("여의도", 220, 745);
		g.setColor(color5);
		g2d.drawString("⑤", 305, 740);
		g.setColor(Color.GRAY);
		g2d.drawString("국회의사당", 290, 810);
		g.setColor(Color.BLACK);
		g2d.drawString("당산", 360, 885);
		g.setColor(color2);
		g2d.drawString("②", 420, 885);
		g.setColor(Color.GRAY);
		g2d.drawString("선유도", 430, 955);
		g2d.drawString("신목동", 505, 1025);
		//3rd line
		g2d.drawString("구반포", -250, 510);
		g2d.drawString("신반포", -180, 580);
		g.setColor(Color.BLACK);
		g.setFont(new Font("서울남산체 M", Font.BOLD, 27));
		g2d.drawString("고속버스터미널", -110, 645);
		g.setFont(new Font("서울남산체 M", Font.BOLD, 30));
		g.setColor(color3);
		g2d.drawString("②", -70, 615);
		g.setColor(color7);
		g2d.drawString("⑦", -25, 615);
		g.setColor(Color.GRAY);
		g2d.drawString("사평", -40, 720);
		g2d.drawString("신논현", 30, 790);
		g2d.drawString("언주", 100, 865);
		g.setColor(Color.BLACK);
		g2d.drawString("선정릉", 170, 935);
		g.setColor(Color.ORANGE);
		g.setFont(new Font("서울남산체 M", Font.BOLD, 21));
		g2d.drawString("분당", 255, 930);
		g.setFont(new Font("서울남산체 M", Font.BOLD, 30));
		g.setColor(Color.GRAY);
		g2d.drawString("삼성중앙", 240, 1000);
		g2d.drawString("봉은사", 310, 1070);
		g.setColor(Color.BLACK);
		g2d.drawString("종합운동장", 380, 1145);
		g.setColor(color2);
		g2d.drawString("②", 525, 1145);
		g.setColor(Color.GRAY);
		//last line
		g2d.drawString("중앙보훈병원", -230, 770);
		g2d.drawString("둔촌오륜", -160, 840);
		g.setColor(Color.BLACK);
		g2d.drawString("올림픽공원", -90, 910);
		g.setColor(color5);
		g2d.drawString("⑤", 50, 910);
		g.setColor(Color.GRAY);
		g2d.drawString("한성백제", -20, 980);
		g2d.drawString("송파나루", 50, 1050);
		g.setColor(Color.BLACK);
		g2d.drawString("석촌", 120, 1120);
		g.setColor(Color.magenta);
		g2d.drawString("⑧", 175, 1120);
		g.setColor(Color.GRAY);
		g2d.drawString("석촌고분", 190, 1190);
		g2d.drawString("삼전", 260, 1260);
		g2d.setTransform(defaultAt);



		//button
		Color[] color = {new Color(255,200,0)};
		//1st line
		JRadioButton btn1 = new JRadioButton();
		JRadioButton btn2 = new JRadioButton();
		JRadioButton btn3 = new JRadioButton();
		JRadioButton btn4 = new JRadioButton();
		JRadioButton btn5 = new JRadioButton();
		JRadioButton btn6 = new JRadioButton();
		JRadioButton btn7 = new JRadioButton();
		JRadioButton btn8 = new JRadioButton();
		//1nd line
		JRadioButton btn9 = new JRadioButton();
		JRadioButton btn10 = new JRadioButton();
		JRadioButton btn11 = new JRadioButton();
		JRadioButton btn12 = new JRadioButton();
		JRadioButton btn13 = new JRadioButton();
		JRadioButton btn14 = new JRadioButton();
		JRadioButton btn15 = new JRadioButton();
		JRadioButton btn16 = new JRadioButton();
		JRadioButton btn17 = new JRadioButton();
		JRadioButton btn18 = new JRadioButton();
		//3rd line
		JRadioButton btn19 = new JRadioButton();
		JRadioButton btn20 = new JRadioButton();
		JRadioButton btn21 = new JRadioButton();
		JRadioButton btn22 = new JRadioButton();
		JRadioButton btn23 = new JRadioButton();
		JRadioButton btn24 = new JRadioButton();
		JRadioButton btn25 = new JRadioButton();
		JRadioButton btn26 = new JRadioButton();
		JRadioButton btn27 = new JRadioButton();
		JRadioButton btn28 = new JRadioButton();
		JRadioButton btn29 = new JRadioButton();
		//4th line
		JRadioButton btn30 = new JRadioButton();
		JRadioButton btn31 = new JRadioButton();
		JRadioButton btn32 = new JRadioButton();
		JRadioButton btn33 = new JRadioButton();
		JRadioButton btn34 = new JRadioButton();
		JRadioButton btn35 = new JRadioButton();
		JRadioButton btn36 = new JRadioButton();
		JRadioButton btn37 = new JRadioButton();
		JRadioButton btn38 = new JRadioButton();

		// ★ 버튼 위치와 크기 설정
		btn1.setBackground(color[0]);
		btn1.setBounds(361,714,16,14);
		btn2.setBackground(color[0]);
		btn2.setBounds(461,714,16,14);
		btn3.setBackground(color[0]);
		btn3.setBounds(561,714,16,14);
		btn4.setBackground(color[0]);
		btn4.setBounds(661,714,16,14);
		btn5.setBackground(color[0]);
		btn5.setBounds(761,714,16,14);
		btn6.setBackground(color[0]);
		btn6.setBounds(861,714,16,14);
		btn7.setBackground(color[0]);
		btn7.setBounds(961,714,16,14);
		btn8.setBackground(color[0]);
		btn8.setBounds(1061,714,16,14);
		//2nd line
		btn9.setBackground(color[0]);
		btn9.setBounds(161,544,16,14);
		btn10.setBackground(color[0]);
		btn10.setBounds(261,544,16,14);
		btn11.setBackground(color[0]);
		btn11.setBounds(361,544,16,14);
		btn12.setBackground(color[0]);
		btn12.setBounds(461,544,16,14);
		btn13.setBackground(color[0]);
		btn13.setBounds(561,544,16,14);
		btn14.setBackground(color[0]);
		btn14.setBounds(661,544,16,14);
		btn15.setBackground(color[0]);
		btn15.setBounds(761,544,16,14);
		btn16.setBackground(color[0]);
		btn16.setBounds(861,544,16,14);
		btn17.setBackground(color[0]);
		btn17.setBounds(961,544,16,14);
		btn18.setBackground(color[0]);
		btn18.setBounds(1061,544,16,14);
		//3rd line
		btn19.setBackground(color[0]);
		btn19.setBounds(161,374,16,14);
		btn20.setBackground(color[0]);
		btn20.setBounds(261,374,16,14);
		btn21.setBackground(color[0]);
		btn21.setBounds(361,374,16,14);
		btn22.setBackground(color[0]);
		btn22.setBounds(461,374,16,14);
		btn23.setBackground(color[0]);
		btn23.setBounds(561,374,16,14);
		btn24.setBackground(color[0]);
		btn24.setBounds(661,374,16,14);
		btn25.setBackground(color[0]);
		btn25.setBounds(761,374,16,14);
		btn26.setBackground(color[0]);
		btn26.setBounds(861,374,16,14);
		btn27.setBackground(color[0]);
		btn27.setBounds(961,374,16,14);
		btn28.setBackground(color[0]);
		btn28.setBounds(1061,374,16,14);
		//4th line
		btn29.setBackground(color[0]);
		btn29.setBounds(161,204,16,14);
		btn30.setBackground(color[0]);
		btn30.setBounds(261,204,16,14);
		btn31.setBackground(color[0]);
		btn31.setBounds(361,204,16,14);
		btn32.setBackground(color[0]);
		btn32.setBounds(461,204,16,14);
		btn33.setBackground(color[0]);
		btn33.setBounds(561,204,16,14);
		btn34.setBackground(color[0]);
		btn34.setBounds(661,204,16,14);
		btn35.setBackground(color[0]);
		btn35.setBounds(761,204,16,14);
		btn36.setBackground(color[0]);
		btn36.setBounds(861,204,16,14);
		btn37.setBackground(color[0]);
		btn37.setBounds(961,204,16,14);
		btn38.setBackground(color[0]);
		btn38.setBounds(1061,204,16,14);



		// ★ 프레임에다가 버튼 추가
		add(btn1); add(btn2); add(btn3); add(btn4); add(btn5); add(btn6); add(btn7); add(btn8);
		//2nd line
		add(btn9); add(btn10); add(btn11); add(btn12); add(btn13); add(btn14); add(btn15); add(btn16); add(btn17); add(btn18);
		//3rd line
		add(btn19); add(btn20); add(btn21); add(btn22); add(btn23); add(btn24); add(btn25); add(btn26); add(btn27); add(btn28);
		//4rd line
		add(btn29); add(btn30); add(btn31); add(btn32); add(btn33); add(btn34); add(btn35); add(btn36); add(btn37); add(btn38);

	}


}