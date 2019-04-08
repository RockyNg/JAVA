package rocky;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class gui  extends JFrame
{
	private JPanel p1,p2,p3;
	private JLabel label1,label2,label3;
	private JRadioButton tempH,tempN,tempC,achesY,achesN,ThroatY,sThroatN;
	private ButtonGroup group1,group2,group3;
	
	public gui()
	{
		super ("title");
		setSize(300,200);
		setLayout(new FlowLayout());
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();

		
		p1.setBackground(Color.WHITE);
		p2.setBackground(Color.GREEN);
		p3.setBackground(Color.YELLOW);
		
		add(p1,BorderLayout.CENTER);
		add(p2,BorderLayout.NORTH);
		add(p3,BorderLayout.SOUTH);

		
		

		
		label1 = new JLabel("Temperature",25);
		label2 = new JLabel("Aches",25);
		label3 = new JLabel("Sore Throat",25);
		add(label1);
		add(label2);
		add(label3);
		
		//tempH,tempN,tempC,achesY,achesN,ThroatY,sThroatN;
		tempH = new JRadioButton("Hot",false);
		tempN = new JRadioButton("Normal",false);
		tempC = new JRadioButton("Cool",false);
		achesY = new JRadioButton("Yes",false);
		achesN = new JRadioButton("No",false);
		ThroatY = new JRadioButton("Yes",false);
		sThroatN = new JRadioButton("No",false);
		
		add(pb);
		add(bb);
		add(ib);
		add(bib);
		
		group = new ButtonGroup();
		group.add(bb);
		group.add(ib);
		group.add(bib);
		group.add(pb);
		
		
		bf = new Font("Serif",Font.BOLD,14);
		itf = new Font("Serif",Font.ITALIC,14);
		bif = new Font("Serif",Font.BOLD + Font.ITALIC,14);
		tf.setFont(pf);
		
		//wait for event to happen, pass in font object to constructor
		bb.addItemListener(new HandlerClass(bf));
		ib.addItemListener(new HandlerClass(itf));
		bib.addItemListener(new HandlerClass(bif));
		
		
		
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