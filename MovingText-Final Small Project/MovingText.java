import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*;
import java.awt.event.*;

public class MovingText extends Applet implements Runnable{

	Thread th;
	Button btn1 , btn2;
	int y = 100;	 	
	
	public void init(){
		th = new Thread(this);	
		th.start();	
		
		btn1 = new Button("move up");
		btn2 = new Button("move down");	
		
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				y = y - 20;
				repaint();
			}
		});
		add(btn1);
		
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				y = y + 20;
				repaint();
			}
		});
		add(btn2);	
	}
	
	public void paint(Graphics g){
		g.drawString("hello world", 100 , y);
	}
	
	public void run(){
		while(true){
			repaint();
			try{
				th.sleep(500);
			} catch(InterruptedException e){}
			
		}
	}
}

/*

<applet code="MovingText" width=1000 height=1000>
</applet>




*/