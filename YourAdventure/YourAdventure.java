package adventure;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class YourAdventure extends JComponent implements MouseListener {

	public static String nameOfApp = "Your Adventure!";
	
	int screen;
	public YourAdventure() {
		addMouseListener(this);
	}
	
	public void paint(Graphics g) {
    if(screen==0){
    	startingScreen(g);
    } else if (screen == 1){
    	animal(g);
    } else if (screen == 2){
    	plant(g);
    }
    
    if (screen == 3){
    	blackDoor(g);
    }
	}
	
	public void startingScreen(Graphics g){
	g.setColor(Color.black);
	g.drawString("Who do you want to be in a parallel universe?", 95, 70);
	
	g.drawString("Animal", 95, 130);
	
	g.drawString("Plant", 285, 130);	
	}
	
	public void animal (Graphics g){
		g.setColor(Color.blue);
		g.drawString("You've become a puppy! There are two doors, which one should you enter?", 25, 100);
		g.drawString("black door", 100, 150);
		g.drawString("white door", 250, 150);
	}
	
	public void plant (Graphics g){
		g.setColor(Color.white);
		g.drawString("You've become a tree! Someone cut you down, u are dead...", 50, 100);
	}
	
	public void blackDoor (Graphics g){
		g.setColor(Color.black);
		g.drawString("You are eaten by a lion. DEAD", 100, 100);
	}
	
	public void whiteDoor (Graphics g){
		g.setColor(Color.white);
		g.drawString("There is food! Do you want to eat it?", 100, 100);
		g.drawString("Yes", 100, 150);
		g.drawString("No", 250, 150);
	}
	
	public void food (Graphics g){
		g.setColor(Color.red);
		g.drawString("You are full now. There's footstep, what do you do?", 50, 100);
		g.drawString("hide", 100, 150);
		g.drawString("stand still", 250, 150);
	}
	
	public void noFood (Graphics g){
		g.drawString("You've starved to death.", 100, 100);
	}
	
	public void hide (Graphics g){
		g.setColor(Color.black);
		g.drawString("You went behind the sofa, 2 person are coming, which one should you go to?", 10, 100);
		g.drawString("man", 100, 150);
		g.drawString("woman", 250, 150);
	}
	
	public void standStrill (Graphics g){
		g.setColor(Color.red);
		g.drawString("They decided to kick you out and you got hit by a car. DEAD", 50, 100);
	}
	
	public void man (Graphics g){
		g.setColor(Color.black);
		g.drawString("The man kicked you out. FAIL", 50, 100);
	}
	
	public void woman (Graphics g){
		g.setColor(Color.white);
		g.drawString("The woman took you home. An unfriendly cat is there, what do you do?", 10, 100);
		g.drawString("stay calm", 100, 150);
		g.drawString("bite her", 250, 150);
	}
	
	public void stayCalm (Graphics g){
		g.setColor(Color.white);
		g.drawString("You two became friend eventually! You lived happy ever after!", 10, 100);
	}
	
	public void biteHer (Graphic g){
		g.setColor(Color.red);
		g.drawString("the woman got mad, what do you do?", 50, 100);
		g.drawString("run away", 100, 150);
		g.drawString("stay", 250, 150);
	}
	
	public void both (Graphic g){
		g.setColor(Color.red);
		g.drawString("You fail either way.", 50, 100);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(e.getX()+","+e.getY());
        if(e.getX()>90 && e.getX()<135 && e.getY()>110 && e.getY()<140){
			screen = 1;
		}
        
        if(e.getX()>280 && e.getX()<325 && e.getY()>110 && e.getY()<140){
			screen = 2;
		} else if(e.getX()>90 && e.getX()<135 && e.getY()>110 && e.getY()<140){
			screen = 3;
		}
        
        repaint();
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
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new YourAdventure());
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.pink);
	}

}
