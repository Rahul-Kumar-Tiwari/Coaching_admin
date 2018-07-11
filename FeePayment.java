import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Feepayment  implements ActionListener
{

     JFrame f1;
     JLabel l1,l2,l3,l4,l5;
     JButton b1,b2;
     FeePayment();
     {
	 f1=new JFrame("CoachingWindow");
         f1.setBounds(0,0,1920,1080);
	 Container c1=f1.getContentPane();                   
	 c1.setBackground(Color.blue);
