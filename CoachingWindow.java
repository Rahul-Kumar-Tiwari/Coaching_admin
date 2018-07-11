import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CoachingWindow  implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,li;
    JFrame f1;
    JButton b1,b2,b3,b4,b5,b6;
    CoachingWindow()
    {
	   f1=new JFrame("CoachingWindow");
           f1.setBounds(0,0,1920,1080);
	   Container c1=f1.getContentPane();                   
	   c1.setBackground(Color.blue);


	  l1=new JLabel("Welcome to :- Rahul kumar");
	  l1.setBounds(150,10,800,50);
	  f1.add(l1);
	  l1.setForeground(Color.yellow);
	  Font f3=new Font("Times New Roman",Font.ITALIC,50);
	  l1.setFont(f3);

	  l2=new JLabel("APOGEE  EDUCATION  CENTRE");
	  l2.setBounds(150,90,1300,80);
	  f1.add(l2);
	  l2.setForeground(Color.green);
          Font f4=new Font("Times New Roman",Font.BOLD,80);
	  l2.setFont(f4);

	  ImageIcon icon=new ImageIcon("C:/Users/RAHUL KUMAR/Desktop/rahul/java/Coaching/coaching/abc.png");
	  //li=new JLabel("New Admission");
	  //b1.add(li);
	  b1=new JButton(icon);
	  b1.setBackground(Color.blue);
          b1.setBounds(110,200,300,300);
          f1.add(b1);
	  b1.addActionListener(this);

	  ImageIcon fee=new ImageIcon("C:/Users/RAHUL KUMAR/Desktop/rahul/java/Coaching/coaching/fee.png");
          b2=new JButton(fee);
          b2.setBackground(Color.blue);
          b2.setBounds(610,200,300,300);
          f1.add(b2);



	  ImageIcon Details=new ImageIcon("C:/Users/RAHUL KUMAR/Desktop/rahul/java/Coaching/coaching/Details3.png");
          b3=new JButton(Details);
	  b3.setBackground(Color.blue);
          b3.setBounds(1110,200,300,300);
          f1.add(b3);
	
	   ImageIcon Contact=new ImageIcon("C:/Users/RAHUL KUMAR/Desktop/rahul/java/Coaching/coaching/Contacts2.png");
	   b4=new JButton(Contact);
	   b4.setBackground(Color.blue);
           b4.setBounds(110,620,300,300);
           f1.add(b4);
	   
	   ImageIcon Card=new ImageIcon("C:/Users/RAHUL KUMAR/Desktop/rahul/java/Coaching/coaching/Card2.png");
           b5=new JButton(Card);
	   b5.setBackground(Color.blue);
           b5.setBounds(610,620,300,300);
           f1.add(b5);
 		

	   ImageIcon Attendance=new ImageIcon("C:/Users/RAHUL KUMAR/Desktop/rahul/java/Coaching/coaching/Attendance.png");
           b6=new JButton(Attendance);
	   b6.setBackground(Color.blue);
           b6.setBounds(1110,620,300,300);
           f1.add(b6);

	ImageIcon Portal=new ImageIcon("C:/Users/RAHUL KUMAR/Desktop/rahul/java/Coaching/coaching/Portal.png");
	l3=new JLabel(Portal);
	l3.setBounds(1550,0,200,200);
	f1.add(l3);

	
	  b1.addActionListener(this);
        f1.setLayout(null);
	f1.setVisible(true);
	f1.setResizable(false);
	
	}
    public void actionPerformed(ActionEvent e1)
    {
		if(e1.getSource()==b1)
                {
			new Class6th();
		}
   
	}
   public static void main(String std[])	
   {
                 new CoachingWindow();
   } 

}
