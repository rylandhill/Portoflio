import javax.swing.*;

import org.w3c.dom.events.MouseEvent;

import java.awt.*;
import java.awt.event.MouseAdapter;

public class JPanel2 extends JPanel{
	public void paintComponent(Graphics g){
		for (int i=0;i<42;i++) {
			g.setColor(MainScreen.CList.getColor(i));
			g.fillOval(MainScreen.CList.getItem(i).x, MainScreen.CList.getItem(i).y, 50,50);
		}
	}
	public JPanel2(int x) {
		super(new GridLayout(x,7,10,10));
	setSize(new Dimension(800,500));
	}
}