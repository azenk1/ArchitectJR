import javax.swing.*;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.Arrays;
import java.awt.BasicStroke;
public class ArchiGUI extends JFrame {//Create separate drawing class that extends canvas.
	
	String colorChoice;
	int[] cord = new int[200];//cords as vectors
	int[] cord1 = new int[200];
	int[] cord2 = new int [200];
	int [] cord3 = new int [200];
	
	int[] reccord = new int[200];//cords as vectors
	int[] reccord1 = new int[200];
	int[] reccord2 = new int [200];
	int [] reccord3 = new int [200];
	
	int[] circord = new int[200];//cords as vectors
	int[] circord1 = new int[200];
	int[] circord2 = new int [200];
	int [] circord3 = new int [200];
	


	ArchEvent archE = new ArchEvent(this);
	JPanel row1 = new JPanel();
	JComboBox shape = new JComboBox();
	JLabel X = new JLabel("X:");
	JTextField cordX = new JTextField(5);
	JLabel Y = new JLabel("Y:");
	JTextField cordY = new JTextField(5);
	JLabel x1 = new JLabel();//Either height or end point coordinate of line. Determined by shape selected in "shape" JComboBox.
	JTextField val1 = new JTextField(5);
	JLabel y1 = new JLabel();//Either width or end point coordinate of line   "                                                 "
	JTextField val2 = new JTextField(5);
	JButton Draw = new JButton("Draw"); 
	JButton clear = new JButton("Clear");
	
	
	public ArchiGUI(){
		super("Architect Jr.");
		setSize(600,600);
		FlowLayout flo = new FlowLayout();
		row1.setLayout(flo);
		shape.setEditable(true);
		clear.setBounds(550, 550, 10, 5);
		//Add Listeners
		shape.addItemListener(archE);//Listener to interface with ArchEvent
		Draw.addActionListener(archE);
		clear.addActionListener(archE);
		shape.addItem("Shape");
		shape.addItem("Line");
		shape.addItem("Rectangle");
		shape.addItem("Circle");
		row1.add(shape);
		row1.add(X);
		row1.add(cordX);
		row1.add(Y);
		row1.add(cordY);
		row1.add(x1);
		row1.add(val1);
		row1.add(y1);
		row1.add(val2);
		row1.add(Draw);
		row1.add(clear);
		add(row1);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void paint(Graphics draw){
		
		super.paint(draw);
		
		Graphics2D draw2D = (Graphics2D) draw;
		for(int x = 0; x<=600; x+=20){
			Line2D.Float grid = new Line2D.Float(0,(140+x),600,(140+x));
			draw2D.draw(grid);
		}
		for(int x = 0; x<=600;	 x+=20){
			Line2D.Float HGrid = new Line2D.Float((0+x),140,(0+x),600);
			draw2D.draw(HGrid);
		}
		
		
			draw.setColor(Color.red);
			draw2D.setStroke(new BasicStroke(5));
	
		
			for(int x = 0; x<=199; x++){
				
				//Create Clear button
				//prevent maximizing
				//handle data entry errors
				//Create pixel grid background
			draw2D.drawLine(cord[x],(cord1[x]+140),cord2[x],(cord3[x]+140));//**Empty until repaint is called. After data is entered and repaint is called arrays are filled. Every time repaint is called entire array is drawn. Arrays devoid of coordinates are not drawn.
			
		}
			
			
		
	
			for(int x = 0; x<=199; x++){	
	
		draw2D.drawRect(reccord[x],(reccord1[x]+140),reccord2[x],reccord3[x]);
		}
		
	
			for(int x = 0; x<=199; x++){	
			Ellipse2D.Float circ = new Ellipse2D.Float(circord[x],(circord1[x]+140),circord2[x],circord3[x]);
			draw2D.draw(circ);
			
		}
			
	
			
			}
	
		
		
	
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArchiGUI archjr = new ArchiGUI();
		archjr.setResizable(false);//Disables user ability to maximize window.
	}

}
