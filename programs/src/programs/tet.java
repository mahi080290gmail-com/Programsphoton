package programs;

import java.awt.Graphics;
import java.util.function.Function;

import javax.swing.JComponent;
import javax.swing.JFrame;
class gg extends JComponent
{
	public void paint(Graphics g)
	{
		g.drawRect(10, 10, 200, 200);
	}
}
public class tet  {
	
	public static void main(String[] args) {
		JFrame w=new JFrame();
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		w.setBounds(30,30,300,300);
	
		w.getContentPane().add(new gg());
	
		w.setVisible(true);
	
	

}}
