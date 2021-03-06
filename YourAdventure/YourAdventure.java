//Haixin Chen
package myAdventure;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class YourAdventure extends JComponent implements MouseListener {

	public static String nameOfApp = "Your Adventure!";
	
	int screen;
	
	int[] diceRolls = new int [7];
	
	public YourAdventure() {
		addMouseListener(this);
		setDice(0);
		printDice(0);
	}
	
	public void setDice(int diceNum){
		if (diceNum <diceRolls.length){
			diceRolls[diceNum] = rollDice(6);
			setDice(diceNum+1);
		}
	}
	
	public void printDice(int diceNum){
		if (diceNum < diceRolls.length){
			System.out.println(diceRolls[diceNum]);
			printDice(diceNum+1);
		}
	}
	
	public int sumDice(int diceNum){
		if (diceNum<diceRolls.length){
			return diceRolls[diceNum]+sumDice(diceNum + 1);
		}
		return 0;
	}
	
	
	public void paint(Graphics g) {
    if(screen==0){
    	startingScreen(g);
    } else if (screen == 1){
    	animal(g);
    } else if (screen == 2){
    	plant(g);
    } else if (screen == 3){
    	blackDoor(g);
    } else if (screen == 4){
    	whiteDoor(g);
    } else if (screen == 5){
    	food(g);
    } else if (screen == 6){
    	noFood(g);
    } else if (screen == 7){
    	hide(g);
	} else if (screen == 8){
        standStill(g);
	} else if (screen == 9){
        man(g);
	} else if (screen == 10){
        woman(g);
	} else if (screen == 11){
        stayCalm(g);
	} else if (screen == 12){
        biteHer(g);
	} else if (screen == 13){
        both(g);
	} else if (screen == 14){
        acceptYourFate(g);
	} else if (screen == 15){
	random(g);
	} else if (screen == 16){
	adopted(g);
        } else if (screen == 17){
	grass(g);
        }else if (screen == 18){
	dead(g);
	} else if (screen == 19){
	poison(g);
	}
        }
	
	public void startingScreen(Graphics g){
	g.setColor(Color.black);
	g.drawString("Who do you want to be?", 95, 70);
	g.drawString("Animal", 95, 130);
	g.drawString("Plant", 285, 130);
	
	g.drawString("Total sum: " + sumDice(0), 10, 10);
	g.drawString("Average:" + (sumDice(0)/diceRolls.length), 10, 20);
	} //0
	
	public void animal (Graphics g){
		g.setColor(Color.blue);
		g.drawString("You've become a puppy! There are two doors, which one should you enter?", 25, 70);
		g.drawString("black door", 95, 130);
		g.drawString("white door", 285, 130);
	} //1
	
	public void plant (Graphics g){
		g.setColor(Color.white);
		g.drawString("You've become a bush with " + sumDice(6) +  " trees. Someone cut you down, u are dead...", 50, 70);
	} //2
	
	public void blackDoor (Graphics g){
		g.setColor(Color.black);
		g.drawString("There's nothing in this room", 25, 70);
		g.drawString("Go back", 95, 130);
	} //3
	
	public void whiteDoor (Graphics g){
		g.setColor(Color.white);
		g.drawString("There is food! Do you want to eat it?", 100, 70);
		g.drawString("Yes", 95, 130);
		g.drawString("No", 285, 130);
	} //4
	
	public void food (Graphics g){
		g.setColor(Color.red);
		g.drawString("You are full now. There's footstep, what do you do?", 50, 70);
		g.drawString("hide", 95, 130);
		g.drawString("stand still", 285, 130);
	} //5
	
	public void noFood (Graphics g){
		g.setColor(Color.black);
		g.drawString("You've starved to death.", 100, 70);
	} //6
	
	public void hide (Graphics g){
		g.setColor(Color.black);
		g.drawString("You went behind the sofa, 2 person are coming, which one should you go to?", 10, 70);
		g.drawString("man", 95, 130);
		g.drawString("woman", 285, 130);
	} //7
	
	public void standStill (Graphics g){
		g.setColor(Color.red);
		g.drawString("They decided to kick you out and you got hit by a car. DEAD", 50, 70);
	} //8
	
	public void man (Graphics g){
		g.setColor(Color.black);
		g.drawString("The man kicked you out. FAIL", 50, 70);
	} //9
	
	public void woman (Graphics g){
		g.setColor(Color.white);
		g.drawString("The woman took you home. An unfriendly cat is there, what do you do?", 10, 70);
		g.drawString("stay calm", 95, 130);
		g.drawString("bite her", 285, 130);
	} //10
	
	public void stayCalm (Graphics g){
		g.setColor(Color.white);
		g.drawString("You two became friend eventually! You lived happy ever after!", 10, 70);
	} //11
	
	public int rollDice(int sides){
		int value = (int)(Math.random()*sides+1);
		return value;
	} 
	
	public void biteHer (Graphics g){
		g.setColor(Color.red);
		g.drawString("the woman got mad, what do you do?", 50, 70);
		g.drawString("run away", 95, 130);
		g.drawString("stay", 285, 130);
		
		int dice1 = rollDice(6);
		int dice2 = rollDice(6);
		g.drawString("roll Dice 1: "+dice1, 10, 10);
		g.drawString("roll Dice 2: "+dice2, 10, 20);
		g.drawString("Total: "+(dice1+dice2), 10, 30);
	} //12
	

	public void both (Graphics g){
		g.setColor(Color.red);
		g.drawString("You fail either way.", 50, 100);
		g.drawString("restart", 95, 130);
		g.drawString("accept your fate", 285, 130);	
	} //13
	
	public void acceptYourFate (Graphics g){
		g.setColor(Color.gray);
		g.drawString("THE END", 50, 100);
	} //14
	
	public void random (Graphics g){
		g.setColor(Color.gray);
		g.drawString("You woke up", 10, 70);
	} //15
	
	public void adopted (Graphics g){
		g.setColor(Color.black);
		g.drawString("He didn't adopted you, but he give you away to a dog lover. Happy ending!", 10, 100);
	} //16
	
	public void grass (Graphics g){
		g.setColor(Color.black);
		g.drawString("You became a grass, didn't really lived an exciting life. END.", 10, 100);
	} //17
	
	public void dead (Graphics g){
		g.setColor(Color.black);
		g.drawString("You didn't kill her so she killed you.", 10, 100);
	} //18
	
	public void poison (Graphics g){
		g.setColor(Color.black);
		g.drawString("The food is poisonous.You are dead.", 10, 100);
	} //19
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(e.getX()+","+e.getY());
		if(screen == 0){
        if(e.getX()>90 && e.getX()<135 && e.getY()>110 && e.getY()<140){
			screen = 1;
		} 
        
        if(e.getX()>280 && e.getX()<325 && e.getY()>110 && e.getY()<140){
			screen = 2;
			if(rollDice(6) == 6){
		screen = 17;
        }
	}  
        
		}else if(screen == 1){
    	    if(e.getX()>90 && e.getX()<155 && e.getY()>110 && e.getY()<140){
    			screen = 3;
    		}
    	    
            if(e.getX()>280 && e.getX()<345 && e.getY()>110 && e.getY()<140){
    			screen = 4;
    		}
		}else if(screen == 3){
    	    if(e.getX()>90 && e.getX()<155 && e.getY()>110 && e.getY()<140){
    			screen = 1;
    		}
		}else if(screen == 4){
	   		 if(e.getX()>90 && e.getX()<115 && e.getY()>110 && e.getY()<140){
		  		    screen = 5;
		  		 }
		  		    
		  	    if(e.getX()>280 && e.getX()<325 && e.getY()>110 && e.getY()<140){
		  			screen = 6;
		  	     } 
		  		} else if(screen == 5){
			  		if(e.getX()>90 && e.getX()<115 && e.getY()>110 && e.getY()<140){
			  		    screen = 7;
			  		    if (rollDice(6) == 6){
				screen =19;
			}
			  		} 
			  				    
			  		if(e.getX()>280 && e.getX()<345 && e.getY()>110 && e.getY()<140){
			  			screen = 8;
			  		} 
			
		  		}else if(screen == 7){
		  			if(e.getX()>90 && e.getX()<110 && e.getY()>110 && e.getY()<140){
		  			    screen = 9;
		  			   if (rollDice(6) == 4){
						screen = 16;
			                } 
		  			} 
		  					    
		  			if(e.getX()>280 && e.getX()<325 && e.getY()>110 && e.getY()<140){
		  				screen = 10;
		  			}
		  		} else if(screen == 10){
		  			if(e.getX()>90 && e.getX()<150 && e.getY()>110 && e.getY()<140){
		  			    screen = 11;
		  			    if (rollDice(6) == 3){
						screen = 18;
		  			} 
		  					    
		  			if(e.getX()>280 && e.getX()<325 && e.getY()>110 && e.getY()<140){
		  				screen = 12;
		  			}
		  		} else if(screen == 12){
		  			if(e.getX()>90 && e.getX()<135 && e.getY()>110 && e.getY()<140){
		  			    screen = 13;
		  			}
		  					    
		  			if(e.getX()>280 && e.getX()<350 && e.getY()>110 && e.getY()<140){
		  				screen = 13;
		  				
					}
		  			
		  			int n = (int)((Math.random()*6)+1);
		  			if (n == 2){
		  				screen = 15;
		  			}
		  			} 
		  		} else if(screen == 13){
		  			if(e.getX()>90 && e.getX()<135 && e.getY()>110 && e.getY()<140){
		  			    screen = 0;
		  			}
		  					    
		  			if(e.getX()>280 && e.getX()<325 && e.getY()>110 && e.getY()<140){
		  				screen = 14;
		  			} 
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
