package rocky;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;
import javax.swing.DefaultListModel;

public class gui  extends JFrame implements ActionListener
{
	
	//declare components needed for the gui
	private JPanel p1,p2,p3,p4;
	private JLabel label1,label2,label3,label4;
	private JRadioButton tempH,tempN,tempC,achesY,achesN,sThroatY,sThroatN;
	private ButtonGroup group1,group2,group3;
	private JButton ClearButton;	
	private Font big;
	private String one,two,three,four;
	//declare variables to store user input
	private double temp,aches,soreThroat,tempSafe,achesSafe,soreThroatSafe,chanceTon,chanceNoTon=0;
	private int[] user= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	private int hog=0;
	
	//bring in calculations from nbayes class
	nbayes finalCalculations =new nbayes();
	
	//put them into last list
	private double[] lastList = ((finalCalculations.naiveBaes).clone());
	
	
	//if user selects hot
	private ActionListener hot = new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
			//put probability of having and not having tongsillitis when temp is hot
			gui.this.temp=lastList[0];
			gui.this.tempSafe=lastList[4];
			
			//record user's selection
			one="Hot";
			
		}
		
	};
	//if user selects normal
	private ActionListener normal = new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
			gui.this.temp=lastList[1];
			gui.this.tempSafe=lastList[5];
			one="Normal";
		}
		
	};
	//if user selects cool
	private ActionListener cool = new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
			gui.this.temp=lastList[2];
			gui.this.tempSafe=lastList[6];

			one="Cool";
		}
		
	};
	//if user selects yes to aches
	private ActionListener yesA = new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
			gui.this.aches=lastList[8];
			gui.this.achesSafe=lastList[10];

			two="Yes";
		}
		
	};
	//if user selects no to aches
	private ActionListener noA = new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
			gui.this.aches=lastList[9];
			gui.this.achesSafe=lastList[11];

			two="No";
		}
		
	};
	//if user selects yes to sore throat
	private ActionListener yesS = new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
			gui.this.soreThroat=lastList[12];
			gui.this.soreThroatSafe=lastList[14];

			three="Yes";
		}
		
	};
	//if user selects no to sore throat
	private ActionListener noS = new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
			gui.this.soreThroat=lastList[13];
			gui.this.soreThroatSafe=lastList[15];
			three="No";
			
			
		}
		
	};
	
	 
	public gui()
	{
		//the frame of the program
		super ("Tonsilltis prediction program");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		//make JRadioButtons
		tempH = new JRadioButton("Hot",false);
		tempN = new JRadioButton("Normal",false);
		tempC = new JRadioButton("Cool",false);
		achesY = new JRadioButton("Yes",false);
		achesN = new JRadioButton("No",false);
		sThroatY = new JRadioButton("Yes",false);
		sThroatN = new JRadioButton("No",false);
		
		//make groups for the JRadioButtons
		group1 =new ButtonGroup();
		group2 =new ButtonGroup();
		group3 = new ButtonGroup();
		
		//add JRadioButton to appropriate groups
		group1.add(tempH);
		group1.add(tempN);
		group1.add(tempC);
		
		group2.add(achesY);
		group2.add(achesN);
		
		group3.add(sThroatY);
		group3.add(sThroatN);
		
		//make panels for each section
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();

		//colours for panels
		p1.setBackground(Color.WHITE);
		p2.setBackground(Color.WHITE);
		p3.setBackground(Color.WHITE);
		p4.setBackground(Color.RED);

		//big font for heading on top
		big = new Font("Serif", Font.ITALIC,20);
		
		//instruction for user
		label1 = new JLabel("What best describes your Temperature?");	
		label2 = new JLabel("Do you have any Aches?");
		label3 = new JLabel("Do you have a Sore Throat?");
		label4 = new JLabel("Please enter your symptoms below:");
		
		//add heading and panels with JRadioButton
		label4.setFont(big);
		add(label4,BorderLayout.NORTH);
		add(p1,BorderLayout.CENTER);
		add(p2,BorderLayout.SOUTH);
		add(p3,BorderLayout.SOUTH);
		
		//add button 2 to clear entered buttons
		ClearButton= new JButton("Another diagnosis/Next Person");
		
		//declare JList
		DefaultListModel<String> dlm = new DefaultListModel<String>();
	    JList<String> list = new JList<>(dlm);
	    add(new JScrollPane(list));
	    
	    //heading for JList
	    dlm.addElement("Temperature, __Aches, __Sore Throat, __Tonsillitis");
	    dlm.addElement("________________________________________________");
	    
	    //add button to submit data
	    add(new JButton("Submit") 
	    {
	    	{
	    		addActionListener(new ActionListener() 
	        	{
	    			public void actionPerformed(ActionEvent e)
	        		{
	        	  
	    				//find probability of having and not having tonsillitis
	    				chanceTon=((soreThroat*aches)*(temp*lastList[3]));
	    				chanceNoTon=((soreThroatSafe*achesSafe)*(tempSafe*lastList[7]));
	        		
	    				//if not all data have been entered, notify user
	    				if(chanceTon==0)
	    				{
	    					JOptionPane.showMessageDialog(null,"You have not entered all your symptpms");
	    				}
	    				else
	    				{
	    					//display probability in 2 decimal points
	    					DecimalFormat df = new DecimalFormat("#.00"); 
	    					chanceTon*=100;
	    					chanceNoTon*=100;
	    					
	    					if(chanceTon>chanceNoTon)
	    					{
	    						//if chance of having ton is higher 
	    						JOptionPane.showMessageDialog(null,(df.format(chanceTon))+"% chance of having tonsillitis\n"+ (df.format(chanceNoTon))+"% chance of not having tongsillitis \nYOU HAVE TONSILLITIS!");
	    						four="Yes";
	    					}
	    					else
	    					{
	    						//if chance of not having ton is higher 
	    						JOptionPane.showMessageDialog(null,(df.format(chanceTon))+"% chance of having tonsillitis\n"+ (df.format(chanceNoTon))+"% chance of not having tongsillitis \n You don't have tonsillitis");
	    						four="No";
	    					}
	  				
	    					//add users' input into JList
	    					dlm.addElement("person "+user[hog]+" : \t\t"+one+", "+two+", "+three+","+four);
	    					
	    					//next user
	    					hog++;

	    				}//end outer else	
	    				
	        		}//end actionPerformed
	    			
	        	});//end ActionListener
	    	}
	    }, BorderLayout.SOUTH);//end add Button to Submit
	    
	    add(p4,BorderLayout.SOUTH);
	 
		//add Label and JRadioButton to panels
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
		
		p4.add(ClearButton);

		setVisible(true);	
		ClearButton.addActionListener(this);

		//wait for event to happen, whatever the user selects will trigger the corresponding actionListener
		tempH.addActionListener(hot);
		tempN.addActionListener(normal);
		tempC.addActionListener(cool);
		achesY.addActionListener(yesA);
		achesN.addActionListener(noA);
		sThroatY.addActionListener(yesS);
		sThroatN.addActionListener(noS);
	
	}

	//actionPerformed for button2
	@Override
	public void actionPerformed(ActionEvent e) 
	{

		if (e.getSource() ==ClearButton)
			
		   {	
					//reset all selected button
			      	temp=0;
			        aches=0;
			        soreThroat=0;
			      
			        chanceTon=0;
			        group1.clearSelection();
			        group2.clearSelection();
			        group3.clearSelection();
		       
		   } 

	}

}