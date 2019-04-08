package rocky;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class gui  extends JFrame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel p1,p2,p3;
	private JLabel label1,label2,label3;
	private JRadioButton tempH,tempN,tempC,achesY,achesN,sThroatY,sThroatN;
	private ButtonGroup group1,group2,group3;
	private JButton b1;
	private int a=9;
	
	 private ActionListener al = new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		      System.out.println(a);
		    }
		  };

	public gui()
	{
		super ("title");
		setSize(300,200);
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
		
		group1 = group2 = group3 = new ButtonGroup();
		
		
		group1.add(tempH);
		group1.add(tempN);
		group1.add(tempC);
		
		group2.add(achesY);
		group2.add(achesN);
		
		group3.add(sThroatY);
		group3.add(sThroatN);
		
		p1 = p2 = p3 = new JPanel(new FlowLayout());
	

	
		p1.setBackground(Color.WHITE);
		p2.setBackground(Color.GREEN);
		p3.setBackground(Color.YELLOW);
		
		add(p1,BorderLayout.CENTER);
		add(p2,BorderLayout.NORTH);
		add(p3,BorderLayout.SOUTH);

		
		label1 = new JLabel("Temperature");
		label2 = new JLabel("Aches");
		label3 = new JLabel("Sore Throat");
		
		p1.add(label1);
		p2.add(label2);
		p3.add(label3);
		p3.add(b1);
		
		setVisible(true);
		b1.addActionListener(this);
		
		
		//wait for event to happen, pass in font object to constructor
		
		tempH.addActionListener(al);
		tempN.addActionListener(al);
		tempC.addActionListener(al);
		achesY.addActionListener(al);
		achesN.addActionListener(al);
		sThroatY.addActionListener(al);
		sThroatN.addActionListener(al);
		
		 
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() ==b1)
		   {	
		      
			    JOptionPane.showMessageDialog(this,a);
		  	
			  	   
		     	
		   } 
		
	}
	
	
	

}