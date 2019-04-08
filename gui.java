package rocky;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class gui  extends JFrame
{
	private JTextField tf;
	private Font pf,bf,itf,bif;
	private JRadioButton pb,bb,ib,bib;
	private ButtonGroup group;
	
	public gui()
	{
		super ("title");
		setLayout(new FlowLayout());
		tf = new JTextField("Why hello there",25);
		add(tf);
		
		pb = new JRadioButton("Plain",false);

		bb = new JRadioButton("bold",false);
		ib = new JRadioButton("italic",false);
		bib = new JRadioButton("b and i",false);
		
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