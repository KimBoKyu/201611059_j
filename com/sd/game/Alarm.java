package com.sd.game;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import com.sd.game.*;
import ch.aplu.turtle.*;
import java.awt.Container;

public class Alarm extends JFrame implements ActionListener{
	JLabel label = new JLabel("End Game!!!!!!");
	JButton b1 = new JButton("HOME");
	public Alarm(){
		JPanel panel = new JPanel(new GridLayout(1,2));
		b1.addActionListener(this);
		getContentPane().add(panel);
		panel.add(label);
		panel.add(b1);
		setSize(300,200);
		pack();
		setVisible(true);				
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		if (e.getSource().equals(b1)) {
			new GameSet();
		}
	}
}