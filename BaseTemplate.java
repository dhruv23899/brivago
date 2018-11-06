import javax.swing.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
class BaseTemplate
{
	public static void main(String args[]) throws IOException
	{
		BaseTemplate basetemplate = new BaseTemplate();
		basetemplate.gui();
	}
	public void gui() throws IOException
	{
		JFrame frame = new JFrame("Brivago");
		frame.setSize(1920,1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		BufferedImage myPicture = ImageIO.read(new File("pic2.jpg"));
		JLabel picLabel = new JLabel(new ImageIcon(myPicture));
		frame.getContentPane().add(BorderLayout.NORTH, picLabel);
	}
}
