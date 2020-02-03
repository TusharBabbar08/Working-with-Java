import java.awt.*;
import java.applet.*;
public class Q13 extends Applet{
	public void init()
	{
		setBackground(Color.red);
		getBackground();
	}
	public void paint(Graphics g)
	{
		g.drawRect(30,110,110,50);
		g.drawOval(30,180,50,50);
		g.drawOval(30,250,50,80);
		g.drawArc(15,350,290,100,0,120);
		int x[]={50,90,90,50,30};
		int y[]={50,50,90,90,70};
		g.drawPolygon(x,y,5);
	}
}
/*
<applet code="Q13.java" width=300 height=400>
</applet>
*/