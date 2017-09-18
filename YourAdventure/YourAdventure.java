
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;
import javax.swing.JFrame;

int screen = 0;

public class YourAdventure extends JComponent implements MouseListener {

	public static String nameOfApp = "Your Adventure!";
	
	
	public YourAdventure() {
		addMouseListener(this);
	}
	
	public void paint(Graphics g) {
	if (screen == 0){
		startingScreen();
	}
	}
	
	public void startingScreen(Graphics g){
	g.setColor(Color.white);
	g.drawString("Which door would you chose?", 50, 50);
	g.drawString("white door", 50, 100);
	g.drawString("black door", 150, 100);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame(nameOfApp);
		frame.getDefaultCloseOperation();
		frame.add(new YourAdventure());
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.black);
	}

}
