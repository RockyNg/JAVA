package rocky;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class gui  extends JFrame implements ActionListener
{
	
	//declare components needed for the gui
	private JPanel p1,p2,p3;
	private JLabel label1,label2,label3,label4;
	private JRadioButton tempH,tempN,tempC,achesY,achesN,sThroatY,sThroatN;
	private ButtonGroup group1,group2,group3;
	private JButton b1;
	private Font big;
	//declare variables to store user input
	private double temp,aches,soreThroat,chance=0;
	
	//bring in calculations from nbayes class
	nbayes finalCalculations =new nbayes();
	
	//put them into last list
	private double[] lastList = ((finalCalculations.results).clone());
	
	

	private ActionListener hot = new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
			gui.this.temp=lastList[0];
			
		}
		
	};
	private ActionListener normal = new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
			gui.this.temp=lastList[1];
		     
		}
		
	};
	private ActionListener cool = new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
			gui.this.temp=lastList[2];
		     
		}
		
	};
	private ActionListener yesA = new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
			gui.this.aches=lastList[4];
		     
		}
		
	};
	private ActionListener noA = new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
			gui.this.aches=lastList[5];
		     
		}
		
	};
	private ActionListener yesS = new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
			gui.this.soreThroat=lastList[6];
		     
		}
		
	};
	private ActionListener noS = new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
			gui.this.soreThroat=lastList[7];
		     
			
			
		}
		
	};
	
	 
	public gui()
	{
		
		super ("title");
		setSize(400,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		b1= new JButton("show");
		
		
		tempH = new JRadioButton("Hot",false);
		tempN = new JRadioButton("Normal",false);
		tempC = new JRadioButton("Cool",false);
		achesY = new JRadioButton("Yes",false);
		achesN = new JRadioButton("No",false);
		sThroatY = new JRadioButton("Yes",false);
		sThroatN = new JRadioButton("No",false);
		
		
		add(tempH);
		add(tempN);
		add(tempC);
		add(achesY);
		add(achesN);
		add(sThroatY);
		add(sThroatN);
		
		group1 =new ButtonGroup();
		group2 =new ButtonGroup();
		group3 = new ButtonGroup();
		
		
		group1.add(tempH);
		group1.add(tempN);
		group1.add(tempC);
		
		group2.add(achesY);
		group2.add(achesN);
		
		group3.add(sThroatY);
		group3.add(sThroatN);
		
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		
	
	
	

	
		p1.setBackground(Color.WHITE);
		p2.setBackground(Color.WHITE);
		p3.setBackground(Color.WHITE);
	
		setBackground(Color.pink);
	
		
		

		
	

		big = new Font("Serif", Font.ITALIC,20);
		
		label1 = new JLabel("Temperature");	
		label2 = new JLabel("Aches");
		label3 = new JLabel("Sore Throat");
		label4 = new JLabel("Please enter your symptoms below:");
		
		label4.setFont(big);
		add(label4,BorderLayout.NORTH);
		add(p1,BorderLayout.CENTER);
		add(p2,BorderLayout.SOUTH);
		add(p3,BorderLayout.SOUTH);
		
		p1.add(label1);
		p1.add(tempH);
		p1.add(tempN);
		p1.add(tempC);
		
		p2.add(label2);
		p2.add(achesY);
		p2.add(achesN);
		
		p3.add(label3);
		p3.add(sThroatY);
		p3.add(sThroatN);
		p3.add(b1);
		
		
		setVisible(true);
		b1.addActionListener(this);
		
		
		//wait for event to happen, pass in font object to constructor
		  
		tempH.addActionListener(hot);
		tempN.addActionListener(normal);
		tempC.addActionListener(cool);
		achesY.addActionListener(yesA);
		achesN.addActionListener(noA);
		sThroatY.addActionListener(yesS);
		sThroatN.addActionListener(noS);
		
		 
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() ==b1)
		   {	
			chance=((soreThroat*aches)*(temp*lastList[3]));
			if(chance==0)
			{
				JOptionPane.showMessageDialog(this,"you have not enter all your symtopms");
			}
			else
			{
				
				DecimalFormat df = new DecimalFormat("#.00"); 
				chance*=100;
				if(chance>=10)
				{
					JOptionPane.showMessageDialog(this,(df.format(chance))+"% chance of having tongsillitis\n YOU HAVE TONSILLITIS!");
					
				}
				else
				{
					
				
			    JOptionPane.showMessageDialog(this,(df.format(chance))+"% chance of having tongsillitis\n YOU DON'T HAVE TONGSILLITS");
			}
			}
			  	   
		     	
		   } 
		
	}
	
	
	

}