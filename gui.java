package rocky;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class gui  extends JFrame
{
	private JPanel p1,p2,p3;
	private JLabel label1,label2,label3;
	private JRadioButton tempH,tempN,tempC,achesY,achesN,sThroatY,sThroatN;
	private ButtonGroup group1,group2,group3;
	private int a1,a2,a3,a4,a5,a6,a7;
	
	public gui()
	{
		super ("title");
		setSize(300,200);
		setLayout(new FlowLayout());
		
		
		
		
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

		
		label1 = new JLabel("Temperature",25);
		label2 = new JLabel("Aches",25);
		label3 = new JLabel("Sore Throat",25);
		p1.add(label1);
		p2.add(label2);
		p3.add(label3);
		setVisible(true);
		
		a1 = 1;
		a2 = 2;
		a3 = 3;
		a4 = 4;
		a5 = 5;
		a6 = 6;
		a7 = 7;
		
		//tempH,tempN,tempC,achesY,achesN,ThroatY,sThroatN;
		//wait for event to happen, pass in font object to constructor
		tempH.addItemListener(new HandlerClass(itf);
		tempN.addItemListener(new HandlerClass(itf));
		tempC.addItemListener(new HandlerClass(bif));
		achesY.addItemListener(new HandlerClass(bif));
		achesN.addItemListener(new HandlerClass(bif));
		sThroatY.addItemListener(new HandlerClass(bif));
		sThroatN.addItemListener(new HandlerClass(bif));
		
		
		
	}
	
	private class HandlerClass implements ItemListener
	{
		private Font font;
		
		public HandlerClass (Font f)
		{
			font =f;
		}
		public void itemStateChanged(ItemEvent event)
		{
			tf.setFont(font);
		}
	}
	

}