package gamewindow;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
public class Menu extends JFrame
{
	JButton op1;
	JButton op2;
	JButton op3;
	JLabel name;
		
		public Menu()
		{
			op1=new JButton("Play Game");
			op2=new JButton("View Instruction");
			op3=new JButton("Exit");
			name.setFont(new Font("serif",Font.PLAIN,24));
			setTitle("HANGMAN GAME");
			setSize(300,200);
			setResizable(false);
			setVisible(true);
		}
		public void addComponent()
		{
			setLayout(new GridBagLayout());
			GridBagConstraints c=new GridBagConstraints();
			
			c.gridx=0;
			c.gridy=0;
			c.weighty=0.1;
			c.anchor=c.CENTER;
			add(name,c);
			
			c.gridx=0;
			c.gridy=1;
			c.fill=c.HORIZONTAL;
			add(op1,c);
			
			c.gridx=0;
			c.gridy=2;
			c.fill=c.HORIZONTAL;
			add(op2,c);
			
			c.gridx=0;
			c.gridy=3;
			c.fill=c.HORIZONTAL;
			add(op3,c);
		}
}



