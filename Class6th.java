import java.awt.*;
import javax.swing.*;
import java.sql.*; 
import java.awt.event.*;
import java.io.*;
public class Class6th implements ActionListener
{
	 JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,la,lb,lc,ld,lback;
         JFrame f1;
         JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,ta,tb,tc;
         JTextArea a1,a2;
         JRadioButton rb1,rb2;
         JButton b1,b2,b3;
         JComboBox cb1,cb2,cb3,cb4,cb5;
         JCheckBox c1,c2;
         File file;
        String day[]={"day","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        String month[]={"month","January","February","March","April","may","June","July","August","September","October","November","December"};
        String year[]={"year","1985","1986","1987","1988","1989","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017"};
	String studyclass[]={"Class 6th","Class 7th","Class 8th","Class 9th","Class 10th","Class 11th","Class 12th"};
	String Percent[]={"Less than 50%","Greater than 50%","Greater than 60%","Greater than 70%","Greater than 80%","Greater than 90%","Greater than 95%"};
	Class6th()
        {
		f1=new JFrame("Class6th");
                f1.setBounds(0,0,1980,1020);

		l1=new JLabel("Welcome to :- Rahul kumar");
	        l1.setBounds(150,10,800,50);
	        f1.add(l1);
	        l1.setForeground(Color.red);
	        Font f2=new Font("Times New Roman",Font.ITALIC,50);
	        l1.setFont(f2);

	       l2=new JLabel("APOGEE  EDUCATION  CENTRE");
	       l2.setBounds(150,90,1300,80);
	       f1.add(l2);
	       l2.setForeground(Color.green);
               Font f3=new Font("Times New Roman",Font.BOLD,80);
	       l2.setFont(f3);

		 ImageIcon back=new ImageIcon("C:/Users/RAHUL KUMAR/Desktop/rahul/java/Coaching/coaching/back.png");
		 b3=new JButton(back);
        	 b3.setBounds(20,30,100,100);
         	 f1.add(b3);
         	 b3.addActionListener(this);
                 //lback=new JLabel(back);
                 //lback.setBounds(20,30,100,100);
	         //f1.add(lback);
		 //lback.addActionListener(this);



                l3=new JLabel("Please fill all the filled :-");
	        l3.setBounds(100,200,520,50);
	        f1.add(l3);
	        l3.setForeground(Color.blue);
                Font f11=new Font("Times New Roman",Font.BOLD,50);
	        l3.setFont(f11);

                l4=new JLabel("Name");
	        l4.setBounds(100,280,200,30);
	        f1.add(l4);
	        l4.setForeground(Color.black);
                Font f5=new Font("Times New Roman",Font.BOLD,30);
	        l4.setFont(f5);

		l11=new JLabel("Admisson in");
	        l11.setBounds(500,280,300,30);
	        f1.add(l11);
	        l11.setForeground(Color.black);
                Font fa=new Font("Times New Roman",Font.BOLD,30);
	        l11.setFont(fa);
		
		cb4=new JComboBox(studyclass);
           	cb4.setBounds(500,320,300,25);
	  	f1.add(cb4);


                 t1=new JTextField();
                 t1.setBounds(100,320,145,25);
                 f1.add(t1);
   
                 t2=new JTextField();
                 t2.setBounds(250,320,145,25);
                 f1.add(t2);

                 l9=new JLabel("Father's Name");
	         l9.setBounds(100,375,300,30);
	         f1.add(l9);
	         l9.setForeground(Color.black);
                 Font f6=new Font("Times New Roman",Font.BOLD,30);
	         l9.setFont(f6);

		 la=new JLabel("marks in previous class");
	         la.setBounds(500,375,300,30);
	         f1.add(la);
	         la.setForeground(Color.black);
                 Font fb=new Font("Times New Roman",Font.BOLD,30);
	         la.setFont(fb);

                 t3=new JTextField();
                 t3.setBounds(100,415,300,25);
                 f1.add(t3);

		 cb5=new JComboBox(Percent);
	   	 cb5.setBounds(500,415,300,25);
	   	 f1.add(cb5);
            

		 

    			 l5=new JLabel("Address");
	                 l5.setBounds(100,465,300,30);
	 		 f1.add(l5);
	 		 l5.setForeground(Color.black);
        		 Font f7=new Font("Times New Roman",Font.BOLD,30);
	                 l5.setFont(f7);

			 lb=new JLabel("Set Fee of student");
	                 lb.setBounds(500,465,300,30);
	 		 f1.add(lb);
	 		 lb.setForeground(Color.black);
        		 Font fbt=new Font("Times New Roman",Font.BOLD,30);
	                 lb.setFont(fbt);

   			a1=new JTextArea();
                        a1.setBounds(100,505,300,75);
                        f1.add(a1);

			
                 	ta=new JTextField();
                 	ta.setBounds(500,505,300,25);
                 	f1.add(ta);

           
  
			l6=new JLabel("D.O.B");
	                l6.setBounds(100,610,200,30);
	                f1.add(l6);
	                l6.setForeground(Color.black);
          		Font f8=new Font("Times New Roman",Font.BOLD,30);
	 	        l6.setFont(f8);

			lc=new JLabel("Mobile no(parent)");
	                lc.setBounds(500,545,300,30);
	                f1.add(lc);
	                lc.setForeground(Color.black);
          		Font fd=new Font("Times New Roman",Font.BOLD,30);
	 	        lc.setFont(fd);
			
			tb=new JTextField();
              		tb.setBounds(500,585,300,25);
              		f1.add(tb);
         

			ld=new JLabel("Roll no");
	                ld.setBounds(500,630,300,30);
	                f1.add(ld);
	                ld.setForeground(Color.black);
          		Font fg=new Font("Times New Roman",Font.BOLD,30);
	 	        ld.setFont(fg);
			
			tc=new JTextField();
              		tc.setBounds(500,670,300,25);
              		f1.add(tc);


               		cb1=new JComboBox(day);
	   		cb1.setBounds(100,650,85,25);
	   		f1.add(cb1);

           		cb2=new JComboBox(month);
	   		cb2.setBounds(190,650,110,25);
	   		f1.add(cb2);
            
           		cb3=new JComboBox(year);
           		cb3.setBounds(305,650,95,25);
	  	        f1.add(cb3);

                	l7=new JLabel("Gender");
	       		l7.setBounds(100,705,200,30);
	        	f1.add(l7);
	       	        l7.setForeground(Color.black);
                	Font f9=new Font("Times New Roman",Font.BOLD,30);
	       		l7.setFont(f9);

                	rb1=new JRadioButton("Male");
			rb1.setBounds(100,745,75,25);
			f1.add(rb1);
	
			rb2=new JRadioButton("Female");
			rb2.setBounds(240,745,75,25);
			f1.add(rb2);	

			ButtonGroup bg1=new ButtonGroup();
			bg1.add(rb1);
			bg1.add(rb2); 



              		l8=new JLabel("Mobile no(student)");
	      		l8.setBounds(100,800,350,30);
	      		f1.add(l8);
	      		l8.setForeground(Color.black);
              		Font f10=new Font("Times New Roman",Font.BOLD,30);
	      		l8.setFont(f10);

              		t6=new JTextField();
              		t6.setBounds(100,840,300,25);
              		f1.add(t6);


              		l10=new JLabel("Upload a profile picture");
	  		l10.setBounds(900,645,400,30);
	  		f1.add(l10);
	  		l10.setForeground(Color.black);
          		Font f12=new Font("Times New Roman",Font.BOLD,30);
	  		l10.setFont(f12);
          		ImageIcon camera=new ImageIcon("D:/rt.png");
	 
			b1=new JButton();
        		b1.setBounds(700,750,300,75);
         		f1.add(b1);
         		b1.addActionListener(this);

			ld=new JLabel("                Submit");
	      		ld.setBounds(200,25,100,25);
	      		b1.add(ld);
	      		ld.setForeground(Color.black);
              		Font fe=new Font("Times New Roman",Font.BOLD,25);
	      		ld.setFont(fe);


         		b2=new JButton(camera);
         		b2.setBounds(900,280,352,352);
         		f1.add(b2);
	 		b2.addActionListener(this);
	 		JFileChooser fc = new JFileChooser();
          		f1.setLayout(null);
          		f1.setVisible(true);
          		f1.setResizable(false);

			}
	private class ImageFilter extends javax.swing.filechooser.FileFilter
	{
	  	public boolean accept(File f)
	  	{
			if (f.isDirectory())
		            	return true;
			 String name = f.getName();
			 if (name.matches(".*((.jpg)|(.gif)|(.png))"))
			return true;
	        		else
	        		   return false;
		 }
		public String getDescription()













		{
			       return "Image files (*.jpg, *.gif, *.png)";
	    	}
	}
    public void actionPerformed(ActionEvent e1)
    {

	if(e1.getSource()==b2)
	{
			JFileChooser fc = new JFileChooser();
			fc.setFileFilter(new ImageFilter());
			int result = fc.showSaveDialog(null);
			
	    		if (result == JFileChooser.APPROVE_OPTION)
	    		{
	       			file = fc.getSelectedFile();
				
	    		}
	}
		if(e1.getSource()==b3)
        	{
			new CoachingWindow();
		}

      		
		
    	
				if(e1.getSource()==b1)
        			{
                 			 	String name=t1.getText()+" "+t2.getText();
                  				String father=t3.getText();
                  				String address=a1.getText();
                 				String birthday=cb1.getSelectedItem()+"-"+cb2.getSelectedItem()+"-"+cb3.getSelectedItem();                  
                  				String gender=null;
                  				if(rb1.isSelected()==true)
						{
							gender="male";
						}
						else if(rb2.isSelected()==true)
						{
							gender="Female";
						}
                   				String mobile=t6.getText();
						String studyclass=cb4.getSelectedItem()+" ";
						String marks=cb5.getSelectedItem()+" ";
						String fee=ta.getText();
						String mobileparent=tb.getText();
						String rollno=tc.getText();
					
	           if (name.equals("")||father.equals("")||address.equals("")||birthday.equals("")||gender.equals("")||mobile.equals("")||studyclass.equals("")||fee.equals("")||mobileparent.equals("")||rollno.equals(""))
                   {
                     JOptionPane.showMessageDialog(null,"please fill all the field","ERROR WINDOW",JOptionPane.ERROR_MESSAGE);
 			 
                   }
                   
                   else
                   {
			try
		       {
		     	  Class.forName("oracle.jdbc.driver.OracleDriver");
			  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			  Statement st=con.createStatement();
                          String val="insert into student values('"+name+"','"+rollno+"','"+father+"','"+address+"','"+birthday+"','"+gender+"','"+mobile+"','"+studyclass+"','"+marks+"','"+fee+"','"+mobileparent+"','"+file+"')";
                          System.out.println(val);
                          st.executeUpdate(val);
                        }
		        catch(Exception e2)
		        {
                          System.out.println("exception="+e2);
		        }

					
		}
	}


	   	}
          	public static void main(String std[])	
   		{
                  new Class6th();
   		} 

}



	