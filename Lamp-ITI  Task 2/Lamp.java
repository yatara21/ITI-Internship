import java.applet.Applet;
import java.awt.*;
import java.awt.*;

public class Lamp extends Applet
{
	public void paint(Graphics g)
	{
	g.setColor(Color.green);

	g.drawRect(775, 650, 360, 40);

	g.drawLine(910, 650, 940, 540);

	g.drawLine(1000, 650, 970, 540);
	
	g.drawLine(745, 450, 776, 250);
		
	g.drawLine(1165, 450, 1134, 250);

	g.drawOval(775, 220, 360, 65);

	g.drawOval(905, 310, 100, 160);

	g.drawOval(780, 330, 70, 100);

	g.drawOval(1060, 330, 70, 100);
	
	g.fillOval(775, 220, 360, 65);

	g.fillOval(905, 310, 100, 160);

	g.fillOval(780, 330, 70, 100);

	g.fillOval(1060, 330, 70, 100);	






	g.drawArc(745, 365, 420, 175, 0, -180);

		



		

		

		
	}
}
/*<applet width="2000" height="2000" code="Lamp"></applet>*/
