package first;



import java.lang.System;

import javax.swing.JFrame;


//;

public class inc 
{
	public static void main(String args[]) {
	
		
		JFrame xx = new JFrame();
		xx.setSize(300, 300);
		xx.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		xx.setVisible(true);
	int x;
	x = 0;
	
	long y1, y2, w1, w2, w3;
	y1 = y2 = w1=w2=w3 =0;
	w3 = System.nanoTime();
	while(x < 407040)
	{
		x++;
		y1 = System.nanoTime();
		System.out.println(x + "  incoper  " + w1 + "    else   " + w2);
		y2 = System.nanoTime();
		w1 = y1-y2;
		w2 = y2-y1;
	}
	w3 = (System.nanoTime() - w3)/1000000000;
	System.out.println(x + "  alltime  " + w3);
	}

	
	
}
