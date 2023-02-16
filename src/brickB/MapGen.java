package brickB;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class MapGen {
	public int mapTwo [][];
	public int brickWidth;
	public int brickHeight;
	public MapGen(int row, int col) {
		mapTwo= new int [row][col];
		for(int i = 0; i < mapTwo.length; i++) {
			for (int j=0; j<mapTwo[0].length;j++) {
		mapTwo[i][j]= 1;
			}
	}
		brickWidth= 540/col;
		brickHeight = 150/row;
	}
	public void draw(Graphics2D g) {
		for(int i = 0; i < mapTwo.length; i++) {
			for (int j=0; j<mapTwo[0].length;j++) {
				if(mapTwo[i][j]>0) {
	g.setColor(Color.white);
	g.fillRect(j * brickWidth+ 80, i * brickHeight + 50, brickWidth, brickHeight);
			
	g.setStroke(new BasicStroke(3));
	g.setColor(Color.black);
	g.drawRect(j * brickWidth+ 80, i * brickHeight + 50, brickWidth, brickHeight);
				}
}
			}
}
	public void setBrickVal(int value, int row, int col) {
		mapTwo[row][col] = value;
	}
}