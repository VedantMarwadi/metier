/*
<applet code="First.class" width="300" height="300">
</applet>
*/
import java.applet.*;
import java.awt.*;
public class First extends Applet
{

	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.drawString("welcome",50,50);
		g.setColor(Color.blue);
		g.drawRect(150,150,50,50);
		g.drawOval(150,100,50,50);
		g.setColor(Color.yellow);
		g.fillRect(160,165,10,10);
		g.fillRect(180,165,10,10);
		g.fillRect(170,180,10,20);
		g.setColor(Color.red);
		g.drawArc(160,110,30,50,0,180);
	}

}