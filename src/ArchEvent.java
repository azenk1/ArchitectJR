import javax.swing.*;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.*;
import java.awt.geom.Line2D;
import java.awt.Graphics2D.*;
import java.util.Random;
import java.util.Vector;
public class ArchEvent extends JFrame implements ItemListener, ActionListener{
ArchiGUI gui;
static String label;
static String delete;
static int x = 0;


public ArchEvent(ArchiGUI in){
	gui = in;	
	
}
		

	


@Override
public void itemStateChanged(ItemEvent shp) {
	// TODO Auto-generated method stub
	Object choice = shp.getItem();//Retrieves selected value of shape JComboBox.
	label = choice.toString();
	
	if(label.equals("Line")){
		gui.x1.setText("x1:");
		gui.y1.setText("y1");
	
	}
		else{
			gui.x1.setText("Width:");
			gui.y1.setText("Height:");
		}
	


}
	



@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String select = e.getActionCommand();
	if(select.equals("Clear")){
	for(int x = 0; x<=199; x++){
		//Clear Lines
		gui.cord[x]= 0;
		gui.cord1[x]= 0;
		gui.cord2[x]=0;
		gui.cord3[x]=0;
	}
		for(int x = 0; x<=199; x++){
		//Clear Rectangles
		gui.reccord[x]= 0;
		gui.reccord1[x]= 0;
		gui.reccord2[x]=0;
		gui.reccord3[x]=0;
		}
		//Clear Circles
		for(int x = 0; x<=199; x++){
		gui.circord[x]= 0;
		gui.circord1[x]= 0;
		gui.circord2[x]=0;
		gui.circord3[x]=0;
		
		}
	}
	
	if(select.equals("Draw")){
	x++;
	if(label=="Line"){
		gui.cord[x] = Integer.parseInt(gui.cordX.getText());
		gui.cord1[x] = Integer.parseInt(gui.cordY.getText());
		gui.cord2[x] = Integer.parseInt(gui.val1.getText());
		gui.cord3[x] = Integer.parseInt(gui.val2.getText());
		
	}
	if(label=="Rectangle"){
		
		gui.reccord[x] = Integer.parseInt(gui.cordX.getText());
		gui.reccord1[x] = Integer.parseInt(gui.cordY.getText());
		gui.reccord2[x] = Integer.parseInt(gui.val1.getText());
		gui.reccord3[x] = Integer.parseInt(gui.val2.getText());
	}
	if(label=="Circle"){
		gui.circord[x] = Integer.parseInt(gui.cordX.getText());
		gui.circord1[x] = Integer.parseInt(gui.cordY.getText());
		gui.circord2[x] = Integer.parseInt(gui.val1.getText());
		gui.circord3[x] = Integer.parseInt(gui.val2.getText());
	}
		
	
	
		//System.out.println(100*rand.nextFloat());
		


		
		
	}

	gui.repaint();
	}
}


	 
	
	
	
	
	
	
	
	
	//Using loop increment vector each time user inputs data and charge paint with drawing vector each time.




