import java.awt.*;
import javax.swing.*;
import java.sql.*; 
import java.awt.event.*;
public class PrintDemo extends WindowAdapter
{
        JFrame f1;
        JTextField t1,t2;
	JButton b1,b2;
        JTextArea a1,a2;
	JLabel l1,l2,l3;
	String n,f,a,b,g,m;
        PrintDemo(String name,String father,String address,String birthday,String gender,String mobile)
        {	
		n=name;f=father;a=address;b=birthday;g=gender;m=mobile;		
		f1=new JFrame("Class6th");
                f1.setBounds(150,0,1620,1020);

		a1=new JTextArea(10,30);
                a1.setBounds(100,200,1000,700);
                f1.add(a1);
		//a1.add ActionListener(this);

       		f1.setLayout(null);
          	f1.setVisible(true);
          	f1.setResizable(false);
	   	}
		@Override
 		public void windowClosing(WindowEvent e)
		{
           		System.exit(0);
    		}
		


          	public static void main(String std[])	
   		{
                  new PrintDemo(null,null,null,null,null,null);
		  PrintDemo.append(new Class6th.t3.getText);   		
		} 
}

           