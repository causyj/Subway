import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import javax.swing.*;

public class SubwayLinePanel extends JPanel {
	Shape platformNode[][] = new Shape[4][10];
	final int xInterval = 80;
	final int yInterval = 170;
	
	public SubwayLinePanel()
	{
		for(int i = 0; i < 4; i++)
			for(int j = 0; j < 10; j++)
			{
				int x = xInterval * j + 135;
				int y = yInterval * i + 100;
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
			int startX = (xInterval * 0 + 135) - 20; // 선의 시작 X
			int   endX = (xInterval * 9 + 135) + 40; // 선의 끝 X
			int Y = (yInterval * i + 100) + 10; // 각 원의 Y + 반지름
			g2d.setStroke(new BasicStroke(3)); // 선 굵기 설정
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
}
