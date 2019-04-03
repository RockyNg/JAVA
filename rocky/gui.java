package rocky;
//the display



/*******************************************************
 * 
 * 
 *   Lab 5: GUI solution 
 * 
 * 
 *******************************************************/
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class gui  extends JFrame implements ActionListener, MouseListener  
{

   /* attributes:
    note: it's good to set up the GUI components as class attributes , 
    instead of in the constructor so that they are visible/ usable in all method
   */	
   
   private JButton 		button1;
   private JButton		button2;
   private JPanel 		panel;
   private JTextField 	tf1;
      
   // constructor
   void BaseScreen2(String title)
   {
  
	  
	   setSize(300,300);
	   setLayout(new FlowLayout());
	   
	   // create / instantiate the GUI components and add listenera
	   button1 	= new JButton("Click me");
	   button2 	= new JButton("Click me as well");
	   tf1 		= new JTextField("Name   ");

	   button1.addActionListener(this);
	   button2.addActionListener(this);
	   
	   tf1.setToolTipText("enter your name here");
	   tf1.addActionListener(this);

	   // add the GUI components to the frame
	   add(button1);
	   add(button2);
	   add(tf1);
	   
	   // adding panel (Part 5)
	   panel 		= new JPanel(new FlowLayout());
	   panel.setBackground(Color.red);
	   JLabel label = new JLabel("the panel is here");
	   panel.add(label);
   	   panel.addMouseListener(this);
	   add(panel);

	   setVisible(true);
	
	}

@Override
public void actionPerformed(ActionEvent event) 
{
	
    if 	(event.getSource() == button1)
    {
    	JOptionPane.showMessageDialog(this, "clicked button 1");
     	
    }
    else 
    	if (event.getSource() == button2)
    	{
    		JOptionPane.showMessageDialog(this, "clicked button 2");

    
    	}
    	else 
    		if (event.getSource() == tf1)
    		{
        		JOptionPane.showMessageDialog(this, "You entered " + tf1.getText());
    			
    			
    		}
}

@Override
public void mouseClicked(MouseEvent arg0) 
{
  if(arg0.getButton() == MouseEvent.BUTTON1) 
          JOptionPane.showMessageDialog(this,"Left Click!");
  else
              JOptionPane.showMessageDialog(this,"right Click!");
          
  
}

@Override
public void mouseEntered(MouseEvent arg0) {
	JOptionPane.showMessageDialog(this, "Nouse ENTERED");
}

@Override
public void mouseExited(MouseEvent arg0) 
{
	JOptionPane.showMessageDialog(this, "Nouse exited the panel");
	
}

@Override
public void mousePressed(
		MouseEvent arg0) {

//	JOptionPane.showMessageDialog(this, "Pressing on the frame");
	
}

@Override
public void mouseReleased(MouseEvent arg0) {

//	JOptionPane.showMessageDialog(this, "Unclicking from on the frame");
	
}


}