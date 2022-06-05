import java.awt.BorderLayout;
import javax.swing.*;

public class Window extends JFrame{
	public Window() 
{
		setSize(1300, 900);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("소프트웨어 프로젝트 Subway");
		setLayout(new BorderLayout());
		SubwayLinePanel slp = new SubwayLinePanel();
		add(slp);
		setVisible(true);
	}
}
