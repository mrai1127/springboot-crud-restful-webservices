package com.chessgame;

import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChessGame {
	
	public static void main(String[] args) {
		
		LinkedList<Piece> ps = new LinkedList<>();
		
		
		JFrame frame = new JFrame();
		frame.setBounds(10, 10, 512, 512);
		frame.setUndecorated(true);
		
		JPanel pn = new JPanel() {
			@Override
			public void paint(Graphics g) {
				boolean white = true;
				for(int y =0; y < 8; y++) {
					for(int x = 0; x< 8; x++) {
						if(white) {
							g.setColor(Color.WHITE.darker());
						}else {
							g.setColor(Color.BLACK);
						}
						
						g.fillRect(x*64, y*64, 64, 64);
						white =! white;
					}
					
					white =! white;
				}
			}
		};
		frame.add(pn);
		frame.setDefaultCloseOperation(3);
		frame.setVisible(true);
	}

}
