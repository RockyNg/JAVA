package rocky;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class gui  extends JFrame implements ActionListener
{
	
	//declare components needed for the gui
	private JPanel p1,p2,p3,p4;
	private JLabel label1,label2,label3,label4;
	private JRadioButton tempH,tempN,tempC,achesY,achesN,sThroatY,sThroatN;
	private ButtonGroup group1,group2,group3;
	private JButton b1,b2;
	private Font big;
	private String one,two,three,four="hey";
	//declare variables to store user input
	private double temp,aches,soreThroat,chance=0;
	
	
	ArrayList<String> people = new ArrayList<String>();
	//bring in calculations from nbayes class
	nbayes finalCalculations =new nbayes();
	
	//put them into last list
	private double[] lastList = ((finalCalculations.results).clone());
	
	

	private ActionListener hot = new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
			gui.this.temp=lastList[0];
			one="Hot";
			
		}
		
	};
	private ActionListener normal = new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
			gui.this.temp=lastList[1];
			one="Normal";
		}
		
	};
	private ActionListener cool = new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
			gui.this.temp=lastList[2];
			one="Cool";
		}
		
	};
	private ActionListener yesA = new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
			gui.this.aches=lastList[4];
			two="Yes";
		}
		
	};
	private ActionListener noA = new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
			gui.this.aches=lastList[5];
			two="No";
		}
		
	};
	private ActionListener yesS = new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
			gui.this.soreThroat=lastList[6];
			three="Yes";
		}
		
	};
	private ActionListener noS = new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
			gui.this.soreThroat=lastList[7];
			three="No";
			
			
		}
		
	};
	
	 
	public gui()
	{
		
		super ("Tongsilltis prediction program");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		b1= new JButton("Submit");
		b2= new JButton("Another diagnosis");
		
		
		
		
		
		
		tempH = new JRadioButton("Hot",false);
		tempN = new JRadioButton("Normal",false);
		tempC = new JRadioButton("Cool",false);
		achesY = new JRadioButton("Yes",false);
		achesN = new JRadioButton("No",false);
		sThroatY = new JRadioButton("Yes",false);
		sThroatN = new JRadioButton("No",false);
		

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
		p4 = new JPanel();

		p1.setBackground(Color.WHITE);
		p2.setBackground(Color.WHITE);
		p3.setBackground(Color.WHITE);
		p4.setBackground(Color.WHITE);


		big = new Font("Serif", Font.ITALIC,20);
		
		label1 = new JLabel("What best describes your Temperature?");	
		label2 = new JLabel("Do you have any Aches?");
		label3 = new JLabel("Do you have a Sore Throat?");
		label4 = new JLabel("Please enter your symptoms below:");
		
		label4.setFont(big);
		add(label4,BorderLayout.NORTH);
		add(p1,BorderLayout.CENTER);
		add(p2,BorderLayout.SOUTH);
		add(p3,BorderLayout.SOUTH);
		add(p4,BorderLayout.SOUTH);
		
		
		people.add("Temperature, ____Aches, ____Sore Throat,_____Tongsillitis");
		people.add("Person 1:"+one+","+two+","+three+","+four);
		people.add(two);
		people.add(three);
		people.add(four);
		JList<String> showList = new JList<>(people.toArray(new String[0]));
		JScrollPane scrollPane = new JScrollPane(showList);
		add(scrollPane);
		
		 
		 
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
		p4.add(b1);
		p4.add(b2);
		
		
		setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
	
		
		

		//wait for event to happen, whatever the user selects will enter the correct probability
		  
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
				JOptionPane.showMessageDialog(this,"You have not enter all your symptpms");
			}
			else
			{
				
			
				
				DecimalFormat df = new DecimalFormat("#.00"); 
				chance*=100;
				if(chance>=10)
				{
					JOptionPane.showMessageDialog(this,(df.format(chance))+"% chance of having tongsillitis\n YOU HAVE TONSILLITIS!");
					four="Yes";
				}
				else
				{
					
				
			    JOptionPane.showMessageDialog(this,(df.format(chance))+"% chance of having tongsillitis\n You don't have tongsillitis");
			    four="No";
			    
			}
			
				
			  	   
		     	
		   } 
			
			}
		if (e.getSource() ==b2)
		   {	
			
			
			  
			      temp=0;
			        aches=0;
			        soreThroat=0;
			        chance=0;
			        group1.clearSelection();
			        group2.clearSelection();
			        group3.clearSelection();
			        
		   } 
		
	}
	
	
	

}