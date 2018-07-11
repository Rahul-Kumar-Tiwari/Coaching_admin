import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ClassWindow
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    JFrame f1;
    JButton b1,b2,b3,b4,b5,b6,b7;
    ClassWindow()
    {
	   f1=new JFrame("ClassWindow");
           f1.setBounds(150,0,1620,1020);
	   Container c1=f1.getContentPane();                   
	   c1.setBackground(Color.pink);

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
          
          l3=new JLabel("Admisson for:-");
	  l3.setBounds(220,270,450,75);
	  f1.add(l3);
	  l3.setForeground(Color.blue);
	  Font f5=new Font("Times New Roman",Font.ITALIC,70);
	  l3.setFont(f5);

	  b1=new JButton("Class 6th");
          b1.setBounds(750,220,200,200);
          f1.add(b1);

          b2=new JButton("Class 7th");
          b2.setBounds(110,500,200,200);
          f1.add(b2);

          b3=new JButton("Class 8th");
          b3.setBounds(430,500,200,200);
          f1.add(b3);

	   b4=new JButton("Class 9th");
           b4.setBounds(750,500,200,200);
           f1.add(b4);

           b5=new JButton("class 10th");
           b5.setBounds(110,780,200,200);
           f1.add(b5);

           
           b6=new JButton("Class 11th");
           b6.setBounds(430,780,200,200);
           f1.add(b6);

           b7=new JButton("Class 12th");
           b7.setBounds(750,780,200,200);
           f1.add(b7);

	f1.setLayout(null);
	f1.setVisible(true);
	f1.setResizable(false);
   }
   public static void main(String std[])	
   {
                 new ClassWindow();
   } 

}
