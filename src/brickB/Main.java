package brickB;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;


public class Main {

	public static void main(String[] args) {
		
JFrame obj = new JFrame();
Gameplay gamePlay = new Gameplay();
obj.setBounds(10, 10, 700, 600);
obj.setTitle("BreakBall");
obj.setResizable(false);
obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
obj.add(gamePlay);
obj.setVisible(true);
	}

}
